package com.automation.steps;

import com.automation.pages.CheckoutPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("verify user is on checkout page")
    public void verify_user_is_on_checkout_page() {
        Assert.assertTrue("user is not in checkout page",checkoutPage.isCheckoutPageDisplayed());
    }

    @Then("verify item prices display correctly on checkout page")
    public void verify_item_prices_display_correctly_on_checkout_page() {
        Assert.assertTrue(checkoutPage.isFinalPriceIsMatchingWithItemTotalPrice());
    }
}
