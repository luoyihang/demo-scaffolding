//package com.lyh.sharding.table.util.sharding;
//
//import com.google.common.base.Preconditions;
//import lombok.RequiredArgsConstructor;
//import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
//import org.apache.shardingsphere.core.exception.ShardingException;
//import org.apache.shardingsphere.core.util.InlineExpressionParser;
//import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
//import org.apache.shardingsphere.shardingjdbc.spring.boot.common.SpringBootPropertiesConfigurationProperties;
//import org.apache.shardingsphere.shardingjdbc.spring.boot.sharding.ShardingRuleCondition;
//import org.apache.shardingsphere.shardingjdbc.spring.boot.sharding.SpringBootShardingRuleConfigurationProperties;
//import org.apache.shardingsphere.shardingjdbc.spring.boot.util.DataSourceUtil;
//import org.apache.shardingsphere.shardingjdbc.spring.boot.util.PropertyUtil;
//import org.springframework.boot.autoconfigure.AutoConfigureBefore;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.EnvironmentAware;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Conditional;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.core.env.StandardEnvironment;
//
//import javax.sql.DataSource;
//import java.sql.SQLException;
//import java.util.Collections;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author luo yihang
// * @date 2019/12/23 14:07
// */
//@Configuration
//@EnableConfigurationProperties({
//        SpringBootShardingRuleConfigurationProperties.class, SpringBootPropertiesConfigurationProperties.class})
//@ConditionalOnProperty(prefix = "spring.shardingsphere", name = "enabled", havingValue = "true", matchIfMissing = true)
//@AutoConfigureBefore(DataSourceAutoConfiguration.class)
//@RequiredArgsConstructor
//public class DatabaseConfig implements EnvironmentAware {
//
//    private final SpringBootShardingRuleConfigurationProperties shardingRule;
//
//    private final SpringBootPropertiesConfigurationProperties props;
//
//    private final Map<String, DataSource> dataSourceMap = new LinkedHashMap<>();
//
//    @Bean
//    @Conditional(ShardingRuleCondition.class)
//    public DataSource shardingDataSource() throws SQLException {
//        // 需要启动方法中 exclude org.apache.shardingsphere.shardingjdbc.spring.boot.SpringBootConfiguration.class
//        ShardingRuleConfiguration shardingRule = new ShardingRuleConfiguration();
//        return ShardingDataSourceFactory.createDataSource(dataSourceMap, shardingRule, props.getProps());
//    }
//
//    @Override
//    public final void setEnvironment(final Environment environment) {
//        String prefix = "spring.shardingsphere.datasource.";
//        for (String each : getDataSourceNames(environment, prefix)) {
//            try {
//                dataSourceMap.put(each, getDataSource(environment, prefix, each));
//            } catch (final ReflectiveOperationException ex) {
//                throw new ShardingException("Can't find datasource type!", ex);
//            }
//        }
//    }
//
//    private List<String> getDataSourceNames(final Environment environment, final String prefix) {
//        StandardEnvironment standardEnv = (StandardEnvironment) environment;
//        standardEnv.setIgnoreUnresolvableNestedPlaceholders(true);
//        return null == standardEnv.getProperty(prefix + "name")
//                ? new InlineExpressionParser(standardEnv.getProperty(prefix + "names")).splitAndEvaluate() : Collections.singletonList(standardEnv.getProperty(prefix + "name"));
//    }
//
//    @SuppressWarnings("unchecked")
//    private DataSource getDataSource(final Environment environment, final String prefix, final String dataSourceName) throws ReflectiveOperationException {
//        Map<String, Object> dataSourceProps = PropertyUtil.handle(environment, prefix + dataSourceName.trim(), Map.class);
//        Preconditions.checkState(!dataSourceProps.isEmpty(), "Wrong datasource properties!");
//        return DataSourceUtil.getDataSource(dataSourceProps.get("type").toString(), dataSourceProps);
//    }
//
//}
