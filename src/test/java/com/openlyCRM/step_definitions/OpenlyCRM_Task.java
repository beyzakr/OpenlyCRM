package com.openlyCRM.step_definitions;

import com.openlyCRM.pages.ActiveStreamPage;
import com.openlyCRM.pages.CRM_LoginPage;
import com.openlyCRM.pages.TaskPage;
import com.openlyCRM.utilities.BrowserUtils;
import com.openlyCRM.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenlyCRM_Task {

CRM_LoginPage loginPage = new CRM_LoginPage();
ActiveStreamPage activeStreamPage = new ActiveStreamPage();
WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
TaskPage taskPage = new TaskPage();

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        loginPage.login();
    }
    @When("user clicks Task button under quick navigate menu")
    public void user_clicks_task_button_under_quick_navigate_menu() {
        activeStreamPage.taskButton.click();
    }
    @When("user type something in {string}")
    public void user_type_something_in(String string) {
        activeStreamPage.thingsToDo.sendKeys(string);
    }

    @When("user clicks the send button")
    public void user_clicks_the_send_button() {
        activeStreamPage.sendButton.click();
    }
    @Then("user should be able to see the high priority task sending successfully")
    public void user_should_be_able_to_see_the_high_priority_task_sending_successfully() {

        WebElement highPr = Driver.getDriver().findElement(By.xpath("//div[.='Task has been created']"));
        BrowserUtils.sleep(2);
        Assert.assertTrue(highPr.isDisplayed());

    }

    //------------------------------

/*    @Given("user is on the homepage and clicks Task button")
    public void user_is_on_the_homepage_and_clicks_task_button() {
        loginPage.login();
        activeStreamPage.taskButton.click();
    }
    @When("user type something in {string} window")
    public void user_type_something_in_window(String string) {
        activeStreamPage.thingsToDo.sendKeys(string);
    }
    @When("user click the High Priority button")
    public void user_click_the_high_priority_button() {
        activeStreamPage.highPriority.click();
    }*/

    @When("user click the High Priority button")
    public void user_click_the_high_priority_button() {
        activeStreamPage.highPriority.click();
    }

    @When("user click the add more button in Responsible person table")
public void user_click_the_add_more_button_in_responsible_person_table() {
    activeStreamPage.addMoreButton.click();

}

    @When("user assign a task to more than one user")
    public void user_assign_a_task_to_more_than_one_user() {
        activeStreamPage.hDesk9.click();
        activeStreamPage.hr97.click();
        activeStreamPage.hr77.click();

    }
    @Then("user should be able to send Task successfully")
    public void user_should_be_able_to_send_task_successfully() {

        activeStreamPage.sendButton.click();
        WebElement editTask = Driver.getDriver().findElement(By.xpath("//div[.='You can now view and edit the task.']"));
        Assert.assertTrue(editTask.isDisplayed());

 }
    @When("user click send button and send successfully")
    public void user_click_send_button_and_send_successfully() {
        activeStreamPage.sendButton.click();
    }

    @When("user click Activity Stream button")
        public void user_click_activity_stream_button() {
        activeStreamPage.activityStream.click();
    }

    @Then("user should be able to see the count on the homepage under MY Tasks table.")
    public void user_should_be_able_to_see_the_count_on_the_homepage_under_my_tasks_table() {

        Assert.assertTrue(activeStreamPage.activityStream.isDisplayed());
    }

    //------------

    @When("user click the checklist button")
        public void user_click_the_checklist_button() {
        activeStreamPage.checkList.click();
    }

    @Then("user should be able to add checklist items {string}")
    public void user_should_be_able_to_add_checklist_items(String string) {
        activeStreamPage.addCheckList.sendKeys(string);
        activeStreamPage.clickCheckList.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(activeStreamPage.clickCheckList.isDisplayed());

    }

    @When("user click the Deadline table")
    public void user_click_the_deadline_table() {
       activeStreamPage.deadlineBox.click();
    }

    @Then("should be able to select Deadline and clicks the select button")
    public void should_be_able_to_select_deadline_and_clicks_the_select_button() {
        activeStreamPage.july4.click();
        WebElement deadlineBox = Driver.getDriver().findElement(By.xpath("(//input[@class='task-options-inp'])[1]"));
        BrowserUtils.sleep(2);
        activeStreamPage.selectBtnDeadline.click();
        Assert.assertTrue(deadlineBox.isDisplayed());

    }


    //--------------------

    @When("user click the time planing button")
    public void user_click_the_time_planing_button() {
        activeStreamPage.timePlaningBtn.click();
    }
    @When("user click the start task on")
    public void user_click_the_start_task_on() {
        activeStreamPage.startTaskOn.click();
    }
    @When("select the tasks start date and click select")
    public void select_the_tasks_start_date_and_click_select() {
        activeStreamPage.july1Start.click();
        activeStreamPage.startSelectBtn.click();
    }
    @When("user clicks the duration and gives only number {string}")
    public void user_clicks_the_duration_and_gives_only_number(String string) {
        activeStreamPage.durationBtn.click();
        activeStreamPage.durationBtn.sendKeys("3");
    }
    @Then("user should be able to see the Finish date is automatically given and clicks the send button")
    public void user_should_be_able_to_see_the_finish_date_is_automatically_given_and_clicks_the_send_button() {
        activeStreamPage.sendButton.click();
        WebElement verifyTask = Driver.getDriver().findElement(By.xpath("//div[.='Task has been created']"));
        BrowserUtils.sleep(2);


        Assert.assertTrue(verifyTask.isDisplayed());
    }



}
