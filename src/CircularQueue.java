import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

private JPanel contentPane;
private JTextField size;
private JTextField CQelement;
private JTextField displayQueue;
private int cqueue[];
private int size1;
private int r=-1;
private int f=0;;
private int count=0;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
CircularQueue frame = new CircularQueue();
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
public CircularQueue() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 693, 469);
contentPane = new JPanel();
contentPane.setBackground(new Color(254, 124, 69));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel heading = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
heading.setForeground(new Color(255, 255, 255));
heading.setFont(new Font("Constantia", Font.BOLD, 22));
heading.setBounds(145, 24, 405, 28);
contentPane.add(heading);

JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE");
lblEnterQueueSize.setForeground(new Color(255, 255, 255));
lblEnterQueueSize.setFont(new Font("Constantia", Font.BOLD, 18));
lblEnterQueueSize.setBounds(124, 86, 175, 23);
contentPane.add(lblEnterQueueSize);

size = new JTextField();
size.setBounds(341, 83, 143, 28);
contentPane.add(size);
size.setColumns(10);

JButton create = new JButton("CREATE CQUEUE");
create.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for creating cqueue
int len = Integer.valueOf(size.getText());
cqueue = new int[len];
size1 = cqueue.length;
String message = "Queue of size "+len+" is created";
JOptionPane.showMessageDialog(contentPane, message);
CQelement.requestFocusInWindow();
}
});
create.setFont(new Font("Constantia", Font.BOLD, 13));
create.setBounds(248, 130, 173, 28);
contentPane.add(create);

JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
lblEnterAnElement.setForeground(new Color(255, 255, 255));
lblEnterAnElement.setFont(new Font("Constantia", Font.BOLD, 18));
lblEnterAnElement.setBounds(74, 190, 186, 30);
contentPane.add(lblEnterAnElement);

CQelement = new JTextField();
CQelement.setColumns(10);
CQelement.setBounds(270, 184, 155, 30);
contentPane.add(CQelement);

JButton insert = new JButton("INSERT");
insert.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for inserting cqueue
int elem = Integer.valueOf(CQelement.getText());
if(count==size1)
{
String message = "Insertion Not Possible";
JOptionPane.showMessageDialog(contentPane, message);
CQelement.setText("");
}
else
{
r = (r+1)%size1;
cqueue[r]=elem;
count++;
String message = "Element "+elem+" is successfully inserted";
JOptionPane.showMessageDialog(contentPane, message);
CQelement.setText("");
if(r!=size1-1)
{
CQelement.requestFocusInWindow();
}
}
}
});
insert.setFont(new Font("Constantia", Font.BOLD, 13));
insert.setBounds(454, 190, 96, 25);
contentPane.add(insert);

JButton delete = new JButton("DELETE");
delete.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for deleting cqueue
if(count==0)
{
String message = "Deletion not possible";
JOptionPane.showMessageDialog(contentPane, message);
}
else
{
String message = "Element deleted is "+cqueue[f];
JOptionPane.showMessageDialog(contentPane, message);
f = (f+1)%size1;
count--;
}
}
});
delete.setFont(new Font("Constantia", Font.BOLD, 13));
delete.setBounds(291, 240, 124, 25);
contentPane.add(delete);

JButton display = new JButton("DISPLAY");
display.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for displaying cqueue
int temp = f;
if(count==0)
{
displayQueue.setText("Queue is Empty");
}
else
{
String res ="";
for(int i=1;i<=count;i++)
{
res = res+" "+cqueue[temp];
temp = (temp+1)%size1;
}
displayQueue.setText(res);
}
}
});
display.setFont(new Font("Constantia", Font.BOLD, 13));
display.setBounds(291, 296, 124, 25);
contentPane.add(display);

displayQueue = new JTextField();
displayQueue.setColumns(10);
displayQueue.setBounds(178, 357, 337, 28);
contentPane.add(displayQueue);
}

}