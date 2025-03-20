package com.example;

import io.github.cdimascio.dotenv.Dotenv;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Base project structure is a project about boilerplate for java project. \nAbout everything that can happen before Hello World");
        
        // Zastosowanie argumentu konsoli
        System.out.print("Handling of arguments provided: ");
        if (args.length > 0) {
            System.out.println("Argument: " + args[0]);
        } else if (args.length == 1 ) {
            System.out.println("One argument provided");

        } else {
            System.out.println(args.length + " arguments provided");
        }

        // Zastosowanie zmiennej środowiskowej
        System.out.print("Handling of enviroment variables: ");        
        Dotenv dotenv = Dotenv.configure()
            .directory("./")            
            .load();
        String envName = dotenv.get("ENV_NAME");
        System.out.println("Enviroment name in use: " + envName );
    }
}