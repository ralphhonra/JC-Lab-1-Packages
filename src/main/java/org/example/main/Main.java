package org.example.main;

// Import here manually

import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassThree;
import org.example.packagethree.ClassTwo;
import static java.lang.System.out;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        ClassTwo classTwo = new ClassTwo();
        ClassThree classThree = new ClassThree();

        out.println(classOne.greet());
        out.println(classTwo.greet());
        out.println(classThree.greet());

    }
}