package tests;

import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;

import java.util.Locale;
import static com.codeborne.selenide.Selenide.$;
import java.util.Random;

public class TestData {

    Faker fakerRussian = new Faker(new Locale("ru"));
    Faker fakerEnglish = new Faker(new Locale("en"));

    String firstName = fakerRussian.address().firstName();
    String lastName = fakerRussian.address().lastName();
    String email = fakerEnglish.internet().emailAddress();
    String gender = GetTestData.getGenderFromSite();
    String phone = String.valueOf(fakerRussian.number().randomNumber(10, true));
    String birthDay = String.valueOf(fakerEnglish.number().numberBetween(1, 28));
    String birthMonth = GetTestData.randomMonth();
    String birthYear = String.valueOf(fakerEnglish.number().numberBetween(1995, 2022));
    String birthDate = birthDay + " " + birthMonth + "," + birthYear;
    String subject = "Chemistry";
    String hobby = GetTestData.getHobbyFromSite();
    String fileLink = "src/test/resources/cat.jpg";
    String fileName = "cat.jpg";
    String address = fakerRussian.address().fullAddress();
    String state = "NCR";
    String city = "Noida";

    public static class GetTestData {
        static Faker fakerEnglish = new Faker(new Locale("en"));

        public static String getGenderFromSite() {
            Selenide.open("https://demoqa.com/automation-practice-form");
            var genders = $("#genterWrapper").$$("input");
            return genders.get(fakerEnglish.number().numberBetween(0, genders.size() - 1)).getValue();
        }

        public static String getHobbyFromSite() {
            Selenide.open("https://demoqa.com/automation-practice-form");
            var hobbies = $("#hobbiesWrapper").$$("label");
            return hobbies.get(fakerEnglish.number().numberBetween(0, hobbies.size() - 1)).getText();
        }
        public static String randomMonth() {
            String[] month = {"January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"};
            Random random = new Random();
            String randomMonths = month[random.nextInt(month.length)];
            return randomMonths;
        }
    }
}