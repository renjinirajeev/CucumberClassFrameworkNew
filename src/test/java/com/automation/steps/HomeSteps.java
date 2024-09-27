package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomeSteps {

    HomePage homePage = new HomePage();
    static List<String> itemsOnCart = new ArrayList<>();

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("user click on add to cart button for {string}")
    public void user_click_on_add_to_cart_button_for_item(String item) {
        itemsOnCart.add(item);
        homePage.clickOnAddToCartButtonForItem(item);
    }

    @Then("verify cart icon displays cart value to {string}")
    public void verify_cart_icon_displays_cart_value_to(String cartValue) {
        Assert.assertEquals(cartValue, homePage.getCartValue());
    }

    @When("user click on cart icon")
    public void user_click_on_cart_icon() {
        homePage.clickOnCartIcon();
    }


}
