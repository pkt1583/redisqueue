package com.apigatekeeper.redisqueue.repository;

import com.apigatekeeper.redisqueue.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisRepo extends CrudRepository<Student, Student> {
}
