/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author veerc
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI implements ActionListener{
    
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    
    
    
    
    
     public static void main(String[] args) {
         JPanel panel= new JPanel();
         JFrame frame= new JFrame();
         frame.setSize(350,200);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         frame.add(panel);
          
          panel.setLayout(null);
          
          userLabel=new JLabel("user");
          userLabel.setBounds(10,20,80,25);
          panel.add(userLabel);
          
         userText= new JTextField(20);
          userText.setBounds(100,20,165,25);
          panel.add(userText);
          
          passwordLabel=new JLabel("Password");
          passwordLabel.setBounds(10,50,80,25);
          panel.add(passwordLabel);
          
          passwordText=new JPasswordField();
          passwordText.setBounds(100,50,165,25); 
          panel.add(passwordText);
          
          button=new JButton("Login");
          button.setBounds(10,80,80,25);
          button.addActionListener(new GUI());
          panel.add(button);
          
          success=new JLabel("");
          success.setBounds(10,110,300,25);
          panel.add(success);
    
          
          frame.setVisible(true);
          
        
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + " , " + password);
        
        if(user.equals("alex") && password.equals("abc123") ) {

       JFrame rame= new JFrame();
         rame.setSize(400,100);
         rame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JPanel pane= new JPanel();
         rame.add(pane);
         success=new JLabel("");
          success.setBounds(10,110,300,25);
          pane.add(success);
          success.setText("Login Successful, Welcome back.");
          
          rame.setVisible(true);

        }
        
        else{
            
            JFrame rame= new JFrame();
         rame.setSize(400,100);
         rame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JPanel pane= new JPanel();
         rame.add(pane);
         success=new JLabel("");
          success.setBounds(10,110,300,25);
          pane.add(success);
          success.setText("Wrong username or password, please try again.");
          
          rame.setVisible(true);
          
         
         
         
        }
        
        
        
        
        
        
    }
    
}
