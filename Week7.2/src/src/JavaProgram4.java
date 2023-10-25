package src;

//Write a Java programme using the following steps.
  //      4.1 Declare two instance and two static variables.
    //    4.2 Declare one instance method.
      //  4.3 Declare one static method.
        // 4.4 Call all four instance and static variables into both instance and static methods inside the
       // print statement.
       // 4.5 Declare the Main method.
//        4.6 Call both instance and static methods into the Main method and run the programme.
public class JavaProgram4 {
   private int p = 15;
   private int q = 16;
   private static int r=7;
   private static int s=8;
    public void m1(){
        System.out.println("instanceVar1: " + p);
        System.out.println("instanceVar2: " + q);
        System.out.println("staticVar1: " + r);
        System.out.println("staticVar2: " + s);
    }
    public static void m2(){
        JavaProgram4 obj =new JavaProgram4();
        System.out.println("instanceVar1: " + obj.p);
        System.out.println("instanceVar2: " + obj.q);
        System.out.println("staticVar1: " + r);
        System.out.println("staticVar2: " + s);
        }
        public static void main (String [] args){
        JavaProgram4 obj1 =new JavaProgram4();
            obj1.m1();
            m2();
        }
    }


