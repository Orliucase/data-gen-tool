package cn.jaspter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
@Configuration
public class ThreadPoolConfig {
    @Bean
    public ThreadPoolExecutor threadPoolExecutor(){
        return new ThreadPoolExecutor(20,20,1, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(200),new ThreadPoolExecutor.CallerRunsPolicy());
    }
}
