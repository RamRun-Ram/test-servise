package com.example.testservise.config

import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories(basePackages = ["com.example.testservice.service.repository"])
class TestConfig {
}
