package com.apigatekeeper.redisqueue;

import com.apigatekeeper.redisqueue.entity.Student;
import com.apigatekeeper.redisqueue.repository.RedisRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RedisqueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisqueueApplication.class, args);
    }

    @Bean
    public CommandLineRunner initRedis(RedisRepo redisRepo) {
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {
                Student student = new Student("Eng2015001", "John Doe", Student.Gender.MALE, 1);

                redisRepo.save(student);
            }
        };
    }

}

