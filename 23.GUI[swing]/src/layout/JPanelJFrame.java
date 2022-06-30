package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JPasswordField;

public class JPanelJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPanelJFrame frame = new JPanelJFrame();
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
	public JPanelJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel northPanel = new JPanel();
		northPanel.setBackground(Color.BLUE);
		northPanel.setForeground(Color.WHITE);
		contentPane.add(northPanel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(JPanelJFrame.class.getResource("/images/0.png")));
		northPanel.add(lblNewLabel);
		
		textField = new JTextField();
		northPanel.add(textField);
		textField.setColumns(20);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.setIcon(new ImageIcon(JPanelJFrame.class.getResource("/images/search_image20.png")));
		northPanel.add(btnNewButton);
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.ORANGE);
		contentPane.add(southPanel, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("회원가입");
		southPanel.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("로그인");
		southPanel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("회원리스트");
		southPanel.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("회원삭제");
		southPanel.add(btnNewButton_1);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 89, 106, 21);
		centerPanel.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(131, 129, 106, 21);
		centerPanel.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(62, 92, 57, 15);
		centerPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("비밀번호");
		lblNewLabel_3.setBounds(62, 132, 57, 15);
		centerPanel.add(lblNewLabel_3);
		
		JButton btnNewButton_5 = new JButton("로그인");
		btnNewButton_5.setBounds(48, 183, 97, 23);
		centerPanel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("취소");
		btnNewButton_6.setBounds(183, 183, 97, 23);
		centerPanel.add(btnNewButton_6);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.CYAN);
		contentPane.add(westPanel, BorderLayout.WEST);
		westPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("회원리스트");
		westPanel.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JList list = new JList();
		list.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"김경호", "이소라", "이효리", "신명숙", "김은희", "김동화"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		westPanel.add(list, BorderLayout.CENTER);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.GREEN);
		contentPane.add(eastPanel, BorderLayout.EAST);
	}
}
