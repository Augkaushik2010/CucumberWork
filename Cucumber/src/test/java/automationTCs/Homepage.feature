Feature: HomePage of selenium hq

Scenario: Launching the HomePage of selenium hq
Given Selenium HQ URL
When Launch URL
Then Title Should be Selenium HQ

Scenario: Verify the Selenium Download link in Selenium HQ webpage
Given Selenium HQ URL
When Launch URL
Then Verify Selenium download link


