package com.example.springcaching.dao;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class UserDao {
    int age,uuid;
    String name;
}
