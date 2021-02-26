# MiniProject1
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Login extends JFrame implements ActionListener  {
	JLabel lb,jb1;
	JTextField j;
	JButton b,b1;
	Container c;
	Login(){
		 
		c=getContentPane();
		c.setBackground(Color.pink);
		jb1=new JLabel(" PUZZLE GAME");
		jb1.setBounds(150,30,100, 20);
		jb1.setForeground(Color.red);
		lb=new JLabel("Enter Your Name");
		lb.setBounds(50,80,180, 20);
		j=new JTextField();
		j.setBounds(180,80,180, 20);
		b=new JButton("NUMBER PUZZLE");
		b.setBounds(90,150,200, 50);
		b.setBackground(Color.black);
		b.setForeground(Color.green);
		
		b1=new JButton("COLOR PUZZLE");
		b1.setBounds(90,220,200, 50);
		b1.setBackground(Color.black);
		b1.setForeground(Color.green);
		
		b.addActionListener(this);
        b1.addActionListener(this);
        
		add(lb);add(jb1);add(j);add(b);add(b1);
		setTitle("PUZZLE GAME");
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		
	}
	 
		
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		 
		
		if(e.getSource().equals(b)) {
			this.dispose();
            Puzzle hh = new Puzzle();
            hh.setVisible(true);
		}
		if(e.getSource().equals(b1)) {
			this.dispose();
		ColorPuzzle p= new ColorPuzzle();
        p.setVisible(true);
		}
	}
	public static void main(String[] args) {
		new Login();

	}
}
