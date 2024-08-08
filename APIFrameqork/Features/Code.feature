Feature: Validating Add Place Apis

Scenario: Verify if place is being successfully added using AddPlace Apis
	Given Add Place Payload
	When user calls AddPlace APis with post HTTP request
	Then the api call is success with the status code 200
	And status in response body is OK
	

