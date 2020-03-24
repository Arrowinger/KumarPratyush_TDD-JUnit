package com.epam.Remove2Characters;

public class RemoveFirst2A {

	public String remove(String string) {
		
		String newString ;
		if(string.isEmpty()) {
			newString = "";
		}
		else 
		if(string.length() == 1) {
			if(string.charAt(0) == 'A') {
				newString = "";
			}else {
				newString = string;
			}
		}
		else
		{
			int count = 0;
			for(int i=0;i<2;i++) {
				char ch = string.charAt(i);				
				if(ch == 'A') {
					count++;
				}				
			}
			if(string.charAt(0) != 'A' && string.charAt(1) == 'A')
			{
				newString = ""+string.charAt(0)+string.substring(count+1);				
			}
			else
			{
				newString = string.substring(count);
			}
		}
		
		return newString;
	}
		

}
