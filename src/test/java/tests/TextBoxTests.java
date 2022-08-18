/*package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void conf(){
        Configuration.baseUrl ="https://demoqa.com";
        Configuration.browserSize = "1366x768";
        Configuration.browserPosition = "00x00";
    }

    @Test
    void firstTest(){
        open("/automation-practice-form");

        // Some staff
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        // Text
        $("[id= firstName]").setValue("Kris");
        $("[id= lastName]").setValue("Yerem");
        $("[id= userEmail]").setValue("kriss@mail.com");

        // Radio
        $("[for='gender-radio-2']").click();
        $("[id=userNumber]").setValue("1234567890");

        // Date
        $("[id=dateOfBirthInput]").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1996");
        $("[aria-label = 'Choose Tuesday, July 9th, 1996']").click();

        //Subject
        $("#subjectsInput").sendKeys("Chemistry");
        $("#subjectsInput").pressEnter();

        //Checkboxes
        $("[for='hobbies-checkbox-1']").click();


        //File
        $("[id=uploadPicture]").uploadFile(new
                File("src\\test\\resources\\cat.jpg"));

        //Address
        $("[id=currentAddress]").setValue("Some address");

        //Lists
        $("[id=react-select-3-input]").setValue("NCR").pressEnter();
        $("[id=react-select-4-input]").setValue("Noida").pressEnter();

        //Button
        $("#submit").click();


        //Checks
        $(".table-responsive").shouldHave(
                text("Kris"),
                text("kriss@mail.com"),
                text("Female"),
                text("1234567890"),
                text("9 July,1996"),
                text("Chemistry"),
                text("Sports"),
                text("cat.jpg"),
                text("Some address"),
                text("NCR Noida")
        );
    }

}

 */