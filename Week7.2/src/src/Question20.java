package src;

public class Question20 {


        static String spain = "Spain";


        String unitedKingdom = "United Kingdom";


        public void homeCountry() {
            System.out.println("My home country is " + spain);
        }


        public static void holidays(Question20 example) {
            System.out.println("I want to visit " + example.unitedKingdom + " during the holidays.");
        }

        public static void main(String[] args) {
            // Step 20.5: Call both methods in the main method.
            Question20 example = new Question20();
            example.homeCountry();
            holidays(example);
        }
    }


