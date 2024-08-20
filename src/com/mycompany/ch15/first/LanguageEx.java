package com.mycompany.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Language language1 = new Language("짱구",5);
		
		System.out.println(language1.name);
		System.out.println(language1.version);
		
		System.out.println("---------------");
		
		List<Language> languages = new ArrayList<>();
		
//		list.add("daf"); //error : Language 객체를 넣어야 함 
		languages.add(language1);
		
		//방법1
		Language language2 = new Language("봉미선",30);
		Language language3 = new Language("신형만",35);
		
		languages.add(language2);
		languages.add(language3);
		
		//방법2
		languages.add(new Language("신짱아",1));
		
		System.out.println(language2.name);
		System.out.println(language2.version);
		
		System.out.println("-------------------");
		
		System.out.println(language3.name);
		System.out.println(language3.version);
		
		
		System.out.println("-------------------");
		
//		Car car = new Car("KIA" , 3000);
//		
//		List<Car> list2 = new ArrayList<>();
//		
//		list2.add(car);
//		
//		System.out.println(car.name);
//		System.out.println(car.cc);
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("BMW",3000));
		cars.add(new Car("KIA",2000));
		cars.add(new Car("HYUNDAI",1000));
		
		for(int i=0; i<cars.size(); i++) {
//			System.out.println("cars.get(" + i + ").name: " +cars.get(i).getName());
		}
		
		for(Car car : cars) {
			System.out.println("cars.getName: " + car.getName());
		}
		
		System.out.println("-------------------");
		
		languages.get(3).name = "철수"; //list에 3번째 변수에 이름을 철수로 바꾸겠다.
		
		for(int i=0; i<languages.size(); i++) {
//			System.out.println("i: " + i); //배열이 몇개 있는지
//			System.out.println(list.get(i)); //languages의 주소
			System.out.println("list.get("+ i + ").name: " + languages.get(i).name);
//			System.out.println("list.get("+ i + ").version: " + list.get(i).version);
		}
		
		System.out.println("---------------------");
		
		//많이 쓰는 방법 (향상된 for문)  데이터타입,변수명,collection변수명(사다리)맨 뒤
		
		for(Language language : languages) {
			System.out.println("language.name: " + language.name);
		}
		
		System.out.println("----------------------");
		
		
		
	}

}
