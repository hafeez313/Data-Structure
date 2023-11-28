import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Queue extends JFrame {

private JPanel contentPane;
private JTextField qsize;
private JTextField element;
private JTextField result;
private int queue[];
private int size;
private int r=-1;
private int f=0;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Queue frame = new Queue();
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
public Queue() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 714, 470);
contentPane = new JPanel();
contentPane.setBackground(new Color(252, 216, 254));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel heading = new JLabel("QUEUE DATA STRUCTURE");
heading.setForeground(new Color(128, 0, 255));
heading.setFont(new Font("Constantia", Font.BOLD, 22));
heading.setBounds(220, 21, 285, 28);
contentPane.add(heading);

JLabel lblNewLabel = new JLabel("ENTER QUEUE SIZE");
lblNewLabel.setForeground(new Color(128, 0, 255));
lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 18));
lblNewLabel.setBounds(102, 103, 175, 23);
contentPane.add(lblNewLabel);

qsize = new JTextField();
qsize.setBounds(330, 99, 175, 30);
contentPane.add(qsize);
qsize.setColumns(10);

JButton btnNewButton = new JButton("CREATE QUEUE");
btnNewButton.setForeground(new Color(64, 0, 128));
btnNewButton.setBackground(new Color(229, 229, 229));
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for creating queue
int len = Integer.valueOf(qsize.getText());
queue = new int[len];
size = queue.length;
String message = "Queue of size "+size+" is created";
JOptionPane.showMessageDialog(contentPane, message);
element.requestFocusInWindow();
}
});
btnNewButton.setFont(new Font("Constantia", Font.BOLD, 16));
btnNewButton.setBounds(271, 155, 166, 29);
contentPane.add(btnNewButton);

JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
lblEnterAnElement.setForeground(new Color(128, 0, 255));
lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 18));
lblEnterAnElement.setBounds(47, 213, 182, 23);
contentPane.add(lblEnterAnElement);

element = new JTextField();
element.setColumns(10);
element.setBounds(271, 209, 138, 29);
contentPane.add(element);

JButton btnInsert = new JButton("INSERT");
btnInsert.setForeground(new Color(64, 0, 128));
btnInsert.setBackground(new Color(229, 229, 229));
btnInsert.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for inserting  queue
int elem = Integer.valueOf(element.getText());
if(r==size-1)
{
String message = "Insertion Not Possible";
JOptionPane.showMessageDialog(contentPane, message);
}
else
{
++r;
queue[r]=elem;
String message = "Element "+queue[r]+" is successfully inserted";
JOptionPane.showMessageDialog(contentPane, message);
element.setText("");
if(r!=size-1)
{
element.requestFocusInWindow();
}
}
}
});
btnInsert.setFont(new Font("Constantia", Font.BOLD, 16));
btnInsert.setBounds(439, 211, 103, 29);
contentPane.add(btnInsert);

JButton btnDelete = new JButton("DELETE");
btnDelete.setForeground(new Color(64, 0, 128));
btnDelete.setBackground(new Color(229, 229, 229));
btnDelete.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for deleting queue
if(r==-1 || f>r)
{
String message = "Deletion not possible";
JOptionPane.showMessageDialog(contentPane, message);
}
else
{
String message = "Element deleted is "+queue[f];
JOptionPane.showMessageDialog(contentPane, message);
++f;
}
}
});
btnDelete.setFont(new Font("Constantia", Font.BOLD, 16));
btnDelete.setBounds(286, 266, 114, 30);
contentPane.add(btnDelete);

JButton btnDisplay = new JButton("DISPLAY");
btnDisplay.setForeground(new Color(64, 0, 128));
btnDisplay.setBackground(new Color(229, 229, 229));
btnDisplay.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for displaying queue
String res="";
for(int i=f;i<=r;i++)
{
res = res+" "+queue[i];
}
result.setText(res);
}
});
btnDisplay.setFont(new Font("Constantia", Font.BOLD, 16));
btnDisplay.setBounds(289, 319, 111, 28);
contentPane.add(btnDisplay);

result = new JTextField();
result.setColumns(10);
result.setBounds(174, 370, 368, 30);
contentPane.add(result);
}

}