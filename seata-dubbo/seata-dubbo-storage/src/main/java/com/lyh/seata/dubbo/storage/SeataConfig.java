package com.lyh.seata.dubbo.storage;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import io.seata.rm.datasource.DataSourceProxy;
import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author luo yihang
 * @date 2019/12/30 16:53
 */
@Configuration
public class SeataConfig {

    @Primary
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.druid")
    public DruidDataSource druidDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    public DataSourceProxy dataSourceProxy(DruidDataSource druidDataSource) {
        return new DataSourceProxy(druidDataSource);
    }

    @Bean
    public GlobalTransactionScanner globalTransactionScanner() {
        return new GlobalTransactionScanner("storage-gts-seata-example", "my_test_tx_group");
    }
}
