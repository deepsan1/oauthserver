package com.example.oauthserver.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggingConfig {

    private static final Logger logger =LoggerFactory.getLogger(LoggingConfig.class);
    public LoggingConfig() {
        logger.info("Logging configuration initialized");
    }

}
