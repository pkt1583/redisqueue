package com.apigatekeeper.redisqueue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private String id;
    private String name;
    private Gender gender;
    private int grade;

    public enum Gender {
        MALE, FEMALE
    }
}
