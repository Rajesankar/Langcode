package org.lang;

public class LanguageInfo {
	private void tamilLan() {
		System.out.println("People speaks Tamil 50%");

	}private void englan() {
		System.out.println("People speaks English 30%");

	}private void hindiLan() {
		System.out.println("People speaks Hindi 20%");

	}
	

	public static void main(String[] args) {
		
		LanguageInfo i=new LanguageInfo();
		i.tamilLan();
		i.englan();
		i.hindiLan();
		
		
		System.out.println("Raje code added");		
	}

}
