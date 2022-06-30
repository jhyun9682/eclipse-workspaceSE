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

public class JPanelJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setBounds(100, 100, 450, 300);
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
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(centerPanel, BorderLayout.CENTER);
		
		JPanel westPanel = new JPanel();
		westPanel.setBackground(Color.CYAN);
		contentPane.add(westPanel, BorderLayout.WEST);
		
		JPanel eastPanel = new JPanel();
		eastPanel.setBackground(Color.GREEN);
		contentPane.add(eastPanel, BorderLayout.EAST);
	}

}
