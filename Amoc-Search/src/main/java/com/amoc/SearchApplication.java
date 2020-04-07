package com.amoc;

import com.amoc.config.EsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Author zhoucx
 * @Description
 * @Date $ $
 **/
@SpringBootApplication(scanBasePackages = {"com.amoc"})
@EnableConfigurationProperties({EsConfig.class})
public class SearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
    }
}
