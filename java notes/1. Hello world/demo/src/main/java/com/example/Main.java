package com.example;

import java.util.*;
import java.util.stream.IntStream;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public final double SHORT_PI = 3.1415;
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Sizes of variable types");
        System.out.println("Byte max: " + Byte.MAX_VALUE + " Byte min: " + Byte.MIN_VALUE);
        System.out.println("Short max: " + Short.MAX_VALUE + " Short min: " + Short.MIN_VALUE);
        System.out.println("Char max: " + (int) Character.MAX_VALUE + " Char min: " + (int) Character.MIN_VALUE);
        System.out.println("Integer max: " + Integer.MAX_VALUE + " Integer min: " + Integer.MIN_VALUE); 
        System.out.println("Float max value: " + Float.MAX_VALUE + " Float min value: " + Float.MIN_VALUE);
        System.out.println("Double max value: " + Double.MAX_VALUE + " Double min value: " + Double.MIN_VALUE);
        System.out.println("Long max value: " + Long.MAX_VALUE + " Long min value: " + Long.MIN_VALUE);

        boolean isTrue = true;
        isTrue = false;
        char a = 'a';
        float number = 3.14f; // f na końcu oznacza że to liczba typu float
        // precision issues
        System.out.println("Zmienne: " + isTrue + " " + a + " " + number);        

        float fNumber1 = 1.111111111111111F;
        float fNumber2 = 1.111111111111111F;

        double dNumber1 = 1.111111111111111; // Istotnym jest to że nie ma tutaj f na końcu, to nie jest liczba float, tylko double
        double dNumber2 = 1.111111111111111; // Gdyby f było na końcu to doszłoby do błędów precyzji obliczeń.
        
        System.out.println("Zmienne float tracą precyzje przy wynikach które mają 7 cyfr po przecinku. fNumber1 + fNumber2 = " + (fNumber1 + fNumber2));
        System.out.println("Double przy takich oblieczeniach wystarcza. dNumber1 + dNumber2 = " + (dNumber1 + dNumber2));

        double thousand = 1e+3;
        System.out.println("Można używać naukowej notacji liczb: " + thousand );

        long bigNumber = 123_456_789_123_123L; // L na końcu oznacza że to liczba typu long
        System.out.println("Można używać _ do oddzielania cyfr: " + bigNumber);

        // Konwersja typów z mniejszych do większych zachodzi zwyczajnie
        int smInt = 10;
        long longNumber = smInt;                

        // Konwersja typów z większych na mniejsze
        double double1 = 1.234;
        int int1 = (int) double1; // Użycie rzutowania (int) powoduje utratę części dziesiętnej
        System.out.println("Konwersja z double na int: " + int1);

        long bigLong = 211200000234L;
        int int2 = (int) bigLong; // Użycie rzutowania (int)
        System.out.println("Konwersja z long na int: " + int2); // Uwaga! Może dojść do utraty danych

        String favNumber = Double.toString(bigLong); // Konwersja z long na string
        System.out.println("Konwersja z long na string: " + favNumber);

        String favInt = Integer.toString(30033); // Konwersja z int na string
        System.out.println("Konwersja z int na string: " + favInt);

        // Operacje matematyczne
        System.out.println("5 + 4 = " + (5+4));
        System.out.println("5 - 4 = " + (5-4));
        System.out.println("5 * 4 = " + (5*4));
        System.out.println("5 / 4 = " + (5/4));
        System.out.println("5F / 4F = " + (5F/4F));
        System.out.println("5D / 4D = " + (5F/4F));
        System.out.println("5 % 4 = " + (int)(5F % 4F));

        int incMe = 0;
        System.out.println("incMe++ = " + incMe++);
        System.out.println("++incMe = " + ++incMe);

        incMe += 10;

        // Metody matematyczne
        System.out.println("Math.abs(-1) = " + Math.abs(-1));
        System.out.println("Math.ceil(4.25) = " + Math.ceil(4.25));
        System.out.println("Math.floor(4.25) = " + Math.floor(4.25));
        System.out.println("Math.round(4.25) = " + Math.round(4.25));
        System.out.println("Math.round(4.75) = " + Math.round(4.75));
        System.out.println("Math.max(4, 5) = " + Math.max(4, 5));
        System.out.println("Math.min(4, 5) = " + Math.min(4, 5));
        System.out.println("Math.pow(2, 2) = " + Math.pow(2, 2));
        System.out.println("Math.sqrt(4) = " + Math.sqrt(4));
        System.out.println("Math.PI = " + Math.PI);


        // Losowe liczby

        
    }
}