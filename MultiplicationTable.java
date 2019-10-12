/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Shaon
 */
public class MultiplicationTable extends JFrame {
    private Container c;
    private JLabel imglabel,textlabel;
    private JTextArea ta;
    private JTextField tf;
    private JButton clearButton;
    private ImageIcon img;
    private Font f;
    private Cursor cursor;
    
MultiplicationTable(){
     c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        f = new Font("Tahoma",Font.BOLD,20);
        
        img= new ImageIcon(getClass().getResource("1.png"));
    
        imglabel=new JLabel(img);
        imglabel.setBounds(20,10,img.getIconWidth(),img.getIconHeight());
        c.add(imglabel);
        textlabel = new JLabel("Enter any number:");
        textlabel.setBounds(20,200,250,50);
        textlabel.setFont(f);
        textlabel.setForeground(Color.red);
        textlabel.setBackground(Color.MAGENTA);
        c.add(textlabel);
        
        
        tf =new JTextField();
        tf.setBounds(230, 200, 90, 50);
        tf.setFont(f);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.green);
        c.add(tf);
        
        cursor=new Cursor(Cursor.HAND_CURSOR);
        
        
        clearButton=new JButton("clear");
        clearButton.setBounds(230, 260, 90, 50);
        clearButton.setCursor(cursor);
        clearButton.setBackground(Color.red);
        c.add(clearButton);
        
        ta= new JTextArea();
        ta.setBounds(20, 350, 300, 300);
        ta.setBackground(Color.green);
        ta.setFont(f);
        c.add(ta);
        
        tf.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String value=tf.getText();
            if(value.isEmpty()){
                JOptionPane.showMessageDialog(null, "You didn,t put any number");
            }
            else{
                
            }
            ta.setText("");
            int num=Integer.parseInt(tf.getText());
            
            for(int i=1;i<=10;i++){
                int result= num*i;
                String r = String.valueOf(result);
                String n=String.valueOf(num);
                String incr = String.valueOf(i);
                
                ta.append(n+"X"+incr+"="+r+"\n");
            }
            
        }
        
        });
        
         clearButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
       ta.setText("");
        
        }
        });
         
        
        
        
        
        
        
        
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MultiplicationTable frame= new MultiplicationTable();
        frame.setVisible(true);
        frame.setBounds(300,20,360,700);
        frame.setTitle("MultiplicationTable Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
