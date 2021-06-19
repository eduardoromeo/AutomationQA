package task;

import actions.IsDisplayed;
import org.openqa.selenium.WebDriver;
import ui.EmployeeUIBuy;

public class IsEmployeePageDisplayed {
    public static boolean form(WebDriver webDriver) {

        return IsDisplayed.element(webDriver, EmployeeUIBuy.form);
    }
}