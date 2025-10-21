package com.ksh.java_designpattern._01_creational_patterns._01_singleton.enums;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class EnumSerializeApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        EnumSettings settings = EnumSettings.INSTANCE;

        EnumSettings settings1 = null;

        // 직렬화, 역직렬화 사용 가능
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (EnumSettings) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 직렬화/역직렬화 - 싱글톤 보장
        System.out.println(settings == settings1); // true

    }
}
