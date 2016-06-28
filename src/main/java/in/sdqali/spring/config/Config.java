package in.sdqali.spring.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


public class Config extends WebMvcConfigurerAdapter {
    private HandlerInterceptor metaDataDecorator;



    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(metaDataDecorator);
        super.addInterceptors(registry);
    }
}
