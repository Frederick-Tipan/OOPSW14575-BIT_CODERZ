package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.EventPlaceController;
import ec.edu.espe.organivent.model.EventPlace;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FrmReadEventPlace extends javax.swing.JFrame {
    
    private Color btnDefaultColor = new Color(116,179,237);
    private Color btnHoverColor = new Color(63,115,193);
    private Font pressedFont = new Font("Inter SemiBold", Font.PLAIN, 20);
    private Font defaultFont = new Font("Inter", Font.PLAIN, 20);
    /**
     * Creates new form FrmReadEventPlace
     */
    public FrmReadEventPlace() {
        initComponents();
        readEventPlace();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReadEventPlace = new javax.swing.JTable();
        btnBack = new javax.swing.JPanel();
        txtBackbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle.setText(org.openide.util.NbBundle.getMessage(FrmReadEventPlace.class, "FrmReadEventPlace.txtTitle.text")); // NOI18N
        jPanel1.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 20, -1, -1));

        tblReadEventPlace.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Direccion", "Costo", "Capacidad"
            }
        ));
        jScrollPane1.setViewportView(tblReadEventPlace);
        if (tblReadEventPlace.getColumnModel().getColumnCount() > 0) {
            tblReadEventPlace.getColumnModel().getColumn(0).setHeaderValue(org.openide.util.NbBundle.getMessage(FrmReadEventPlace.class, "FrmReadEventPlace.tblReadEventPlace.columnModel.title0")); // NOI18N
            tblReadEventPlace.getColumnModel().getColumn(1).setHeaderValue(org.openide.util.NbBundle.getMessage(FrmReadEventPlace.class, "FrmReadEventPlace.tblReadEventPlace.columnModel.title1")); // NOI18N
            tblReadEventPlace.getColumnModel().getColumn(2).setHeaderValue(org.openide.util.NbBundle.getMessage(FrmReadEventPlace.class, "FrmReadEventPlace.tblReadEventPlace.columnModel.title2")); // NOI18N
            tblReadEventPlace.getColumnModel().getColumn(3).setHeaderValue(org.openide.util.NbBundle.getMessage(FrmReadEventPlace.class, "FrmReadEventPlace.tblReadEventPlace.columnModel.title3")); // NOI18N
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 390, 400));

        btnBack.setBackground(new java.awt.Color(63, 115, 193));
        btnBack.setPreferredSize(new java.awt.Dimension(158, 56));

        txtBackbtn.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtBackbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtBackbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBackbtn.setText(org.openide.util.NbBundle.getMessage(FrmReadEventPlace.class, "FrmReadEventPlace.txtBackbtn.text")); // NOI18N
        txtBackbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBackbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBackbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBackbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBackLayout = new javax.swing.GroupLayout(btnBack);
        btnBack.setLayout(btnBackLayout);
        btnBackLayout.setHorizontalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBackbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        btnBackLayout.setVerticalGroup(
            btnBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBackbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBackbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackbtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtBackbtnMouseClicked

    private void txtBackbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackbtnMouseEntered
        btnBack.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtBackbtnMouseEntered

    private void txtBackbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackbtnMouseExited
        if(txtBackbtn.getFont().equals(defaultFont)){
            btnBack.setBackground(btnDefaultColor);
        }
    }//GEN-LAST:event_txtBackbtnMouseExited

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
            java.util.logging.Logger.getLogger(FrmReadEventPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReadEventPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReadEventPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReadEventPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReadEventPlace().setVisible(true);
            }
        });
    }
    
    private void readEventPlace() {
    EventPlaceController evplc = new EventPlaceController();
    ArrayList<EventPlace> eventPlaceList = evplc.read();

    DefaultTableModel model = (DefaultTableModel) tblReadEventPlace.getModel();
    model.setRowCount(0); // Clear existing rows

    for (EventPlace eventPlace : eventPlaceList) {
        Object[] rowData = {eventPlace.getName(), eventPlace.getAdress(), eventPlace.getRentCost(), eventPlace.getCapacity()};
        model.addRow(rowData);
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReadEventPlace;
    private javax.swing.JLabel txtBackbtn;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
