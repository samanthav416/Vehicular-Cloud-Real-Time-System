import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UserFrame extends JPanel {
    public UserFrame() {
        initializeUI();
    }

    public static void showFrame() {
        JPanel panel = new UserFrame();
        panel.setOpaque(true);

        JFrame frame = new JFrame("User Information");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                UserFrame.showFrame();
            }
        });
    }

    private void initializeUI() {
        final int FIELD_WIDTH = 10; 
        
        JTabbedPane tabbedPane = new JTabbedPane();
        JButton ownerButton = new JButton("Submit");
        JButton clientButton = new JButton("Submit");

        
        // Create Owner Pannel
        JPanel ownerPanel = new JPanel();
        ownerPanel.add(new JLabel("Owner"));
        ownerPanel.add(new JTextField(FIELD_WIDTH));
        
        //Text Field
        ownerPanel.add(new JLabel("VPN"));
        ownerPanel.add(new JTextField(FIELD_WIDTH));
        ownerPanel.add(new JLabel("Make"));
        ownerPanel.add(new JTextField(FIELD_WIDTH));
        ownerPanel.add(new JLabel("Model"));
        ownerPanel.add(new JTextField(FIELD_WIDTH));
        ownerPanel.add(new JLabel("Milage"));
        ownerPanel.add(new JTextField(FIELD_WIDTH));
        ownerPanel.add(new JLabel("Color"));
        ownerPanel.add(new JTextField(FIELD_WIDTH));
        ownerPanel.add(new JLabel("Time"));
        ownerPanel.add(new JTextField(FIELD_WIDTH));
        ownerPanel.add(ownerButton);

       // Create Owner Tab
        tabbedPane.addTab("Owner", ownerPanel);
        
        //Create Client Pannel
        JPanel clientPanel = new JPanel();
        clientPanel.add(new JLabel("Client"));
        
        //Text Field
        clientPanel.add(new JTextField(FIELD_WIDTH));
        clientPanel.add(new JLabel("Job Duration"));
        clientPanel.add(new JTextField(FIELD_WIDTH));
        clientPanel.add(new JLabel("Job Deadline"));
        clientPanel.add(new JTextField(FIELD_WIDTH));
        clientPanel.add(clientButton);

        // Create Client Tab
        tabbedPane.addTab("Client", clientPanel);


        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(500, 500));
        this.add(tabbedPane, BorderLayout.CENTER);
    }
      
    class Action implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event){
            JOptionPane.showInputDialog(new Action());
        }
        
    
    private void createButton(){
       JButton button = new JButton("Submit");      
       ActionListener listener = new Action();
       button.addActionListener(listener);
        

    }
}
}
    
