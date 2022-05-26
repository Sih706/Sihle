package computerapp;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import computer.Computer;

public class LabApp extends javax.swing.JFrame{
	ArrayList<Computer>list;
	public LabApp() {
	initComponents();
	list=new ArrayList<Computer>();
	}
	@SuppressWarnings("unchecked")
	
private void initComponents() {
		
		JLabel jLabel1 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		jLabel1 = new javax.swing.JLabel();
		JTextField jTextField1 = new javax.swing.JTextField();
		jTextField1 = new javax.swing.JTextField();
		JButton jButton1 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		jLabel1.setText("Computer Lab");
		jLabel1.setText("IP Address");
		jLabel1.setText("Value");
		
		jButton1.setText("+");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
		actionPerformed(evt);
		}
	});
		
		jButton1.setText("+");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//jButton1ActionPerformed(evt);
		}
	});
		
		Component jButton3;
		((AbstractButton) jButton3).setText("Clear");
		((AbstractButton) jButton3).addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
		actionPerformed(evt);
		}
		});
		
		AbstractButton jButton4;
		jButton4.setText("Exit App");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
		actionPerformed(evt);
		}
		});
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		Component jLabel2;
		Component jLabel3;
		Component jTextField2;
		Component jButton2;
		layout.setHorizontalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(layout.createSequentialGroup()
		.addContainerGap()
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(layout.createSequentialGroup()
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
		.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 
		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, 
		javax.swing.GroupLayout.PREFERRED_SIZE))
		.addGroup(layout.createSequentialGroup()
		.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, 
		javax.swing.GroupLayout.PREFERRED_SIZE)
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, 
		javax.swing.GroupLayout.PREFERRED_SIZE)))
		.addContainerGap(73, Short.MAX_VALUE))
		.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		.addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, 
		javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, 
		Short.MAX_VALUE)
		.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
		.addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 
		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addGap(28, 28, 28))
		);
		layout.setVerticalGroup(
		layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		.addGroup(layout.createSequentialGroup()
		.addContainerGap()
		.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, 
		javax.swing.GroupLayout.PREFERRED_SIZE)
		.addGap(18, 18, 18)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, 
		javax.swing.GroupLayout.PREFERRED_SIZE)
		.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, 
		javax.swing.GroupLayout.PREFERRED_SIZE))
		.addGap(18, 18, 18)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		.addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
		.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 
		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addGap(18, 18, 18)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 
		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		.addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
		.addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 
		javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		pack();
		}// </editor-fold>
		/*
		Function to add a new computer information in array list
		*/
		private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		AbstractButton jTextField1;
		String ip=jTextField1.getText();
		AbstractButton jTextField2;
		String s=jTextField2.getText();
		if(ip.isEmpty() && s.isEmpty())
		JOptionPane.showMessageDialog(this, "Please enter all details!","Computer", 
		JOptionPane.ERROR_MESSAGE);
		else
		{
		float value = Float.parseFloat(s);
		Computer c= new Computer(ip,value);
		list.add(c);
		JOptionPane.showMessageDialog(this,"Computer Inserted");
		JTextField jTextField = new JTextField();
		jTextField.setText("");
		jTextField2.setText("");
		}
		});
		/*
		Function to show all details of store compters
		*/
		private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
			// TODO add your handling code here:
			String s="";
			for(Computer c:this.list)
			{
			s+=c.toString();
			}
			JOptionPane.showMessageDialog(this,s);
			}
			/*
			Function to clear input fields.
			*/
			private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
			AbstractButton jTextField1;
			// TODO add your handling code here:
			jTextField1.setText("");
			AbstractButton jTextField2;
			jTextField2.setText("");
			}
			/*
			Function that will exit the app
			*/
			private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
			// TODO add your handling code here:
			wait(0);
			};
			/**
			* @param args the command line arguments
			*/
			public static void main(String args[]) {
			
			try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
			if ("Nimbus".equals(info.getName())) {
			javax.swing.UIManager.setLookAndFeel(info.getClassName());
			break;
			}
			}
			} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(LabApp.class.getName()).log(java.util.logging.Level.SEVERE, null, 
			ex);
			} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LabApp.class.getName()).log(java.util.logging.Level.SEVERE, null, 
			ex);
			} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LabApp.class.getName()).log(java.util.logging.Level.SEVERE, null, 
			ex);
			} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LabApp.class.getName()).log(java.util.logging.Level.SEVERE, null, 
			ex);
			}
	
			java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
			new LabApp().setVisible(true);
			}
			
			});
			}
			
			private javax.swing.JButton jButton1;
			private javax.swing.JButton jButton2;
			private javax.swing.JButton jButton3;
			private javax.swing.JButton jButton4;
			private javax.swing.JLabel jLabel1;
			private javax.swing.JLabel jLabel2;
			private javax.swing.JLabel jLabel3;
			private javax.swing.JTextField jTextField1;
			private javax.swing.JTextField jTextField2;
}



