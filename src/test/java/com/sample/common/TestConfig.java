package com.sample.common;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class TestConfig {

    @Bean
    public DataSource dataSource() {
        HikariConfig dataSourceConfig = new HikariConfig();
        dataSourceConfig.setDriverClassName( "com.mysql.jdbc.Driver" );
        dataSourceConfig.setJdbcUrl( "jdbc:mysql://localhost:23306/test" );
        dataSourceConfig.setUsername( "test-user" );
        dataSourceConfig.setPassword( "test-pass" );

        return new HikariDataSource( dataSourceConfig );
    }
}
