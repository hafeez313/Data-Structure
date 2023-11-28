import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField Array_length;
	private JTextField Element;
	private JTextField Deleteposition;
	private JTextField Insertposition;
	private JTextField DisplayBox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(156, 160, 67));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Array_Text = new JLabel("ARRAY DATASTRUCTURE");
		Array_Text.setForeground(new Color(153, 11, 68));
		Array_Text.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Array_Text.setBounds(222, 30, 235, 21);
		contentPane.add(Array_Text);
		
		JLabel Array_Text_1 = new JLabel("ENTER ARRAY LENGTH");
		Array_Text_1.setForeground(new Color(153, 11, 68));
		Array_Text_1.setFont(new Font("Dialog", Font.BOLD, 14));
		Array_Text_1.setBounds(63, 89, 217, 31);
		contentPane.add(Array_Text_1);
		
		Array_length = new JTextField();
		Array_length.setFont(new Font("Dialog", Font.BOLD, 14));
		Array_length.setBounds(290, 89, 135, 31);
		contentPane.add(Array_length);
		Array_length.setColumns(10);
		
		JButton Create = new JButton("CREATE ARRAY");
		Create.setForeground(new Color(0, 0, 0));
		Create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array
				int len = Integer.valueOf(Array_length.getText());
				arr = new int[len];
				String message = "Array of Length "+len+" Created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		Create.setBackground(new Color(192, 192, 192));
		Create.setFont(new Font("Constantia", Font.BOLD, 18));
		Create.setBounds(452, 92, 175, 31);
		contentPane.add(Create);
		
		JLabel Array_Text_1_1 = new JLabel("INSERT AN INTEGER ELEMENT");
		Array_Text_1_1.setForeground(new Color(153, 11, 68));
		Array_Text_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		Array_Text_1_1.setBounds(22, 159, 269, 24);
		contentPane.add(Array_Text_1_1);
		
		Element = new JTextField();
		Element.setColumns(10);
		Element.setBounds(290, 158, 135, 31);
		contentPane.add(Element);
		
		JButton BtnInsert = new JButton("INSERT");
		BtnInsert.setForeground(new Color(0, 0, 0));
		BtnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem=Integer.valueOf(Element.getText());
				int pos = Integer.valueOf(Insertposition.getText());
				arr[pos] = elem;
				String message="Element "+elem+" inserted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				Element.setText("");
				Insertposition.setText("");
			}
		});
		BtnInsert.setFont(new Font("Constantia", Font.BOLD, 18));
		BtnInsert.setBackground(new Color(192, 192, 192));
		BtnInsert.setBounds(480, 215, 109, 31);
		contentPane.add(BtnInsert);
		
		JLabel Array_Text_1_2 = new JLabel("DELETE POSITION");
		Array_Text_1_2.setForeground(new Color(153, 11, 68));
		Array_Text_1_2.setFont(new Font("Dialog", Font.BOLD, 14));
		Array_Text_1_2.setBounds(107, 273, 184, 24);
		contentPane.add(Array_Text_1_2);
		
		Deleteposition = new JTextField();
		Deleteposition.setColumns(10);
		Deleteposition.setBounds(290, 272, 134, 31);
		contentPane.add(Deleteposition);
		
		JLabel Array_Text_1_2_1 = new JLabel("POSITION");
		Array_Text_1_2_1.setForeground(new Color(153, 11, 68));
		Array_Text_1_2_1.setFont(new Font("Dialog", Font.BOLD, 14));
		Array_Text_1_2_1.setBounds(165, 215, 98, 24);
		contentPane.add(Array_Text_1_2_1);
		
		Insertposition = new JTextField();
		Insertposition.setColumns(10);
		Insertposition.setBounds(290, 214, 135, 31);
		contentPane.add(Insertposition);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setForeground(new Color(0, 0, 0));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(Deleteposition.getText());
				arr[pos]=0;
				String message="Element deleted @ the position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				Deleteposition.setText("");
			}
		});
		btnDelete.setFont(new Font("Constantia", Font.BOLD, 18));
		btnDelete.setBackground(new Color(192, 192, 192));
		btnDelete.setBounds(480, 273, 109, 31);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.setForeground(new Color(0, 0, 0));
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				for(int i=0;i<=arr.length-1;i++) {
					msg = msg+" "+arr[i];
				}
				DisplayBox.setText(msg);
			}
		});
		btnDisplay.setFont(new Font("Constantia", Font.BOLD, 18));
		btnDisplay.setBackground(new Color(192, 192, 192));
		btnDisplay.setBounds(300, 320, 125, 31);
		contentPane.add(btnDisplay);
		
		DisplayBox = new JTextField();
		DisplayBox.setBackground(new Color(255, 255, 255));
		DisplayBox.setColumns(10);
		DisplayBox.setBounds(165, 374, 366, 31);
		contentPane.add(DisplayBox);
	}
}
