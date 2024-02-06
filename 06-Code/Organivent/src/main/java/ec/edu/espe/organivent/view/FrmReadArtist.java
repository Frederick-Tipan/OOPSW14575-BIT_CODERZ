package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.ArtistController;
import ec.edu.espe.organivent.model.Artist;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FrmReadArtist extends javax.swing.JFrame {

    private Color btnDefaultColor = new Color(116,179,237);
    private Color btnHoverColor = new Color(63,115,193);
    private Font pressedFont = new Font("Inter SemiBold", Font.PLAIN, 20);
    private Font defaultFont = new Font("Inter", Font.PLAIN, 20);
    /**
     * Creates new form FrmReadArtist
     */
    public FrmReadArtist() {
        initComponents();
        readArtist();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtTitle2 = new javax.swing.JLabel();
        btnBackArtist = new javax.swing.JPanel();
        txtBackAritstbtn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReadArtist = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle2.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle2.setText(org.openide.util.NbBundle.getMessage(FrmReadArtist.class, "FrmReadArtist.txtTitle2.text_1")); // NOI18N
        jPanel2.add(txtTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        btnBackArtist.setBackground(new java.awt.Color(63, 115, 193));
        btnBackArtist.setPreferredSize(new java.awt.Dimension(158, 56));

        txtBackAritstbtn.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtBackAritstbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtBackAritstbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBackAritstbtn.setText(org.openide.util.NbBundle.getMessage(FrmReadArtist.class, "FrmReadArtist.txtBackAritstbtn.text_1")); // NOI18N
        txtBackAritstbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBackAritstbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackAritstbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBackAritstbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBackAritstbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBackArtistLayout = new javax.swing.GroupLayout(btnBackArtist);
        btnBackArtist.setLayout(btnBackArtistLayout);
        btnBackArtistLayout.setHorizontalGroup(
            btnBackArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackArtistLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtBackAritstbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnBackArtistLayout.setVerticalGroup(
            btnBackArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackArtistLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtBackAritstbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(btnBackArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 316, -1, 50));

        tblReadArtist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Salario"
            }
        ));
        jScrollPane1.setViewportView(tblReadArtist);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 390, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBackAritstbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackAritstbtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtBackAritstbtnMouseClicked

    private void txtBackAritstbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackAritstbtnMouseEntered
        btnBackArtist.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtBackAritstbtnMouseEntered

    private void txtBackAritstbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackAritstbtnMouseExited
        if(txtBackAritstbtn.getFont().equals(defaultFont)){
            btnBackArtist.setBackground(btnDefaultColor);
        }
    }//GEN-LAST:event_txtBackAritstbtnMouseExited

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
            java.util.logging.Logger.getLogger(FrmReadArtist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReadArtist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReadArtist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReadArtist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReadArtist().setVisible(true);
            }
        });
    }
    
    private void readArtist() {
    ArtistController art = new ArtistController();
    ArrayList<Artist> artistList = art.read();

    DefaultTableModel model = (DefaultTableModel) tblReadArtist.getModel();
    model.setRowCount(0); 

    for (Artist artist : artistList) {
        Object[] rowData = {artist.getId(), artist.getName(), artist.getWage() };
        model.addRow(rowData);
    }
    }
    
    private void resetButtonColors(){
        btnBackArtist.setBackground(btnDefaultColor);
        
    }
    
    private void resetFontFormat(){
        txtBackAritstbtn.setFont(defaultFont);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBackArtist;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReadArtist;
    private javax.swing.JLabel txtBackAritstbtn;
    private javax.swing.JLabel txtTitle2;
    // End of variables declaration//GEN-END:variables
}
