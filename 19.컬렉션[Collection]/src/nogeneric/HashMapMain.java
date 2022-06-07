package nogeneric;

import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap carMap=new HashMap();
		System.out.println("# map size:"+carMap.size());
		System.out.println("*********1.put**********");
		Car c1=new Car("1111",12);
		carMap.put("1111",c1);
		carMap.put("2222",new Car("2222",13));
		carMap.put("3333",new Car("3333",15));
		carMap.put("4444",new Car("4444",16));
		carMap.put("5555",new Car("5555",17));
		System.out.println("# map size:"+carMap.size());
		System.out.println(carMap);
		//동일한 키값이 존재하지않는다[키 중복허용X]
		
		carMap.put("3333", new Car("삼삼삼삼",23));
		System.out.println("# map size:"+carMap.size());
		System.out.println(carMap);
		System.out.println("******2.get(key)******");
		Car getCar=(Car)carMap.get("3333");
		getCar.print();
		System.out.println("******3.remove(key)******");
		Car removeCar=(Car) carMap.remove("3333");
		removeCar.print();
		System.out.println("# map size:"+carMap.size());
		System.out.println(carMap);
		
		
		
		

	}

}
