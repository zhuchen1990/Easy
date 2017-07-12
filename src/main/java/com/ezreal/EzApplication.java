package com.ezreal; /**
 * Created by Ezreal# on 2017/7/11.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class EzApplication {

    public static void main (String[] args) {
        SpringApplication.run(EzApplication.class, args);

    }

}
