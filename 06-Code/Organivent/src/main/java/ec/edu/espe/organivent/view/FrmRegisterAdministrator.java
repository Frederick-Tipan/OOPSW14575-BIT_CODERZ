package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.AdministratorController;
import ec.edu.espe.organivent.model.Administrator;
import ec.edu.espe.organivent.utils.Encriptation;
import ec.edu.espe.organivent.utils.HandleInput;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Frederick
 */
public class FrmRegisterAdministrator extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegisterAdministrator
     */
    private Administrator administrator;
    
    public FrmRegisterAdministrator() {
        initComponents();
        String underlined = "<html><u>Iniciar Sesión</u></html>";
        txtReturnbtn.setText(underlined);
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
        pnlBottomLayer = new javax.swing.JPanel();
        txtVolver = new javax.swing.JLabel();
        txtReturnbtn = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JPanel();
        txtConfirmbtn = new javax.swing.JLabel();
        txtRegistrarse = new javax.swing.JLabel();
        txtSalario = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JLabel();
        tfdName = new javax.swing.JTextField();
        tfdUserName = new javax.swing.JTextField();
        tfdEmail = new javax.swing.JTextField();
        psfdPassword = new javax.swing.JPasswordField();
        lbEyeImage = new javax.swing.JLabel();
        sptTitle = new javax.swing.JSeparator();
        sptNombre = new javax.swing.JSeparator();
        sptUsuario = new javax.swing.JSeparator();
        sptContrasena = new javax.swing.JSeparator();
        sptEmail = new javax.swing.JSeparator();
        sptTelefono = new javax.swing.JSeparator();
        fdlPhoneNumber = new javax.swing.JFormattedTextField();
        fdlWage = new javax.swing.JFormattedTextField();
        sptTelefono1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBottomLayer.setBackground(new java.awt.Color(116, 178, 237));
        pnlBottomLayer.setPreferredSize(new java.awt.Dimension(427, 85));
        pnlBottomLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtVolver.setFont(new java.awt.Font("Inter SemiBold", 0, 12)); // NOI18N
        txtVolver.setText("Volver a");
        pnlBottomLayer.add(txtVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 55, -1, -1));

        txtReturnbtn.setFont(new java.awt.Font("Inter Light", 0, 12)); // NOI18N
        txtReturnbtn.setForeground(new java.awt.Color(10, 14, 115));
        txtReturnbtn.setText("Iniciar Sesión");
        txtReturnbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtReturnbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReturnbtnMouseClicked(evt);
            }
        });
        pnlBottomLayer.add(txtReturnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 55, -1, -1));

        btnConfirm.setBackground(new java.awt.Color(63, 115, 193));
        btnConfirm.setPreferredSize(new java.awt.Dimension(142, 27));

        txtConfirmbtn.setFont(new java.awt.Font("Inter SemiBold", 0, 15)); // NOI18N
        txtConfirmbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtConfirmbtn.setText("Confirmar");
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
            .addComponent(txtConfirmbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        btnConfirmLayout.setVerticalGroup(
            btnConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConfirmbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        pnlBottomLayer.add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 17, -1, -1));

        background.add(pnlBottomLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 366, -1, -1));

        txtRegistrarse.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtRegistrarse.setForeground(new java.awt.Color(32, 108, 141));
        txtRegistrarse.setText("Registrarse");
        background.add(txtRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 20, -1, -1));

        txtSalario.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(135, 132, 132));
        txtSalario.setText("Salario:   $");
        background.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 318, 80, -1));

        txtNombre.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(135, 132, 132));
        txtNombre.setText("Nombre Completo:");
        background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 89, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(135, 132, 132));
        txtUsuario.setText("Usuario:");
        background.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        txtContrasena.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(135, 132, 132));
        txtContrasena.setText("Contraseña:");
        background.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 176, -1, -1));

        txtEmail.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(135, 132, 132));
        txtEmail.setText("Email:");
        background.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 222, -1, -1));

        txtTelefono.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(135, 132, 132));
        txtTelefono.setText("Teléfono:");
        background.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 273, 70, -1));

        tfdName.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        tfdName.setBorder(null);
        tfdName.setPreferredSize(new java.awt.Dimension(210, 22));
        background.add(tfdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 86, 210, -1));

        tfdUserName.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        tfdUserName.setBorder(null);
        tfdUserName.setPreferredSize(new java.awt.Dimension(210, 22));
        background.add(tfdUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 128, -1, -1));

        tfdEmail.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        tfdEmail.setBorder(null);
        tfdEmail.setPreferredSize(new java.awt.Dimension(210, 22));
        background.add(tfdEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 210, -1));

        psfdPassword.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        psfdPassword.setText("***********************");
        psfdPassword.setToolTipText("La contraseña debe tener mínimo 10 dígitos entre: numeros, mayúsculas, minúsculas y un caracter especial");
        psfdPassword.setBorder(null);
        psfdPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                psfdPasswordMousePressed(evt);
            }
        });
        background.add(psfdPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 174, 190, -1));

        lbEyeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye_hide_icon.png"))); // NOI18N
        lbEyeImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbEyeImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbEyeImageMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbEyeImageMouseReleased(evt);
            }
        });
        background.add(lbEyeImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 170, -1, -1));

        sptTitle.setBackground(new java.awt.Color(116, 178, 237));
        sptTitle.setForeground(new java.awt.Color(116, 178, 237));
        sptTitle.setOpaque(true);
        sptTitle.setPreferredSize(new java.awt.Dimension(350, 1));
        background.add(sptTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 55, -1, -1));

        sptNombre.setBackground(new java.awt.Color(116, 178, 237));
        sptNombre.setForeground(new java.awt.Color(116, 178, 237));
        sptNombre.setOpaque(true);
        sptNombre.setPreferredSize(new java.awt.Dimension(210, 1));
        background.add(sptNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        sptUsuario.setBackground(new java.awt.Color(116, 178, 237));
        sptUsuario.setForeground(new java.awt.Color(116, 178, 237));
        sptUsuario.setOpaque(true);
        sptUsuario.setPreferredSize(new java.awt.Dimension(210, 1));
        background.add(sptUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        sptContrasena.setBackground(new java.awt.Color(116, 178, 237));
        sptContrasena.setForeground(new java.awt.Color(116, 178, 237));
        sptContrasena.setOpaque(true);
        sptContrasena.setPreferredSize(new java.awt.Dimension(210, 1));
        background.add(sptContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 198, -1, -1));

        sptEmail.setBackground(new java.awt.Color(116, 178, 237));
        sptEmail.setForeground(new java.awt.Color(116, 178, 237));
        sptEmail.setOpaque(true);
        sptEmail.setPreferredSize(new java.awt.Dimension(210, 1));
        background.add(sptEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 242, -1, -1));

        sptTelefono.setBackground(new java.awt.Color(116, 178, 237));
        sptTelefono.setForeground(new java.awt.Color(116, 178, 237));
        sptTelefono.setOpaque(true);
        sptTelefono.setPreferredSize(new java.awt.Dimension(70, 1));
        background.add(sptTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 294, -1, -1));

        fdlPhoneNumber.setBorder(null);
        try {
            fdlPhoneNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fdlPhoneNumber.setToolTipText("Digite 9 números");
        fdlPhoneNumber.setPreferredSize(new java.awt.Dimension(210, 22));
        background.add(fdlPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 70, -1));

        fdlWage.setBorder(null);
        fdlWage.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        fdlWage.setText("0,00");
        fdlWage.setPreferredSize(new java.awt.Dimension(128, 16));
        background.add(fdlWage, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 317, 110, -1));

        sptTelefono1.setBackground(new java.awt.Color(116, 178, 237));
        sptTelefono1.setForeground(new java.awt.Color(116, 178, 237));
        sptTelefono1.setOpaque(true);
        sptTelefono1.setPreferredSize(new java.awt.Dimension(128, 1));
        background.add(sptTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 337, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtReturnbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReturnbtnMouseClicked
        FrmLogIn frmLogIn = new FrmLogIn();
        frmLogIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtReturnbtnMouseClicked

    private void txtConfirmbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseEntered
        btnConfirm.setBackground(new Color(48,88,149));
    }//GEN-LAST:event_txtConfirmbtnMouseEntered

    private void txtConfirmbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseExited
        btnConfirm.setBackground(new Color(63,115,193));
    }//GEN-LAST:event_txtConfirmbtnMouseExited

    private void psfdPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psfdPasswordMousePressed
        if(String.valueOf(psfdPassword.getPassword()).equals("***********************")){
            psfdPassword.setText("");
            psfdPassword.setForeground(Color.black);
        }
    }//GEN-LAST:event_psfdPasswordMousePressed

    private void lbEyeImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEyeImageMousePressed
        if(String.valueOf(psfdPassword.getPassword()).equals("***********************")){
            psfdPassword.setText("");
            psfdPassword.setForeground(Color.black);
        }
        psfdPassword.setEchoChar((char)0);
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/eye_show_icon.png"));
        lbEyeImage.setIcon(icon);
    }//GEN-LAST:event_lbEyeImageMousePressed

    private void lbEyeImageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEyeImageMouseReleased
        if(String.valueOf(psfdPassword.getPassword()).equals("")){
            psfdPassword.setText("***********************");
            psfdPassword.setForeground(Color.black);
        }
        psfdPassword.setEchoChar('*');
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/eye_hide_icon.png"));
        lbEyeImage.setIcon(icon);
    }//GEN-LAST:event_lbEyeImageMouseReleased

    private void txtConfirmbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseClicked
        boolean canContinue = validateData();

        if(canContinue==true){
            sendAdministratorData();
        } 
    }//GEN-LAST:event_txtConfirmbtnMouseClicked

    private boolean validateData(){
        boolean passed = true;
        
        passed = HandleInput.validateRealName(tfdName.getText());
        
        if(passed){
            AdministratorController admc = new AdministratorController();
            passed = admc.validateUserName(tfdUserName.getText());
            if(passed){
                passed = HandleInput.validateEmail(tfdEmail.getText());
                if(passed){
                    passed = HandleInput.validatePassword(String.valueOf(psfdPassword.getPassword()));
                    if(passed){
                        passed = HandleInput.validatePriceString(fdlWage.getText());
                    }
                }
            }
        }
        return passed;
    }
    private void sendAdministratorData(){
        String insertedName = tfdName.getText();
        String insertedUserName = tfdUserName.getText();
        String insertedPassword = String.valueOf(psfdPassword.getPassword());
        byte[] encriptedPassword = Encriptation.encrypt(insertedPassword);
        String insertedEmail = tfdEmail.getText();
        int insertedPhoneNumber = Integer.parseInt(fdlPhoneNumber.getText());
        float insertedWage = HandleInput.returnFloat(fdlWage.getText());
        
        AdministratorController admc = new AdministratorController();
        int asignedId = admc.asignNewId();
                
        administrator = new Administrator(insertedUserName, encriptedPassword, insertedEmail, insertedPhoneNumber, asignedId, insertedName, insertedWage);
        
        admc.create(administrator);
        
        emptyFields();
    }
    
    private void emptyFields(){
        tfdName.setText("");
        tfdUserName.setText("");
        psfdPassword.setText("***********************");
        tfdEmail.setText("");
        fdlPhoneNumber.setText("");
        fdlWage.setText("0,00");
        
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
            java.util.logging.Logger.getLogger(FrmRegisterAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegisterAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegisterAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegisterAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegisterAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnConfirm;
    private javax.swing.JFormattedTextField fdlPhoneNumber;
    private javax.swing.JFormattedTextField fdlWage;
    private javax.swing.JLabel lbEyeImage;
    private javax.swing.JPanel pnlBottomLayer;
    private javax.swing.JPasswordField psfdPassword;
    private javax.swing.JSeparator sptContrasena;
    private javax.swing.JSeparator sptEmail;
    private javax.swing.JSeparator sptNombre;
    private javax.swing.JSeparator sptTelefono;
    private javax.swing.JSeparator sptTelefono1;
    private javax.swing.JSeparator sptTitle;
    private javax.swing.JSeparator sptUsuario;
    private javax.swing.JTextField tfdEmail;
    private javax.swing.JTextField tfdName;
    private javax.swing.JTextField tfdUserName;
    private javax.swing.JLabel txtConfirmbtn;
    private javax.swing.JLabel txtContrasena;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtRegistrarse;
    private javax.swing.JLabel txtReturnbtn;
    private javax.swing.JLabel txtSalario;
    private javax.swing.JLabel txtTelefono;
    private javax.swing.JLabel txtUsuario;
    private javax.swing.JLabel txtVolver;
    // End of variables declaration//GEN-END:variables
}
