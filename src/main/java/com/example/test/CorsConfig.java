package com.example.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // İzin verilen origin (örnekte herkese izin verilmiştir, güvenlik nedeniyle spesifik bir değer kullanmanız önerilir)
        config.addAllowedMethod("*"); // İzin verilen HTTP methodları (GET, POST, vb.)
        config.addAllowedHeader("*"); // İzin verilen HTTP başlıkları
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
