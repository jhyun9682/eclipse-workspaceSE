package generic;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMain {

	public static void main(String[] args) {
		/*
		 * Collection 클래스
		 * -Collection 객체들의 utility메소드 제공
		 */
		ArrayList<Integer> intList= new ArrayList<Integer>();
		intList.add(34);
		intList.add(45);
		intList.add(78);
		intList.add(90);
		intList.add(23);
		intList.add(10);
		intList.add(99);
		intList.add(20);
		
		ArrayList<String> stringList=new ArrayList<String>();
		stringList.add("유재석");
		stringList.add("조세호");
		stringList.add("김경호");
		stringList.add("이효리");
		stringList.add("유재식");
		
		Collections.sort(intList);
		Collections.sort(stringList);
		System.out.println(intList);
		System.out.println(stringList);

	}

}
