package com.itwill06.collection.car;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;





public class CarHashMapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("2344",3 );
		Car c2 = new Car("4566",4 );
		Car c3 = new Car("4567",5 );
		Car c4 = new Car("2389",6 );
		Car c5 = new Car("3908",7 );
		Car c6=  new Car("7891",8 );
		Car c7 = new Car("5656",9 );
		Car c8 = new Car("7789",10 );
		Car c9 = new Car("4690",11 );
		// 0.Car HashMap 객체생성 초기화
		HashMap<String,Car> carMap=new HashMap<String,Car>();	
		
		
		System.out.println("1.입차 9대");
		//1.차량객체생성
		carMap.put("2344",new Car("2344",3));
		carMap.put("4566",new Car("4566",4));
		carMap.put("4567",new Car("4567",5));
		carMap.put("2389",new Car("2389",6));
		carMap.put("3908",new Car("3908",7));
		carMap.put("7891",new Car("7891",8));
		carMap.put("5656",new Car("5656",9));
		carMap.put("7789",new Car("7789",10));
		carMap.put("4690",new Car("4690",11));
		 // 2.carMap저장
		System.out.println(carMap);
		 
		System.out.println("2.차량번호 7789번  차한대 정보출력");
		Car findCar=carMap.get("7789");
		findCar.print();
		
		System.out.println("3.입차시간 8시이후 차량여러대 찾아서 정보출력");
	//???
		
		System.out.println("4.7789번차량 12시 출차");
		//1. 7789번차량찾기
		//2. 출차
		//3. 영수증출력
		//4. 2389번차량 주차장에서 차량삭제
		Car outCar=carMap.remove("7789");
		outCar.setOutTime(12);
		outCar.calculateFee();
		outCar.print();
	
	
		 
		System.out.println("5. 7789번차량 출차후전체 차량출력");
		Set<String> keySet=carMap.keySet();
		Iterator<String> keyIterator=keySet.iterator();
		while(keyIterator.hasNext()) {
			
			String key=keyIterator.next();
			Car tempCar= carMap.get(key);
			tempCar.print();
		}
	}

}
