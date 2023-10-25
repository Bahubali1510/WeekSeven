package src;// Write a program to insert any temperature value in degree Fahrenheit and convert
//to degree Celsius ((F − 32) × 5/9 = 0°C).

public class Fahrenheittocelsious {
    public static void main (String[] args){
        double Fahrenheit = 50;
        double celsius = 0.00;
        celsius = (Fahrenheit - 32) * 5/9 ;
        System.out.println("Value of temperature:" + celsius);
    }
}
