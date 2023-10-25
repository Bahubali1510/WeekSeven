package src;

public class Question19 {


        String member1 = "abc";

         static String member2 = "pqr";


        void selenium() {
            String localVariable1 = "Selenium";
            System.out.println("Instance Method - Group Member: " + member1);
            System.out.println("Local Variable (selenium): " + localVariable1);
        }


        static void agile() {
            String localVariable2 = "Agile";
            System.out.println("Static Method - Group Member: " + member2);
            System.out.println("Local Variable (agile): " + localVariable2);
        }

        public static void main(String[] args) {
            // 19.5 Call both user-defined methods into the main method
            Question19 group = new Question19();
            group.selenium();
            agile();

            String localVariable3 = "Main";
            System.out.println("Local Variable (main): " + localVariable3);
        }
    }


