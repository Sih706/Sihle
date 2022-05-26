package computer;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Computer extends JFrame {
	
	public Computer() {
	super("Lab App");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	String IPAddress;
	float Value;
	public Computer(String ip,float value ){
		
	this.IPAddress=ip;
	this.Value=value;
	
	}
	public String toString(){
		
	String s= this.IPAddress+" "+this.Value+"\n";
	return s;
	}
	

}
