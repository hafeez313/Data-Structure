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

public class SinglyLinkedList extends JFrame {
class Node
{
int data;
Node link;
}
    private Node first;
private JPanel contentPane;
private JTextField rear;
private JTextField displaydll;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
SinglyLinkedList frame = new SinglyLinkedList();
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
public SinglyLinkedList() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 726, 471);
contentPane = new JPanel();
contentPane.setBackground(new Color(162, 221, 175));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JLabel heading = new JLabel("SINGLY LINKED LIST DATA STRUCTURE");
heading.setForeground(new Color(0, 128, 192));
heading.setFont(new Font("Constantia", Font.BOLD, 22));
heading.setBounds(150, 10, 430, 28);
contentPane.add(heading);

JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT");
lblEnterTheElement.setForeground(new Color(0, 128, 192));
lblEnterTheElement.setFont(new Font("Constantia", Font.BOLD, 16));
lblEnterTheElement.setBounds(132, 89, 193, 20);
contentPane.add(lblEnterTheElement);

rear = new JTextField();
rear.setBounds(347, 82, 200, 31);
contentPane.add(rear);
rear.setColumns(10);

JButton insertrear = new JButton("INSERT REAR");
insertrear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for insertrear
int elem = Integer.valueOf(rear.getText());
Node temp;
Node newnode = new Node();
newnode.data = elem;
newnode.link = null;
if(first==null)
{
first=newnode;
String message = "New node with value "+newnode.data+" is successfully created";
JOptionPane.showMessageDialog(contentPane, message);
rear.setText("");
rear.requestFocusInWindow();
}
else
{
temp=first;
while(temp.link!=null)
{
temp=temp.link;
}
temp.link=newnode;
String message = "New node with value "+newnode.data+" is successfully craeted and inserted at REAR";
JOptionPane.showMessageDialog(contentPane, message);
rear.setText("");
rear.requestFocusInWindow();
}
}
});
insertrear.setFont(new Font("Constantia", Font.BOLD, 13));
insertrear.setBounds(183, 139, 124, 31);
contentPane.add(insertrear);

JButton insertfront = new JButton("INSERT FRONT");
insertfront.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for insertfront
int elem = Integer.valueOf(rear.getText());
Node newnode = new Node();
newnode.data = elem;
newnode.link = null;
if(first==null)
{
first=newnode;
String message = "New node with value "+newnode.data+" is successfully created";
JOptionPane.showMessageDialog(contentPane, message);
rear.setText("");
rear.requestFocusInWindow();
}
else
{
newnode.link = first;
first = newnode;
String message = "New node with value "+newnode.data+" is successfully craeted and inserted at FRONT";
JOptionPane.showMessageDialog(contentPane, message);
rear.setText("");
rear.requestFocusInWindow();
}
}
});
insertfront.setFont(new Font("Constantia", Font.BOLD, 13));
insertfront.setBounds(402, 139, 131, 31);
contentPane.add(insertfront);

JButton deleterear = new JButton("DELETE REAR");
deleterear.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for deletetrear
Node temp;
if(first==null)
{
String message = "Deletion not Possible!!!";
JOptionPane.showMessageDialog(contentPane, message);
rear.setText("");
displaydll.setText("Queue is Empty");
}
else if (first.link==null)
{
String message = "Element "+first.data+" deleted from rear";
JOptionPane.showMessageDialog(contentPane, message);
first = null;
}
else
{
temp=first;
while(temp.link.link!=null)
{
temp = temp.link;
}
String message = "Element "+temp.link.data+" deleted from rear";
JOptionPane.showMessageDialog(contentPane, message);
temp.link = null;
}
}
});
deleterear.setFont(new Font("Constantia", Font.BOLD, 13));
deleterear.setBounds(278, 201, 139, 28);
contentPane.add(deleterear);

JButton deleterfront = new JButton("DELETE FRONT");
deleterfront.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for deletefront
if(first==null)
{
String message = "Deletion not Possible!!!";
JOptionPane.showMessageDialog(contentPane, message);
rear.setText("");
displaydll.setText("List is Empty");
}
else if (first.link==null)
{
String message = "Element "+first.data+" deleted from front";
JOptionPane.showMessageDialog(contentPane, message);
first = null;
}
else
{
String message = "Element "+first.data+" deleted from front";
JOptionPane.showMessageDialog(contentPane, message);
first = first.link;

}
}
});
deleterfront.setFont(new Font("Constantia", Font.BOLD, 13));
deleterfront.setBounds(278, 252, 139, 28);
contentPane.add(deleterfront);

JButton display = new JButton("DISPLAY");
display.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for display
Node temp;
String res="";
if(first==null)
{
String message = "List is Empty!!!";
JOptionPane.showMessageDialog(contentPane, message);
rear.setText("");
displaydll.setText("List is Empty");
}
else if (first.link==null)
{
res = res+first.data;
displaydll.setText(res);
}
else
{
String res1="";
temp=first;
while(temp!=null)
{

res1 = res1+" "+temp.data;
temp = temp.link;
}
       displaydll.setText(res1);
}
}
});
display.setFont(new Font("Constantia", Font.BOLD, 13));
display.setBounds(278, 301, 144, 28);
contentPane.add(display);

displaydll = new JTextField();
displaydll.setColumns(10);
displaydll.setBounds(186, 357, 335, 28);
contentPane.add(displaydll);
}

}