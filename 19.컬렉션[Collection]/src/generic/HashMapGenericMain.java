package generic;

import java.util.HashMap;

import nogeneric.Car;

public class HashMapGenericMain {

	public static void main(String[] args) {
		HashMap<String,Car> carMap=new HashMap<String,Car>();
		System.out.println("# map size:"+carMap.size());
		
		//put
		carMap.put("1111",new Car("1111",12));
		carMap.put("2222",new Car("2222",13));
		carMap.put("3333",new Car("3333",14));
		carMap.put("4444",new Car("4444",15));
		carMap.put("5555",new Car("5555",16));
		System.out.println("# map size:"+carMap.size());
		System.out.println(carMap);
		carMap.put("3333",new Car("삼삼삼",20));
		System.out.println("# map size:"+carMap.size());
		System.out.println(carMap);
		
		//get
		Car getCar=carMap.get("3333");
		getCar.print();
		getCar=carMap.get("5555");
		getCar.print();
		
		if(carMap.containsKey("4444")) {
			getCar=carMap.get("4444");
			getCar.print();
			
		}else {
			System.out.println("4444키 존재안함");
			
		}
		//remove
		Car removeCar =carMap.remove("3333");
		removeCar.print();
		System.out.println("# map size:"+carMap.size());
		System.out.println(carMap);
		System.out.println("##########iteration반복[전체출력]###############");
		
		System.out.println("%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%");
		
		System.out.println("1.전체차량출력");
		
		System.out.println("2.입차");
		Car newCar=new Car("2389",21);
		carMap.put(newCar.getNo(), newCar);
		
		System.out.println("3.차량번호 2389차량 한대 정보출력");
		Car findCar=carMap.get("2389");
		findCar.print();
		
		System.out.println("4.입차시간 15시 이후 차량 여러대찾기");
		
		System.out.println("5.2389차량 24시출차");
		Car outCar=carMap.remove("2389");
		outCar.setOutTime(24);
		outCar.calculateFee();
		outCar.print();
		

	}

}
