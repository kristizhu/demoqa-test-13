package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalenderComponent;
import pages.components.ResultsTableComponent;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {
    CalenderComponent calenderComponent = new CalenderComponent();
    ResultsTableComponent resultsTableComponent = new ResultsTableComponent();

    SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("[id= userEmail]"),
            gender = $("#genterWrapper"),
            date = $("[id=dateOfBirthInput]"),
            phoneInput = $("[id=userNumber]"),
            subject = $("#subjectsInput"),
            hobbies = $("#hobbiesWrapper"),
            file = $("#uploadPicture"),
            address = $("[id=currentAddress]"),
            state = $("#react-select-3-input"),
            city = $("#react-select-4-input"),
            submit = $("#submit");


    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return this;
    }

    public RegistrationFormPage setFirstName(String value)
    {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage lastName(String value)
    {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setEmail(String value)
    {
        emailInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setGender(String value)
    {
        gender.$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage setDaeOfBirth(String day, String month, String year)
    {
        date.click();
        calenderComponent.setDate(day, month, year);
        return this;
    }

    public RegistrationFormPage setPhone(String value)
    {
        phoneInput.setValue(value);
        return this;
    }

    public RegistrationFormPage setSubject(String value)
    {
        subject.sendKeys(value);
        subject.pressEnter();
        return this;
    }

    public RegistrationFormPage setHobbies(String value)
    {
        hobbies.$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage File(String value)
    {
        file.uploadFile(new File(value));
        return this;

    }

    public RegistrationFormPage setAddress(String value)
    {
        address.setValue(value);
        return this;
    }

    public RegistrationFormPage setState(String value) {
        state.setValue(value).pressEnter();
        return this;
    }

    public RegistrationFormPage setCity(String value) {
        city.setValue(value).pressEnter();
        return this;
    }

    public RegistrationFormPage sendForm()
    {
        submit.click();
        return this;
    }

    public RegistrationFormPage checkResult(String key, String value)
    {
        resultsTableComponent.checkResult(key, value);
        return this;
    }
}