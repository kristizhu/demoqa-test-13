package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    TestData testData = new TestData();
    @BeforeAll
    static void conf(){
        Configuration.baseUrl ="https://demoqa.com";
        Configuration.browserSize = "1366x768";
        Configuration.browserPosition = "00x00";
    }
}
