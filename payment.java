/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billpay;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shaon
 */
public class payment extends JFrame implements ActionListener {
      private Container c;
    private JPanel panel,panel2;
    private Font f;
    private JTable table;
      private DefaultTableModel model;
      private JScrollPane scroll;
     private JLabel code,name,quantity,price, Amount,total,pay,balance;
     private JTextField t1,t2,t3,t4,t5,t6,t7,t8;
     private JOptionPane p1;
     private String[] cols ={"product code","product name","Quantity","Price","Amount"};
     private String[] rows =new String[5];
    private JButton addButton,printButton;
       payment(){
             initComponent();
           }
 public void initComponent(){
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900,750);
        this.setLocationRelativeTo(null);
        this.setTitle("Bill Payment");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        f= new Font("Arial",Font.BOLD,16);
        
  code = new JLabel("Product_code");
   code.setFont(f);
   code.setBounds(15, 40, 140, 30);
   c.add(code);
   
   t5= new JTextField();
   t5.setBounds(130, 30, 200, 30);
   t5.setFont(f);
   c.add(t5);
   
   
   name = new JLabel("Product_name");
   name.setFont(f);
   name.setBounds(15, 80, 140, 30);
   c.add(name);
   
   t1= new JTextField();
   t1.setBounds(130, 80, 200, 30);
   t1.setFont(f);
   c.add(t1);
   
   quantity = new JLabel("Quantity ");
   quantity.setFont(f);
   quantity.setBounds(10, 130, 140, 30);
   c.add(quantity);
   
   t2= new JTextField();
   t2.setBounds(130, 130, 200, 30);
   t2.setFont(f);
   c.add(t2);
   
    price = new JLabel("Price");
   price.setFont(f);
   price.setBounds(10, 180, 140, 30);
   c.add(price);
   
   t3= new JTextField();
   t3.setBounds(130, 180, 200, 30);
   t3.setFont(f);
   c.add(t3);
   
   
   Amount = new JLabel("Amount");
   Amount.setFont(f);
   Amount.setBounds(10, 230, 140, 30);
   c.add(Amount);
   
   t4= new JTextField();
   t4.setBounds(130, 230, 200, 30);
   t4.setFont(f);
   c.add(t4);
   

   addButton= new JButton("Add");
   addButton.setBounds(130, 270, 100, 30);
   addButton.setFont(f);
   c.add(addButton);
   
    total = new JLabel("Total");
   total.setFont(f);
   total.setBounds(515, 30, 100, 30);
   c.add(total);
   
   t6= new JTextField();
   t6.setBounds(515, 60, 200, 30);
   t6.setFont(f);
   c.add(t6);
   
    pay = new JLabel("Pay");
   pay.setFont(f);
   pay.setBounds(515, 90, 140, 30);
   c.add(pay);
   
   t7= new JTextField();
   t7.setBounds(515, 120, 200, 30);
   t7.setFont(f);
   c.add(t7);
   
    balance = new JLabel("Balance");
   balance.setFont(f);
   balance.setBounds(515, 150, 140, 30);
   c.add(balance);
   
   t8= new JTextField();
   t8.setBounds(515, 180, 200, 30);
   t8.setFont(f);
   c.add(t8);
   
   printButton=new JButton("Print Bill");
   printButton.setBounds(515, 235, 200, 30);
   c.add(printButton);
   
     addButton.addActionListener(this);
    printButton.addActionListener(this);
    
     table = new JTable();
   model=new DefaultTableModel();
   model.setColumnIdentifiers(cols);
   table.setModel(model);
   table.setFont(f);
   table.setSelectionBackground(Color.green);
   table.setBackground(Color.white);
   table.setRowHeight(30);
   scroll= new JScrollPane(table);
   scroll.setBounds(10, 360, 460, 265);
   c.add(scroll);
   
   
   panel2 = new JPanel();
   
   panel2.setBackground(Color.white);
   JScrollPane scroll2=new JScrollPane(panel2);
   scroll2.setBounds(515, 300, 350, 300);
   c.add(scroll2);
    
}
  @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==addButton){
            rows[0]=t5.getText();
            rows[1]=t1.getText();
            rows[2]=t2.getText();
            rows[3]=t3.getText();
            rows[4]=t4.getText();
            
           model.addRow(rows);
           
        }
         else if(e.getSource()==printButton){
                 int total =Integer.parseInt(t6.getText());
             int pay=Integer.parseInt(t7.getText());
             int bal=total-pay;
             t8.setText(String.valueOf(bal));
             bill();
         }
         
         int sum=0;
         for(int i=0;i<model.getRowCount();i++){
        sum=sum+Integer.parseInt(model.getValueAt(i, 4).toString());
        
    }
         t6.setText(Integer.toString(sum));
         t1.setText("");
         t2.setText("");
         t3.setText("");
         t4.setText("");
         t5.setText("");
         
         
         
    }
    public static void main(String[] args) {
        payment jframe=new payment();
        jframe.setVisible(true);
    }
public void bill(){
    String total = t6.getText();
    String pay = t7.getText();
    String bal = t8.getText();
   //DefaultTableModel m =new DefaultTableModel();
  // m=(DefaultTableModel).table.
  
  JTextArea t = new JTextArea();
  t.setBounds(515, 300, 350, 300);
  t.setText(t.getText()+ ".........................\n");
  t.setText(t.getText()+ "  POSBILL  \n");
  t.setText(t.getText()+ ".........................\n");
  t.setText(t.getText()+ "Product" + "\t" + "price"+"\t" +"Amount" + "\n");
  
  panel2.add(t);
  
}
   
    
}
