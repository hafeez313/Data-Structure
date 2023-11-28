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

public class Stack extends JFrame {

private JPanel displaybox;
private JTextField Size;
private JTextField Element;
private JTextField Result;
private int stk[];
private int top=-1;
private int size1;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Stack frame = new Stack();
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
public Stack() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 690, 455);
displaybox = new JPanel();
displaybox.setBackground(new Color(168, 222, 158));
displaybox.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(displaybox);
displaybox.setLayout(null);

JLabel heading = new JLabel("STACK DATA STRUCTURE");
heading.setForeground(new Color(0, 128, 128));
heading.setFont(new Font("Constantia", Font.BOLD, 22));
heading.setBounds(188, 10, 277, 28);
displaybox.add(heading);

JLabel lblEnterTheStack = new JLabel("ENTER THE STACK SIZE");
lblEnterTheStack.setForeground(new Color(0, 128, 128));
lblEnterTheStack.setFont(new Font("Constantia", Font.BOLD, 18));
lblEnterTheStack.setBounds(64, 89, 210, 23);
displaybox.add(lblEnterTheStack);

Size = new JTextField();
Size.setFont(new Font("Constantia", Font.PLAIN, 11));
Size.setBounds(321, 88, 164, 28);
displaybox.add(Size);
Size.setColumns(10);

JButton create = new JButton("CREATE STACK");
create.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//Code for creating stack
int stacksize = Integer.valueOf(Size.getText());
stk = new int[stacksize];
       size1 = stk.length;
String message = "Stack of size "+ size1 +" is Created";
JOptionPane.showMessageDialog(displaybox, message);
Element.requestFocusInWindow();
}
});
create.setFont(new Font("Constantia", Font.BOLD, 16));
create.setBounds(249, 135, 164, 29);
displaybox.add(create);

JLabel lblNewLabel = new JLabel("ENTER AN ELEMENT");
lblNewLabel.setForeground(new Color(0, 128, 128));
lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 18));
lblNewLabel.setBounds(38, 191, 182, 23);
displaybox.add(lblNewLabel);

Element = new JTextField();
Element.setFont(new Font("Constantia", Font.PLAIN, 16));
Element.setColumns(10);
Element.setBounds(262, 188, 164, 30);
displaybox.add(Element);

JButton push = new JButton("PUSH");
push.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for push
int elem = Integer.valueOf(Element.getText());
if(top!=size1-1)
{

++top;
stk[top]=elem;
String message = " Element "+elem+" pushed to Stack";
JOptionPane.showMessageDialog(displaybox, message);
Element.setText("");
if(top!=size1-1)
{
Element.requestFocusInWindow();
}
}
else
{
String message = "Push not Possible";
JOptionPane.showMessageDialog(displaybox, message);
Element.setText("");
}

}});
push.setFont(new Font("Constantia", Font.BOLD, 16));
push.setBounds(491, 185, 101, 37);
displaybox.add(push);

JButton pop = new JButton("POP");
pop.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for pop
String message = "Element "+stk[top]+" is popped out";
JOptionPane.showMessageDialog(displaybox, message);
stk[top]=0;
--top;
}
});
pop.setFont(new Font("Constantia", Font.BOLD, 16));
pop.setBounds(194, 253, 106, 37);
displaybox.add(pop);

JButton display = new JButton("DISPLAY");
display.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
//code for display
String res="";
for(int i=top;i>=0;i--)
{
res = res+" "+stk[i];
}
Result.setText(res);
}
});
display.setFont(new Font("Constantia", Font.BOLD, 16));
display.setBounds(403, 252, 113, 38);
displaybox.add(display);

Result = new JTextField();
Result.setFont(new Font("Times New Roman", Font.PLAIN, 10));
Result.setBounds(166, 321, 332, 28);
displaybox.add(Result);
Result.setColumns(10);
}

}