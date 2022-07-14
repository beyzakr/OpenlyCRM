Feature: As a user, I should be able to assign tasks  under Quick Navigate Menu .

  Background:
    Given user is on the homepage
    When user clicks Task button under quick navigate menu
    And user type something in "Things to do"
    And user click the High Priority button


  Scenario: HR User should be able to create a "High priority" tasks with the mandatory fields.
    And user clicks the send button
    Then user should be able to see the high priority task sending successfully


  Scenario: HR User should be able to assign a task to more than one user (Test with adding 3 users max.)

   And user click the add more button in Responsible person table
   And user assign a task to more than one user
   Then user should be able to send Task successfully


  Scenario: When task(s) is(are) created, they can be seen on the count on the homepage under "MY TASKS" table.

    And user click the add more button in Responsible person table
    And user assign a task to more than one user
    And user click send button and send successfully
    And user click Activity Stream button
    Then user should be able to see the count on the homepage under MY Tasks table.


  Scenario: Checklist should be able to be added while creating a task.

     And user click the add more button in Responsible person table
     And user assign a task to more than one user
     And user click the checklist button
     Then user should be able to add checklist items "Things to do"


  Scenario: Deadline should be able to be added while creating a task.

    And user click the add more button in Responsible person table
    And user assign a task to more than one user
    And user click the checklist button
    And user should be able to add checklist items "Things to do"
    And user click the Deadline table
    Then should be able to select Deadline and clicks the select button



  Scenario: Time planning function should be able to be used in the setting of deadline.

    And user click the add more button in Responsible person table
    And user assign a task to more than one user
    And user click the checklist button
    And user should be able to add checklist items "Things to do"
    And user click the Deadline table
    And should be able to select Deadline and clicks the select button
    And user click the time planing button
    And user click the start task on
    And select the tasks start date and click select
    And user clicks the duration and gives only number "3"
    Then user should be able to see the Finish date is automatically given and clicks the send button










