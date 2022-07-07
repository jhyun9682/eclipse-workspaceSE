package bytestream.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputInputFileCopyMain {

	public static void main(String[] args) throws Exception{
		BufferedInputStream bis= new BufferedInputStream(new FileInputStream("ChromeSetup.exe"));
		BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream("ChromeSetup_copy2.exe"));
		
		
		int byteCount=0;
		int startCount=0;
		long copyStartTime=System.currentTimeMillis();
		
		while(true) {
			int readByte=bis.read();
			if(readByte==-1) break;
			byteCount++;
			if(byteCount%1024==0) {
				
				System.out.print("*");
				startCount++;
				if(startCount%20==0) {
					System.out.println();
				}
			}
				bos.write(readByte);
			}
			long copyEndTime=System.currentTimeMillis();
			long duration=copyEndTime-copyStartTime;
			bis.close();
			bos.close();
			
		
		System.out.println();
		System.out.println("FileCopy:"+byteCount+" bytes copy");
		System.out.println("took"+duration+"ms");

	}

}
