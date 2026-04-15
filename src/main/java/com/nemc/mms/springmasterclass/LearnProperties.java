package com.nemc.mms.springmasterclass;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@Slf4j
@RequiredArgsConstructor
public class LearnProperties {
//    @Value("${master-class.integrations.mgov.base-url}")
//    private String baseUrl;
//
//    @Value("${master-class.integrations.mgov.send-sms-endpoint}")
//    private String sendSmsEndpoint;
//
    @Value("${master-class.integrations.mgov.timeOut:3500}")
    private Integer timeOut;
    private final MgovProperties mgovProperties;

    @PostConstruct
    void init() {
        log.info("Wil be sending sms to Base URL: {} and endpoint {} with timeout {}", mgovProperties.getBaseUrl(), mgovProperties.getSendSmsEndpoint(), timeOut);
    }
}


@Configuration
@EnableConfigurationProperties(MgovProperties.class)
class MgovConfig {

}

@ConfigurationProperties(prefix = "master-class.integrations.mgov")
@Getter
@Setter
class MgovProperties {
    private String baseUrl;
    private String sendSmsEndpoint;
//    private Integer timeOut;
}