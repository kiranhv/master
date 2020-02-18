Feature: Person from Wales need to what help he can get with NHS costs

	Scenario: Person from Wales need to what help he can get with NHS costs
	Given I am a person from Wales
	When I put my circumstances into the Checker tool
	Then I should get a result of whether I will get help or not