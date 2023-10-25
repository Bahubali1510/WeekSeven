package src;//1. Write a Java programme using the following steps.
       // 1.1 Declare two instance variables.
       // 1.2 Declare one instance method.
       // 1.3 Call both instance variables into the instance method inside the print statement.
       // 1.4 Declare the Main method.
       // 1.5 Call the above instance method into the Main method and run the progra1. Write a Java programme using the following steps.

public class JavaProgram1 {
private int num;
private String text;
int b= 20;
public void m1(){
    System.out.println("num=" +num );
    System.out.println("text=" +text);
}
    public static void main (String [] args){
        JavaProgram1 obj = new JavaProgram1();
        obj.num=30;
        obj.text="Hello";

    obj.m1();


    }
}
