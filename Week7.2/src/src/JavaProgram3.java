package src;//Write a Java programme using the following steps.
  //      3.1 Declare one instance and one static variable.
    //    3.2 Declare one instance method.
      //  3.3 Declare one static method.
        //3.4 Call both instance and static variables into both instance and static methods inside the
        //print statement.
        //3.5 Declare the Main method.
        //3.6 Call both instance and static methods into the Main method and run the program

public class JavaProgram3 {
    private int a = 10;
    private static int b= 20;
    public void m1(){
        System.out.println("Instance Variable: " + a);
        System.out.println("Static Variable: " + b);
    }
    public static void m2(){
        JavaProgram3 obj=new JavaProgram3();
        System.out.println("Instance Variable: " + obj.a);
        System.out.println("Static Variable: " + b);
    }
    public static void main(String[] args){
        JavaProgram3 obj=new JavaProgram3();
        obj.m1();
        JavaProgram3.m2();

    }

}
