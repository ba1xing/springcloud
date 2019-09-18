package cn.wellcare.serverzuul.config;

import cn.wellcare.serverzuul.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Zuulconfiguration {

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
}
