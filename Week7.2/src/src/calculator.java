package src;

//Write a program for a calculator with addition, subtraction, multiplication, and division
//methods all with parameters and use string concatenation methods. (Note: Two static
//and Two instance methods.)
public class calculator {
    public static void main(String[] args) {
        calculator obj = new calculator();

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + a + " + " + b + " = " + (a+b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + (a-b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + (a*b));
        System.out.println("Division: " + a + " / " + b + " = " + (a/b));

    }
}
