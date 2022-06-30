package basic;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChildJFrame extends JFrame {
	private JPanel contentPane;
	/*
	 * 컴포넌트를 멤버필드로 선언
	 */
	private JButton okBtn;
	private JButton cancleBtn;
	public ChildJFrame() {
		
		this.setTitle("나의 첫번째프레임");
		this.contentPane=new JPanel();
		this.setContentPane(contentPane);
		contentPane.setBackground(Color.DARK_GRAY);

		/*
		 * 컴포넌트객체생성
		 */
		okBtn=new JButton("확인");
		cancleBtn=new JButton("취소");
		/*
		 * 컨테이너에 컴포넌트를 추가
		 */
		
		contentPane.setLayout(null);
		okBtn.setBounds(40,40,80,40);
		cancleBtn.setBounds(130,40,80,40);
		
		contentPane.add(okBtn);
		contentPane.add(cancleBtn);
		
		
		
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
