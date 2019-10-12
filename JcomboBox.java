/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcombobox;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Shaon
 */
public class JcomboBox extends JFrame  {
    private Container c;
    private JComboBox jb;
    private String[] proLanguage={"C","C++","JAVA","PHP","PYTHON"};
    private JLabel jl;
    private JButton btn; 
    JcomboBox(){
        initComponents();
    }
    public void initComponents(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Combo Box demo");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        jb = new JComboBox(proLanguage);
          jb.setSelectedItem("JAVA");
        jb.setBounds(50,150,100,50);
         c.add(jb);
       // jb.setEditable(true)
       //jb.setSelectedIndex(3);
       // jb.addItem("BASIC");
     //  jb.removeItem("Basic");
     //  jb.removeItemAt(3);
       //jb.removeAllItems();
       
        System.out.println("Total item ="+jb.getItemCount());
        
        jl = new JLabel();
        jl.setBounds(160, 150, 200, 50);
        c.add(jl);
        
        
        btn = new JButton("show");
        btn.setBounds(160, 150, 200, 50);
        c.add(btn);
         //btn.addActionListener(new ActionListener()
       
             
             jb.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            String s=jb.getSelectedItem().toString();
        jl.setText("You have selected : "+s);
        }
        });
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         JcomboBox frame = new JcomboBox();
        frame.setVisible(true);
    }
    
}
