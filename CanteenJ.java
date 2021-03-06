/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffff;

 

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static javafx.scene.input.KeyCode.Q;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.ws.Service;
import net.proteanit.sql.DbUtils;
public class CanteenJ extends javax.swing.JFrame {

    Connection C = null;
    PreparedStatement ps = null;
    ResultSet Rs = null;
    
    
    double [] cal = new double[3];
    String PN;
    
    public CanteenJ() {
        
        
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

        jPanel1 = new javax.swing.JPanel();
        Canteen = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        Bookshop = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ProductName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RET = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        Recipt = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        Total = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        QTY = new javax.swing.JTextField();
        ToT = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        CANT = new javax.swing.JTable();
        Search1 = new javax.swing.JButton();
        msg2 = new javax.swing.JLabel();
        msg1 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PID = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Canteen.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Canteen.setText("Canteen");
        jPanel1.add(Canteen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, 50));

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 70, 40));

        LogOut.setText("LogOut");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        jPanel1.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 80, 40));

        Bookshop.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Bookshop.setText("Bookshop");
        Bookshop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookshopActionPerformed(evt);
            }
        });
        jPanel1.add(Bookshop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 150, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 820));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Canteen");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 1140, 63));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1630, 110));

        ProductName.setText(" ");
        ProductName.setToolTipText("");
        ProductName.setName("vb"); // NOI18N
        ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameActionPerformed(evt);
            }
        });
        getContentPane().add(ProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 98, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Product Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Unit Price");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        UP.setText(" ");
        UP.setToolTipText("");
        UP.setName("vb"); // NOI18N
        UP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPActionPerformed(evt);
            }
        });
        UP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UPKeyPressed(evt);
            }
        });
        getContentPane().add(UP, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 98, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Quantity");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        RET.setColumns(20);
        RET.setRows(5);
        jScrollPane2.setViewportView(RET);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1309, 150, 480, 370));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Recipt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Recipt.setText("Recipt");
        Recipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReciptActionPerformed(evt);
            }
        });
        jPanel3.add(Recipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 100, 40));

        Reset.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel3.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 80, 40));

        Exit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel3.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 70, 40));

        ADD.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ADD.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\Add.png")); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel3.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 40));

        Total.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Total.setText("Total");
        Total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TotalMouseClicked(evt);
            }
        });
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        jPanel3.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 100, 40));

        UPDATE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        UPDATE.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\Save.png")); // NOI18N
        UPDATE.setText("Update");
        UPDATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UPDATEMouseClicked(evt);
            }
        });
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel3.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 130, 40));

        DELETE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DELETE.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\cancel.png")); // NOI18N
        DELETE.setText("Delete");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel3.add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 130, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 800, 130));

        QTY.setText(" ");
        QTY.setToolTipText("");
        QTY.setName("vb"); // NOI18N
        QTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QTYActionPerformed(evt);
            }
        });
        QTY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                QTYKeyPressed(evt);
            }
        });
        getContentPane().add(QTY, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 98, -1));

        ToT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToTActionPerformed(evt);
            }
        });
        getContentPane().add(ToT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 140, 37));

        CANT.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        CANT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product name", "Unit Price", "Quantity ", "Total"
            }
        ));
        CANT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CANTMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(CANT);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 1550, 240));

        Search1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Search1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DuminduS\\Desktop\\New folder\\images\\View.png")); // NOI18N
        Search1.setText("Search");
        Search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search1ActionPerformed(evt);
            }
        });
        getContentPane().add(Search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 130, 30));

        msg2.setText(" ");
        getContentPane().add(msg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 150, 20));

        msg1.setText(" ");
        getContentPane().add(msg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 150, 20));
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 180, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Product ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 70, 20));
        getContentPane().add(PID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 90, 20));

        jPanel4.setBackground(new java.awt.Color(214, 222, 222));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 169, 20), 4));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1622, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 702, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 1630, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
             
        try{
        
        int b1 = Integer.parseInt(UP.getText());
        int b2 = Integer.parseInt(QTY.getText());
        
        
        int TOTB = (b1*b2);
        
        ToT.setText(""+TOTB);
        
        }catch(Exception ex){
        
        JOptionPane.showMessageDialog(Canteen,ex.getMessage());
        }
    }//GEN-LAST:event_TotalActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        
        ProductName.setText(null);
        UP.setText(null);
        QTY.setText(null);
        RET.setText(null);
        ToT.setText(null);
    }//GEN-LAST:event_ResetActionPerformed

    private void UPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UPActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ReciptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReciptActionPerformed
     
        PN = ProductName.getText();
        cal[0] = Double.parseDouble(UP.getText());
        cal[1] = Double.parseDouble(QTY.getText());
        cal[2] = Double.parseDouble(ToT.getText());
        
        int refs;
        refs = 1325 +(int) (Math.random()*4238);
        int ref = (refs);
        
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        tTime.format(timer.getTime());
        SimpleDateFormat tDate = new SimpleDateFormat("dd-MMM-yyyy");
        tDate.format(timer.getTime());
        
        
        RET.append("\t\t\nCanteen Managment System : \n\n  \n\tProduct Name :"+PN+"  \n\tUnit Price :"+cal[0]+"\n\tQuantity :"+cal[1]+"\n\tTotal :"+cal[2]+"\n \tDate :"+tDate.format(timer.getTime())+"\n\tTime :"+tTime.format(timer.getTime())+"\n\n \tThank You!");
    }//GEN-LAST:event_ReciptActionPerformed

    private void BookshopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookshopActionPerformed
        
        Bookshop1 BK = new Bookshop1();
        BK.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BookshopActionPerformed

    private void QTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QTYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QTYActionPerformed

    private void TotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TotalMouseClicked





        // TODO add your handling code here:
    }//GEN-LAST:event_TotalMouseClicked

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed

        
        if(ProductName.getText().trim().isEmpty() && UP.getText().trim().isEmpty()){
        
            error.setText("Field is empty");
        
        
        }
        
                                                
    String Product_Name = ProductName.getText();
    String Unit_Price = UP.getText();
    String Quantity = QTY.getText();
    String Total = ToT.getText();
    String query = "insert into canteen(Product_Name,Unit_Price,CQuantity,CTotal) values ('"+Product_Name+"','"+Unit_Price+"','"+Quantity+"','"+Total+"')";
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
              
    }//GEN-LAST:event_ADDActionPerformed

    
      public void ShowTableData(){
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"Product_ID","Product_Name","Unit_Price","CQuantity","CTotal"},0);
        
        
        try{
        
        Connection C = DB_class.getConnection();
        Statement st = C.createStatement();
           
            String sql="SELECT * FROM canteen";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
            
                String a = rs.getString("Product_Name");
                String b = rs.getString("Unit_Price");
                String c = rs.getString("CQuantity");
                String d = rs.getString("CTotal"); 
                String e = rs.getString("Product_ID"); 
               
                
                 
                model.addRow(new Object[]{e,a,b,c,d});
                CANT.setModel(model);
            }
            
            
            
        }catch(Exception ex){
        ex.printStackTrace();
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void ToTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ToTActionPerformed

    private void UPDATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UPDATEMouseClicked

    
    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed

        
       
       
        try{
            
        int ID = Integer.parseInt(PID.getText());
        String Pname = ProductName.getText();
        String Uprice = UP.getText();
        String Qty = QTY.getText();
        String total = ToT.getText();
        
            
        Connection C = DB_class.getConnection();
        PreparedStatement pre2;
             
        pre2 = C.prepareStatement( "UPDATE canteen SET Unit_Price =?,CQuantity =?, CTotal=?,Product_Name =? where Product_ID =?");
           
           pre2.setString(1,Uprice);
           pre2.setString(2,Qty);
           pre2.setString(3,total);
           pre2.setString(4,Pname);
            pre2.setInt(5,ID);
           
            pre2.executeUpdate();
            
         JOptionPane.showMessageDialog(this, "Updated !!");
         ShowTableData();
            
        }catch(Exception e){
                 JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        
    }//GEN-LAST:event_UPDATEActionPerformed

    private void CANTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CANTMouseClicked

        
        
          
         int i = CANT.getSelectedRow();
       TableModel model = CANT.getModel();
       ProductName.setText(model.getValueAt(i,1).toString());
       UP.setText(model.getValueAt(i,2).toString());
       QTY.setText(model.getValueAt(i,3).toString());
        PID.setText(model.getValueAt(i,0).toString());
        
        
        
    }//GEN-LAST:event_CANTMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        
        ShowTableData();
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void Search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search1ActionPerformed
     
         Connection connection;
        try {
            connection = DB_class.getConnection();
       
        
           PreparedStatement pre1;
     
            pre1 = connection.prepareStatement("select *  from canteen where Product_Name= ?   ");
            pre1.setString(1 , ProductName.getText() );
            ResultSet rs = pre1.executeQuery();
            String Product_Name ="" ;
            String UnitPrice ="" ;
            String CQuantity ="" ;
            String CTotal="" ;
       
            
            
            while(rs.next())
            {
                Product_Name = rs.getString(1);
                UnitPrice = rs.getString(2);
                CQuantity  = rs.getString(3);
                CTotal = rs.getString(4);
              
      
            }
            
            ProductName.setText(Product_Name);
            UP.setText(UnitPrice);
           QTY.setText(CQuantity);
            ToT.setText( CTotal);
          

    }   catch (Exception ex) {
            System.out.println(ex);
        }
        
        
        
        
    }//GEN-LAST:event_Search1ActionPerformed

    private void ProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameActionPerformed
      
        
        
    }//GEN-LAST:event_ProductNameActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
       
            
        String query = "DELETE FROM canteen WHERE Product_ID = " +PID.getText();
      
    try {
        Connection c = DB_class.getConnection();
        Statement stmt = c.createStatement();
        stmt.execute(query);
        JOptionPane.showMessageDialog(this, "deleted");
        ShowTableData();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }

        
        
    }//GEN-LAST:event_DELETEActionPerformed

    private void UPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UPKeyPressed
      
        char C =evt.getKeyChar();
        if(Character.isLetter(C)){
        
            UP.setEditable(false);
            msg1.setText("please enter number only");
            
        
        
        }
        else{
        
        UP.setEditable(true);
        }
        
    }//GEN-LAST:event_UPKeyPressed

    private void QTYKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QTYKeyPressed
   
        
        char C =evt.getKeyChar();
        if(Character.isLetter(C)){
        
            QTY.setEditable(false);
            msg2.setText("please enter number only");
            
        
        
        }
        else{
        
        QTY.setEditable(true);
        }
        
        
        
    }//GEN-LAST:event_QTYKeyPressed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
         mainhome1 main = new mainhome1();
        main.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogOutActionPerformed

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
            java.util.logging.Logger.getLogger(CanteenJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CanteenJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CanteenJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CanteenJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CanteenJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton Back;
    private javax.swing.JButton Bookshop;
    private javax.swing.JTable CANT;
    private javax.swing.JButton Canteen;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton Exit;
    private javax.swing.JButton LogOut;
    private javax.swing.JLabel PID;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField QTY;
    private javax.swing.JTextArea RET;
    private javax.swing.JButton Recipt;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Search1;
    private javax.swing.JTextField ToT;
    private javax.swing.JButton Total;
    private javax.swing.JTextField UP;
    private javax.swing.JButton UPDATE;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel msg1;
    private javax.swing.JLabel msg2;
    // End of variables declaration//GEN-END:variables
}
