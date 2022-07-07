package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileCopyMain {

	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("ChromeSetup.exe");
		FileOutputStream fos=new FileOutputStream("ChromeSetup_copy.exe");
		
		int byteCount=0;
		int startCount=0;
		long copyStartTime=System.currentTimeMillis();
		
		while(true) {
			int readByte=fis.read();
			if(readByte==-1) break;
			byteCount++;
			if(byteCount%1024==0) {
				
				System.out.print("*");
				startCount++;
				if(startCount%20==0) {
					System.out.println();
				}
			}
				fos.write(readByte);
			}
			long copyEndTime=System.currentTimeMillis();
			long duration=copyEndTime-copyStartTime;
			fis.close();
			fos.close();
			
		
		System.out.println();
		System.out.println("FileCopy:"+byteCount+" bytes copy");
		System.out.println("took"+duration+"ms");

	}
	

}
