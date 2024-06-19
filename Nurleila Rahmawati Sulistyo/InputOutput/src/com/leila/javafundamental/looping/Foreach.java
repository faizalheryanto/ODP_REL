package com.leila.javafundamental.looping;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {

        List<Integer> numbers2 = Arrays.asList(10, 20, 30, 40, 50);

        for(Integer x : numbers2 ) {
            System.out.print( x );
            System.out.print(",");
        }

        System.out.println(",");

        Student[] students = { new Student(1, "Julie"), new Student(3, "Adam"), new Student(2, "Robert") };

        for( Student student : students ) {
            System.out.print( student );
            System.out.print(",");
        }
    }
}

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[ " + this.rollNo + ", " + this.name + " ]";
    }
}