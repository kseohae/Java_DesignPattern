package com.ksh.java_designpattern._01_creational_patterns._05_prototype._03_java;

import lombok.Setter;

public class Student {

    @Setter
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
