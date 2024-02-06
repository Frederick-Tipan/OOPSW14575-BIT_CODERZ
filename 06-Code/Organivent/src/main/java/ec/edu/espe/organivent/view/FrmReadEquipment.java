package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.EquipmentController;
import ec.edu.espe.organivent.model.Equipment;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FrmReadEquipment extends javax.swing.JFrame {

    private Color btnDefaultColor = new Color(116,179,237);
    private Color btnHoverColor = new Color(63,115,193);
    private Font pressedFont = new Font("Inter SemiBold", Font.PLAIN, 20);
    private Font defaultFont = new Font("Inter", Font.PLAIN, 20);
    /**
     * Creates new form FrmReadEquipment
     */
    public FrmReadEquipment() {
        initComponents();
        readEquipment();
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
        txtTitle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReadEquipment = new javax.swing.JTable();
        btnBackEquipment = new javax.swing.JPanel();
        txtBackEquipmentbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle1.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle1.setText(org.openide.util.NbBundle.getMessage(FrmReadEquipment.class, "FrmReadEquipment.txtTitle1.text_1")); // NOI18N
        jPanel1.add(txtTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        tblReadEquipment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Costo", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tblReadEquipment);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 390, 270));

        btnBackEquipment.setBackground(new java.awt.Color(63, 115, 193));
        btnBackEquipment.setPreferredSize(new java.awt.Dimension(158, 56));

        txtBackEquipmentbtn.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtBackEquipmentbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtBackEquipmentbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBackEquipmentbtn.setText(org.openide.util.NbBundle.getMessage(FrmReadEquipment.class, "FrmReadEquipment.txtBackEquipmentbtn.text_1")); // NOI18N
        txtBackEquipmentbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBackEquipmentbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackEquipmentbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBackEquipmentbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBackEquipmentbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBackEquipmentLayout = new javax.swing.GroupLayout(btnBackEquipment);
        btnBackEquipment.setLayout(btnBackEquipmentLayout);
        btnBackEquipmentLayout.setHorizontalGroup(
            btnBackEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackEquipmentLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtBackEquipmentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnBackEquipmentLayout.setVerticalGroup(
            btnBackEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackEquipmentLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtBackEquipmentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnBackEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBackEquipmentbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackEquipmentbtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtBackEquipmentbtnMouseClicked

    private void txtBackEquipmentbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackEquipmentbtnMouseEntered
        btnBackEquipment.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtBackEquipmentbtnMouseEntered

    private void txtBackEquipmentbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackEquipmentbtnMouseExited
        if(txtBackEquipmentbtn.getFont().equals(defaultFont)){
            btnBackEquipment.setBackground(btnDefaultColor);
        }
    }//GEN-LAST:event_txtBackEquipmentbtnMouseExited

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
            java.util.logging.Logger.getLogger(FrmReadEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReadEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReadEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReadEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReadEquipment().setVisible(true);
            }
        });
    }
    
    private void readEquipment() {
    EquipmentController equip = new EquipmentController();
    ArrayList<Equipment> equipmentList = equip.read();

    DefaultTableModel model = (DefaultTableModel) tblReadEquipment.getModel();
    model.setRowCount(0); 

    for (Equipment equipment : equipmentList) {
        Object[] rowData = {equipment.getType(),equipment.getCost(),equipment.getQuantity() };
        model.addRow(rowData);
    }
    }
    
    private void resetButtonColors(){
        btnBackEquipment.setBackground(btnDefaultColor);
        
    }
    
    private void resetFontFormat(){
        txtBackEquipmentbtn.setFont(defaultFont);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBackEquipment;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReadEquipment;
    private javax.swing.JLabel txtBackEquipmentbtn;
    private javax.swing.JLabel txtTitle1;
    // End of variables declaration//GEN-END:variables
}
