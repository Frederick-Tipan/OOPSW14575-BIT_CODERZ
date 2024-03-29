package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.EmployeeController;
import ec.edu.espe.organivent.controller.StaffController;
import ec.edu.espe.organivent.model.Employee;
import ec.edu.espe.organivent.model.Staff;
import ec.edu.espe.organivent.utils.HandleInput;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class PnlAddStaff extends javax.swing.JPanel {

    private Color btnDefaultColor = new Color(63,115,193);
    private Color btnHoverColor = new Color(48,88,149);
    private Staff staff;
    private int workingHours;
    private int workingDays;
    private float totalStaffCost;
    private ArrayList<Employee> employees = new ArrayList<>();
    private FrmOrganiventMenu frmOrganiventMenu;
    
    /**
     * Creates new form PnlStaff
     */
    public PnlAddStaff() {
        initComponents();
        asignNewId();
        loadEmployees();
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

        tfdName = new javax.swing.JTextField();
        txtTitle = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtTipo = new javax.swing.JLabel();
        sptTipo = new javax.swing.JSeparator();
        txtEmployees = new javax.swing.JLabel();
        txtCostoTotal = new javax.swing.JLabel();
        tfdType = new javax.swing.JTextField();
        txtDias = new javax.swing.JLabel();
        txtHoras = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JPanel();
        txtConfirmBtn = new javax.swing.JLabel();
        spnDaysWorked = new javax.swing.JSpinner();
        spnHoursWorked = new javax.swing.JSpinner();
        scpnEmployees = new com.raven.scroll.win11.ScrollPaneWin11();
        lstEmployees = new javax.swing.JList<>();
        txtIdValue = new javax.swing.JLabel();
        txtTotalCost = new javax.swing.JLabel();
        btnReadStaff = new javax.swing.JPanel();
        txtReadStaffBtn = new javax.swing.JLabel();

        tfdName.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        tfdName.setBorder(null);
        tfdName.setPreferredSize(new java.awt.Dimension(210, 22));

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(32, 108, 141));
        txtTitle.setText("Añadir Staff");
        add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 14, -1, -1));

        txtId.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(135, 132, 132));
        txtId.setText("Id:");
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        txtTipo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(135, 132, 132));
        txtTipo.setText("Tipo de Staff:");
        add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        sptTipo.setBackground(new java.awt.Color(116, 178, 237));
        sptTipo.setForeground(new java.awt.Color(116, 178, 237));
        sptTipo.setOpaque(true);
        sptTipo.setPreferredSize(new java.awt.Dimension(212, 1));
        add(sptTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 122, -1, -1));

        txtEmployees.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtEmployees.setForeground(new java.awt.Color(135, 132, 132));
        txtEmployees.setText("Empleados:");
        add(txtEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        txtCostoTotal.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtCostoTotal.setForeground(new java.awt.Color(135, 132, 132));
        txtCostoTotal.setText("Costo total:");
        add(txtCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        tfdType.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        tfdType.setBorder(null);
        tfdType.setPreferredSize(new java.awt.Dimension(210, 22));
        tfdType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdTypeActionPerformed(evt);
            }
        });
        add(tfdType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, 20));

        txtDias.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtDias.setForeground(new java.awt.Color(135, 132, 132));
        txtDias.setText("Dias de trabajo:");
        add(txtDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 20));

        txtHoras.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtHoras.setForeground(new java.awt.Color(135, 132, 132));
        txtHoras.setText("Horas de trabajo:");
        add(txtHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        btnConfirm.setBackground(new java.awt.Color(63, 115, 193));
        btnConfirm.setPreferredSize(new java.awt.Dimension(142, 27));

        txtConfirmBtn.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N
        txtConfirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtConfirmBtn.setText("Confirmar");
        txtConfirmBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtConfirmBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConfirmBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtConfirmBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtConfirmBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnConfirmLayout = new javax.swing.GroupLayout(btnConfirm);
        btnConfirm.setLayout(btnConfirmLayout);
        btnConfirmLayout.setHorizontalGroup(
            btnConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfirmLayout.createSequentialGroup()
                .addComponent(txtConfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnConfirmLayout.setVerticalGroup(
            btnConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtConfirmBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 120, -1));

        spnDaysWorked.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnDaysWorked.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnDaysWorkedStateChanged(evt);
            }
        });
        add(spnDaysWorked, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        spnHoursWorked.setModel(new javax.swing.SpinnerNumberModel(1, 1, 23, 1));
        spnHoursWorked.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnHoursWorkedStateChanged(evt);
            }
        });
        add(spnHoursWorked, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        scpnEmployees.setBorder(null);

        lstEmployees.setBorder(null);
        lstEmployees.setFont(new java.awt.Font("Inter Light", 0, 12)); // NOI18N
        lstEmployees.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstEmployees.setToolTipText("Realice ctr + clic para seleccionar varios empleados a la vez");
        lstEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstEmployeesMouseClicked(evt);
            }
        });
        scpnEmployees.setViewportView(lstEmployees);

        add(scpnEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 220, 90));

        txtIdValue.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtIdValue.setText("0");
        add(txtIdValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 40, -1));

        txtTotalCost.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtTotalCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTotalCost.setText("$ 0,00");
        add(txtTotalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 100, -1));

        btnReadStaff.setBackground(new java.awt.Color(63, 115, 193));
        btnReadStaff.setPreferredSize(new java.awt.Dimension(142, 27));

        txtReadStaffBtn.setFont(new java.awt.Font("Inter", 0, 16)); // NOI18N
        txtReadStaffBtn.setForeground(new java.awt.Color(255, 255, 255));
        txtReadStaffBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtReadStaffBtn.setText("Visualizar Staff");
        txtReadStaffBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtReadStaffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReadStaffBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtReadStaffBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtReadStaffBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnReadStaffLayout = new javax.swing.GroupLayout(btnReadStaff);
        btnReadStaff.setLayout(btnReadStaffLayout);
        btnReadStaffLayout.setHorizontalGroup(
            btnReadStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtReadStaffBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        btnReadStaffLayout.setVerticalGroup(
            btnReadStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtReadStaffBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        add(btnReadStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tfdTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdTypeActionPerformed

    private void txtConfirmBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmBtnMouseEntered
        btnConfirm.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtConfirmBtnMouseEntered

    private void txtConfirmBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmBtnMouseExited
        btnConfirm.setBackground(btnDefaultColor);
    }//GEN-LAST:event_txtConfirmBtnMouseExited

    private void txtConfirmBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmBtnMouseClicked
        boolean canContinue = validateData();

        if(canContinue){
            sendStaffData();
        } 
    }//GEN-LAST:event_txtConfirmBtnMouseClicked

    private void txtReadStaffBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReadStaffBtnMouseClicked
        FrmReadStaff frmReadStaff = new FrmReadStaff();
        frmReadStaff.setVisible(true);
    }//GEN-LAST:event_txtReadStaffBtnMouseClicked

    private void txtReadStaffBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReadStaffBtnMouseEntered
        btnReadStaff.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtReadStaffBtnMouseEntered

    private void txtReadStaffBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReadStaffBtnMouseExited
        btnReadStaff.setBackground(btnDefaultColor);
    }//GEN-LAST:event_txtReadStaffBtnMouseExited

    private void lstEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstEmployeesMouseClicked
        employees = getSelectedEmployees();
        updateTotalCost();
    }//GEN-LAST:event_lstEmployeesMouseClicked

    private void spnDaysWorkedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnDaysWorkedStateChanged
        updateTotalCost();
    }//GEN-LAST:event_spnDaysWorkedStateChanged

    private void spnHoursWorkedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnHoursWorkedStateChanged
         updateTotalCost();
    }//GEN-LAST:event_spnHoursWorkedStateChanged

    private void updateTotalCost(){
        boolean passed;
        
        passed = !employees.isEmpty();
        
        if(passed){
            passed = HandleInput.validateInteger(spnDaysWorked.getValue().toString());
            if(passed){
                passed = HandleInput.validateInteger(spnHoursWorked.getValue().toString());
                if(passed){
                    StaffController stfc = new StaffController();
                    workingDays = Integer.parseInt(spnDaysWorked.getValue().toString());
                    workingHours = Integer.parseInt(spnHoursWorked.getValue().toString());
                    totalStaffCost = stfc.calculateTotalCost(employees, workingHours, workingDays);
                    
                    txtTotalCost.setForeground(new Color(187,187,187));
                    txtTotalCost.setText("$"+totalStaffCost);
                }else{
                    txtTotalCost.setForeground(new Color(223,87,74));
                    txtTotalCost.setText("¡Error!");
                }
            }else{
                txtTotalCost.setForeground(new Color(223,87,74));
                txtTotalCost.setText("¡Error!");
            }
        }else{
            txtTotalCost.setForeground(new Color(223,87,74));
            txtTotalCost.setText("¡Error!");
        }
    }
    
    private boolean validateData(){
        boolean passed;
        String errorMessage;
        
        passed = HandleInput.validateRealName(tfdType.getText());
        if(passed){
            StaffController stfc = new StaffController();
            passed = stfc.validateTypeName(tfdType.getText());
            if(passed){
                employees = getSelectedEmployees();
                passed = !employees.isEmpty();
                if(passed){
                    passed = HandleInput.validateInteger(spnDaysWorked.getValue().toString());
                    if(passed){
                        passed = HandleInput.validateInteger(spnHoursWorked.getValue().toString());
                        if(!passed){
                            errorMessage = "El número de horas laborales especificado es inválido";
                            frmOrganiventMenu.showErrorPopup(errorMessage);
                        }
                    }else{
                        errorMessage = "El número de dias laborales especificado es inválido";
                        frmOrganiventMenu.showErrorPopup(errorMessage);
                    }
                }else{
                    errorMessage = "No ha seleccionado ningún empleado";
                    frmOrganiventMenu.showErrorPopup(errorMessage);
                }
            }else{
                errorMessage = "El tipo de Staff insertado ya existe, intente de nuevo";
                frmOrganiventMenu.showErrorPopup(errorMessage);
            }
        }else{
            errorMessage = "Asegúrese de haber insertado un nombre real válido";
            frmOrganiventMenu.showErrorPopup(errorMessage);
        }
        return passed;
    }
    
    private void sendStaffData(){
        StaffController stfc = new StaffController();
        
        int asignedId = Integer.parseInt(txtIdValue.getText());
        String insertedType = tfdType.getText();
        
        staff = new Staff(asignedId, insertedType, employees, totalStaffCost, workingDays, workingHours);

        stfc.create(staff);
        
        emptyFields();
        asignNewId();
    }
    
    private void emptyFields(){
        tfdType.setText("");
        spnDaysWorked.setValue(1);
        spnHoursWorked.setValue(1);
        txtTotalCost.setText("$ 0,00");
    }
    
    private void asignNewId(){
        StaffController stfc = new StaffController();
        int asignedId = stfc.asignNewId();
        String displayNewId = Integer.toString(asignedId);
        
        txtIdValue.setText(displayNewId);
    }
    
    private void loadEmployees(){
        DefaultListModel listModel = new DefaultListModel();
        EmployeeController emplc = new EmployeeController();
        
        ArrayList<Employee> availableEmployees = emplc.read();
        
        String display;
        
        for(Employee currentEmployee:availableEmployees){
            display = currentEmployee.getId() + " " + currentEmployee.getName();
            listModel.addElement(display);
        }
        
        lstEmployees.setModel(listModel);
    }
    
    private ArrayList<Employee> getSelectedEmployees(){
        ArrayList<Employee> selectedEmployees = new ArrayList<>();
        Employee fromEmployee;
        EmployeeController emplc = new EmployeeController();
        int reladtedId;
        
        List<String> selectedIndices = lstEmployees.getSelectedValuesList();
        
        
        for(String index:selectedIndices){
            reladtedId = Integer.parseInt(Character.toString(index.charAt(0)));
            
            fromEmployee = emplc.findOne(reladtedId);
            selectedEmployees.add(fromEmployee);
        }

        return selectedEmployees;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConfirm;
    private javax.swing.JPanel btnReadStaff;
    private javax.swing.JList<String> lstEmployees;
    private javax.swing.JScrollPane scpnEmployees;
    private javax.swing.JSpinner spnDaysWorked;
    private javax.swing.JSpinner spnHoursWorked;
    private javax.swing.JSeparator sptTipo;
    private javax.swing.JTextField tfdName;
    private javax.swing.JTextField tfdType;
    private javax.swing.JLabel txtConfirmBtn;
    private javax.swing.JLabel txtCostoTotal;
    private javax.swing.JLabel txtDias;
    private javax.swing.JLabel txtEmployees;
    private javax.swing.JLabel txtHoras;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtIdValue;
    private javax.swing.JLabel txtReadStaffBtn;
    private javax.swing.JLabel txtTipo;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtTotalCost;
    // End of variables declaration//GEN-END:variables
}
