/*
 배열(타입):  
      - 같은데이타형을 가진 멤버변수(기억장소)여러개의 모음타입 
      - 배열타입변수의 선언형식
           데이타타입[] 이름; 
	  - 사용: 
	       1.배열객체의생성	
		   2.배열객체의 초기화 
      -특징   
		  1.모든 배열형의 변수는 참조변수이다.
		    (배열은 객체다.)
		    int i;  vs  int[] ia;
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */
public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		int intType;
		intType=90;
		
		int[] intArray;
		intArray = new int[5];
		System.out.println(intArray);
		intArray[0]=90;
		intArray[1]=78;
		intArray[2]=56;
		intArray[3]=13;
		intArray[4]=81;
		
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		System.out.println("----------for문-----------");
		for(int i=0;i<5;i++) {
			System.out.println(intArray[i]);
		}
		/*
		 * 모든배열객체는 public int length; 를멤버변수로가진다
		 */
		int length = intArray.length;
		System.out.println("배열객체의멤버필드 갯수:"+length);
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("-------------기본형 1차원[]배열-------------");
		System.out.println("------------int[]--------------");
		int[] korArray=new int[10];
		korArray[0]=80;
		korArray[1]=56;
		korArray[2]=99;
		korArray[3]=34;
		korArray[4]=78;
		korArray[5]=90;
		korArray[6]=93;
		korArray[7]=56;
		korArray[8]=77;
		korArray[9]=38;
		
		int korTot=0;
		for(int i=0;i<korArray.length;i++) {
			korTot=korTot+korArray[i];
		}
		System.out.println("우리반국어총점:"+korTot);
		double korAvg = (double)korTot/korArray.length; 
		System.out.println("우리반국어평균:"+korAvg);
		System.out.println("------------char[]--------------");
		char[] ca=new char[6];
		ca[0]='H';
		ca[1]='e';
		ca[2]='l';
		ca[3]='l';
		ca[4]='o';
		ca[5]='!';
		for(int i=0;i<ca.length;i++) {
			System.out.print(ca[i]+" ");
		}
		System.out.println();
		System.out.println("--------------boolean[]------------");
		boolean[] ba=new boolean[5];
		ba[0]=true;
		ba[1]=false;
		ba[2]=true;
		ba[3]=true;
		ba[4]=false;
		int trueCount=0;
		/*
		 * enhanced for문
		 */
		for(boolean tempElement:ba) {
			System.out.println(tempElement);
			if(tempElement) {
				trueCount++;
			}
		}
		System.out.println("true count:"+trueCount);
		System.out.println("------------String[]--------------");
		String[] strArray=new String[5];
		strArray[0]="KIM";
		strArray[1]="LEE";
		strArray[2]="PARK";
		strArray[3]="CHOI";
		strArray[4]="SIM";
		System.out.println("---------for----------");
		for(int i=0;i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
		System.out.println("--------enhanced for----------");
		for(String tempStr:strArray) {
			System.out.println(tempStr);
		}
		
	}

}














