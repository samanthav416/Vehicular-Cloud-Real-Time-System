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

public class VCServer implements ActionListener {
       
    ClientFrame cF = new ClientFrame();	
    JFrame controllerView = new JFrame();
    JButton accept = new JButton("Would you like to Accept?");
    JButton reject = new JButton("Would you like to Reject?");
    JLabel clientId = new JLabel ("Client Id: "+cF.getClientId());
    JLabel duration = new JLabel ("Duration: "+cF.getDuration());
    JLabel deadline = new JLabel ("Deadline: "+cF.getDeadline());
    Queue<Integer> jobDuration = new LinkedList<>();
    
    VCServer() {
    
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
}

	@Override
	public void actionPerformed(ActionEvent e) {
            
            if (e.getActionCommand() == accept.getActionCommand())
            {
                jobDuration.add(cF.getDuration());
            }
            else {
                System.out.println(", the Server did not accept this Job");
            }
}
}
