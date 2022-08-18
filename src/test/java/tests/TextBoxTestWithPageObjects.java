package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;

public class TextBoxTestWithPageObjects extends TestBase{

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    @Test
    void firstTest() {
        String firstName = "Kris";
        String lastName = "Yerem";
        String email = "kriss@mail.com";
        String number = "1234567890";
        String link = "src/test/resources/cat.jpg";
        String address = "Some address";



        registrationFormPage.openPage()
                .setFirstName(firstName)
                .lastName(lastName)
                .setEmail(email)
                .setGender("Female")
                .setDaeOfBirth("09", "July", "1996")
                .setPhone(number)
                .setSubject("Chemistry")
                .setHobbies("Sports")
                .file(link)
                .setAddress(address)
                .setState("NCR")
                .setCity("Noida")
                .sendForm();

        registrationFormPage.checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", email)
                .checkResult("Gender", "Female")
                .checkResult("Mobile", number)
                .checkResult("Date of Birth", "09 July,1996")
                .checkResult("Subjects", "Chemistry")
                .checkResult("Hobbies", "Sports")
                .checkResult("Picture", "cat.jpg")
                .checkResult("Address", address)
                .checkResult("State and City", "NCR Noida");


    }

}