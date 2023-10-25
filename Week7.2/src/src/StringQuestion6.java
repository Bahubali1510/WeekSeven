package src;

//java program which replace a “I@love@java” to “we love java”
public class StringQuestion6 {
    public static void main (String [] args){
        String s = "I@love@java";
        s = s.replace("I@love@java" , "we love java");
        System.out.println(s);

    }
}
