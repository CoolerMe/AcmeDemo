package demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author coolme
 * @version 1.0.0 创建自己的
 */

@Configuration
@ConditionalOnNotWebApplication
@EnableConfigurationProperties(HelloEntity.class)
public class HelloWorldConfiguration {

    @Bean
    public ApplicationRunner newRunner(HelloEntity entity) {
        return args -> System.out.printf("Hello %s%n", entity.getContent());
    }
}
