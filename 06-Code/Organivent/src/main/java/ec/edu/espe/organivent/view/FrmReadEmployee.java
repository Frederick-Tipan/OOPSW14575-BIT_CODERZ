package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.EmployeeController;
import ec.edu.espe.organivent.model.Employee;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class FrmReadEmployee extends javax.swing.JFrame {

    private Color btnDefaultColor = new Color(116,179,237);
    private Color btnHoverColor = new Color(63,115,193);
    private Font pressedFont = new Font("Inter SemiBold", Font.PLAIN, 20);
    private Font defaultFont = new Font("Inter", Font.PLAIN, 20);
    /**
     * Creates new form FrmEvent
     */
    public FrmReadEmployee() {
        initComponents();
        readEmployee();
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
        txtTitle1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReadEmployee = new javax.swing.JTable();
        btnBackEmployee = new javax.swing.JPanel();
        txtBackEmployeebtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle1.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle1.setText(org.openide.util.NbBundle.getMessage(FrmReadEmployee.class, "FrmReadEmployee.txtTitle1.text_1")); // NOI18N
        jPanel1.add(txtTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        tblReadEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Salario"
            }
        ));
        jScrollPane1.setViewportView(tblReadEmployee);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 390, 260));

        btnBackEmployee.setBackground(new java.awt.Color(63, 115, 193));
        btnBackEmployee.setPreferredSize(new java.awt.Dimension(158, 56));

        txtBackEmployeebtn.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtBackEmployeebtn.setForeground(new java.awt.Color(255, 255, 255));
        txtBackEmployeebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBackEmployeebtn.setText(org.openide.util.NbBundle.getMessage(FrmReadEmployee.class, "FrmReadEmployee.txtBackEmployeebtn.text_1")); // NOI18N
        txtBackEmployeebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtBackEmployeebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBackEmployeebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtBackEmployeebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtBackEmployeebtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnBackEmployeeLayout = new javax.swing.GroupLayout(btnBackEmployee);
        btnBackEmployee.setLayout(btnBackEmployeeLayout);
        btnBackEmployeeLayout.setHorizontalGroup(
            btnBackEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackEmployeeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtBackEmployeebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnBackEmployeeLayout.setVerticalGroup(
            btnBackEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBackEmployeeLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtBackEmployeebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(btnBackEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 316, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBackEmployeebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackEmployeebtnMouseExited
        if(txtBackEmployeebtn.getFont().equals(defaultFont)){
            btnBackEmployee.setBackground(btnDefaultColor);
        }
    }//GEN-LAST:event_txtBackEmployeebtnMouseExited

    private void txtBackEmployeebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackEmployeebtnMouseEntered
        btnBackEmployee.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtBackEmployeebtnMouseEntered

    private void txtBackEmployeebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBackEmployeebtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtBackEmployeebtnMouseClicked

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
            java.util.logging.Logger.getLogger(FrmReadEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReadEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReadEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReadEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmReadEmployee().setVisible(true);
            }
        });
    }
    
    private void readEmployee() {
    EmployeeController ev = new EmployeeController();
    ArrayList<Employee> employeeList = ev.read();

    DefaultTableModel model = (DefaultTableModel) tblReadEmployee.getModel();
    model.setRowCount(0); 

    for (Employee employee : employeeList) {
        Object[] rowData = {employee.getId(), employee.getName(), employee.getWage()};
        model.addRow(rowData);
    }
    }
    
    private void resetButtonColors(){
        btnBackEmployee.setBackground(btnDefaultColor);
        
    }
    
    private void resetFontFormat(){
        txtBackEmployeebtn.setFont(defaultFont);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBackEmployee;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReadEmployee;
    private javax.swing.JLabel txtBackEmployeebtn;
    private javax.swing.JLabel txtTitle1;
    // End of variables declaration//GEN-END:variables
}
