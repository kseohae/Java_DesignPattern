package com.ksh.java_designpattern._01_creational_patterns._04_builder._03_java;

public class StringBuilderExample {

    public static void main(String[] args) {
        // StringBuffer : synchronized 사용 (thread-safe)
        // StringBuilder : synchronized 사용하지 않음 (not thread-safe)
        StringBuilder stringBuilder = new StringBuilder();

        // 빌더를 만들고 문자열을 추가적으로 append 하고, 최종적으로 toString 으로 원하는 문자열을 얻는다.
        String result = stringBuilder
                .append("whiteship")
                .append("keesun")
                .toString();

        System.out.println(result);
    }
}
