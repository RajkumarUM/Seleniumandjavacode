package automationFreamwork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;

public class JavaPrograms {
	
	

	public static void findLetterNumberSpecial() {
		String check = "1a2%$*()bc";
		String no = "";
		String alpa = "";
		String spe = "";

		for (int i = 0; i < check.length(); i++) {
			String a = check.charAt(i) + "";
			if (a.matches("[0-9]+")) {
				no += a;
			} else if (a.matches("[a-zA-Z]+")) {
				alpa += a;
			} else if (a.matches("[^A-Za-z0-9]")) {
				spe +=  a;
			}
		}
		System.out.println(no + " " + alpa + " " + spe);

	}
	
	public static void reverseString(){
		String check = "1a2%$*()bc";
		String reverse="";
		
		for(int i= check.length()-1;i>=0;i--){
			
			char c = check.charAt(i);
			
			reverse = reverse +c;
			
		}
		
		System.out.print(reverse);
	}
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
	

	public static void Substrings(){
		
		String rk ="rajkumar";
		
	   System.out.println(rk.substring(3, 8));
		
	}
	
	public static void vowles(){
		
		String vow = "raqewytiro2u2*(";
		String english="";
		
		for(int i=0;i<vow.length();i++){
			
			String vowels = vow.charAt(i)+"";
			
			if(vowels.matches("[aeiou]+")){
				english += vowels;
			}		
			
		}
		System.out.println(english);
		
	}
	
	public static void arrays(){
		int ar[]={1,2,6};
			
	}
	public static void arraylists(){
		
		String j = "";
		List<String> lis = new ArrayList<String>();
		
	lis.add("u");
	lis.add("raj");
	lis.add("kumar");
		
		for(String s:lis){
			int i =0;
			j= j+s;			
			i++;
		}
		System.out.println(j);
		
		Iterator<String> its = lis.iterator();	
		while(its.hasNext()){
			System.out.println(its.next());
		}
	}
	
	public static void set(){
		
		Set<String> lis = new HashSet<String>();
		
		lis.add("u");
		lis.add("raj");
		lis.add("kumar");
		lis.add("raj");
		
		Iterator its = lis.iterator();
		
		while(its.hasNext()){
			
			System.out.println(its.next());
		}
		
	}
	public static  void swapnumber(){
		
		int x = 50;
		int y = 60;
		System.out.println("x:is"+ x);
		System.out.println("y:is"+y );
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("x:is"+ x);
		System.out.println("y:is"+y );
		
		
	}

	public static void main(String[] args) throws IOException {
		//findLetterNumberSpecial();
		//reverseString();
		//Substrings();
		//vowles();
		//arraylists();
		//set();
		//swapnumber();
		reverseSelectedOnly();
	}
	
	
	
	
}

