package event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteOrder;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ActionEventJFrame extends JFrame{
	private JPanel contentPane;
	private JButton northBtn;
	private JButton southBtn;
	private JButton eastBtn;
	private JButton westBtn;
	
	public ActionEventJFrame() {
		contentPane=new JPanel();
		contentPane.setBackground(Color.green);
		contentPane.setLayout(new BorderLayout());
		this.setContentPane(contentPane);
		
		/*****이벤트 소스*****/
		northBtn=new JButton("이벤트소스[NORTH]");
		southBtn=new JButton("이벤트소스[SOUTH]");
		eastBtn=new JButton("이벤트소스[EAST]");
		westBtn=new JButton("이벤트소스[WEST]");
		
		
		/*****이벤트 소스에 이벤트 핸들러객체 등록*****/
		northBtn.addActionListener(new NorthButtonActionEventHandler());
		southBtn.addActionListener(new SouthBottonActionEventHandler());
		
		
		
		
		contentPane.add(northBtn,BorderLayout.NORTH);
		contentPane.add(southBtn,BorderLayout.SOUTH);
		contentPane.add(eastBtn,BorderLayout.EAST);
		contentPane.add(westBtn,BorderLayout.WEST);
		this.setSize(300, 400);
	
	}
/******member inner class*******/
	public class SouthBottonActionEventHandler implements ActionListener{
		int count;
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("south button click...");
			/*
			 * 프레임의 타이틀변경
			 * contentPane의 배경색변경
			 * ?
			 */
			setTitle("south button click["+ ++count +"]");
			int r=(int)(Math.random()*256);
			int g=(int)(Math.random()*256);
			int b=(int)(Math.random()*256);
			contentPane.setBackground(new Color(r,g,b));
			
			
		}
	}
	
	public static void main(String[] args) {
		ActionEventJFrame actionEventJFrame = new ActionEventJFrame();
		actionEventJFrame.setVisible(true);
	

	}

}
