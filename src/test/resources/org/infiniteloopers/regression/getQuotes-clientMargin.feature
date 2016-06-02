@getQuotes

  Feature: validate the client margin for RichClient

  Background:

    Given system connects to "falcon" database as per Configuration

    Scenario: Validate the client margin for rate category ABCDEF and currency pair USD-SGD
      Given user has rateCategoryId as "ABCDEF"
      And user makes a GET call to "http://falconservice:8000/falcon/v1/quotes-services/RC/ABCDEF" endpoint
      Then response status code should be 200