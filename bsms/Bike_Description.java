/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANK
 */
public class Bike_Description extends javax.swing.JFrame {
     String modelid,colour;
      Integer availability,warrenty_period;
    /**
     * Creates new form Bike_Description
     */
    public Bike_Description() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtbdmid = new javax.swing.JTextField();
        txtbda = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnenter = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        txtbdwp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbikedescription = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bike Description", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif", 0, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Model ID              :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 118, 220, 37));

        jLabel10.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Colour                   :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 200, 40));

        jLabel11.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Availability           :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 200, 33));

        jLabel12.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Warrenty Period  :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 210, 28));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RED", "BLUE", "BLACK", "YELLOW", "WHITE", "PURPLE", " " }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setDoubleBuffered(true);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 321, 40));

        txtbdmid.setBackground(new java.awt.Color(255, 255, 255));
        txtbdmid.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        txtbdmid.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtbdmid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 117, 321, 40));

        txtbda.setBackground(new java.awt.Color(255, 255, 255));
        txtbda.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        txtbda.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtbda, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 321, 39));

        btnclear.setBackground(new java.awt.Color(0, 102, 204));
        btnclear.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel2.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 140, 50));

        btndelete.setBackground(new java.awt.Color(0, 102, 204));
        btndelete.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("DELETE");
        btndelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 140, 50));

        btnenter.setBackground(new java.awt.Color(0, 102, 204));
        btnenter.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnenter.setForeground(new java.awt.Color(255, 255, 255));
        btnenter.setText("ENTER");
        btnenter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnenter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenterActionPerformed(evt);
            }
        });
        jPanel2.add(btnenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 140, 50));

        btnback.setBackground(new java.awt.Color(0, 102, 204));
        btnback.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 255));
        btnback.setText("BACK");
        btnback.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        jPanel2.add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 140, 50));

        btnhome.setBackground(new java.awt.Color(0, 102, 255));
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bsms/1 home-start-blue-logo-icon-0.png"))); // NOI18N
        btnhome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnhome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 60, 60));

        btnsearch.setBackground(new java.awt.Color(0, 102, 255));
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bsms/vippng.com-search-png-images-1037268.png"))); // NOI18N
        btnsearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 60, 60));

        btnupdate.setBackground(new java.awt.Color(0, 102, 204));
        btnupdate.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("UPDATE");
        btnupdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnupdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 140, 50));

        txtbdwp.setBackground(new java.awt.Color(255, 255, 255));
        txtbdwp.setFont(new java.awt.Font("DejaVu Serif", 0, 18)); // NOI18N
        txtbdwp.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txtbdwp, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 408, 321, 39));

        tblbikedescription.setBackground(new java.awt.Color(0, 153, 255));
        tblbikedescription.setForeground(new java.awt.Color(0, 0, 0));
        tblbikedescription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblbikedescription);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 480, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        LoadElements();
        DBConnection.Connect();
        try
        {
            if(this.txtbdmid.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Model ID is required!");
            }

            else
            {
                Statement st=DBConnection.con.createStatement();
                st.executeUpdate("INSERT INTO BIKE_DESCRIPTION VALUES('"+modelid+"','"+colour+"','"+availability+"','"+warrenty_period+"')");
                JOptionPane.showMessageDialog(this, "Record is inserted succesfully");
                DBConnection.con.close();
                LoadTable();
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
         DBConnection.Connect();
       try
       {
           if(this.txtbdmid.getText().equals(""))
           {
           JOptionPane.showMessageDialog(this, "Model ID is required!");
           }
       
           else
       {
       Statement st=DBConnection.con.createStatement();
         st.executeUpdate("DELETE FROM BIKE_DESCRIPTION WHERE MODELID='"+this.txtbdmid.getText()+"'");
         JOptionPane.showMessageDialog(this, "Record is deleted succesfully");
         DBConnection.con.close();
         LoadTable();
       }
       }
       catch(SQLException ex)
               {
               JOptionPane.showMessageDialog(this, ex.getMessage());
               }        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenterActionPerformed
       LoadElements();
       DBConnection.Connect();
       try
       {
           if(this.txtbdmid.getText().equals(""))
           {
           JOptionPane.showMessageDialog(this, "Model ID is required!");
           }
           else if(this.jComboBox1.getSelectedItem().equals(""))
                   {
                   JOptionPane.showMessageDialog(this, "Colour is required!");
                   }
       
           else
       {
       Statement st=DBConnection.con.createStatement();
         st.executeUpdate("INSERT INTO BIKE_DESCRIPTION VALUES('"+modelid+"','"+colour+"','"+availability+"','"+warrenty_period+"')");
         JOptionPane.showMessageDialog(this, "Record is inserted succesfully");
         DBConnection.con.close();
         LoadTable();
       }
       }
       catch(SQLException ex)
               {
               JOptionPane.showMessageDialog(this, ex.getMessage());
               } // TODO add your handling code here:
    }//GEN-LAST:event_btnenterActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
      Bike_Details bd=new Bike_Details();
      bd.setVisible(true);
      this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        Main mp=new Main();
        mp.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        DBConnection.Connect();
        try
        {
            Statement st = DBConnection.con.createStatement();
            ResultSet res = st.executeQuery("SELECT*FROM BIKE_DESCRIPTION WHERE MODELID='"+this.txtbdmid.getText()+"'AND COLOUR='"+this.jComboBox1.getSelectedItem());
            while(res.next())
            {
                this.txtbda.setColumns(res.getInt("AVAILABILITY"));
                this.txtbdwp.setColumns(res.getInt("WARRENTY_PERIOD"));
                
            }
            DBConnection.con.close();

        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());

        }// TODO add your handling code here:
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
              DBConnection.Connect();
        try
         
       {
           if(this.txtbdmid.getText().equals(""))
           {
           JOptionPane.showMessageDialog(this, "Model ID is required!");
           }
       
           else
       {
       Statement st=DBConnection.con.createStatement();
         st.executeUpdate("UPDATE BIKE_DETAILS SET COLOUR='"+colour+"',AVAILABILITY='"+availability+"',WARRENTY_PERIOD='"+warrenty_period+"' WHERE MODELID='"+this.txtbdmid.getText()+"'");
         JOptionPane.showMessageDialog(this, "Record is updated succesfully");
         DBConnection.con.close();
         LoadTable();
       }
       }
       catch(SQLException ex)
               {
               JOptionPane.showMessageDialog(this, ex.getMessage());
               }        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed
 void LoadElements()
    {
    modelid=this.txtbdmid.getText();
    colour=(String) this.jComboBox1.getSelectedItem();
    availability=this.txtbda.getColumns();
    warrenty_period=this.txtbdwp.getColumns();
    
    
    }
 void LoadTable()
 {
 DefaultTableModel dtm=new DefaultTableModel();
    dtm.addColumn("Model ID");
    dtm.addColumn("Colour");
    dtm.addColumn("Availability");
    dtm.addColumn("Warrenty Period");
    
    
    DBConnection.Connect();
    try
    {
    Statement st=DBConnection.con.createStatement();
    ResultSet rs=st.executeQuery("SELECT * FROM BIKE_DESCRIPTION");
    while(rs.next())
    {
    String MODELID = rs.getString("MODELID");
    String COLOUR = rs.getString("COLOUR");
    
  
    Integer AVAILABILITY=rs.getInt("AVAILABILITY");
    Integer WARRENTY_PERIOD=rs.getInt("WARRENTY_PERIOD");   
    dtm.addRow(new String[]{MODELID,COLOUR});
    
    dtm.addRow(new Integer[]{AVAILABILITY,WARRENTY_PERIOD});
    }
    this.tblbikedescription.setModel(dtm);
    DBConnection.con.close();
    
    
    }
    catch(SQLException ex)
    {
    JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    
 
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
            java.util.logging.Logger.getLogger(Bike_Description.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bike_Description.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bike_Description.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bike_Description.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bike_Description().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnenter;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblbikedescription;
    private javax.swing.JTextField txtbda;
    private javax.swing.JTextField txtbdmid;
    private javax.swing.JTextField txtbdwp;
    // End of variables declaration//GEN-END:variables
}
