@B32G15-186
Feature: Default

	#_*As a user, I should be able to manage my works by creating a new board/list/card and modifying them under Deck Module.*_
	#
	#{color:#de350b}*_Acceptance Criteria_*{color}
	# # User can create a new board
	# # User can create a new list of card/task under any board
	# # User can add a new card/task on any list on the current board
	# # User can assign any card/task to himself/herself by using the three dots on the related card
	#h3. Attachments
	@B32G15-182
	Scenario: User can create a new board
		Scenario: Deck module
		  Given user log in with valid credentials
		  When user clicks on deck module
		  Then use clicks on add board
		  Then user is able to create new board	

	#_*As a user, I should be able to manage my works by creating a new board/list/card and modifying them under Deck Module.*_
	#
	#{color:#de350b}*_Acceptance Criteria_*{color}
	# # User can create a new board
	# # User can create a new list of card/task under any board
	# # User can add a new card/task on any list on the current board
	# # User can assign any card/task to himself/herself by using the three dots on the related card
	@B32G15-183
	Scenario: User can create a new list of card/task under any board
		Scenario: Deck module
		  Given user log in with valid credentials
		  When user clicks on deck module
		  Then use clicks on sprint 2 board
		  Then user is clicks in list name field
		  Then use is able to type in list name
		  Then user is able to click add list	

	#{color:#de350b}*User Story* *:*{color}
	#
	#_*As a user, I should be able to manage my works by creating a new board/list/card and modifying them under Deck Module.*_
	#
	#{color:#de350b}*_Acceptance Criteria_*{color}
	# # User can create a new board
	# # User can create a new list of card/task under any board
	# # User can add a new card/task on any list on the current board
	# # User can assign any card/task to himself/herself by using the three dots on the related card
	@B32G15-184
	Scenario: User can add a new card/task on any list on the current board
		Scenario: Deck module
		  Given user log in with valid credentials
		  When user clicks on deck module
		  Then use clicks on sprint 2 board
		  Then user is clicks in list name field
		  Then use is able to type in list name
		  Then user is able to click add list
		  Then user is able to click add card
		  Then usre is able to enter card name in card name field
		  Then user is able to click create button	

	#{color:#de350b}*User Story* *:*{color}
	#
	#_*As a user, I should be able to manage my works by creating a new board/list/card and modifying them under Deck Module.*_
	#
	#{color:#de350b}*_Acceptance Criteria_*{color}
	# # User can create a new board
	# # User can create a new list of card/task under any board
	# # User can add a new card/task on any list on the current board
	# # User can assign any card/task to himself/herself by using the three dots on the related card
	@B32G15-185
	Scenario: User can assign any card/task to himself/herself by using the three dots on the related card
		Scenario: Deck module
		  Given user log in with valid credentials
		  When user clicks on deck module
		  Then use clicks on sprint 2 board
		  Then user is clicks in list name field
		  Then use is able to type in list name
		  Then user is able to click add list
		  Then user is able to click add card
		  Then user is able to enter card name in card name field
		  Then user is able to click create button
		  Then user is able to click on three dots button
		  Then user is able to assing card/task to himself/herself