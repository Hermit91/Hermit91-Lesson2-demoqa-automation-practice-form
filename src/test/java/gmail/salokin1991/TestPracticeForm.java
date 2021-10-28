package gmail.salokin1991;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestPracticeForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
//        Configuration.browserSize = "1920x1080";

    }

    @Test
    void firstTest() {

        String uFN = "V";               //first name
        String uLN = "P";               //last name
        String uE = "Some@a.com";       //email
        String mN = "1234567890";       //mobile number
        String cD = "28 Oct 2021";      //current Date
        String bD = "7 oct 1952";       //birth date
        String iSubj = "History";       //subject
        String cA = "Covid bunker";     //current address

        String cState = "NCR";          //state
        String cCity = "Delhi";         //city

        String meme = "https://images.theconversation.com/files/177834/original/file-20170712-14488-19lw3sc.jpg";
                                        //picture link

        open("https://demoqa.com/automation-practice-form");

        $("#close-fixedban").click();           //close ad

        $("#submit").scrollIntoView(true);      //submit button

        $("#firstName").setValue(uFN);          //input first name
        $("#lastName").setValue(uLN);           //input lastname
        $("#userEmail").setValue(uE);           //input email
        $("#userNumber").setValue(mN);          //input mobile number
        $("#currentAddress").setValue(cA);      //input address
        


    }
}