package vcrts;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class VCFrame implements ActionListener{
	
    ClientFrame cF = new ClientFrame();
	
    JFrame controllerView = new JFrame();
    JButton accept = new JButton("Would you like to Accept?");
    JButton reject = new JButton("Would you like to Reject?");
    JLabel clientId = new JLabel ("Client Id: "+cF.getClientId());
    JLabel duration = new JLabel ("Duration: "+cF.getDuration());
    JLabel deadline = new JLabel ("Deadline: "+cF.getDeadline());
    JFrame jobRejected = new JFrame();
    JLabel sorry = new JLabel("Sorry this job has been rejected");
    JFrame jobAccepted = new JFrame();
    JLabel congrats = new JLabel("Congrats, this job has been accepted");
    Queue<Integer> jobDuration = new LinkedList<>();
  
    
    VCFrame() {
    
        controllerView.setLayout(new FlowLayout());
        
        controllerView.add(clientId);
        controllerView.add(duration);
        controllerView.add(deadline);
        
        controllerView.add(accept);
        accept.addActionListener(this);
        
        controllerView.add(reject);
        accept.addActionListener(this);
        
        controllerView.setSize(500,500);
        controllerView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controllerView.setVisible(true);
        
        jobAccepted.add(congrats);
        jobAccepted.setSize(500,500);
        jobAccepted.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jobRejected.add(sorry);
        jobRejected.setSize(500,500);
        jobRejected.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
}

	@Override
	public void actionPerformed(ActionEvent e) {
            
            if (e.getActionCommand() == accept.getActionCommand())
            {
                jobDuration.add(cF.getDuration());
                controllerView.setVisible(false);
                jobAccepted.setVisible(true);
            }
            else if (e.getActionCommand() == reject.getActionCommand()) {
                jobRejected.setVisible(true);;
            }
            
	
    // Display contents of the queue. 
    System.out.println("Elements of queue "+ jobDuration);
    JOptionPane.showMessageDialog(null,"Jobs: " + jobDuration, null, JOptionPane.PLAIN_MESSAGE); 
    
    try {
	      File myObj = new File("controller.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName()); 	
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException v) {
	      System.out.println("An error occurred.");
	      v.printStackTrace();
	    }
	
    //WRITES TO THE CREATED FILE
	try {
	      FileWriter myWriter = new FileWriter("controller.txt");
	      myWriter.write("Client ID: "+cF.getClientId());
		  myWriter.write("\nDuration: "+cF.getClientId());
		  myWriter.write("\nDead-line: "+cF.getClientId());
		  myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	      if(jobDuration.peek() != null)
	  	  {
	    	  	JOptionPane.showMessageDialog(null,"Client: "+cF.getClientId()+"\nJob: "+jobDuration.peek(), null, JOptionPane.PLAIN_MESSAGE);
	  		jobDuration.remove();
	  		JOptionPane.showMessageDialog(null,"Jobs: "+jobDuration, null, JOptionPane.PLAIN_MESSAGE);
	  	  }
	      
	    } catch (IOException v) {
	      System.out.println("An error occurred.");
	      JOptionPane.showMessageDialog(null,"An error has occured!", null, JOptionPane.PLAIN_MESSAGE);
	      v.printStackTrace();
	    }
   }
		
}
    
