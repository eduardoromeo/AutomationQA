package task;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.EmployeeUIBuy;

public class Employee {
    public static void as(WebDriver driver){
        Click.on(driver, EmployeeUIBuy.Button);
        Click.on(driver, EmployeeUIBuy.addButton);
    }
}
