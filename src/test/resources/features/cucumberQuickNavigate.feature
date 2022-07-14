@OPC-1072
Feature: Default

	Background:
		#@OPC-1065
		Given user is on the homepage
		When user clicks Task button under quick navigate menu
		And user type something in "Things to do"
		And user click the High Priority button
		

	#_*US:*_
	#
	# As a user, I should be able to assign tasks under Quick Navigate Menu .
	#
	#_*AC1:*_
	#
	#HR User should be able to create a "High priority" tasks with the mandatory fields.
	#
	# 
	@OPC-1066
	Scenario: Verify that users create High Priority tasks
		And user clicks the send button
		Then user should be able to see the high priority task sending successfully	

	#_*US:*_
	#
	#As a user, I should be able to assign tasks under Quick Navigate Menu .
	#
	#_*AC2:*_
	#
	#HR User should be able to assign a task to more than one user (Test with adding 3 users max.)
	#
	# 
	@OPC-1067
	Scenario: Verify that user assign a task to more than one user.
		And user click the add more button in Responsible person table
		And user assign a task to more than one user
		Then user should be able to send Task successfully	

	#_*US:*_
	#
	#As a user, I should be able to assign tasks under Quick Navigate Menu .
	#
	#_*AC3:*_
	#
	#When task(s) is(are) created, they can be seen on the count on the homepage under "MY TASKS" table.
	@OPC-1068
	Scenario: Verify that task is created, user can be seen on the "MY TASKS" table.
		And user click the add more button in Responsible person table
		And user assign a task to more than one user
		And user click send button and send successfully
		And user click Activity Stream button
		Then user should be able to see the count on the homepage under MY Tasks table.	

	#_*US:*_
	#
	#As a user, I should be able to assign tasks under Quick Navigate Menu 
	#
	#_*AC4:*_
	#
	#Checklist should be able to be added while creating a task.
	@OPC-1069
	Scenario: Verify that user can be added checklist while creating task
		And user click the add more button in Responsible person table
		And user assign a task to more than one user
		And user click the checklist button
		Then user should be able to add checklist items "Things to do"	

	#_*US:*_
	#
	#As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#_*AC5:*_
	#
	#Deadline should be able to be added while creating a task.
	@OPC-1070
	Scenario: Verify that deadline should be able to be added while creating a task.
		And user click the add more button in Responsible person table
		And user assign a task to more than one user
		And user click the checklist button
		And user should be able to add checklist items "Things to do"
		And user click the Deadline table
		Then should be able to select Deadline and clicks the select button	

	#_*US:*_
	#
	#As a user, I should be able to assign tasks under Quick Navigate Menu
	#
	#_*AC6:*_
	#
	#Time planning function should be able to be used in the setting of deadline.
	@OPC-1071
	Scenario: Verify that Time planning function should be able to be used in the setting of deadline.
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