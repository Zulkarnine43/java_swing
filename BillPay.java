/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billpay;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shaon
 */
public class BillPay extends JFrame {
    private Container c;
    private JPanel panel;
    private Font f;
    private JTable table;
      private DefaultTableModel model;
      private JScrollPane scroll;
    private JLabel code,name,quality,price, Amount;
    private JTextField t1,t2,t3,t4;
    private JOptionPane p1;
    private String[] cols ={"product code","product name","Quantity","Price","Amount"};
    private String[] rows =new String[5];
BillPay(){
    initComponent();
}
public void initComponent(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setBounds(10, 10, 1000, 700);
    this.setLocationRelativeTo(null);
    this.setTitle("Shop BillPayment");
    
    c=this.getContentPane();
    c.setLayout(null);
    
    
    panel = new JPanel();
    panel.setBounds(10, 14, 500, 150);
    panel.setBackground(Color.blue);
    c.add(panel);
    
    
    code=new JLabel("Product code");
    code.setBounds(10, 80, 140, 30);
    panel.add(code);
    
    name=new JLabel("Product name");
    name.setBounds(50, 5, 40, 20);
    panel.add(name);
    
    quality=new JLabel("Quantity");
    quality.setBounds(90, 5, 40, 20);
    panel.add(quality);
    
    price=new JLabel("Price");
    price.setBounds(130, 5, 40, 20);
    panel.add(price);
    
    Amount=new JLabel("Amount");
    Amount.setBounds(170, 5, 40, 20);
    panel.add(Amount);
    
    t1=new JTextField();
    t1.setBounds(10,30,70,40);
    panel.add(t1);
    
    
     table = new JTable();
   model=new DefaultTableModel();
   model.setColumnIdentifiers(cols);
   table.setModel(model);
   table.setFont(f);
   table.setSelectionBackground(Color.green);
   table.setBackground(Color.white);
   table.setRowHeight(30);
   scroll= new JScrollPane(table);
   scroll.setBounds(10, 360, 740, 265);
   c.add(scroll);
    
}
    public static void main(String[] args) {
        // TODO code application logic here
        BillPay jframe=new BillPay();
        jframe.setVisible(true);
        
    }
    
}
