Feature: this is feature 3

  Scenario: Successful Login with Valid Credentials
  
    #for single/multiple rows with single/multiple columns List<Map<String,String>>
    When User enters Credentials to LogIn
      | Username   | Password |
      | testuser_1 | Test@153 |
      | testuser_2 | Test@154 |
      
    #for both single/multiple rows  List<List<String>>
    When User enters Credentials to LogIn1
      | testuser_1 | Test@153 |
      | testuser_2 | Test@154 |
      | testuser_3 | Test@155 |

    #Map<String,String>
    When User enters Credentials to LogIn2  
    | Username | testuser_1 |
    | Password | Test@153 |
    

    #List<String>
    #for both Single/multiple values but single column only
    When User enters Credentials to LogIn4   
      | testuser_1 |
      | testuser_2 |
      | testuser_3 |  
     
    #same code as for Login but need to add this line as first line inside method------usercredentials = usercredentials.transpose();
    #When User enters Credentials to LogIn8
    #| Username | testuser_1 | testuser_2 |
    #| Password | Test@153 | Test@154 |      