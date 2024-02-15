package ec.edu.espe.organivent.view;

import com.raven.glasspanepopup.GlassPanePopup;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

/**
 *
 * @author Frederick
 */
public class FrmOrganiventMenu extends javax.swing.JFrame {
    
    private Color btnDefaultColor = new Color(116,179,237);
    private Color btnHoverColor = new Color(63,115,193);
    private Font pressedFont = new Font("Inter SemiBold", Font.PLAIN, 20);
    private Font defaultFont = new Font("Inter", Font.PLAIN, 20);
    
    /**
     * Creates new form FrmOrganiventMenu
     */
    public FrmOrganiventMenu() {
        initComponents();
        showPanel(new PnlEventMainMenu());
        
        GlassPanePopup.install(this);
    }
    
    private void showPanel(JPanel p){
        p.setSize(390, 375);
        p.setLocation(0, 0);
        
        pnlContent.removeAll();
        pnlContent.add(p, BorderLayout.CENTER);
        pnlContent.revalidate();
        pnlContent.repaint();
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
        pnlMainMenuBar = new javax.swing.JPanel();
        btnEventPlace = new javax.swing.JPanel();
        txtEventPlacebtn = new javax.swing.JLabel();
        btnEquipment = new javax.swing.JPanel();
        txtEquipmentbtn = new javax.swing.JLabel();
        btnEmployee = new javax.swing.JPanel();
        txtEmployeebtn = new javax.swing.JLabel();
        btnEvent = new javax.swing.JPanel();
        txtEventbtn = new javax.swing.JLabel();
        btnArtist = new javax.swing.JPanel();
        txtArtistbtn = new javax.swing.JLabel();
        btnStaff = new javax.swing.JPanel();
        txtStaffbtn = new javax.swing.JLabel();
        lbLogOutIcon = new javax.swing.JLabel();
        pnlContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Organivent");
        setLocationByPlatform(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainMenuBar.setBackground(new java.awt.Color(116, 179, 237));
        pnlMainMenuBar.setPreferredSize(new java.awt.Dimension(158, 375));
        pnlMainMenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEventPlace.setBackground(new java.awt.Color(116, 179, 237));
        btnEventPlace.setPreferredSize(new java.awt.Dimension(158, 56));

        txtEventPlacebtn.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        txtEventPlacebtn.setForeground(new java.awt.Color(255, 255, 255));
        txtEventPlacebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEventPlacebtn.setText("Lugares");
        txtEventPlacebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEventPlacebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEventPlacebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEventPlacebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEventPlacebtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEventPlaceLayout = new javax.swing.GroupLayout(btnEventPlace);
        btnEventPlace.setLayout(btnEventPlaceLayout);
        btnEventPlaceLayout.setHorizontalGroup(
            btnEventPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEventPlacebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        btnEventPlaceLayout.setVerticalGroup(
            btnEventPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEventPlacebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        pnlMainMenuBar.add(btnEventPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 319, -1, -1));

        btnEquipment.setBackground(new java.awt.Color(116, 179, 237));
        btnEquipment.setPreferredSize(new java.awt.Dimension(158, 56));

        txtEquipmentbtn.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        txtEquipmentbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtEquipmentbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEquipmentbtn.setText("Equipo");
        txtEquipmentbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEquipmentbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEquipmentbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEquipmentbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEquipmentbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEquipmentLayout = new javax.swing.GroupLayout(btnEquipment);
        btnEquipment.setLayout(btnEquipmentLayout);
        btnEquipmentLayout.setHorizontalGroup(
            btnEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEquipmentLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtEquipmentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnEquipmentLayout.setVerticalGroup(
            btnEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEquipmentLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtEquipmentbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainMenuBar.add(btnEquipment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 264, -1, -1));

        btnEmployee.setBackground(new java.awt.Color(116, 179, 237));
        btnEmployee.setPreferredSize(new java.awt.Dimension(158, 56));

        txtEmployeebtn.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        txtEmployeebtn.setForeground(new java.awt.Color(255, 255, 255));
        txtEmployeebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEmployeebtn.setText("Empleados");
        txtEmployeebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEmployeebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmployeebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEmployeebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEmployeebtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEmployeeLayout = new javax.swing.GroupLayout(btnEmployee);
        btnEmployee.setLayout(btnEmployeeLayout);
        btnEmployeeLayout.setHorizontalGroup(
            btnEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEmployeeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtEmployeebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnEmployeeLayout.setVerticalGroup(
            btnEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEmployeeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtEmployeebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainMenuBar.add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, -1, -1));

        btnEvent.setBackground(new java.awt.Color(63, 115, 193));
        btnEvent.setPreferredSize(new java.awt.Dimension(158, 56));

        txtEventbtn.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtEventbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtEventbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEventbtn.setText("Eventos");
        txtEventbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEventbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEventbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtEventbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEventbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnEventLayout = new javax.swing.GroupLayout(btnEvent);
        btnEvent.setLayout(btnEventLayout);
        btnEventLayout.setHorizontalGroup(
            btnEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEventLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtEventbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnEventLayout.setVerticalGroup(
            btnEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEventLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtEventbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainMenuBar.add(btnEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        btnArtist.setBackground(new java.awt.Color(116, 179, 237));
        btnArtist.setPreferredSize(new java.awt.Dimension(158, 56));

        txtArtistbtn.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        txtArtistbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtArtistbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtArtistbtn.setText("Artistas");
        txtArtistbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtArtistbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtArtistbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtArtistbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtArtistbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnArtistLayout = new javax.swing.GroupLayout(btnArtist);
        btnArtist.setLayout(btnArtistLayout);
        btnArtistLayout.setHorizontalGroup(
            btnArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnArtistLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtArtistbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnArtistLayout.setVerticalGroup(
            btnArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnArtistLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtArtistbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainMenuBar.add(btnArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 208, -1, -1));

        btnStaff.setBackground(new java.awt.Color(116, 179, 237));
        btnStaff.setPreferredSize(new java.awt.Dimension(158, 56));

        txtStaffbtn.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        txtStaffbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtStaffbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtStaffbtn.setText("Staff");
        txtStaffbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtStaffbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtStaffbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtStaffbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtStaffbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnStaffLayout = new javax.swing.GroupLayout(btnStaff);
        btnStaff.setLayout(btnStaffLayout);
        btnStaffLayout.setHorizontalGroup(
            btnStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnStaffLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtStaffbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnStaffLayout.setVerticalGroup(
            btnStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnStaffLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtStaffbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMainMenuBar.add(btnStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 152, -1, -1));

        lbLogOutIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_icon.png"))); // NOI18N
        lbLogOutIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogOutIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogOutIconMouseClicked(evt);
            }
        });
        pnlMainMenuBar.add(lbLogOutIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 8, -1, -1));

        background.add(pnlMainMenuBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setPreferredSize(new java.awt.Dimension(390, 375));

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );

        background.add(pnlContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 0, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmployeebtnMouseEntered
        btnEmployee.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtEmployeebtnMouseEntered

    private void txtEmployeebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmployeebtnMouseExited
        if(txtEmployeebtn.getFont().equals(defaultFont)){
            btnEmployee.setBackground(btnDefaultColor);
        }
    }//GEN-LAST:event_txtEmployeebtnMouseExited

    private void txtStaffbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStaffbtnMouseEntered
        btnStaff.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtStaffbtnMouseEntered

    private void txtStaffbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStaffbtnMouseExited
        if(txtStaffbtn.getFont().equals(defaultFont)){
            btnStaff.setBackground(btnDefaultColor);
        }
    }//GEN-LAST:event_txtStaffbtnMouseExited

    private void txtArtistbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtArtistbtnMouseEntered
        btnArtist.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtArtistbtnMouseEntered

    private void txtArtistbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtArtistbtnMouseExited
        if(txtArtistbtn.getFont().equals(defaultFont)){
            btnArtist.setBackground(btnDefaultColor);
        }
    }//GEN-LAST:event_txtArtistbtnMouseExited

    private void txtEquipmentbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEquipmentbtnMouseEntered
        btnEquipment.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtEquipmentbtnMouseEntered

    private void txtEquipmentbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEquipmentbtnMouseExited
        if(txtEquipmentbtn.getFont().equals(defaultFont)){
            btnEquipment.setBackground(btnDefaultColor);
        }
    }//GEN-LAST:event_txtEquipmentbtnMouseExited

    private void txtEventPlacebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEventPlacebtnMouseEntered
        btnEventPlace.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtEventPlacebtnMouseEntered

    private void txtEventPlacebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEventPlacebtnMouseExited
        if(txtEventPlacebtn.getFont().equals(defaultFont)){
            btnEventPlace.setBackground(btnDefaultColor);
        }
    }//GEN-LAST:event_txtEventPlacebtnMouseExited

    private void txtEmployeebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmployeebtnMouseClicked
        resetButtonColors();
        resetFontFormat();
        btnEmployee.setBackground(btnHoverColor);
        txtEmployeebtn.setFont(pressedFont);
        
        PnlAddEmployee pnlEmployee = new PnlAddEmployee();
        pnlEmployee.setOrganiventMenu(this);
        showPanel(pnlEmployee);
    }//GEN-LAST:event_txtEmployeebtnMouseClicked

    private void txtEventbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEventbtnMouseEntered
        btnEvent.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtEventbtnMouseEntered

    private void txtEventbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEventbtnMouseExited
        if(txtEventbtn.getFont().equals(defaultFont)){
            btnEvent.setBackground(btnDefaultColor);
        }
    }//GEN-LAST:event_txtEventbtnMouseExited

    private void txtEventbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEventbtnMouseClicked
        resetButtonColors();
        resetFontFormat();
        btnEvent.setBackground(btnHoverColor);
        txtEventbtn.setFont(pressedFont);
        
        showPanel(new PnlEventMainMenu());
    }//GEN-LAST:event_txtEventbtnMouseClicked

    private void txtStaffbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStaffbtnMouseClicked
        resetButtonColors();
        resetFontFormat();
        btnStaff.setBackground(btnHoverColor);
        txtStaffbtn.setFont(pressedFont);
        
        PnlAddStaff pnlStaff = new PnlAddStaff();
        pnlStaff.setOrganiventMenu(this);
        showPanel(pnlStaff);
    }//GEN-LAST:event_txtStaffbtnMouseClicked

    private void txtArtistbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtArtistbtnMouseClicked
        resetButtonColors();
        resetFontFormat();
        btnArtist.setBackground(btnHoverColor);
        txtArtistbtn.setFont(pressedFont);
        
        PnlAddArtist pnlArtist = new PnlAddArtist();
        pnlArtist.setOrganiventMenu(this);
        showPanel(pnlArtist);
    }//GEN-LAST:event_txtArtistbtnMouseClicked

    private void txtEquipmentbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEquipmentbtnMouseClicked
        resetButtonColors();
        resetFontFormat();
        btnEquipment.setBackground(btnHoverColor);
        txtEquipmentbtn.setFont(pressedFont);
        
        PnlAddEquipment pnlEquipment = new PnlAddEquipment();
        pnlEquipment.setOrganiventMenu(this);
        showPanel(pnlEquipment);
    }//GEN-LAST:event_txtEquipmentbtnMouseClicked

    private void txtEventPlacebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEventPlacebtnMouseClicked
        resetButtonColors();
        resetFontFormat();
        btnEventPlace.setBackground(btnHoverColor);
        txtEventPlacebtn.setFont(pressedFont);
        
        PnlAddEventPlace pnlEventPlace = new PnlAddEventPlace();
        pnlEventPlace.setOrganiventMenu(this);
        showPanel(pnlEventPlace);
    }//GEN-LAST:event_txtEventPlacebtnMouseClicked

    private void lbLogOutIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogOutIconMouseClicked
        FrmLogIn frmLogIn = new FrmLogIn();
        frmLogIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbLogOutIconMouseClicked

    
    private void resetButtonColors(){
        btnEvent.setBackground(btnDefaultColor);
        btnEmployee.setBackground(btnDefaultColor);
        btnStaff.setBackground(btnDefaultColor);
        btnArtist.setBackground(btnDefaultColor);
        btnEquipment.setBackground(btnDefaultColor);
        btnEventPlace.setBackground(btnDefaultColor);
    }
    
    private void resetFontFormat(){
        txtEventbtn.setFont(defaultFont);
        txtEmployeebtn.setFont(defaultFont);
        txtStaffbtn.setFont(defaultFont);
        txtArtistbtn.setFont(defaultFont);
        txtEquipmentbtn.setFont(defaultFont);
        txtEventPlacebtn.setFont(defaultFont);
    }
    
    public void showErrorPopup(String errorMessage){
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
            java.util.logging.Logger.getLogger(FrmOrganiventMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOrganiventMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOrganiventMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOrganiventMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOrganiventMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnArtist;
    private javax.swing.JPanel btnEmployee;
    private javax.swing.JPanel btnEquipment;
    private javax.swing.JPanel btnEvent;
    private javax.swing.JPanel btnEventPlace;
    private javax.swing.JPanel btnStaff;
    private javax.swing.JLabel lbLogOutIcon;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlMainMenuBar;
    private javax.swing.JLabel txtArtistbtn;
    private javax.swing.JLabel txtEmployeebtn;
    private javax.swing.JLabel txtEquipmentbtn;
    private javax.swing.JLabel txtEventPlacebtn;
    private javax.swing.JLabel txtEventbtn;
    private javax.swing.JLabel txtStaffbtn;
    // End of variables declaration//GEN-END:variables
}
