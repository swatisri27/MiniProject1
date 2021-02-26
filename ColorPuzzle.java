
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ColorPuzzle extends JFrame implements ActionListener {
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next,back;
static int count=0;
JLabel lb,lb2,lb3;
long before,after;
Container c;

ColorPuzzle(){
	
	c=getContentPane();
	c.setBackground(Color.pink);
	lb=new JLabel();
lb.setBounds(240,50,180, 20);
lb2=new JLabel();
lb2.setBounds(240,100,180, 20);;
b1=new JButton();
b1.setBackground(Color.black);

b1.setBounds(60,50,50,50);

b2=new JButton();
b2.setBackground(Color.green);
b2.setBounds(120,50,50,50);

b3=new JButton();
b3.setBackground(Color.yellow);

b3.setBounds(180,50,50,50);

b4=new JButton("");
b4.setBounds(60,110,50,50);
b4.setBackground(Color.blue);

b5=new JButton();
b5.setBackground(Color.orange);

b5.setBounds(120,110,50,50);

b6=new JButton();
b6.setBackground(Color.red);

b6.setBounds(180,110,50,50);

b7=new JButton();
b7.setBackground(Color.blue);

b7.setBounds(60,170,50,50);

b8=new JButton();
b8.setBackground(Color.black);

b8.setBounds(120,170,50,50);

b9=new JButton();
b9.setBackground(Color.yellow);

b9.setBounds(180,170,50,50);

back=new JButton("Back");  
back.setForeground(Color.green);
back.setBackground(Color.black);
back.setBounds(40,250,100,40);

next=new JButton("Next");  
next.setForeground(Color.green);
next.setBackground(Color.black);
next.setBounds(150,250,100,40);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
next.addActionListener(this);
back.addActionListener(this);

add(lb);add(lb2);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(next);add(back);
setTitle("Welcome USER");
setSize(400,400);
setLayout(null);
setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(back)) {
		this.dispose();
        Login l = new Login(); 
        l.setVisible(true);
	}  
	
if(count==0){
before=System.currentTimeMillis();
}
lb.setText("Total Clicks: "+(++count));
lb.setForeground(Color.red);


if(e.getSource()==b1){
b1.setBackground(Color.green);
}//end of b1

if(e.getSource()==b4){
	b4.setBackground(Color.red);

}//end of b4
if(e.getSource()==b5){
	b5.setBackground(Color.green);
}//end of b5

if(e.getSource()==b9){
	b9.setBackground(Color.green);
}//end of b9

after=System.currentTimeMillis();
long seconds=((after-before)/1000);
lb2.setText("Time: "+seconds+" Seconds");
lb2.setForeground(Color.red);

if(b1.getBackground().equals(Color.green)&&b5.getBackground().equals(Color.green)&&b9.getBackground().equals(Color.green)){
JOptionPane.showMessageDialog(this,"Congratulations, You won!");
count=0;
before=0;
after=0;
}
else 
	if(e.getSource()==next){
		count=0;
	Color s=b4.getBackground();  
	b4.setBackground(b9.getBackground());  
	b9.setBackground(s);  
	s=b1.getBackground();  
	b1.setBackground(b5.getBackground());  
	b5.setBackground(s);  
	s=b2.getBackground();  
	b2.setBackground(b7.getBackground());  
	b7.setBackground(s);  
	}

if(e.getSource()==b4){
	b4.setBackground(Color.orange);
}

if(e.getSource()==b7){
	b7.setBackground(Color.orange);
}



if(b4.getBackground().equals(Color.orange)&&b7.getBackground().equals(Color.orange)){
JOptionPane.showMessageDialog(this,"Congratulations, You won!");
count=0;
before=0;
after=0;
}

}

public static void main(String[] args) {
new ColorPuzzle();
}
}
