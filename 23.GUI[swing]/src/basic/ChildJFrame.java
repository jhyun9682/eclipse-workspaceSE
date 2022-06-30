package basic;

import javax.swing.JFrame;

public class ChildJFrame extends JFrame {
	
	public ChildJFrame() {
		
		this.setTitle("나의 첫번째프레임");
		 /*
		  * JFrame의 크기설정
		  */
		 this.setSize(400, 500);

	}
	
	public static void main(String[] args) {
		/*
		 * JFrame객체 생성
		 */
		 ChildJFrame  childJFrame=new  ChildJFrame();
		
		 /*
		  * JFrame객체 화면에 보여주세요
		  */
		 childJFrame.setVisible(true);
		 
		 return;
	}

}
