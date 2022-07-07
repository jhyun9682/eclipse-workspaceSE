package bytestream.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputInputStreamMain {

	public static void main(String[] args) throws Exception{
		/*
		 * 자바의 기본데이터를 출력스트림에 쉽게쓸수 있도록 하는 필터스트림클래스
		 */
		
		DataOutputStream dos=
				new DataOutputStream(
						new FileOutputStream("dataOut.dat"));
		int intData=2147483647;
		dos.writeInt(intData);
		dos.writeByte(127);
		dos.writeBoolean(false);
		dos.writeDouble(3.1415987945);
		dos.writeChar('가');
		dos.writeUTF("오늘은 자바입출력을 공부합니다.");
		dos.close();
		System.out.println("DataOutputStream.writeXXX()--> dataOut.dat");
		/*
		 * 자바의기본데이터를 입력스트림으로부터  쉽게 읽을수있도록 하는 필터스트림클래스
		 */
		DataInputStream dis=
				new DataInputStream(
						new FileInputStream("dataOut.dat"));
		System.out.println("");
		System.out.println("DataOutputStream.readXXX()<-- dataOut.dat");
		
	

	}

}
