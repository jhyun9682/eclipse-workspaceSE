package com.itwill.member.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itwill.member.dto.Member;
import com.itwill.member.service.MemberService;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextPane;

public class MemberMainFrame extends JFrame {
	/**1.MemberService 객체 선언**/
	private MemberService memberService;
	/****/

	/**로그인한 회원**/
	private Member loginMember=null;
	/****/
	
	/****/
	
	/****/

	private JPanel contentPane;
	private JTabbedPane memberTabbedPane;
	private JPasswordField passwordTF;
	private JTextField idTF;
	private JTextField nameTF;
	private JTextField addressTF;
	private JComboBox ageCB;
	private JLabel messageLB;
	private JCheckBox marriedCHK;
	private JPasswordField loginpasswordTF;
	private JTextField loginidTF;
	private JLabel loginMessageLB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberMainFrame frame = new MemberMainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MemberMainFrame() {
		setTitle("회원관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		memberTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(memberTabbedPane, BorderLayout.CENTER);
		
		JPanel joinPanel = new JPanel();
		memberTabbedPane.addTab("회원가입", null, joinPanel, null);
		joinPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(24, 34, 57, 15);
		joinPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(24, 96, 57, 15);
		joinPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(24, 160, 57, 15);
		joinPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("주소");
		lblNewLabel_3.setBounds(24, 225, 57, 15);
		joinPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("나이");
		lblNewLabel_4.setBounds(24, 294, 57, 15);
		joinPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("결혼");
		lblNewLabel_5.setBounds(24, 348, 57, 15);
		joinPanel.add(lblNewLabel_5);
		
		passwordTF = new JPasswordField();
		passwordTF.setBounds(107, 93, 116, 18);
		joinPanel.add(passwordTF);
		
		idTF = new JTextField();
		idTF.setBounds(107, 31, 116, 21);
		joinPanel.add(idTF);
		idTF.setColumns(10);
		
		nameTF = new JTextField();
		nameTF.setBounds(107, 157, 116, 21);
		joinPanel.add(nameTF);
		nameTF.setColumns(10);
		
		addressTF = new JTextField();
		addressTF.setBounds(107, 222, 116, 21);
		joinPanel.add(addressTF);
		addressTF.setColumns(10);
		
		ageCB = new JComboBox();
		ageCB.setModel(new DefaultComboBoxModel(new String[] {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35"}));
		ageCB.setBounds(107, 290, 116, 23);
		joinPanel.add(ageCB);
		
		marriedCHK = new JCheckBox("");
		marriedCHK.setBounds(108, 344, 115, 23);
		joinPanel.add(marriedCHK);
		
		JButton joinBtn = new JButton("가입");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**회원가입**/
				try {
					//TextField로부터 데이터 얻기
					String id=idTF.getText();
					String password=passwordTF.getText();
					String name=nameTF.getText();
					String address=addressTF.getText();
					
					if(id.equals("")|| password.equals("")||name.equals("")||address.equals("")) {
						messageLB.setText("* 내용을 입력하세요");
						return;
					}
					String ageStr=(String)ageCB.getSelectedItem();
					int age=Integer.parseInt(ageStr);
					String marriedStr="";
					if(marriedCHK.isSelected()) {
						marriedStr="T";
					}else {
						marriedStr="F";
						
					}
					Member newMember=new Member(id,password,name,address,age,marriedStr,null);
					System.out.println("1.MemberMainFrame");
					boolean isSuccess=
							memberService.addMember(newMember);
					if(isSuccess) {
						//성공(로그인패널 보여줌)
						memberTabbedPane.setSelectedIndex(1);
					}else {
						//실패(다이알로그 띄움)
						JOptionPane.showMessageDialog(null, "아이디가 중복되었습니다.");
						idTF.requestFocus();
						idTF.setSelectionStart(0);
						idTF.setSelectionEnd(id.length());

					}
					
				}catch(Exception e1) {
				}
				/****/
				
			}
		});
		joinBtn.setBounds(32, 399, 97, 23);
		joinPanel.add(joinBtn);
		
		JButton cancelBtn = new JButton("취소");
		cancelBtn.setBounds(166, 399, 97, 23);
		joinPanel.add(cancelBtn);
		
		messageLB = new JLabel("");
		messageLB.setForeground(Color.RED);
		messageLB.setBounds(24, 66, 199, 15);
		joinPanel.add(messageLB);
		
		JLabel lblNewLabel_6 = new JLabel("*");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(235, 34, 16, 15);
		joinPanel.add(lblNewLabel_6);
		
		JPanel loginPanel = new JPanel();
		memberTabbedPane.addTab("로그인", null, loginPanel, null);
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("아이디");
		lblNewLabel_7.setBounds(36, 79, 57, 15);
		loginPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("비밀번호");
		lblNewLabel_8.setBounds(36, 134, 57, 15);
		loginPanel.add(lblNewLabel_8);
		
		loginpasswordTF = new JPasswordField();
		loginpasswordTF.setBounds(111, 131, 110, 18);
		loginPanel.add(loginpasswordTF);
		
		loginidTF = new JTextField();
		loginidTF.setBounds(111, 76, 110, 21);
		loginPanel.add(loginidTF);
		loginidTF.setColumns(10);
		
		JButton loginBtn = new JButton("로그인");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**회원로그인**/
				try {
					String id=loginidTF.getText();
					String password=loginpasswordTF.getText();
					int result=memberService.login(id, password);
					if(result==0) {
						loginProcess(id);
					}else if(result==1) {
						//실패 아이디 존재안함
						loginMessageLB.setText("아이디존재안함");
						loginidTF.requestFocus();
					}else if(result==2) {
						loginMessageLB.setText("비밀번호 불일치");
						//실패 비밀번호 불일치
						loginpasswordTF.requestFocus();
						
					}
					
				}catch(Exception e1) {
					
				}
				/****/
			}
		});
		loginBtn.setBounds(36, 204, 97, 23);
		loginPanel.add(loginBtn);
		
		JButton cancelBtn2 = new JButton("취소");
		cancelBtn2.setBounds(169, 204, 97, 23);
		loginPanel.add(cancelBtn2);
		
		loginMessageLB = new JLabel("");
		loginMessageLB.setBounds(24, 168, 242, 15);
		loginPanel.add(loginMessageLB);
		
		JPanel listPanel = new JPanel();
		memberTabbedPane.addTab("회원리스트", null, listPanel, null);
		
		/**2.MemberService 객체생성**/
		memberService=new MemberService();
		//productService=new ProductService();
		/****/
	}//생성자끝
	/**로그인 성공시 호출할 메소드**/
	public void loginProcess(String id) throws Exception{
		Member loginSucessMember= memberService.findById(id);
		loginMember=loginSucessMember;
		
		setTitle(loginMember.getM_name());

		memberTabbedPane.setSelectedIndex(2);
		memberTabbedPane.setEnabledAt(0, false);
		memberTabbedPane.setEnabledAt(1, false);
		
	}
	/**로그아웃시 호출할 메소드**/
	public void logoutProcess() {
		
	}
}//클래스끝
