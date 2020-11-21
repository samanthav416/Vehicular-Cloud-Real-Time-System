package vcrts;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OwnerFrame implements ActionListener {
    
    static JFrame ownerView = new JFrame();
    JLabel owneridLabel = new JLabel ("Enter ID");
    JTextField ownerID = new JTextField();
    JLabel licenseLabel = new JLabel ("License Plate");
    	JTextField licensePlate = new JTextField();
    JLabel residencyLabel = new JLabel ("Time");
    JTextField residency = new JTextField();
    JButton ownerButton = new JButton("Submit");
    JLabel blank = new JLabel ();
	private Date date;
   
   
   
    OwnerFrame() {
    	
        
        ownerView.setLayout(new GridLayout(4,4));
        
        ownerView.add(owneridLabel);
        ownerView.add(ownerID);
        ownerView.add(licenseLabel);
        ownerView.add(licensePlate);
        ownerView.add(residencyLabel);
        ownerView.add(residency);
        ownerView.add(ownerButton);
        ownerButton.addActionListener(this);
        
        ownerView.add(ownerButton);
        ownerButton.addActionListener(this);
        
        ownerView.setSize(500,500);
        ownerView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ownerView.setVisible(true);
}
    public void reset(){
     
        ownerID.setText(null); 
        licensePlate.setText(null);
        residency.setText(null);  
    }
    
   
    @Override
    public void actionPerformed (ActionEvent event){
    	
    	String iD = owneridLabel.getText();
    	String plate = licensePlate.getText();
    	String res = residency.getText();
    		//CREATES NEW FILE
            try {
  		      File myObj = new File("owner.txt");
  		      if (myObj.createNewFile()) {
  		        System.out.println("File created: " + myObj.getName());
                        new VCFrame();
  		      } else {
  		        System.out.println("File already exists.");
  		      }
  		    } catch (IOException e) {
  		      System.out.println("An error occurred.");
  		      e.printStackTrace();
  		    }
  		
          //WRITES TO THE CREATED FILE
  		try {
  		      FileWriter myWriter = new FileWriter("owner.txt");
  		      myWriter.write("Owner ID: "+iD);
  		      myWriter.write("\nLicense Plate: "+plate);
  		      myWriter.write("\nLicense Plate: "+res);
  		      myWriter.close();
  		      System.out.println("Successfully wrote to the file.");
  		      JOptionPane.showMessageDialog(null,"Successfully wrote to the file.", null, JOptionPane.PLAIN_MESSAGE);
  		      
  		    } catch (IOException e) {
  		      System.out.println("An error occurred.");
  		      JOptionPane.showMessageDialog(null,"An error has occured!", null, JOptionPane.PLAIN_MESSAGE);
  		      e.printStackTrace();
  		    }
         }
    }
  


    
