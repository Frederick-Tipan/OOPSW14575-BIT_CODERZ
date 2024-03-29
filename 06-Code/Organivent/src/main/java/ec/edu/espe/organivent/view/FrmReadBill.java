package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.BillController;
import ec.edu.espe.organivent.model.Bill;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FrmReadBill extends javax.swing.JFrame {

    private Color btnDefaultColor = new Color(116,179,237);
    private Color btnHoverColor = new Color(63,115,193);
    private Font pressedFont = new Font("Inter SemiBold", Font.PLAIN, 20);
    private Font defaultFont = new Font("Inter", Font.PLAIN, 20);
    /**
     * Creates new form FrmReadBill
     */
    public FrmReadBill() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/organivent_icon.jpeg")).getImage());
        readBill();
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
        txtTitle2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReadBill = new javax.swing.JTable();
        btnBackBill = new javax.swing.JPanel();
        txtBackBillbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle2.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle2.setText(org.openide.util.NbBundle.getMessage(FrmReadBill.class, "FrmReadBill.txtTitle2.text_1")); // NOI18N
        jPanel1.add(txtTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        tblReadBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "C. Artista", "C. Staff", "C. Equipo", "Gastos Generales", "Multas", "C. Evento", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tblReadBill);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 540, 260));

        btnBackBill.setBackground(new java.awt.Color(63, 115, 193));
        btnBackBill.setPreferredSize(new java.awt.Dimension(158, 56));

        txtBackBillbtn.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtBackBillbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtBackBillbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBackBillbtn.setText(org.openide.util.NbBundle.getMessage(FrmReadBill.class, "FrmReadBill.txtBackBillbtn.text_1")); // NOI18N
        txtBackBillbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBackBillbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackBillbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBackBillbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBackBillbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBackBillLayout = new javax.swing.GroupLayout(btnBackBill);
        btnBackBill.setLayout(btnBackBillLayout);
        btnBackBillLayout.setHorizontalGroup(
            btnBackBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBackBillbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        btnBackBillLayout.setVerticalGroup(
            btnBackBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtBackBillbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnBackBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBackBillbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackBillbtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtBackBillbtnMouseClicked

    private void txtBackBillbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackBillbtnMouseEntered
        btnBackBill.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtBackBillbtnMouseEntered

    private void txtBackBillbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackBillbtnMouseExited
        if(txtBackBillbtn.getFont().equals(defaultFont)){
            btnBackBill.setBackground(btnDefaultColor);
        }
    }//GEN-LAST:event_txtBackBillbtnMouseExited

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
            java.util.logging.Logger.getLogger(FrmReadBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReadBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReadBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReadBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReadBill().setVisible(true);
            }
        });
    }
    
    private void readBill() {
    BillController bll = new BillController();
    ArrayList<Bill> billList = bll.readTable();

    DefaultTableModel model = (DefaultTableModel) tblReadBill.getModel();
    model.setRowCount(0); 

    for (Bill bill : billList) {
        Object[] rowData = {bill.getId(), bill.getArtistCost(), bill.getStaffCost(), bill.getEquipmentCost(), bill.getGeneralExpensesCost(), bill.getPenaltyFeesCost(), bill.getVenueCost(), bill.getTotalAmount()};
        model.addRow(rowData);
    }
    }
    
    private void resetButtonColors(){
        btnBackBill.setBackground(btnDefaultColor);
        
    }
    
    private void resetFontFormat(){
        txtBackBillbtn.setFont(defaultFont);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBackBill;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReadBill;
    private javax.swing.JLabel txtBackBillbtn;
    private javax.swing.JLabel txtTitle2;
    // End of variables declaration//GEN-END:variables
}
