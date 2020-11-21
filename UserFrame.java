package vcrts;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UserFrame implements ActionListener {
    
    JFrame userView = new JFrame();
    JButton openOwner = new JButton("I am a Vehicle Owner");
    JButton openClient = new JButton("I am a Job Client");
    
  
    
    UserFrame() {
    
        userView.setLayout(new FlowLayout());
        
        userView.add(openOwner);
        openOwner.addActionListener(this);
        
        userView.add(openClient);
        openClient.addActionListener(this);
        
        userView.setSize(500,500);
        userView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userView.setVisible(true);
}

    @Override
    public void actionPerformed (ActionEvent event){
        if (event.getActionCommand() == openOwner.getActionCommand()) 
        {
           new OwnerFrame();
        }
        else if (event.getActionCommand() == openClient.getActionCommand()) 
        {          
        		new ClientFrame(); 
        	}
  }
    	
}


