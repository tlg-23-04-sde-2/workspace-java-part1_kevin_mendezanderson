package com.panion;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Kevin", LocalDate.of(1991, 8, 14));
        System.out.println(p1);
        System.out.println(p1.getName() + " is "+ p1.getAge() +" years old");
    }

}