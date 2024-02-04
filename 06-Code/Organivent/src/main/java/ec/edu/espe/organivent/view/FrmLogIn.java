package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.AdministratorController;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Frederick
 */
public class FrmLogIn extends javax.swing.JFrame {

    /**
     * Creates new form FrmLogIn
     */
    public FrmLogIn() {
        initComponents();
        String underlined = "<html><u>aquí</u></html>";
        txtRegisterbtn.setText(underlined);
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
        pnlImageContainer = new javax.swing.JPanel();
        lbDecorativeImage = new javax.swing.JLabel();
        pnlLogInContent = new javax.swing.JPanel();
        txtIniciarSesion = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JPanel();
        txtLogInbtn = new javax.swing.JLabel();
        txtNoCuenta = new javax.swing.JLabel();
        txtRegisterbtn = new javax.swing.JLabel();
        lbUserImage = new javax.swing.JLabel();
        lbPadlockImage = new javax.swing.JLabel();
        lbEyeImage = new javax.swing.JLabel();
        tfdUserName = new javax.swing.JTextField();
        psfdPassword = new javax.swing.JPasswordField();
        sptPassword = new javax.swing.JSeparator();
        sptUser = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlImageContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlImageContainer.setPreferredSize(new java.awt.Dimension(144, 375));

        lbDecorativeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_image.png"))); // NOI18N
        lbDecorativeImage.setToolTipText("");

        javax.swing.GroupLayout pnlImageContainerLayout = new javax.swing.GroupLayout(pnlImageContainer);
        pnlImageContainer.setLayout(pnlImageContainerLayout);
        pnlImageContainerLayout.setHorizontalGroup(
            pnlImageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbDecorativeImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlImageContainerLayout.setVerticalGroup(
            pnlImageContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbDecorativeImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(pnlImageContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        pnlLogInContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlLogInContent.setPreferredSize(new java.awt.Dimension(470, 375));
        pnlLogInContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIniciarSesion.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        txtIniciarSesion.setForeground(new java.awt.Color(32, 108, 141));
        txtIniciarSesion.setText("INICIAR SESIÓN");
        pnlLogInContent.add(txtIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 31, -1, -1));

        txtContrasena.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(21, 80, 106));
        txtContrasena.setText("Contraseña");
        pnlLogInContent.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 204, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(21, 80, 106));
        txtUsuario.setText("Usuario");
        pnlLogInContent.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 95, -1, -1));

        btnLogIn.setBackground(new java.awt.Color(63, 115, 193));
        btnLogIn.setPreferredSize(new java.awt.Dimension(106, 27));

        txtLogInbtn.setFont(new java.awt.Font("Inter SemiBold", 0, 15)); // NOI18N
        txtLogInbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtLogInbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLogInbtn.setText("Ingresar");
        txtLogInbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLogInbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtLogInbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtLogInbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtLogInbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLogInLayout = new javax.swing.GroupLayout(btnLogIn);
        btnLogIn.setLayout(btnLogInLayout);
        btnLogInLayout.setHorizontalGroup(
            btnLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtLogInbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        btnLogInLayout.setVerticalGroup(
            btnLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtLogInbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        pnlLogInContent.add(btnLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 314, -1, -1));

        txtNoCuenta.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtNoCuenta.setForeground(new java.awt.Color(135, 132, 132));
        txtNoCuenta.setText("¿No tiene cuenta? Regístrese");
        pnlLogInContent.add(txtNoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 320, -1, -1));

        txtRegisterbtn.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        txtRegisterbtn.setForeground(new java.awt.Color(10, 14, 115));
        txtRegisterbtn.setText("aquí");
        txtRegisterbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtRegisterbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRegisterbtnMouseClicked(evt);
            }
        });
        pnlLogInContent.add(txtRegisterbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 320, -1, -1));

        lbUserImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_icon.png"))); // NOI18N
        pnlLogInContent.add(lbUserImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lbPadlockImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/padlock_icon.png"))); // NOI18N
        pnlLogInContent.add(lbPadlockImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

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
        pnlLogInContent.add(lbEyeImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 233, -1, -1));

        tfdUserName.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        tfdUserName.setForeground(new java.awt.Color(135, 132, 132));
        tfdUserName.setText("Ingrese su nombre de usuario");
        tfdUserName.setBorder(null);
        tfdUserName.setPreferredSize(new java.awt.Dimension(317, 22));
        tfdUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfdUserNameMousePressed(evt);
            }
        });
        pnlLogInContent.add(tfdUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 125, -1, -1));

        psfdPassword.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        psfdPassword.setForeground(new java.awt.Color(135, 132, 132));
        psfdPassword.setText("***************");
        psfdPassword.setBorder(null);
        psfdPassword.setPreferredSize(new java.awt.Dimension(317, 22));
        psfdPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                psfdPasswordMousePressed(evt);
            }
        });
        pnlLogInContent.add(psfdPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 235, 280, -1));

        sptPassword.setBackground(new java.awt.Color(116, 178, 237));
        sptPassword.setForeground(new java.awt.Color(116, 178, 237));
        sptPassword.setOpaque(true);
        sptPassword.setPreferredSize(new java.awt.Dimension(320, 1));
        pnlLogInContent.add(sptPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 263, -1, -1));

        sptUser.setBackground(new java.awt.Color(116, 178, 237));
        sptUser.setForeground(new java.awt.Color(116, 178, 237));
        sptUser.setOpaque(true);
        sptUser.setPreferredSize(new java.awt.Dimension(320, 1));
        pnlLogInContent.add(sptUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 155, -1, -1));

        background.add(pnlLogInContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLogInbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLogInbtnMouseEntered
        btnLogIn.setBackground(new Color(48,88,149));
    }//GEN-LAST:event_txtLogInbtnMouseEntered

    private void txtLogInbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLogInbtnMouseExited
        btnLogIn.setBackground(new Color(63,115,193));
    }//GEN-LAST:event_txtLogInbtnMouseExited

    private void tfdUserNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfdUserNameMousePressed
        if(tfdUserName.getText().equals("Ingrese su nombre de usuario")){
            tfdUserName.setText("");
            tfdUserName.setForeground(Color.black);
        }
        if(String.valueOf(psfdPassword.getPassword()).isEmpty()){
            psfdPassword.setText("***************");
            psfdPassword.setForeground(new Color(135,132,132));
        }
    }//GEN-LAST:event_tfdUserNameMousePressed

    private void psfdPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_psfdPasswordMousePressed
         if(String.valueOf(psfdPassword.getPassword()).equals("***************")){
            psfdPassword.setText("");
            psfdPassword.setForeground(Color.black);
        }
        if(tfdUserName.getText().isEmpty()){
            tfdUserName.setText("Ingrese su nombre de usuario");
            tfdUserName.setForeground(new Color(135,132,132));
        }
    }//GEN-LAST:event_psfdPasswordMousePressed

    private void lbEyeImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEyeImageMousePressed
        if(String.valueOf(psfdPassword.getPassword()).equals("***************")){
            psfdPassword.setText("");
            psfdPassword.setForeground(new Color(135,132,132));
        }
        psfdPassword.setEchoChar((char)0);
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/eye_show_icon.png"));
        lbEyeImage.setIcon(icon);
    }//GEN-LAST:event_lbEyeImageMousePressed

    private void lbEyeImageMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEyeImageMouseReleased
        if(String.valueOf(psfdPassword.getPassword()).equals("")){
            psfdPassword.setText("***************");
            psfdPassword.setForeground(new Color(135,132,132));
        }
        psfdPassword.setEchoChar('*');
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/eye_hide_icon.png"));
        lbEyeImage.setIcon(icon);
    }//GEN-LAST:event_lbEyeImageMouseReleased

    private void txtLogInbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLogInbtnMouseClicked
        String insertedUserName = tfdUserName.getText();
        String insertedPassword = String.valueOf(psfdPassword.getPassword());
        
        boolean canEnter = AdministratorController.validateCredentials(insertedUserName, insertedPassword);

        if(canEnter == true){
            FrmOrganiventMenu frmOrganiventMenu = new FrmOrganiventMenu();
            frmOrganiventMenu.setVisible(true);
            this.setVisible(false);
        }else{
        }
    }//GEN-LAST:event_txtLogInbtnMouseClicked

    private void txtRegisterbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegisterbtnMouseClicked
        FrmRegisterAdministrator frmRegisterAdministrator = new FrmRegisterAdministrator();
        frmRegisterAdministrator.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtRegisterbtnMouseClicked

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
            java.util.logging.Logger.getLogger(FrmLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnLogIn;
    private javax.swing.JLabel lbDecorativeImage;
    private javax.swing.JLabel lbEyeImage;
    private javax.swing.JLabel lbPadlockImage;
    private javax.swing.JLabel lbUserImage;
    private javax.swing.JPanel pnlImageContainer;
    private javax.swing.JPanel pnlLogInContent;
    private javax.swing.JPasswordField psfdPassword;
    private javax.swing.JSeparator sptPassword;
    private javax.swing.JSeparator sptUser;
    private javax.swing.JTextField tfdUserName;
    private javax.swing.JLabel txtContrasena;
    private javax.swing.JLabel txtIniciarSesion;
    private javax.swing.JLabel txtLogInbtn;
    private javax.swing.JLabel txtNoCuenta;
    private javax.swing.JLabel txtRegisterbtn;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
