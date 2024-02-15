package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.EmployeeController;
import ec.edu.espe.organivent.model.Employee;
import ec.edu.espe.organivent.utils.HandleInput;
import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author Frederick
 */
public class PnlAddEmployee extends javax.swing.JPanel {

    private Color btnDefaultColor = new Color(63,115,193);
    private Color btnHoverColor = new Color(48,88,149);
    private Employee employee;
    private FrmOrganiventMenu frmOrganiventMenu;
    
    /**
     * Creates new form PnlAddEmployee
     */
    public PnlAddEmployee() {
        initComponents();
        asignNewId();
    }

    public void setOrganiventMenu(FrmOrganiventMenu frmOrganiventMenu){
        this.frmOrganiventMenu = frmOrganiventMenu;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSeeEvent = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        txtSalario = new javax.swing.JLabel();
        txtIdValue = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JPanel();
        txtConfirmbtn = new javax.swing.JLabel();
        tfdName = new javax.swing.JTextField();
        txtId1 = new javax.swing.JLabel();
        fdlWage = new javax.swing.JFormattedTextField();
        sptNombre = new javax.swing.JSeparator();
        sptSalario = new javax.swing.JSeparator();
        btnReadEmployees = new javax.swing.JPanel();
        txtReadEmployeesBtn = new javax.swing.JLabel();

        btnSeeEvent.setBackground(new java.awt.Color(63, 115, 193));
        btnSeeEvent.setMaximumSize(new java.awt.Dimension(142, 47));
        btnSeeEvent.setMinimumSize(new java.awt.Dimension(142, 47));

        javax.swing.GroupLayout btnSeeEventLayout = new javax.swing.GroupLayout(btnSeeEvent);
        btnSeeEvent.setLayout(btnSeeEventLayout);
        btnSeeEventLayout.setHorizontalGroup(
            btnSeeEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        btnSeeEventLayout.setVerticalGroup(
            btnSeeEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(390, 375));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle.setText("Añadir Empleado");
        add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 21, -1, -1));

        txtSalario.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtSalario.setForeground(new java.awt.Color(135, 132, 132));
        txtSalario.setText("Salario:   $");
        add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 192, -1, -1));

        txtIdValue.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtIdValue.setText("0");
        add(txtIdValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 98, 90, -1));

        txtNombre.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(135, 132, 132));
        txtNombre.setText("Nombre:");
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 141, -1, -1));

        btnConfirm.setBackground(new java.awt.Color(63, 115, 193));
        btnConfirm.setPreferredSize(new java.awt.Dimension(138, 31));

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
            .addGroup(btnConfirmLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtConfirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        btnConfirmLayout.setVerticalGroup(
            btnConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConfirmbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 267, -1, -1));

        tfdName.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        tfdName.setBorder(null);
        tfdName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdNameKeyTyped(evt);
            }
        });
        add(tfdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 141, 200, -1));

        txtId1.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtId1.setForeground(new java.awt.Color(135, 132, 132));
        txtId1.setText("Id:");
        add(txtId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 98, -1, -1));

        fdlWage.setBorder(null);
        fdlWage.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        fdlWage.setText("0,00");
        add(fdlWage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 192, 170, -1));

        sptNombre.setBackground(new java.awt.Color(116, 178, 237));
        sptNombre.setForeground(new java.awt.Color(116, 178, 237));
        sptNombre.setOpaque(true);
        sptNombre.setPreferredSize(new java.awt.Dimension(197, 1));
        add(sptNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 162, -1, -1));

        sptSalario.setBackground(new java.awt.Color(116, 178, 237));
        sptSalario.setForeground(new java.awt.Color(116, 178, 237));
        sptSalario.setOpaque(true);
        sptSalario.setPreferredSize(new java.awt.Dimension(197, 1));
        add(sptSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 214, -1, -1));

        btnReadEmployees.setBackground(new java.awt.Color(63, 115, 193));
        btnReadEmployees.setPreferredSize(new java.awt.Dimension(138, 31));

        txtReadEmployeesBtn.setFont(new java.awt.Font("Inter SemiBold", 0, 15)); // NOI18N
        txtReadEmployeesBtn.setForeground(new java.awt.Color(255, 255, 255));
        txtReadEmployeesBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtReadEmployeesBtn.setText("Visualizar empleados");
        txtReadEmployeesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtReadEmployeesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReadEmployeesBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtReadEmployeesBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtReadEmployeesBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnReadEmployeesLayout = new javax.swing.GroupLayout(btnReadEmployees);
        btnReadEmployees.setLayout(btnReadEmployeesLayout);
        btnReadEmployeesLayout.setHorizontalGroup(
            btnReadEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReadEmployeesLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(txtReadEmployeesBtn)
                .addGap(56, 56, 56))
        );
        btnReadEmployeesLayout.setVerticalGroup(
            btnReadEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtReadEmployeesBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        add(btnReadEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseEntered
       btnConfirm.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtConfirmbtnMouseEntered

    private void txtConfirmbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseExited
        btnConfirm.setBackground(btnDefaultColor);
    }//GEN-LAST:event_txtConfirmbtnMouseExited

    private void tfdNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdNameKeyTyped
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)){
        evt.consume();
    }
    }//GEN-LAST:event_tfdNameKeyTyped

    private void txtConfirmbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseClicked
        boolean canContinue = validateData();

        if(canContinue){
            sendEmployeeData();
        } 
    }//GEN-LAST:event_txtConfirmbtnMouseClicked

    private void txtReadEmployeesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReadEmployeesBtnMouseClicked
        FrmReadEmployee frmReadEmployees = new FrmReadEmployee();
        frmReadEmployees.setVisible(true);
    }//GEN-LAST:event_txtReadEmployeesBtnMouseClicked

    private void txtReadEmployeesBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReadEmployeesBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReadEmployeesBtnMouseEntered

    private void txtReadEmployeesBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReadEmployeesBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReadEmployeesBtnMouseExited

    private boolean validateData(){
        boolean passed;
        String errorMessage;
        
        passed = HandleInput.validateRealName(tfdName.getText());
        if(passed){
            passed = HandleInput.validatePriceString(fdlWage.getText());
            if(!passed){
                errorMessage = "Asegúrese de haber insertado un valor monetario válido";
                frmOrganiventMenu.showErrorPopup(errorMessage);
            }
        }else{
            errorMessage = "Asegúrese de haber insertado un nombre real válido";
            frmOrganiventMenu.showErrorPopup(errorMessage);
        }
        return passed;
    }
    
    private void sendEmployeeData(){
        int asignedId = Integer.parseInt(txtIdValue.getText());
        String insertedName = tfdName.getText();
        float insertedWage = HandleInput.returnFloat(fdlWage.getText());
        
        employee = new Employee(asignedId, insertedName, insertedWage);
        
        EmployeeController empc = new EmployeeController();
        empc.create(employee);
        
        emptyFields();
        asignNewId();
    }
    
    private void emptyFields(){
        tfdName.setText("");
        fdlWage.setText("0,00");
    }
    
    private void asignNewId(){
        EmployeeController empc = new EmployeeController();
        int asignedId = empc.asignNewId();
        String displayNewId = Integer.toString(asignedId);
        
        txtIdValue.setText(displayNewId);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConfirm;
    private javax.swing.JPanel btnReadEmployees;
    private javax.swing.JPanel btnSeeEvent;
    private javax.swing.JFormattedTextField fdlWage;
    private javax.swing.JSeparator sptNombre;
    private javax.swing.JSeparator sptSalario;
    private javax.swing.JTextField tfdName;
    private javax.swing.JLabel txtConfirmbtn;
    private javax.swing.JLabel txtId1;
    private javax.swing.JLabel txtIdValue;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtReadEmployeesBtn;
    private javax.swing.JLabel txtSalario;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
