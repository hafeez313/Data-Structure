import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 461);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(35, 157, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Cooper Black", Font.BOLD, 22));
		lblNewLabel.setBounds(181, 10, 400, 26);
		contentPane.add(lblNewLabel);
		
		JButton btnArray = new JButton("ARRAY");
		btnArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				place array window opening code here
//				Array a = new Array();
//				a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		btnArray.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnArray.setBounds(274, 73, 122, 33);
		contentPane.add(btnArray);
		
		JButton btnStack = new JButton("STACK");
		btnStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place stack window opening code here
				new Stack().setVisible(true);

			}
		});
		btnStack.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnStack.setBounds(88, 146, 105, 33);
		contentPane.add(btnStack);
		
		JButton btnCircularQueue = new JButton("CIRCULAR QUEUE");
		btnCircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place Circular Queue window opening code here
				new CircularQueue().setVisible(true);

			}
		});
		btnCircularQueue.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnCircularQueue.setBounds(26, 245, 230, 33);
		contentPane.add(btnCircularQueue);
		
		JButton btnStack_1_1 = new JButton("QUEUE");
		btnStack_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place queue window opening code here
				new Queue().setVisible(true);

			}
		});
		btnStack_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnStack_1_1.setBounds(473, 146, 122, 33);
		contentPane.add(btnStack_1_1);
		
		JButton btnStack_1_1_1 = new JButton("SINGLY LINKED LIST");
		btnStack_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place Singly linked list window opening code here
				new SinglyLinkedList().setVisible(true);

			}
		});
		btnStack_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnStack_1_1_1.setBounds(400, 245, 265, 33);
		contentPane.add(btnStack_1_1_1);
		
		JButton btnStack_1_1_1_1 = new JButton("DOUBLY LINKED LIST");
		btnStack_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//place Doubly linked list window opening code here
				new DoublyLinkedList().setVisible(true);

			}
		});
		btnStack_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnStack_1_1_1_1.setBounds(206, 339, 265, 33);
		contentPane.add(btnStack_1_1_1_1);
	}
}
