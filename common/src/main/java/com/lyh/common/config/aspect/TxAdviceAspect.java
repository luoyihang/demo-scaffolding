package com.lyh.common.config.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.interceptor.*;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author luoyihang
 * @date 2019/4/30 18:43
 */
@Aspect
@Configuration
public class TxAdviceAspect {

    /**
     * 切面
     */
    private static final String AOP_POINTCUT_EXPRESSION = "execution(* com.lyh.**.service..*.*(..))";

    @Resource
    private DataSourceTransactionManager transactionManager;

    /**
     * 事务拦截
     *
     * @return
     */
    @Bean
    public TransactionInterceptor txAdvice(){
        NameMatchTransactionAttributeSource source = new NameMatchTransactionAttributeSource();
        RuleBasedTransactionAttribute requiredTx = new RuleBasedTransactionAttribute();
        requiredTx.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
        requiredTx.setRollbackRules(Collections.singletonList(new RollbackRuleAttribute(Exception.class)));

        Map<String, TransactionAttribute> txMap = new HashMap<>(4);
        txMap.put("*", requiredTx);

        source.setNameMap(txMap);

        return new TransactionInterceptor(transactionManager, source);
    }

    /**
     * 注册事务
     *
     * @param txAdvice
     * @return
     */
    @Bean
    public Advisor txAdviceAdvisor(TransactionInterceptor txAdvice) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(AOP_POINTCUT_EXPRESSION);
        return new DefaultPointcutAdvisor(pointcut, txAdvice);
    }
}
