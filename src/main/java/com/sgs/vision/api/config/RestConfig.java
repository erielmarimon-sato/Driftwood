package com.sgs.vision.api.config;

import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.sgs.vision.api.interceptor.AccessTokenAuthInterceptor;
import com.sgs.vision.api.interceptor.RefreshTokenAuthInterceptor;
import com.sgs.vision.api.interceptor.UrlLoggerInterceptor;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.sgs.vision.api")
@PropertySource("classpath:/config.properties")
public class RestConfig extends WebMvcConfigurerAdapter {

	@Value("${rabbit.host}")
	private String rabbitHostName;

	@Value("${rabbit.port}")
	private String rabbitPort;

	@Value("${rabbit.username}")
	private String rabbitUser;

	@Value("${rabbit.password}")
	private String rabbitPassword;
	
	@Value("${rabbit.exchange}")
	private String rabbitExchange;
	
	@Value("${rabbit.routingKey}")
	private String rabbitRoutingKey;
	
	@Value("${rabbit.gatewayExchange.concurrentConsumers}")
	private String rabbitConcurrentConsumers;
	
	@Value("${rabbit.gatewayExchange.maxConcurrentConsumers}")
	private String rabbitMaxConcurrentConsumers;
	
	@Value("${redis.host}")
	private String redisHostName;
	
	@Value("${redis.port}")
	private String redisPort;
	
	@Value("${redis.password}")
	private String redisPassword;
	
	@Value("${redis.usePool}")
	private String redisUsePool;
		
	
	@Bean
	public RedisTemplate<String, Boolean> redisTemplate() {
	    RedisTemplate<String, Boolean> template = new RedisTemplate<String, Boolean>();
	    template.setConnectionFactory(jedisConnectionFactory());
	    template.setKeySerializer(stringRedisSerializer());
	    return template;
	}
	
	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
	    JedisConnectionFactory jedisConFactory = new JedisConnectionFactory();
	    jedisConFactory.setHostName(redisHostName);
//	    jedisConFactory.setUsePool(Boolean.valueOf(redisUsePool));
//	    jedisConFactory.setPassword(redisPassword);
	    jedisConFactory.setPort(Integer.valueOf(redisPort));
	 	    return jedisConFactory;
	}
	
	@Bean
	StringRedisSerializer stringRedisSerializer() {
	    return new StringRedisSerializer();
	}
	
    @Bean
    public RabbitTemplate rabbitTemplate() {
        RabbitTemplate template = new RabbitTemplate(this.connectionFactory());
        template.setConnectionFactory(connectionFactory());
        template.setExchange(rabbitExchange);
        template.setRoutingKey(rabbitRoutingKey);
        return template;
    }

    @Bean
    public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory() {
        final SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(this.connectionFactory());
        factory.setConcurrentConsumers(Integer.valueOf(rabbitConcurrentConsumers));
        factory.setMaxConcurrentConsumers(Integer.valueOf(rabbitMaxConcurrentConsumers));
        return factory;
    }
    
	@Bean
	public ConnectionFactory connectionFactory() {
	    CachingConnectionFactory connectionFactory = new CachingConnectionFactory(rabbitHostName, Integer.valueOf(rabbitPort));
	    connectionFactory.setUsername(rabbitUser);
	    connectionFactory.setPassword(rabbitPassword);
	    return connectionFactory;
	}

	@Bean
	public PropertiesFactoryBean inventoryProperties() {
	    PropertiesFactoryBean bean = new PropertiesFactoryBean();
	    bean.setLocation(new ClassPathResource("inventory.properties"));
	    return bean;
	}
	
	
    @Override 
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
    

    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        return bean;
    }
 
    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver getMultipartResolver() {
        return new CommonsMultipartResolver();
    }
 
    @Bean(name = "messageSource")
    public ReloadableResourceBundleMessageSource getMessageSource() {
        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
        resource.setBasename("classpath:messages");
        resource.setDefaultEncoding("UTF-8");
        return resource;
    }
    
//    @Bean
//    public AccessTokenAuthInterceptor accessTokenAuthInterceptor() {
//         return new AccessTokenAuthInterceptor();
//    }
//    
//    @Bean
//    public RefreshTokenAuthInterceptor refreshTokenAuthInterceptor() {
//         return new RefreshTokenAuthInterceptor();
//    }
//
//    @Bean
//    public UrlLoggerInterceptor urlLoggerInterceptor() {
//         return new UrlLoggerInterceptor();
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(accessTokenAuthInterceptor())
//        .addPathPatterns("/**")
//        .excludePathPatterns("/public/**","/webjars/**","/swagger*/**","/configuration/**","/**/api-docs/**","/images/**","/users/token","/swagger-ui.html");
//        
//        registry.addInterceptor(refreshTokenAuthInterceptor())
//        .addPathPatterns("/users/token")
//        .excludePathPatterns("/public/**","/webjars/**","/swagger*/**","/configuration/**","/**/api-docs/**","/images/**","/users/token","/swagger-ui.html");
//        
//        registry.addInterceptor(urlLoggerInterceptor())
//        .addPathPatterns("/**")
//        .excludePathPatterns("/public/**","/webjars/**","/swagger*/**","/configuration/**","/**/api-docs/**","/images/**","/swagger-ui.html");
//    }
    
	

    
}
