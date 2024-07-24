
Feature: Title of your feature
   
 Background:
  Given setup the entries in DataBase
  When launch the browser from config variables
  And hit the HomePage url of banking site
  @MobileTest @NetBanking
  Scenario: Admin Page default Login
  Given User is on NetBanking Landing Page.
  When User login into application with username "admin" and password "1234"
  Then Homepage is displayed
  And cards are displayed
   @SmokeTest @RegressionTest
  Scenario Outline: User Page default Login
  Given User is on NetBanking Landing Page.
  When User login into application with username "<username>" and password "<password>"
  Then Homepage is displayed
  And cards are displayed
  Examples:
  | username | password |
  | debituser| hello12  |
  |credituser| lop123   |