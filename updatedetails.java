/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffff;

import static java.awt.event.PaintEvent.UPDATE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class updatedetails extends javax.swing.JFrame {

    /**
    
     */
    public updatedetails() {
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
        evtxdate = new javax.swing.JTextField();
        evtxid = new javax.swing.JTextField();
        evupdatesearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        evtxstudentn = new javax.swing.JTextArea();
        evupdate = new javax.swing.JButton();
        evjladdev = new javax.swing.JLabel();
        evjlid = new javax.swing.JLabel();
        evjldate = new javax.swing.JLabel();
        evtxvenue = new javax.swing.JTextField();
        evjlvenue = new javax.swing.JLabel();
        evtxtime = new javax.swing.JTextField();
        evjltime = new javax.swing.JLabel();
        evtxcost = new javax.swing.JTextField();
        evjlcost = new javax.swing.JLabel();
        evtxguest = new javax.swing.JTextField();
        evjlguest = new javax.swing.JLabel();
        evtxteacher = new javax.swing.JTextField();
        evjlteacher = new javax.swing.JLabel();
        evjlstname = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        evaddD = new javax.swing.JButton();
        eveditd = new javax.swing.JButton();
        eveditd1 = new javax.swing.JButton();
        evhome = new javax.swing.JButton();
        evadddetailsb = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        evjlheader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(214, 222, 222));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 171, 19), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        evtxdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evtxdateActionPerformed(evt);
            }
        });
        jPanel2.add(evtxdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 292, 32));
        jPanel2.add(evtxid, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 310, 30));

        evupdatesearch.setBackground(new java.awt.Color(153, 153, 153));
        evupdatesearch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        evupdatesearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\View.png")); // NOI18N
        evupdatesearch.setText("Search");
        evupdatesearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evupdatesearchActionPerformed(evt);
            }
        });
        jPanel2.add(evupdatesearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 130, 40));

        evtxstudentn.setColumns(20);
        evtxstudentn.setRows(5);
        jScrollPane1.setViewportView(evtxstudentn);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 310, 40));

        evupdate.setBackground(new java.awt.Color(153, 153, 153));
        evupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evupdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\Save.png")); // NOI18N
        evupdate.setText("Update");
        evupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evupdateActionPerformed(evt);
            }
        });
        jPanel2.add(evupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 630, 210, 50));

        evjladdev.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        evjladdev.setText("Update event");
        jPanel2.add(evjladdev, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, 30));

        evjlid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evjlid.setText("Event ID");
        jPanel2.add(evjlid, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 80, 20));

        evjldate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evjldate.setText("Date");
        jPanel2.add(evjldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 80, 20));
        jPanel2.add(evtxvenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 290, 30));

        evjlvenue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evjlvenue.setText("Venue");
        jPanel2.add(evjlvenue, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 80, 20));
        jPanel2.add(evtxtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 290, 30));

        evjltime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evjltime.setText("Time");
        jPanel2.add(evjltime, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 80, 20));
        jPanel2.add(evtxcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 290, 30));

        evjlcost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evjlcost.setText("Cost");
        jPanel2.add(evjlcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 80, 20));

        evtxguest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evtxguestActionPerformed(evt);
            }
        });
        jPanel2.add(evtxguest, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 290, 30));

        evjlguest.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evjlguest.setText("Chef-guest");
        jPanel2.add(evjlguest, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 80, 20));
        jPanel2.add(evtxteacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 290, 30));

        evjlteacher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evjlteacher.setText("Teacher-in-charge");
        jPanel2.add(evjlteacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 140, 20));

        evjlstname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evjlstname.setText("Student name");
        jPanel2.add(evjlstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 1610, 730));

        jPanel1.setBackground(new java.awt.Color(162, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 171, 19), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        evaddD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evaddD.setText("Add details");
        evaddD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaddDActionPerformed(evt);
            }
        });
        jPanel1.add(evaddD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 170, 50));

        eveditd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eveditd.setText("Edit Details");
        eveditd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eveditdActionPerformed(evt);
            }
        });
        jPanel1.add(eveditd, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 660, -1, -1));

        eveditd1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eveditd1.setText("Edit Details");
        eveditd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eveditd1ActionPerformed(evt);
            }
        });
        jPanel1.add(eveditd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 170, 50));

        evhome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evhome.setText("Home");
        evhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evhomeActionPerformed(evt);
            }
        });
        jPanel1.add(evhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 180, 50));

        evadddetailsb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        evadddetailsb.setText("Event details");
        evadddetailsb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evadddetailsbActionPerformed(evt);
            }
        });
        jPanel1.add(evadddetailsb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 180, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 820));

        jPanel3.setBackground(new java.awt.Color(162, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(226, 171, 19), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        evjlheader.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        evjlheader.setForeground(new java.awt.Color(255, 255, 255));
        evjlheader.setText("Event management");
        jPanel3.add(evjlheader, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1610, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void evtxdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evtxdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_evtxdateActionPerformed

    private void evtxguestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evtxguestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_evtxguestActionPerformed

    private void evupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evupdateActionPerformed
        String eventid = evtxid.getText();
        String eventdate = evtxdate.getText();
        String eventvenue = evtxvenue.getText();
        String eventtime = evtxtime.getText();
        String eventcost = evtxcost.getText();
        String eventguest = evtxguest.getText();
        String eventteacher = evtxteacher.getText();
        String evstudent = evtxstudentn.getText();
        
  
            if(eventid.isEmpty()||eventdate.isEmpty()||eventvenue.isEmpty()||eventtime.isEmpty()||eventcost.isEmpty()||eventguest.isEmpty()||eventteacher.isEmpty()||evstudent.isEmpty()||evtxid.getText().trim().length() > 10){
       JOptionPane.showMessageDialog(null,"Empty slots or invalid event ID!");
    } 
  
    else {
        try {

            Connection c = dbbclass.getConnection();
            
            PreparedStatement pre2;
     
            pre2 = c .prepareStatement("update eventd set eventdate = ? , eventvenue = ? , eventtime = ? , eventcost = ? , eventguest = ? , eventteacher = ? , evstudent = ? where eventid= ?   ");
            
            pre2.setString(1 , eventdate  );
            pre2.setString(2 , eventvenue  );
            pre2.setString(3 , eventtime  );
            pre2.setString(4 , eventcost  );
            pre2.setString(5 , eventguest  );
            pre2.setString(6 , eventteacher  );
            pre2.setString(7 , evstudent  );
            pre2.setString(8 , eventid  );
            
            
            pre2.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Updated !!");
            
                 }   catch (Exception ex) {
            System.out.println(ex);


        // TODO add your handling code here:
    }//GEN-LAST:event_evupdateActionPerformed
    }
    }
    private void evupdatesearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evupdatesearchActionPerformed
        Connection c;
        try {
            c = dbbclass.getConnection();
       
        
           PreparedStatement pre1;
     
            pre1 = c.prepareStatement("select *  from eventd where eventid= ?   ");
            pre1.setString(1 , evtxid.getText() );
            ResultSet rs = pre1.executeQuery();
            String eventid ="" ;
            String eventdate ="" ;
            String eventvenue ="" ;
            String eventtime ="" ;
            String  eventcost = "" ;
            String  eventguest = "";
            String  eventteacher = "";
            String  evstudent = "";
        
            
            
            while(rs.next())
            {
                eventid = rs.getString(1);
                eventdate = rs.getString(2);
                eventvenue  = rs.getString(3);
                eventtime = rs.getString(4);
              
                eventcost = rs.getString(5);
                eventguest = rs.getString(6);
                eventteacher = rs.getString(7);
                evstudent = rs.getString(8);
            }
            
            evtxdate.setText(eventdate);
            evtxvenue.setText(eventvenue);
           evtxtime.setText(eventtime);
            evtxcost.setText(eventcost);
           evtxguest.setText(eventguest);
           evtxteacher.setText(eventteacher);
           evtxstudentn.setText(evstudent);

    }   catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_evupdatesearchActionPerformed

    private void evaddDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaddDActionPerformed
        enterdetails cc = new enterdetails();
        cc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_evaddDActionPerformed

    private void eveditdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eveditdActionPerformed
        updatedetails xx = new updatedetails();
        xx.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_eveditdActionPerformed

    private void eveditd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eveditd1ActionPerformed
        updatedetails xx = new updatedetails();
        xx.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_eveditd1ActionPerformed

    private void evhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evhomeActionPerformed
        evhome hh = new evhome();
        hh.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_evhomeActionPerformed

    private void evadddetailsbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evadddetailsbActionPerformed
        eventdetails dd = new eventdetails();
        dd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_evadddetailsbActionPerformed
        
        
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
            java.util.logging.Logger.getLogger(updatedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatedetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton evaddD;
    private javax.swing.JButton evadddetailsb;
    private javax.swing.JButton eveditd;
    private javax.swing.JButton eveditd1;
    private javax.swing.JButton evhome;
    private javax.swing.JLabel evjladdev;
    private javax.swing.JLabel evjlcost;
    private javax.swing.JLabel evjldate;
    private javax.swing.JLabel evjlguest;
    private javax.swing.JLabel evjlheader;
    private javax.swing.JLabel evjlid;
    private javax.swing.JLabel evjlstname;
    private javax.swing.JLabel evjlteacher;
    private javax.swing.JLabel evjltime;
    private javax.swing.JLabel evjlvenue;
    private javax.swing.JTextField evtxcost;
    private javax.swing.JTextField evtxdate;
    private javax.swing.JTextField evtxguest;
    private javax.swing.JTextField evtxid;
    private javax.swing.JTextArea evtxstudentn;
    private javax.swing.JTextField evtxteacher;
    private javax.swing.JTextField evtxtime;
    private javax.swing.JTextField evtxvenue;
    private javax.swing.JButton evupdate;
    private javax.swing.JButton evupdatesearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
