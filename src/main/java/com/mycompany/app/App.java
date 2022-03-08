package com.mycompany.app;

/**
 * Hello world!
 */
  class Car
{  String name,model;
   int price;
 public Car (String name , String model , int price)
  { this.name=name;
   this.model=model;
   this.price=price;
 }
   public void carprice( String nam)
   { 
    System.out.println(" Price of car is  "+ this.price);  }
    public void carservice(String nam)
    {System.out.println("this car needs service");}
    }
  class RaceCar extends Car
  {    String team;
       public RaceCar(String name, String model , int price, String team)
       {super(name , model, price);
            this.team=team;}
       super.carprice(String nam);
       super.carservice(String nam);
       public void ignite(String nam)
       {   String s = nam;
         super.carprice(s);
       System.out.println("This car starts like a race car");}
  
  
  } 
public class App
{

    private final String message = "Hello World!";


    public static void main(String[] args) {
        
      /**  RaceCar r1 = new RaceCar("Honda", "SUV" , 99999 , "Blue");
        r1.carprice("honda");
        r1.carprice("tata");
        r1.carservice("bata");
        r1.ignite("tyota"); */
        
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
    public int mult1(int a , int b)
    {  return a*b;
        }
    public int div1(int a, int b)
    { return a/b;}
   //   public int div2(int a, int b)
   // { return a/b;}
    //  public int cube(int a)
   // { return a*a*a;}
}
