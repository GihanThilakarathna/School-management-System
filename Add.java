/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffff;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Chamoth
 */
public class Add extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    public Add() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Sales = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BOOKID = new javax.swing.JTextField();
        Book = new javax.swing.JLabel();
        Book1 = new javax.swing.JLabel();
        BOOKNAME = new javax.swing.JTextField();
        Book2 = new javax.swing.JLabel();
        BOOKPRICE = new javax.swing.JTextField();
        ADDITEM = new javax.swing.JButton();
        error2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UPDATETABLE = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bookshop");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 180, 63));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1630, 100));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sales.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Sales.setText("Sales");
        jPanel1.add(Sales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 50));

        Back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 80, 40));

        LogOut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LogOut.setText("LogOut");
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 750, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 820));

        jPanel5.setBackground(new java.awt.Color(214, 222, 222));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Add Item");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, 120, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BOOKID.setText(" ");
        BOOKID.setToolTipText("");
        BOOKID.setName("vb"); // NOI18N
        jPanel3.add(BOOKID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 170, 40));

        Book.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Book.setText("Book ID");
        jPanel3.add(Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 60, 40));

        Book1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Book1.setText("Book Name");
        jPanel3.add(Book1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 80, 40));

        BOOKNAME.setText(" ");
        BOOKNAME.setToolTipText("");
        BOOKNAME.setName("vb"); // NOI18N
        jPanel3.add(BOOKNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 170, 40));

        Book2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Book2.setText("Book Price");
        jPanel3.add(Book2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 80, 40));

        BOOKPRICE.setText(" ");
        BOOKPRICE.setToolTipText("");
        BOOKPRICE.setName("vb"); // NOI18N
        BOOKPRICE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOKPRICEActionPerformed(evt);
            }
        });
        jPanel3.add(BOOKPRICE, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 170, 40));

        ADDITEM.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ADDITEM.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\Add.png")); // NOI18N
        ADDITEM.setText("ADD");
        ADDITEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDITEMActionPerformed(evt);
            }
        });
        jPanel3.add(ADDITEM, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 110, 33));
        jPanel3.add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 120, 20));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 610, 250));

        UPDATETABLE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        UPDATETABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Book Price"
            }
        ));
        UPDATETABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UPDATETABLEMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(UPDATETABLE);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 1430, 270));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1630, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       
        Bookshop1 BKS = new Bookshop1();
        BKS.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

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
                UPDATETABLE.setModel(model);
            }
            
            
            
        }catch(Exception ex){
        ex.printStackTrace();
        }
        
    }
    
    
    
    
    
    
    private void ADDITEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDITEMActionPerformed

          
        if(BOOKID.getText().trim().isEmpty() && BOOKNAME.getText().trim().isEmpty() && BOOKPRICE.getText().trim().isEmpty()){
        
            error2.setText("Field is empty");
        
        
        }
              
                                                
    String Book_ID = BOOKID.getText();
    String Book_Name = BOOKNAME.getText();
    String Book_Price = BOOKPRICE.getText();
    String Quantity = "";
    String Total= "";
    String CoopanID ="";
    
    String query = "insert into `bookshop2` values ('"+Book_ID+"','"+Book_Name+"','"+Book_Price+"','"+Quantity+"','"+Total+"','"+CoopanID+"')";
    System.out.println(query);


    try {
        Connection c = DB_class.getConnection();
        Statement stmt = c.createStatement();
        stmt.executeUpdate(query);
        JOptionPane.showMessageDialog(this, "Saved");
        ShowTableData();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_ADDITEMActionPerformed

    private void UPDATETABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATETABLEMouseClicked

        int i = UPDATETABLE.getSelectedRow();
        TableModel model = UPDATETABLE.getModel();
        BOOKID.setText(model.getValueAt(i,0).toString());
        BOOKNAME.setText(model.getValueAt(i,1).toString());
        BOOKPRICE.setText(model.getValueAt(i,2).toString());
    }//GEN-LAST:event_UPDATETABLEMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
       ShowTableData(); 
        
        
    }//GEN-LAST:event_formWindowOpened

    private void BOOKPRICEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOKPRICEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOOKPRICEActionPerformed

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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDITEM;
    private javax.swing.JTextField BOOKID;
    private javax.swing.JTextField BOOKNAME;
    private javax.swing.JTextField BOOKPRICE;
    private javax.swing.JButton Back;
    private javax.swing.JLabel Book;
    private javax.swing.JLabel Book1;
    private javax.swing.JLabel Book2;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Sales;
    private javax.swing.JTable UPDATETABLE;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
