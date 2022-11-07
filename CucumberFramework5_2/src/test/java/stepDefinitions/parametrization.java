package stepDefinitions;

import java.util.List;
import java.util.Map;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;

public class parametrization {
	
	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(DataTable usercredentials) {
		
		for (Map<String, String> data : usercredentials.asMaps(String.class, String.class))
			System.out.println(data.get("Username") + "----"+ data.get("Password"));  

		List<Map<String,String>> data1 = usercredentials.asMaps();
		for(int i=0; i<data1.size(); i++) 
			System.out.println(data1.get(i).get("Username") + "----"+ data1.get(i).get("Password")); 
		
		for(Map<String, String> data2 : data1)
			System.out.println(data2.get("Username") + "----" + data2.get("Password")); 
	}
	
	@When("User enters Credentials to LogIn1")
	public void user_enters_credentials_to_log_in1(DataTable usercredentials) {

		List<List<String>> data1 = usercredentials.asLists();
		for(int i=0; i<data1.size(); i++)
			for(int j=0; j<data1.get(i).size(); j++) 
				System.out.println(data1.get(i).get(j)); 
		
		for(List<String> data2 : data1)
			System.out.println(data2.get(0) + "----" + data2.get(1)); 
	}
		
	@When("User enters Credentials to LogIn2")
	public void user_enters_credentials_to_log_in2(DataTable usercredentials)  {
		
		Map<String,String> data1 = usercredentials.asMap();
		System.out.println(data1.get("Username") + "----" + data1.get("Password")); 
	}
	
	@When("User enters Credentials to LogIn4")
	public void user_enters_credentials_to_log_in4(DataTable usercredentials) {

		List<String>data1 = usercredentials.asList();
		System.out.println(data1.get(0) + "----" + data1.get(1) + "----" + data1.get(2)); 
		for(String s : data1)
			System.out.println(s);
		System.out.println(data1); 
	}
}
