package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    } 
    public  String carprice(String str)
    {  System.out.println("we are inside carprice");
        return str + " is expensive";
         }
    public int add1(int a , int b)
    {
         return a+b;    }
}
