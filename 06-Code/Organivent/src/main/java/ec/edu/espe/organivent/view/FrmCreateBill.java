/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.EventController;
import ec.edu.espe.organivent.model.Event;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson Yepez, DCCO - ESPE, BitCoderz
 */
public class FrmCreateBill extends javax.swing.JFrame {
    Event event;
    private Color btnDefaultColor = new Color(63,115,193);
    private Color btnHoverColor = new Color(48,88,149);
    /**
     * Creates new form FrmCreateBill
     */
    public FrmCreateBill() {
        initComponents();
        loadEvent();
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
        txtIdEvent = new javax.swing.JLabel();
        cmbIdEvent = new javax.swing.JComboBox<>();
        btnDeleteBill = new javax.swing.JPanel();
        txtCreateBillBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        txtTitle.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(32, 108, 141));
        txtTitle.setText(org.openide.util.NbBundle.getMessage(FrmCreateBill.class, "FrmCreateBill.txtTitle.text")); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(116, 178, 237));

        txtIdEvent.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtIdEvent.setText(org.openide.util.NbBundle.getMessage(FrmCreateBill.class, "FrmCreateBill.txtIdEvent.text")); // NOI18N

        cmbIdEvent.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        cmbIdEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbIdEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbIdEventMouseClicked(evt);
            }
        });

        btnDeleteBill.setBackground(new java.awt.Color(63, 115, 193));
        btnDeleteBill.setPreferredSize(new java.awt.Dimension(138, 31));
        btnDeleteBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteBillMouseClicked(evt);
            }
        });

        txtCreateBillBtn.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtCreateBillBtn.setForeground(new java.awt.Color(255, 255, 255));
        txtCreateBillBtn.setText(org.openide.util.NbBundle.getMessage(FrmCreateBill.class, "FrmCreateBill.txtCreateBillBtn.text")); // NOI18N
        txtCreateBillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCreateBillBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCreateBillBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCreateBillBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnDeleteBillLayout = new javax.swing.GroupLayout(btnDeleteBill);
        btnDeleteBill.setLayout(btnDeleteBillLayout);
        btnDeleteBillLayout.setHorizontalGroup(
            btnDeleteBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCreateBillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
        );
        btnDeleteBillLayout.setVerticalGroup(
            btnDeleteBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCreateBillBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(txtTitle))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdEvent)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbIdEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnDeleteBill, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdEvent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbIdEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbIdEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbIdEventMouseClicked
        event = getSelectedEvent();
    }//GEN-LAST:event_cmbIdEventMouseClicked

    private void txtCreateBillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCreateBillBtnMouseClicked
        EventController evtc = new EventController();
        int option = JOptionPane.showConfirmDialog(rootPane, "¿Está seguro que desea crear esta la factura?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION){
            evtc.calculateEventCost(event);
        }
        this.dispose();
    }//GEN-LAST:event_txtCreateBillBtnMouseClicked

    private void txtCreateBillBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCreateBillBtnMouseEntered
        btnDeleteBill.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtCreateBillBtnMouseEntered

    private void txtCreateBillBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCreateBillBtnMouseExited
        btnDeleteBill.setBackground(btnDefaultColor);
    }//GEN-LAST:event_txtCreateBillBtnMouseExited

    private void btnDeleteBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteBillMouseClicked

    }//GEN-LAST:event_btnDeleteBillMouseClicked

    private void loadEvent() {
        DefaultComboBoxModel<String> listModel = new DefaultComboBoxModel();
        EventController evtc = new EventController();

        ArrayList<Event> availableEvents = evtc.readTable();

        String display;

        for (Event currentEvents : availableEvents) {
            display = String.valueOf(currentEvents.getId());
            listModel.addElement(display);
        }

        cmbIdEvent.setModel(listModel);
    }

    private Event getSelectedEvent() {
        Event selectedEvent;
        EventController evtc = new EventController();
        int reladtedId;

        String indexContent = String.valueOf(cmbIdEvent.getSelectedItem());

        reladtedId = Integer.parseInt(Character.toString(indexContent.charAt(0)));

        selectedEvent = evtc.findOne(reladtedId);

        return selectedEvent;
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
            java.util.logging.Logger.getLogger(FrmCreateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCreateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCreateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCreateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCreateBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnDeleteBill;
    private javax.swing.JComboBox<String> cmbIdEvent;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtCreateBillBtn;
    private javax.swing.JLabel txtIdEvent;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
