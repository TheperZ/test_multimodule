package com.api.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.dbmodule.domain")
@EnableJpaRepositories("com.dbmodule.repository")
public class ScanConfig {
}
