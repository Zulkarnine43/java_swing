/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keylisteners;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Shaon
 */
public class KeyListeners extends JFrame {
    private Container c;
    private JTextField tf;
    private JTextArea ta;
KeyListeners(){
        initComponents();
    }
    public void initComponents(){
    
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Combo Box demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        
        tf=new JTextField();
        tf.setBounds(50, 50, 150, 50);
        c.add(tf);
        
        ta=new JTextArea();
        ta.setBounds(10, 110, 300, 300);
        ta.setBackground(Color.pink);
        c.add(ta);
        
        tf.addKeyListener(new KeyListener(){
          @Override
          public void keyTyped(KeyEvent e) {
              ta.append("key Type"+e.getKeyChar()+"\n");
          }

          @Override
          public void keyPressed(KeyEvent e) {
              ta.append("keyPressed :"+e.getKeyChar()+"\n");
          }

          @Override
          public void keyReleased(KeyEvent e) {
               ta.append("keyReleased :"+e.getKeyChar()+"\n");
          }
        
        });
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          KeyListeners frame = new KeyListeners();
        frame.setVisible(true);
    }
    
}
