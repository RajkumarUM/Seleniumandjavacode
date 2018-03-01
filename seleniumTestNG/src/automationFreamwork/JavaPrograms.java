package automationFreamwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
			
			j= j+lis;			
		}
		System.out.println(j);
		
		Iterator<String> its = lis.iterator();	
		while(its.hasNext()){
			System.out.println(its.next());
		}
	}
	
	public static void setlist(){
		
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
	
	
	public static void main(String[] args) {
		//findLetterNumberSpecial();
		//reverseString();
		//Substrings();
		//vowles();
		//arraylists();
		setlist();
	}
}

