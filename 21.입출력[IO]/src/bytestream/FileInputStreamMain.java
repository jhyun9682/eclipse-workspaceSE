package bytestream;

import java.io.FileInputStream;

public class FileInputStreamMain {

	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("fileOut.dat");
		
		int readByte =fis.read();
		System.out.println("1.byte:"+Integer.toBinaryString(readByte));
		readByte=fis.read();
		System.out.println("2.byte:"+Integer.toBinaryString(readByte));
		
		readByte=fis.read();
		System.out.println("3.byte:"+Integer.toBinaryString(readByte));
		
		int byteCount=0;
		while(true) {
			readByte=fis.read();
			if(readByte==-1) {
				break;
			}
			byteCount++;
			System.out.println(Integer.toBinaryString(readByte));
		}
		System.out.println("FileInputStream.read()<-fileOut.date:"+byteCount+"바이트 읽음");
		fis.close();

	}

}

