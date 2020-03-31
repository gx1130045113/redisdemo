package com.example.entity;

import lombok.Data;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author 有丶优秀的少年
 * @Date 2020/3/11
 * @Version V1.0
 **/
@Data
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
