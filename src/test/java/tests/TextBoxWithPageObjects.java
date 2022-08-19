package tests;

import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;

public class TextBoxWithPageObjects extends TestBase{

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    @Test
    void firstTest() {


        registrationFormPage.openPage()
                .setFirstName(testData.firstName)
                .lastName(testData.lastName)
                .setEmail(testData.email)
                .setGender(testData.gender)
                .setDaeOfBirth(testData.birthDay, testData.birthMonth,
                        testData.birthYear)
                .setPhone(testData.phone)
                .setSubject(testData.subject)
                .setHobbies(testData.hobby)
                .file(testData.fileLink)
                .setAddress(testData.address)
                .setState(testData.state)
                .setCity(testData.city)
                .sendForm();

        registrationFormPage.checkResult("Student Name", testData.firstName + " " + testData.lastName)
                .checkResult("Student Email", testData.email)
                .checkResult("Gender", testData.gender)
                .checkResult("Mobile", testData.phone)
                .checkResult("Date of Birth", testData.birthDate)
                .checkResult("Subjects", testData.subject)
                .checkResult("Hobbies", testData.hobby)
                .checkResult("Picture", testData.fileName)
                .checkResult("Address", testData.address)
                .checkResult("State and City", testData.state + " " + testData.city);


    }

}