package ec.edu.espe.organivent.view;

import java.awt.Color;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class PnlAddEvent2 extends javax.swing.JPanel {

    /**
     * Creates new form PnlAddEvent
     */
    public PnlAddEvent2() {
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

        jCalendar1 = new com.toedter.calendar.JCalendar();
        txtConfirmbtn3 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtStaff = new javax.swing.JLabel();
        txtEquipment = new javax.swing.JLabel();
        btnReturn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbEquipment = new javax.swing.JComboBox<>();
        cmbStaff = new javax.swing.JComboBox<>();
        btnConfirm = new javax.swing.JPanel();
        txtConfirmBtn = new javax.swing.JLabel();
        btnPenaltyFees = new javax.swing.JPanel();
        txtPenaltyFeeBtn = new javax.swing.JLabel();
        btnGeneralExpenses = new javax.swing.JPanel();
        txtGeneralExpensesBtn = new javax.swing.JLabel();

        txtConfirmbtn3.setFont(new java.awt.Font("Inter SemiBold", 0, 15)); // NOI18N
        txtConfirmbtn3.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmbtn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtConfirmbtn3.setText("Regresar");
        txtConfirmbtn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtConfirmbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConfirmbtn3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtConfirmbtn3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtConfirmbtn3MouseExited(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));

        txtTitle.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(32, 108, 141));
        txtTitle.setText("Crear Evento");

        jSeparator1.setForeground(new java.awt.Color(116, 178, 237));

        txtStaff.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtStaff.setForeground(new java.awt.Color(135, 132, 132));
        txtStaff.setText("Staff:");

        txtEquipment.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtEquipment.setForeground(new java.awt.Color(135, 132, 132));
        txtEquipment.setText("Equipamiento:");

        btnReturn.setBackground(new java.awt.Color(63, 115, 193));
        btnReturn.setToolTipText("");
        btnReturn.setPreferredSize(new java.awt.Dimension(142, 27));

        jLabel1.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Regresar");

        javax.swing.GroupLayout btnReturnLayout = new javax.swing.GroupLayout(btnReturn);
        btnReturn.setLayout(btnReturnLayout);
        btnReturnLayout.setHorizontalGroup(
            btnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReturnLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        btnReturnLayout.setVerticalGroup(
            btnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        cmbEquipment.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmbEquipment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbStaff.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmbStaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStaffActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(63, 115, 193));
        btnConfirm.setPreferredSize(new java.awt.Dimension(142, 27));

        txtConfirmBtn.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N
        txtConfirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmBtn.setText("Confirmar");

        javax.swing.GroupLayout btnConfirmLayout = new javax.swing.GroupLayout(btnConfirm);
        btnConfirm.setLayout(btnConfirmLayout);
        btnConfirmLayout.setHorizontalGroup(
            btnConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConfirmLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(txtConfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        btnConfirmLayout.setVerticalGroup(
            btnConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConfirmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        btnPenaltyFees.setBackground(new java.awt.Color(63, 194, 193));
        btnPenaltyFees.setPreferredSize(new java.awt.Dimension(142, 27));

        txtPenaltyFeeBtn.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N
        txtPenaltyFeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        txtPenaltyFeeBtn.setText("Agregar Multas");

        javax.swing.GroupLayout btnPenaltyFeesLayout = new javax.swing.GroupLayout(btnPenaltyFees);
        btnPenaltyFees.setLayout(btnPenaltyFeesLayout);
        btnPenaltyFeesLayout.setHorizontalGroup(
            btnPenaltyFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPenaltyFeesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPenaltyFeeBtn)
                .addGap(69, 69, 69))
        );
        btnPenaltyFeesLayout.setVerticalGroup(
            btnPenaltyFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPenaltyFeesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPenaltyFeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnGeneralExpenses.setBackground(new java.awt.Color(63, 194, 193));
        btnGeneralExpenses.setPreferredSize(new java.awt.Dimension(142, 27));

        txtGeneralExpensesBtn.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N
        txtGeneralExpensesBtn.setForeground(new java.awt.Color(255, 255, 255));
        txtGeneralExpensesBtn.setText("Agregar Gastos Generales");

        javax.swing.GroupLayout btnGeneralExpensesLayout = new javax.swing.GroupLayout(btnGeneralExpenses);
        btnGeneralExpenses.setLayout(btnGeneralExpensesLayout);
        btnGeneralExpensesLayout.setHorizontalGroup(
            btnGeneralExpensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGeneralExpensesLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(txtGeneralExpensesBtn)
                .addGap(20, 20, 20))
        );
        btnGeneralExpensesLayout.setVerticalGroup(
            btnGeneralExpensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGeneralExpensesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGeneralExpensesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(txtTitle))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtStaff)
                                    .addComponent(txtEquipment))
                                .addGap(18, 18, 18)
                                .addComponent(cmbEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnPenaltyFees, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(btnGeneralExpenses, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))))
                .addGap(25, 25, 25))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(132, Short.MAX_VALUE)
                    .addComponent(cmbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(txtStaff)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEquipment)
                    .addComponent(cmbEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGeneralExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPenaltyFees, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(83, 83, 83)
                    .addComponent(cmbStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(281, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStaffActionPerformed

    private void txtConfirmbtn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtn3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmbtn3MouseExited

    private void txtConfirmbtn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtn3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmbtn3MouseEntered

    private void txtConfirmbtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtn3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmbtn3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConfirm;
    private javax.swing.JPanel btnGeneralExpenses;
    private javax.swing.JPanel btnPenaltyFees;
    private javax.swing.JPanel btnReturn;
    private javax.swing.JComboBox<String> cmbEquipment;
    private javax.swing.JComboBox<String> cmbStaff;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtConfirmBtn;
    private javax.swing.JLabel txtConfirmbtn3;
    private javax.swing.JLabel txtEquipment;
    private javax.swing.JLabel txtGeneralExpensesBtn;
    private javax.swing.JLabel txtPenaltyFeeBtn;
    private javax.swing.JLabel txtStaff;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
