package com.mycompany.ch15.first;

import java.util.ArrayList;

public class Language2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Language> languages = new ArrayList<>();
		
		languages.add(new Language("신짱구" , 5 ));
		languages.add(new Language("신짱아" , 0 ));
		languages.add(new Language("신형만" , 34 ));
		languages.add(new Language("봉미선" , 29 ));
		
		for(int i=0; i<languages.size(); i++) {
			System.out.println("languages.get(" + i + ").name: " + languages.get(i).name);
		}
		
		System.out.println("-----------------------");
		
		for(Language language : languages) {
			System.out.print("language.name: " + language.name);
			System.out.println(" language.version: " + language.version);
		}
		
	}

}
