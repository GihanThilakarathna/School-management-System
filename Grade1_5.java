package staffff;


import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Grade1_5 extends javax.swing.JFrame {

    /**
     * Creates new form Grade1_5
     */
    public Grade1_5() {
        initComponents();
         Update_Table();
    }
    DB j = new DB();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1Sa = new javax.swing.JButton();
        jButton2Up = new javax.swing.JButton();
        jButton3De = new javax.swing.JButton();
        jButton4Se = new javax.swing.JButton();
        jButton5Cl = new javax.swing.JButton();
        jButton6Pr = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1Avg = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton2Grade = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton1Total = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(160, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 160, 20), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1Sa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1Sa.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\New folder\\Save.png")); // NOI18N
        jButton1Sa.setText("Save");
        jButton1Sa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SaActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1Sa, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 172, 111, -1));

        jButton2Up.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2Up.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\New folder\\Upload.png")); // NOI18N
        jButton2Up.setText("Update");
        jButton2Up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2UpActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 253, 111, -1));

        jButton3De.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3De.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\New folder\\delete16.png")); // NOI18N
        jButton3De.setText("Delete");
        jButton3De.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3DeActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3De, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 333, 111, -1));

        jButton4Se.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4Se.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\New folder\\itmsearch.png")); // NOI18N
        jButton4Se.setText("Search");
        jButton4Se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4SeActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4Se, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 412, 111, -1));

        jButton5Cl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5Cl.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\New folder\\Floopy.png")); // NOI18N
        jButton5Cl.setText("Clear");
        jButton5Cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ClActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5Cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 486, 111, -1));

        jButton6Pr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6Pr.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\New folder\\1471468405_invoice.png")); // NOI18N
        jButton6Pr.setText("Print");
        jButton6Pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6PrActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6Pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\New folder\\arrow-circle-315.png")); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 810));

        jPanel2.setBackground(new java.awt.Color(214, 222, 222));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 160, 20), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ResultIDS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("StudentID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Class");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("English");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Maths");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Environment Study");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Other Subject");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 506, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 160, 56, -1));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 301, 56, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 377, 56, -1));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 419, 56, -1));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 459, 56, -1));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 503, 56, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ResultIDS", "StudentID", "Class", "English", "Maths", "Environment Studies", "Other Subject", "Total", "Average", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 1260, 440));

        jButton1Avg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1Avg.setText("Average");
        jButton1Avg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AvgActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1Avg, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 560, -1, -1));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 616, 69, -1));
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 703, 65, -1));

        jButton2Grade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2Grade.setText("Grade");
        jButton2Grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2GradeActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2Grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 651, -1, -1));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 231, 56, -1));

        jButton1Total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1Total.setText("Total");
        jButton1Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1TotalActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 560, -1, -1));
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 616, 61, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 110, 1660, 700));

        jPanel4.setBackground(new java.awt.Color(160, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 160, 20), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Grade 6 to 11");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 170, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 1650, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1SaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SaActionPerformed
        // TODO add your handling code here:
        String ResultIDS = jTextField1.getText();
        String StudentID = jTextField2.getText();
        String Class = jTextField3.getText();
        String English1 = jTextField4.getText();
        String  Maths1 = jTextField5.getText();
        String EnvironmentS1=jTextField6.getText();
        String  other1 =jTextField7.getText();
        String  Total1 =jTextField10.getText();
        String  avg1 = jTextField8.getText();
        String grade =jTextField9.getText();
        
        
        
        
        if(ResultIDS.isEmpty() || StudentID.isEmpty() || Class.isEmpty() ||  English1.isEmpty() || EnvironmentS1.isEmpty() || other1.isEmpty() ||Total1.isEmpty() || avg1.isEmpty() || grade.isEmpty()){
            JOptionPane.showConfirmDialog(null,"No compelte");
       }
       else{
        int English = Integer.parseInt(English1);
        int Maths = Integer.parseInt(Maths1);
        int EnvironmentS= Integer.parseInt( EnvironmentS1);
        int other = Integer.parseInt(other1);
        int Total = Integer.parseInt(Total1);
        float avg = Float.parseFloat(avg1);
           int  x =JOptionPane.showConfirmDialog(null,"Do you want to add this record");
           if(x==0){
        
        
            
        }
        try{
            j.con();
            j.putdata("INSERT INTO `tograde5`(`ResultIDS`, `StudentID`, `Class`, `English`, `Maths`, `EnvironmentS`, `other`, `Total`, `Average`, `Grade`)"+ "VALUES ('"+ResultIDS+"','"+StudentID+"','"+Class+"','"+English+"','"+Maths+"','"+EnvironmentS+"','"+other+"','"+Total+"','"+avg+"','"+grade+"')");
            JOptionPane.showMessageDialog(rootPane,"SUCCESSFULLY");
             Update_Table();
             clear();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            
        }
        }
        
    }//GEN-LAST:event_jButton1SaActionPerformed

    private void jButton2UpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2UpActionPerformed
        // TODO add your handling code here:
        String ResultIDS = jTextField1.getText();
        String StudentID = jTextField2.getText();
        String Class = jTextField3.getText();
        int English = Integer.parseInt(jTextField4.getText());
        int Maths = Integer.parseInt(jTextField5.getText());
        int EnvironmentS= Integer.parseInt(jTextField6.getText());
        int other = Integer.parseInt(jTextField7.getText());
        int Total = Integer.parseInt(jTextField10.getText());
        float avg = Float.parseFloat(jTextField8.getText());
        String grade =jTextField9.getText();
        try{
            j.con();
            j.putdata("UPDATE `tograde5` SET `StudentID`='"+StudentID+"',`Class`='"+Class+"',`English`='"+English+"',`Maths`='"+Maths+"',`EnvironmentS`='"+EnvironmentS+"',`other`='"+other+"',`Total`='"+Total+"',`Average`='"+avg+"',`Grade`='"+grade+"'  WHERE `ResultIDS`='"+ResultIDS+"'");
            JOptionPane.showMessageDialog(rootPane,"UPDATED");
             Update_Table();
             clear();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
            
        }
        
        
    }//GEN-LAST:event_jButton2UpActionPerformed
private void Update_Table(){
        DefaultTableModel dtm = (DefaultTableModel) jTable1 .getModel();
        dtm.setRowCount(0);
        
        
        try{
            j.con();
            ResultSet  rs = j.getdata("SELECT * FROM `tograde5`");
            
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("ResultIDS"));
                v.add(rs.getString("StudentID"));
                v.add(rs.getString("Class"));
                v.add(rs.getString("English"));
                v.add(rs.getString("Maths"));
                v.add(rs.getString("EnvironmentS"));
                v.add(rs.getString("other"));
                v.add(rs.getString("Total"));
                v.add(rs.getString("Average"));
                v.add(rs.getString("Grade"));
                
                dtm.addRow(v);
                
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        }
    private void jButton3DeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3DeActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "ResultIDS");
        }else{
            try{
                j.con();
                int i = JOptionPane.showConfirmDialog(null,"Are you Sure");
                if(i == 0){
                    j.putdata("DELETE FROM `tograde5` WHERE `ResultIDS` ='"+jTextField1.getText()+ "'");
                    JOptionPane.showMessageDialog(null,"DELETE");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
                e.printStackTrace();
                
            }
            Update_Table();
            clear();
        }
         
         
        
    }//GEN-LAST:event_jButton3DeActionPerformed

    private void jButton4SeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4SeActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        try{
            j.con();
            ResultSet rs = j.getdata("SELECT * FROM `tograde5` WHERE `ResultIDS`='"+jTextField1.getText()+"'");
            
            while(rs.next()){
                Vector v = new Vector();
                 v.add(rs.getString("ResultIDS"));
                v.add(rs.getString("StudentID"));
                v.add(rs.getString("Class"));
                v.add(rs.getString("English"));
                v.add(rs.getString("Maths"));
                v.add(rs.getString("EnvironmentS"));
                v.add(rs.getString("other"));
                v.add(rs.getString("Total"));
                v.add(rs.getString("Average"));
                v.add(rs.getString("Grade"));
                
                dtm.addRow(v);
                
            }
            
            int i = jTable1.getRowCount();
            if(i == 0){
                JOptionPane.showMessageDialog(null,"No information show");
                jTextField1.setText(null);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Sorry! No information to show");
        }
    }//GEN-LAST:event_jButton4SeActionPerformed

    private void jButton5ClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ClActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton5ClActionPerformed

    private void jButton6PrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6PrActionPerformed
        try {
            // TODO add your handling code here:
            jTable1.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Grade1_5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6PrActionPerformed

    private void jButton1AvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AvgActionPerformed
        // TODO add your handling code here:
        int Total = Integer.parseInt(jTextField10.getText());
        float avg  =  Total/4  ;
        jTextField8.setText(""+avg);
        
    }//GEN-LAST:event_jButton1AvgActionPerformed

    private void jButton2GradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2GradeActionPerformed
        // TODO add your handling code here:
        float avg = Float.parseFloat(jTextField8.getText());
        if(Float.parseFloat(jTextField8.getText())>=75){
            jTextField9.setText("A");
        }
        else if(Float.parseFloat(jTextField8.getText())>=65){
            jTextField9.setText("B");
        }
        else if(Float.parseFloat(jTextField8.getText())>=55){
            jTextField9.setText("C");
        }
        else if(Float.parseFloat(jTextField8.getText())>=35){
            jTextField9.setText("S");
        }
        else {
            jTextField9.setText("F");
        }
        
    }//GEN-LAST:event_jButton2GradeActionPerformed

    private void jButton1TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1TotalActionPerformed
        // TODO add your handling code here:
        
       int English = Integer.parseInt(jTextField4.getText());
       int Maths = Integer.parseInt(jTextField5.getText());
       int EnvironmentS= Integer.parseInt(jTextField6.getText());
       int other = Integer.parseInt(jTextField7.getText());
       int sum = (English + Maths+EnvironmentS+other);
       jTextField10.setText(""+sum);
                
       
    }//GEN-LAST:event_jButton1TotalActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        int selectRowIndex =jTable1.getSelectedRow();
        String ResultIDS  = (String) dtm.getValueAt(selectRowIndex,0);
        
        try{
            j.con();
            ResultSet rs = j.getdata("SELECT * FROM `tograde5` WHERE `ResultIDS`='"+ResultIDS+"'");
            while(rs.next()){
                jTextField1.setText(rs.getString("ResultIDS"));
                jTextField2.setText(rs.getString("StudentID"));
                jTextField3.setText(rs.getString("Class"));
                jTextField4.setText(rs.getString("English"));
                jTextField5.setText(rs.getString("Maths"));
                jTextField6.setText(rs.getString("EnvironmentS"));
                jTextField7.setText(rs.getString("other"));
                jTextField10.setText(rs.getString("Total"));
                jTextField8.setText(rs.getString("Average"));
                jTextField9.setText(rs.getString("Grade"));
                
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();;
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Result_management qw = new Result_management();
        qw.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
void clear(){
    jTextField1.setText(null);
    jTextField2.setText(null);
    jTextField3.setText(null);
    jTextField4.setText(null);
    jTextField5.setText(null);
    jTextField6.setText(null);
    jTextField7.setText(null);
    jTextField8.setText(null);
    jTextField9.setText(null);
    jTextField10.setText(null);
}
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
            java.util.logging.Logger.getLogger(Grade1_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grade1_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grade1_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grade1_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grade1_5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Avg;
    private javax.swing.JButton jButton1Sa;
    private javax.swing.JButton jButton1Total;
    private javax.swing.JButton jButton2Grade;
    private javax.swing.JButton jButton2Up;
    private javax.swing.JButton jButton3De;
    private javax.swing.JButton jButton4Se;
    private javax.swing.JButton jButton5Cl;
    private javax.swing.JButton jButton6Pr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    
}