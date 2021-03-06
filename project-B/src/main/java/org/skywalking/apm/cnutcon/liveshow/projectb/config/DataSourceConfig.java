package org.skywalking.apm.cnutcon.liveshow.projectb.config;

import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource primaryDataSource() {
        HikariDataSource ds = new HikariDataSource();
        ds.setMaximumPoolSize(100);
        ds.setMinimumIdle(30);
        ds.setDriverClassName("org.h2.Driver");
        ds.setJdbcUrl("jdbc:h2:mem:test");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
}
