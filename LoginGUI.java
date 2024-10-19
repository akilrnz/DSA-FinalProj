package AURORA_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI extends JFrame {

    public LoginGUI() {
        setTitle("Login - Aurora Cove Hotel");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel backgroundPanel = new JPanel(new BorderLayout());

        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setBackground(new Color(30, 91, 158)); 

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.fill = GridBagConstraints.HORIZONTAL; 

        // Title Label
        JLabel titleLabel = new JLabel("LOG IN");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        gbc.gridx = 0; 
        gbc.gridy = 0; 
        loginPanel.add(titleLabel, gbc);

        // Email Label
        gbc = new GridBagConstraints(); // Create a new instance for email label
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; 
        gbc.gridy = 1; 
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setForeground(Color.WHITE);
        loginPanel.add(emailLabel, gbc);

        // Email Field
        gbc = new GridBagConstraints(); // Create a new instance for email field
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; 
        gbc.gridy = 2; 
        JTextField emailField = new JTextField(20);
        loginPanel.add(emailField, gbc);

        // Password Label
        gbc = new GridBagConstraints(); // Create a new instance for password label
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; 
        gbc.gridy = 3; 
        JLabel passLabel = new JLabel("Password");
        passLabel.setForeground(Color.WHITE);
        loginPanel.add(passLabel, gbc);

        // Password Field
        gbc = new GridBagConstraints(); // Create a new instance for password field
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; 
        gbc.gridy = 4; 
        JPasswordField passField = new JPasswordField(20);
        loginPanel.add(passField, gbc);

        // Login Button
        gbc = new GridBagConstraints(); // Create a new instance for the login button
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; 
        gbc.gridy = 5; 
        gbc.gridwidth = 1; 
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        loginButton.setPreferredSize(new Dimension(100, 30));
        loginPanel.add(loginButton, gbc);

        // Create Account Label
        gbc = new GridBagConstraints(); // Create a new instance for create account label
        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0; 
        gbc.gridy = 6; 
        JLabel createAccountLabel = new JLabel("Create an Account");
        createAccountLabel.setForeground(Color.WHITE);
        createAccountLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        createAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new RegisterGUI();
                dispose(); 
            }
        });
        loginPanel.add(createAccountLabel, gbc);

        backgroundPanel.add(loginPanel, BorderLayout.WEST);

        getContentPane().add(backgroundPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginGUI();
    }
}
