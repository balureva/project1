package org.company;

public class CompanyInfo {

	private void companyName(int id,long phoneno,String name) {

		System.out.println("Employee id"+id+"\tEmployee phoneno"+phoneno+"Employee name"+name);
		
	}
	private void companyName(int id,long phoneno,String name,char Gender) {
        
		System.out.println("Employee id"+id+"\tEmployee phoneno"+phoneno+"Employee name"+name+"\nEmployee gender"+Gender); 
		
		
		
	}
	public static void main(String[] args) {
		CompanyInfo b=new CompanyInfo();
		
		b.companyName(1234, 8428086022l, "rine");
		b.companyName(1234, 8428086022l, "bala", 'm');
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
