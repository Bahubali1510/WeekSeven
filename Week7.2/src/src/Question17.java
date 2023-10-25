package src;

public class Question17 {

    private String city;


    private static String country = "Your Country";

        public void printCityAndCountry() {
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
    }


    public static void printCountryFromStaticMethod(Question17 cityInfo) {
        System.out.println("Country from Static Method: " + country);
    }

    public static void main(String[] args) {

        Question17 myCityInfo = new Question17();
        myCityInfo.city = "Your City";

        myCityInfo.printCityAndCountry();
        printCountryFromStaticMethod(myCityInfo);
    }
}
