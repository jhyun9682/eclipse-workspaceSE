package basic;

import javax.swing.JFrame;

public class ChildJFrameMain extends JFrame {

	
	
	
	public static void main(String[] args) {
		/*
		 * JFrame객체 생성
		 */
		 ChildJFrame  childJFrame=new  ChildJFrame();
		 /*
		  * JFrame의 크기설정
		  */
		 childJFrame.setSize(400, 500);
		 /*
		  * JFrame객체 화면에 보여주세요
		  */
		 childJFrame.setVisible(true);

	}

}
