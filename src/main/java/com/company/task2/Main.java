package com.company.task2;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        f();
    }

    private static void f() {
        Person person = new Person(1, "dew");
        Gson gson = new Gson();
        String resJson = gson.toJson(person);
        System.out.println(resJson);


        Person person2 = gson.fromJson(resJson, Person.class);
        System.out.println(person2.toString());

    }
}

