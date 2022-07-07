package file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		/*
		 * 현재경로[기준경로]
		 * eclipse->C:\2022-05-JAVA-DEVELOPER\eclipse-workspaceSE\21.입출력[IO]
		 * 
		 * 상대(relative)경로
		 * 	현재경로를 기준으로 경로를 기술
		 * 절대(absolute)경로
		 * C:, D: 드라이브를 기준으로 경로 기술
		 * 	-C:\2022-05-JAVA-DEVELOPER
		 * 	-D:\TOOL
		 * 
		 */
				
		File file1=new File("데미안.txt");
		File file2=new File("sample/JAVAAPI_URL.md");
		File file3=new File("sample/subSample1/00.VariableDeclare.txt");
		File file4=new File("C:/2022-05-JAVA-DEVELOPER/eclipse-workspaceSE/21.입출력[IO]/sample/자바문서생성시인코딩설정.txt");
		System.out.println("-------1.file path[relative]------");
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file3.getPath());
		System.out.println(file4.getPath());
		System.out.println("------2.file absolute path-----");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		System.out.println(file4.getAbsolutePath());
		System.out.println("------3.file name-----");
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		System.out.println(file3.getName());
		System.out.println(file4.getName());
		System.out.println("------4.file parent[directory]-----");
		System.out.println(file1.getParent());
		System.out.println(file2.getParent());
		System.out.println(file3.getParent());
		System.out.println(file4.getParent());
		
		File dir1=new File("sample");
		File dir2=new File("sample/subSample1");
		File dir3=new File("sample","subSample2");
		System.out.println("-----5.isDirectory,isFile------");
		System.out.println(dir1.isDirectory());
		System.out.println(dir2.isDirectory());
		System.out.println(dir3.isDirectory());
		
		System.out.println(dir1.isFile());
		System.out.println(dir2.isFile());
		System.out.println(dir3.isFile());
		
				

	}
}
