package src;

public class Question18 {


        static String councilName = "Harrow";

        int houseNumber;

            void borough() {
            System.out.println("Council Name: " + councilName);
        }

        static void address(Question18 councilInfo) {
            System.out.println("House Number: " + councilInfo.houseNumber);
        }

        public static void main(String[] args) {
            // Step 18.5: Call both user-defined methods into the main method.
            Question18 myCouncilInfo = new Question18();
            myCouncilInfo.houseNumber = 123;

            myCouncilInfo.borough();
            address(myCouncilInfo);
        }
    }


