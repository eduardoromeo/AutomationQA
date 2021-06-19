package ui;

import org.openqa.selenium.By;

public class EmployeeUIBuy {
    public static By form = By.id("formEmployee");
    public static By Button = By.cssSelector("#homefeatured [data-id-product='1'] > span");
    public static By addButton = By.xpath("//ul[@id='homefeatured']/li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//span[.='Add to cart']");
}
