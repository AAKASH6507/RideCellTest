@RDCELL001
Feature: SDET TEST

Background:
   * url baseURL
   * def homeXpath =  read(karate.properties['user.dir'] + '/src/test/resources/Locators/homepage/homelocators.json')
   * def sleep = function(millis){ java.lang.Thread.sleep(millis) }
   * eval sleep(1000)

  @GETALLREPOSBYORGANIZATION
  Scenario Outline: Get All Repositories Details from Project
    Given path 'orgs'
    And path '<Organization>'
    And path 'repos'
    And print url
    And method get
    Then status 200
    * def description = karate.jsonPath(response,"$..description")
    * karate.log('Reterive Description of Repositories')
    * def reponame = karate.jsonPath(response,"$..name")
    * karate.log('Reterive name of Repositories')
    And print response.length
    And print description
    And print reponame
    And karate.log('Successffull list ')
   
     Examples:
    | Organization   |
    | django |
    
    
    @VALIDATEUI
    Scenario: Validate UI Features
    Given driver 'https://github.com/django'
    * retry(10).waitFor(homeXpath.homePage.repositoryButton)
    And click(homeXpath.homePage.repositoryButton)
 