package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalenderComponent {

        public void setDate(String day, String month, String year) {
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--" + String.format("%3s", day).replace(' ', '0') + ":not(react-datepicker__day--outside-month").click();
    }
}