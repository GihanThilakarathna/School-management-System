/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffff;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Chamoth
 */
public class Bookshop1 extends javax.swing.JFrame {

    /**
     * Creates new form Bookshop1
     */
    public Bookshop1() {
        initComponents();
    }

     double [] BK = new double[5];
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Sales = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        IDt = new javax.swing.JTextField();
        Price = new javax.swing.JLabel();
        Price1 = new javax.swing.JTextField();
        QTY = new javax.swing.JLabel();
        QTY1 = new javax.swing.JTextField();
        TOT = new javax.swing.JLabel();
        TOT1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        J1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        UPDATE = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Recipt = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        TOTAL = new javax.swing.JButton();
        TOTAL1 = new javax.swing.JButton();
        PRINT = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        BKRET = new javax.swing.JTextArea();
        BE2 = new javax.swing.JLabel();
        BE1 = new javax.swing.JLabel();
        ADDITM = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sales.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Sales.setText("Sales");
        jPanel1.add(Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 150, 48));

        Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 70, 40));

        LogOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LogOut.setText("LogOut");
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, 90, 37));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 810));

        jPanel2.setBackground(new java.awt.Color(162, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel2.setForeground(new java.awt.Color(255, 102, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bookshop");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 180, 63));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1600, 90));

        ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ID.setText("ID");
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 30, -1));
        getContentPane().add(IDt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 90, 30));

        Price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Price.setText("Price");
        getContentPane().add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 60, 20));

        Price1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Price1KeyPressed(evt);
            }
        });
        getContentPane().add(Price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 90, 30));

        QTY.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QTY.setText("Quantity");
        getContentPane().add(QTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 70, 20));

        QTY1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                QTY1KeyPressed(evt);
            }
        });
        getContentPane().add(QTY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 90, 30));

        TOT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TOT.setText("Total");
        getContentPane().add(TOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 70, 20));
        getContentPane().add(TOT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 340, 90, 30));

        J1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        J1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Price", "Quantity", "Total"
            }
        ));
        J1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(J1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 1440, 240));

        jPanel4.setBackground(new java.awt.Color(214, 222, 222));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UPDATE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        UPDATE.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\Save.png")); // NOI18N
        UPDATE.setText("Update Item");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel4.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 150, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Recipt.setText("Recipt");
        Recipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReciptActionPerformed(evt);
            }
        });
        jPanel3.add(Recipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, 40));

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel3.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 130, 40));

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel3.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 130, 40));

        TOTAL.setText("Total");
        TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALActionPerformed(evt);
            }
        });
        jPanel3.add(TOTAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, 40));

        TOTAL1.setText("Total");
        TOTAL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTAL1ActionPerformed(evt);
            }
        });
        jPanel3.add(TOTAL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, 40));

        PRINT.setText("Print");
        PRINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRINTActionPerformed(evt);
            }
        });
        jPanel3.add(PRINT, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 130, 40));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 790, 100));

        BKRET.setColumns(20);
        BKRET.setRows(5);
        jScrollPane3.setViewportView(BKRET);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 40, 500, 360));
        jPanel4.add(BE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 160, 30));
        jPanel4.add(BE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 150, 30));

        ADDITM.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ADDITM.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\Add.png")); // NOI18N
        ADDITM.setText("Add item");
        ADDITM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDITMActionPerformed(evt);
            }
        });
        jPanel4.add(ADDITM, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 130, 40));

        DELETE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DELETE.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\cancel.png")); // NOI18N
        DELETE.setText("Delete Item");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel4.add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 150, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 1600, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed

        CanteenJ CNT = new CanteenJ();
        CNT.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void ADDITMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDITMActionPerformed

        Add AD = new Add();
        AD.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ADDITMActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed

        Update UPD = new Update();
        UPD.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UPDATEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed

        Delete DLT = new Delete();
        DLT.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DELETEActionPerformed

    private void ReciptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReciptActionPerformed

        BK[0] =Double.parseDouble(IDt.getText());
        BK[1] =Double.parseDouble( Price1.getText());
        BK[2] =Double.parseDouble( QTY1.getText());

        BK[3] =Double.parseDouble(TOT1.getText());

        int refs;
        refs = 1325 +(int) (Math.random()*4238);
        int ref = (refs);

        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat tDate = new SimpleDateFormat("dd-MMM-yyyy");
        tDate.format(timer.getTime());

        BKRET.append("\t\t\nBookshop Managment System : \n\n "+"\n\n\tID :"+BK[0]+"\n\tPrice :"+BK[1]+"\n\tQuantity :"+BK[2]+"\n\tQuantity :"+BK[3]+ "\n\tDiscount :"+BK[4]+"\n\tTotal :"+BK[4]+"\n \tDate :"+tDate.format(timer.getTime())+"\n\tTime :"+tTime.format(timer.getTime())+"\n\n \tThank You!");

    }//GEN-LAST:event_ReciptActionPerformed

    public void ShowTableData(){
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"Book_ID","Book_Name","Book_Price","Quantity","Total"},0);
        
        
        try{
        
        Connection C = DB_class.getConnection();
        Statement st = C.createStatement();
           
            String sql="SELECT * FROM bookshop2";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
            
                String a = rs.getString("Book_ID");
                String b = rs.getString("Book_Name");
                String c = rs.getString("Book_Price");
                String d = rs.getString("Quantity"); 
                String e = rs.getString("Total"); 
                 
                model.addRow(new Object[]{a,b,c,d,e});
                J1.setModel(model);
            }
            
            
            
        }catch(Exception ex){
        ex.printStackTrace();
        }
        
    }
    
    
    
    
    
    
    
    
    
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed

        IDt.setText(null);
        Price1.setText(null);
        QTY1.setText(null);

        TOT1.setText(null);
        BKRET.setText(null);
    }//GEN-LAST:event_ResetActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed

        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALActionPerformed

        int b1 = Integer.parseInt(Price1.getText());
        int b2 = Integer.parseInt(QTY1.getText());

        int TOTB = (b1*b2);

        TOT1.setText(""+TOTB);

        String Book_ID = IDt.getText();
        String Book_Price = Price1.getText();
        String Quantity = QTY1.getText();
        String Total = TOT1.getText();
        String Book_Name ="";
        String CoopanID ="";
        String query = "insert into bookshop2 values ('"+Book_ID+"','"+Book_Name+"','"+Book_Price+"','"+Quantity+"','"+Total+"','"+CoopanID+"')";
        System.out.println(query);

        
        if(Book_ID.equals("")){
        
        JOptionPane.showMessageDialog(null, "Book ID can't be Empty!");
        }
        
        
        else if(Price1.equals("")){
        
        JOptionPane.showMessageDialog(null, " Price can't be Empty!");
        }
        
          else if(QTY1.equals("")){
        
        JOptionPane.showMessageDialog(null, "Quantity can't be Empty!");
        }
        
        
        try {
            Connection c = DB_class.getConnection();
            Statement stmt = c.createStatement();
            stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(this, "Saved");
            ShowTableData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_TOTALActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        ShowTableData();
        
        
    }//GEN-LAST:event_formWindowOpened

    private void J1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J1MouseClicked
   
        
         int i = J1.getSelectedRow();
       TableModel model = J1.getModel();
       IDt.setText(model.getValueAt(i,0).toString());
       Price1.setText(model.getValueAt(i,2).toString());
       QTY1.setText(model.getValueAt(i,3).toString());
        
        
        
    }//GEN-LAST:event_J1MouseClicked

    private void Price1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Price1KeyPressed
      
         char C =evt.getKeyChar();
        if(Character.isLetter(C)){
        
            Price1.setEditable(false);
            BE1.setText("please enter number only");
            
        
        
        }
        else{
        
        Price1.setEditable(true);
        }
        
    }//GEN-LAST:event_Price1KeyPressed

    private void QTY1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QTY1KeyPressed
        char C =evt.getKeyChar();
        if(Character.isLetter(C)){
        
            QTY1.setEditable(false);
            BE2.setText("please enter number only");
            
        
        
        }
        else{
        
        QTY1.setEditable(true);
        }
        
    }//GEN-LAST:event_QTY1KeyPressed

    private void TOTAL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTAL1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TOTAL1ActionPerformed

    private void PRINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRINTActionPerformed
      
         try {
            // TODO add your handling code here:
            J1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Bookshop1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_PRINTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bookshop1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bookshop1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bookshop1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bookshop1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bookshop1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDITM;
    private javax.swing.JLabel BE1;
    private javax.swing.JLabel BE2;
    private javax.swing.JTextArea BKRET;
    private javax.swing.JButton Back;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel ID;
    private javax.swing.JTextField IDt;
    private javax.swing.JTable J1;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton PRINT;
    private javax.swing.JLabel Price;
    private javax.swing.JTextField Price1;
    private javax.swing.JLabel QTY;
    private javax.swing.JTextField QTY1;
    private javax.swing.JButton Recipt;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Sales;
    private javax.swing.JLabel TOT;
    private javax.swing.JTextField TOT1;
    private javax.swing.JButton TOTAL;
    private javax.swing.JButton TOTAL1;
    private javax.swing.JButton UPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
