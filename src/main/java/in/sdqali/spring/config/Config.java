package in.sdqali.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class Config extends WebMvcConfigurerAdapter {
    private HandlerInterceptor handlerInterceptor;

    @SuppressWarnings("unused")
    public Config() {
    }

    @Autowired
    public Config(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Autowired
    public void setHandlerInterceptor(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(handlerInterceptor);
        super.addInterceptors(registry);
    }
}
