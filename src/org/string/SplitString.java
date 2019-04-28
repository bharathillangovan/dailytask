package org.string;

public class SplitString {
			
	
	public void spl() 
	{
		String str = "asd*&fghj@#$%^&12gf3456";
		StringBuffer alpha = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer sym = new StringBuffer();
		
		for (int i = 0; i < str.length(); i++) 
	{
			if (Character.isDigit(str.charAt(i))) 
			
				num.append(str.charAt(i));
						
			
			else if (Character.isAlphabetic(str.charAt(i))) 
				
				alpha.append(str.charAt(i));
				
			
			
			else 
				sym.append(str.charAt(i));
				
	}
			System.out.println(alpha);
			System.out.println(num);
			System.out.println(sym);
			
		}



	
	
		public static void main(String[] args) {
			SplitString ss = new SplitString();
			ss.spl();
			
			
			
			
			
			
			
			

			
			
		}

		
		
		


}
