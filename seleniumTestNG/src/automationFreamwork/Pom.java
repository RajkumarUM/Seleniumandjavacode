package automationFreamwork;

import java.util.StringTokenizer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class Pom {
//	 @FindBy(id="")WebElement username;
	//@FindBy(
	
	public void stringreverse(){
		String trimers = " testing is more";
		
		String rev ="";
		
		for(int i=trimers.length()-1;i>=0;i--){
			char a = trimers.charAt(i);
			rev += a;
		}
		System.out.println(rev);
	}
	
	
public static void main (String args[]){
	String rk = "tester";
	String trimer = " testing is more";
	System.out.println(rk.substring(0, 4));
	System.out.println(rk.toUpperCase());
	
	StringTokenizer tok = new StringTokenizer(trimer,"");
	
	System.out.println(trimer.trim());
	
	System.out.println(rk.startsWith("t"));
	
	System.out.println(rk.replace("test", "auto"));
	
	//string buffer
	
	
	StringBuffer edit = new StringBuffer("rajkumar");
	
	System.out.println(edit.reverse());
	
	//char ch[] = trimer.toCharArray();
	
	
}
	 
	 
}
