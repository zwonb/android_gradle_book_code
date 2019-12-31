package com.zwonb.app;

import com.zwonb.base.Person;

/**
 * @author zwonb
 * @date 2019-12-31
 */
public class HelloWorld {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("zwonb");
        System.out.println(person.toString());
    }
}
