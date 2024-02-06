/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.BillController;
import ec.edu.espe.organivent.model.Bill;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson Yepez, DCCO - ESPE, BitCoderz
 */
public class FrmDeleteBill extends javax.swing.JFrame {
    Bill bill;
    private Color btnDefaultColor = new Color(63,115,193);
    private Color btnHoverColor = new Color(48,88,149);
    
    /**
     * Creates new form FrmDeleteBill
     */
    public FrmDeleteBill() {
        initComponents();
        loadBill();
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
        txtTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtId = new javax.swing.JLabel();
        cmbIdBill = new javax.swing.JComboBox<>();
        btnDeleteBill = new javax.swing.JPanel();
        txtDeleteBillBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtTitle.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(32, 108, 141));
        txtTitle.setText(org.openide.util.NbBundle.getMessage(FrmDeleteBill.class, "FrmDeleteBill.txtTitle.text")); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(116, 178, 237));

        txtId.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtId.setText(org.openide.util.NbBundle.getMessage(FrmDeleteBill.class, "FrmDeleteBill.txtId.text")); // NOI18N

        cmbIdBill.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        cmbIdBill.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbIdBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbIdBillMouseClicked(evt);
            }
        });

        btnDeleteBill.setBackground(new java.awt.Color(63, 115, 193));
        btnDeleteBill.setPreferredSize(new java.awt.Dimension(138, 31));
        btnDeleteBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteBillMouseClicked(evt);
            }
        });

        txtDeleteBillBtn.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtDeleteBillBtn.setForeground(new java.awt.Color(255, 255, 255));
        txtDeleteBillBtn.setText(org.openide.util.NbBundle.getMessage(FrmDeleteBill.class, "FrmDeleteBill.txtDeleteBillBtn.text")); // NOI18N
        txtDeleteBillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDeleteBillBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDeleteBillBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDeleteBillBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDeleteBillLayout = new javax.swing.GroupLayout(btnDeleteBill);
        btnDeleteBill.setLayout(btnDeleteBillLayout);
        btnDeleteBillLayout.setHorizontalGroup(
            btnDeleteBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDeleteBillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        btnDeleteBillLayout.setVerticalGroup(
            btnDeleteBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDeleteBillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(txtTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbIdBill, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId))))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDeleteBill, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(txtTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtId)
                .addGap(18, 18, 18)
                .addComponent(cmbIdBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnDeleteBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbIdBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbIdBillMouseClicked
        bill = getSelectedBill();
    }//GEN-LAST:event_cmbIdBillMouseClicked

    private void btnDeleteBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteBillMouseClicked
    }//GEN-LAST:event_btnDeleteBillMouseClicked

    private void txtDeleteBillBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeleteBillBtnMouseEntered
         btnDeleteBill.setBackground(btnHoverColor); 
    }//GEN-LAST:event_txtDeleteBillBtnMouseEntered

    private void txtDeleteBillBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeleteBillBtnMouseExited
        btnDeleteBill.setBackground(btnDefaultColor);
    }//GEN-LAST:event_txtDeleteBillBtnMouseExited

    private void txtDeleteBillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDeleteBillBtnMouseClicked
        BillController bllc = new BillController();
        int option = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea eliminar la factura?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION){
            bllc.delete(bill);
        }
        this.dispose();
    }//GEN-LAST:event_txtDeleteBillBtnMouseClicked

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
            java.util.logging.Logger.getLogger(FrmDeleteBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDeleteBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDeleteBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDeleteBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDeleteBill().setVisible(true);
            }
        });
    }

    private void loadBill() {
        DefaultComboBoxModel<String> listModel = new DefaultComboBoxModel();
        BillController bll = new BillController();

        ArrayList<Bill> availableBills = bll.readTable();

        String display;

        for (Bill currentBill : availableBills) {
            display = String.valueOf(currentBill.getId());
            listModel.addElement(display);
        }

        cmbIdBill.setModel(listModel);
    }

    private Bill getSelectedBill() {
        Bill selectedBill;
        BillController bll = new BillController();
        int reladtedId;

        String indexContent = String.valueOf(cmbIdBill.getSelectedItem());

        reladtedId = Integer.parseInt(Character.toString(indexContent.charAt(0)));

        selectedBill = bll.findOne(reladtedId);

        return selectedBill;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDeleteBill;
    private javax.swing.JComboBox<String> cmbIdBill;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtDeleteBillBtn;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
