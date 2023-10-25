package src;

// Write a Java programme using the following steps.
    //    2.1 Declare two static variables.
      //  2.2 Declare one static method.
      //  2.3 Call both static variables into the static method inside the print statement.
     //   2.4 Declare the Main method.
    //    2.5 Call the static method into the Main method and run the programme.
public class JavaProgram2 {
    static int a=10;
    static String text = "Hello";
    static void m1(){
        System.out.println("Static Variable 1: " + a);
        System.out.println("Static Variable :2 " + text);
    }
    public static void main (String[] args){
                m1();
    }
}
