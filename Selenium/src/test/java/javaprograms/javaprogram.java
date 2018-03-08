package javaprograms;

import org.testng.annotations.Test;

public class javaprogram {

  public void ReverseString() {
	  
		String check = "1a2%$*()bc";
		String reverse="";
		
		for(int i= check.length()-1;i>=0;i--){
			
			char c = check.charAt(i);
			
			reverse = reverse +c;
			
		}
		
		System.out.print(reverse);
	}

	public static void Substrings(){
		
		String rk ="rajkumar";
		
	   System.out.println(rk.substring(3, 8));
		
	}
  @Test(priority=1)
	public static void reverseSelectedOnly(){
		
		String sour= "rajkumar";
		String iden ="";
		String reversed="";
		for(int i =0;i<sour.length();i++){
			
			String cap = sour.charAt(i)+"";
			
			if(cap.matches("[kum]+")){
				
				iden+=cap;
			}
			}
		for(int j=iden.length()-1;j>=0;j--){
		
		char c =  iden.charAt(j);
		
		reversed = reversed + c;
		}
	System.out.println(reversed);
	
	}
	
  
  
  
  
  }

