package AURORA_1;

import javax.swing.*;
import java.awt.*;

public class RegisterGUI extends JFrame {

    public RegisterGUI() {
        setTitle("Sign Up - Aurora Cove Hotel");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Background panel with images
        JPanel backgroundPanel = new JPanel(new BorderLayout());

        // Left side (Registration form)
        JPanel registerPanel = new JPanel(new GridBagLayout());
        registerPanel.setBackground(new Color(30, 91, 158)); // Aurora blue

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel titleLabel = new JLabel("SIGN UP");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);

        JLabel firstNameLabel = new JLabel("First Name");
        firstNameLabel.setForeground(Color.WHITE);
        JTextField firstNameField = new JTextField(20);

        JLabel lastNameLabel = new JLabel("Last Name");
        lastNameLabel.setForeground(Color.WHITE);
        JTextField lastNameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setForeground(Color.WHITE);
        JTextField emailField = new JTextField(20);

        JLabel passLabel = new JLabel("Password");
        passLabel.setForeground(Color.WHITE);
        JPasswordField passField = new JPasswordField(20);

        JLabel confirmPassLabel = new JLabel("Confirm Password");
        confirmPassLabel.setForeground(Color.WHITE);
        JPasswordField confirmPassField = new JPasswordField(20);

        JButton registerButton = new JButton(new ImageIcon("resources/arrow_icon.png"));
        registerButton.setText("Confirm");
        registerButton.setPreferredSize(new Dimension(50, 30));

        JLabel alreadyHaveAccountLabel = new JLabel("Already have an account");
        alreadyHaveAccountLabel.setForeground(Color.WHITE);
        alreadyHaveAccountLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        alreadyHaveAccountLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new LoginGUI(); // Open login form
                dispose(); // Close registration window
            }
        });

        // Positioning elements in the registration panel
        gbc.gridx = 0;
        gbc.gridy = 0;
        registerPanel.add(titleLabel, gbc);

        gbc = new GridBagConstraints(); // Create a new instance for first name label
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        registerPanel.add(firstNameLabel, gbc);

        gbc = new GridBagConstraints(); // New instance for first name field
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 2;
        registerPanel.add(firstNameField, gbc);

        gbc = new GridBagConstraints(); // New instance for last name label
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        registerPanel.add(lastNameLabel, gbc);

        gbc = new GridBagConstraints(); // New instance for last name field
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 4;
        registerPanel.add(lastNameField, gbc);

        gbc = new GridBagConstraints(); // New instance for email label
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 5;
        registerPanel.add(emailLabel, gbc);

        gbc = new GridBagConstraints(); // New instance for email field
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 6;
        registerPanel.add(emailField, gbc);

        gbc = new GridBagConstraints(); // New instance for password label
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 7;
        registerPanel.add(passLabel, gbc);

        gbc = new GridBagConstraints(); // New instance for password field
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 8;
        registerPanel.add(passField, gbc);

        gbc = new GridBagConstraints(); // New instance for confirm password label
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 9;
        registerPanel.add(confirmPassLabel, gbc);

        gbc = new GridBagConstraints(); // New instance for confirm password field
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 10;
        registerPanel.add(confirmPassField, gbc);

        gbc = new GridBagConstraints(); // New instance for register button
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        registerPanel.add(registerButton, gbc);

        gbc = new GridBagConstraints(); // New instance for already have an account label
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 1;
        registerPanel.add(alreadyHaveAccountLabel, gbc);

        // Adding hotel images and logo
        JLabel backgroundImage = new JLabel(new ImageIcon("resources/register_background.jpg"));

        JLabel logoLabel = new JLabel(new ImageIcon("resources/aurora_logo.png"));
        logoLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel imagePanel = new JPanel(new BorderLayout());
        imagePanel.add(logoLabel, BorderLayout.CENTER);
        imagePanel.add(backgroundImage, BorderLayout.SOUTH);

        // Add both panels to the main frame
        backgroundPanel.add(registerPanel, BorderLayout.WEST);
        backgroundPanel.add(imagePanel, BorderLayout.CENTER);

        getContentPane().add(backgroundPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new RegisterGUI();
    }
}
