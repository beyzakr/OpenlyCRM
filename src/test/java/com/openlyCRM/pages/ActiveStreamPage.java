package com.openlyCRM.pages;

import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveStreamPage {
    public ActiveStreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//span[.='Task']/span")
    public WebElement taskButton;

    @FindBy(xpath = "//input[@name='ACTION[0][ARGUMENTS][data][TITLE]']")
    public WebElement thingsToDo;

@FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement highPriority;

@FindBy(xpath = "//button[@class='ui-btn ui-btn-lg ui-btn-primary'][1]")
    public WebElement sendButton;



//--------

@FindBy(xpath = "(//a[@href='javascript:void(0);'])[5]")
   public WebElement addMoreButton;

@FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-name'])[5]")
    public WebElement hDesk9;

@FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-name'])[1]")
    public WebElement hr97;

@FindBy(xpath = "(//div[@class='bx-finder-box-item-t7-name'])[3]")
    public WebElement hr77;

@FindBy(xpath = "(//span[@class='menu-item-link-text'])[1]")
    public WebElement activityStream;

//----------

@FindBy(xpath = "//span[@class='tasks-task-mpf-link']")
    public WebElement checkList;

@FindBy(xpath = "//input[@class='js-id-checklist-is-form-title task-checklist-field-add']")
    public WebElement addCheckList;

@FindBy(xpath = "//span[@class='js-id-checklist-is-open-form task-dashed-link-inner']")
    public WebElement clickCheckList;

//-----------

@FindBy(xpath = "(//input[@class='task-options-inp'])[1]")
    public WebElement deadlineBox;

@FindBy(xpath = "(//a[.='4'])[1]")
    public WebElement july4;

@FindBy(xpath = "//span[.='Select']")
    public WebElement selectBtnDeadline;

@FindBy(xpath = "(//span[@class='task-dashed-link-inner'])[4]")
    public WebElement timePlaningBtn;

@FindBy(xpath = "(//input[@class='task-options-inp'])[2]")
    public WebElement startTaskOn;

@FindBy(xpath = "(//a[.='1'])[1]")
    public WebElement july1Start;

@FindBy(xpath = "(//input[@class='task-options-inp'])[2]")
    public WebElement startSelectBtn;

@FindBy(xpath = "(//input[@class='task-options-inp'])[3]")
    public WebElement durationBtn;



}
