package ec.edu.espe.organivent.view;

import com.raven.glasspanepopup.GlassPanePopup;
import ec.edu.espe.organivent.model.Expense;
import ec.edu.espe.organivent.utils.HandleInput;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Frederick
 */
public class FrmAddExpense extends javax.swing.JFrame {

    private Color btnDefaultColor = new Color(63,115,193);
    private Color btnHoverColor = new Color(48,88,149);
    private Expense expense;
    private FrmAddEvent frmAddEventMenu;
    
    /**
     * Creates new form FrmAddExpense
     */
    public FrmAddExpense() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/organivent_icon.jpeg")).getImage());
        
        GlassPanePopup.install(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        sptTitle = new javax.swing.JSeparator();
        txtCosto = new javax.swing.JLabel();
        txtTipoGasto = new javax.swing.JLabel();
        tfdType = new javax.swing.JTextField();
        fdlCost = new javax.swing.JFormattedTextField();
        sptTypo = new javax.swing.JSeparator();
        sptCosto = new javax.swing.JSeparator();
        btnConfirm = new javax.swing.JPanel();
        txtConfirmbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(390, 267));
        setMinimumSize(new java.awt.Dimension(390, 267));
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(32, 108, 141));
        txtTitle.setText(org.openide.util.NbBundle.getMessage(FrmAddExpense.class, "FrmAddExpense.txtTitle.text")); // NOI18N
        background.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 21, -1, -1));

        sptTitle.setBackground(new java.awt.Color(116, 178, 237));
        sptTitle.setForeground(new java.awt.Color(116, 178, 237));
        sptTitle.setMaximumSize(new java.awt.Dimension(246, 1));
        sptTitle.setMinimumSize(new java.awt.Dimension(246, 1));
        sptTitle.setOpaque(true);
        sptTitle.setPreferredSize(new java.awt.Dimension(246, 1));
        background.add(sptTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 49, -1, -1));

        txtCosto.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtCosto.setForeground(new java.awt.Color(135, 132, 132));
        txtCosto.setText(org.openide.util.NbBundle.getMessage(FrmAddExpense.class, "FrmAddExpense.txtCosto.text")); // NOI18N
        background.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 153, -1, -1));

        txtTipoGasto.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtTipoGasto.setForeground(new java.awt.Color(135, 132, 132));
        txtTipoGasto.setText(org.openide.util.NbBundle.getMessage(FrmAddExpense.class, "FrmAddExpense.txtTipoGasto.text")); // NOI18N
        background.add(txtTipoGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 79, -1, -1));

        tfdType.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        tfdType.setText(org.openide.util.NbBundle.getMessage(FrmAddExpense.class, "FrmAddExpense.tfdType.text")); // NOI18N
        tfdType.setBorder(null);
        background.add(tfdType, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 210, -1));

        fdlCost.setBorder(null);
        fdlCost.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        fdlCost.setText(org.openide.util.NbBundle.getMessage(FrmAddExpense.class, "FrmAddExpense.fdlCost.text_1")); // NOI18N
        background.add(fdlCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 153, 100, -1));

        sptTypo.setBackground(new java.awt.Color(116, 178, 237));
        sptTypo.setForeground(new java.awt.Color(116, 178, 237));
        sptTypo.setMaximumSize(new java.awt.Dimension(222, 1));
        sptTypo.setMinimumSize(new java.awt.Dimension(222, 1));
        sptTypo.setOpaque(true);
        sptTypo.setPreferredSize(new java.awt.Dimension(222, 1));
        background.add(sptTypo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        sptCosto.setBackground(new java.awt.Color(116, 178, 237));
        sptCosto.setForeground(new java.awt.Color(116, 178, 237));
        sptCosto.setMaximumSize(new java.awt.Dimension(120, 1));
        sptCosto.setMinimumSize(new java.awt.Dimension(120, 1));
        sptCosto.setOpaque(true);
        sptCosto.setPreferredSize(new java.awt.Dimension(120, 1));
        background.add(sptCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 175, -1, -1));

        btnConfirm.setBackground(new java.awt.Color(63, 115, 193));
        btnConfirm.setMaximumSize(new java.awt.Dimension(138, 31));
        btnConfirm.setMinimumSize(new java.awt.Dimension(138, 31));
        btnConfirm.setPreferredSize(new java.awt.Dimension(138, 31));

        txtConfirmbtn.setFont(new java.awt.Font("Inter SemiBold", 0, 15)); // NOI18N
        txtConfirmbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtConfirmbtn.setText(org.openide.util.NbBundle.getMessage(FrmAddExpense.class, "FrmAddExpense.txtConfirmbtn.text")); // NOI18N
        txtConfirmbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtConfirmbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConfirmbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtConfirmbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtConfirmbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnConfirmLayout = new javax.swing.GroupLayout(btnConfirm);
        btnConfirm.setLayout(btnConfirmLayout);
        btnConfirmLayout.setHorizontalGroup(
            btnConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfirmLayout.createSequentialGroup()
                .addComponent(txtConfirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );
        btnConfirmLayout.setVerticalGroup(
            btnConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConfirmbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseEntered
        btnConfirm.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtConfirmbtnMouseEntered

    private void txtConfirmbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseExited
        btnConfirm.setBackground(btnDefaultColor);
    }//GEN-LAST:event_txtConfirmbtnMouseExited

    private void txtConfirmbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseClicked
        boolean canContinue = validateData();

        if(canContinue==true){
            sendExpenseData();
        }
    }//GEN-LAST:event_txtConfirmbtnMouseClicked

    public void setAddEventMenu(FrmAddEvent frmAddEventMenu){
        this.frmAddEventMenu = frmAddEventMenu;
    }
    
    private boolean validateData(){
        boolean passed;
        String errorMessage;
        String insertedType = tfdType.getText();
        
        passed = !insertedType.isEmpty();
        if(passed){
            passed = HandleInput.validatePriceString(fdlCost.getText());
            if(!passed){
                errorMessage = "Asegúrese de haber insertado un valor monetario válido";
                showErrorPopup(errorMessage);
            }
        }else{
            errorMessage = "No se ha específicado ningún tipo de gasto general";
            showErrorPopup(errorMessage);
        }
        
        return passed;
    }
    
    private void sendExpenseData(){
        String insertedType = tfdType.getText();
        float insertedCost = HandleInput.returnFloat(fdlCost.getText());
        
        expense = new Expense(insertedType, insertedCost);
        
        frmAddEventMenu.addExpense(expense);
        
        this.dispose();
    }
    
    private void showErrorPopup(String errorMessage){
        Message popup = new Message();
        popup.setMessage(errorMessage);
        GlassPanePopup.showPopup(popup);
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
            java.util.logging.Logger.getLogger(FrmAddExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddExpense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddExpense().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnConfirm;
    private javax.swing.JFormattedTextField fdlCost;
    private javax.swing.JSeparator sptCosto;
    private javax.swing.JSeparator sptTitle;
    private javax.swing.JSeparator sptTypo;
    private javax.swing.JTextField tfdType;
    private javax.swing.JLabel txtConfirmbtn;
    private javax.swing.JLabel txtCosto;
    private javax.swing.JLabel txtTipoGasto;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
