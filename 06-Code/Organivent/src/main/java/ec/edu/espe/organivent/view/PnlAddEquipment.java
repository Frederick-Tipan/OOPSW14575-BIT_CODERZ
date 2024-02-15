package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.EquipmentController;
import ec.edu.espe.organivent.model.Equipment;
import ec.edu.espe.organivent.utils.HandleInput;
import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author Frederick
 */
public class PnlAddEquipment extends javax.swing.JPanel {

    private Color btnDefaultColor = new Color(63,115,193);
    private Color btnHoverColor = new Color(48,88,149);
    private Equipment equipment;
    private FrmOrganiventMenu frmOrganiventMenu;
    
    /**
     * Creates new form PnlAddEmployee
     */
    public PnlAddEquipment() {
        initComponents();
        
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

        txtTitle = new javax.swing.JLabel();
        txtCosto = new javax.swing.JLabel();
        txtTipoEquipo = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JPanel();
        txtConfirmbtn = new javax.swing.JLabel();
        spnQuantity = new javax.swing.JSpinner();
        tfdType = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JLabel();
        fdlCost = new javax.swing.JFormattedTextField();
        sptTipo = new javax.swing.JSeparator();
        sptCosto = new javax.swing.JSeparator();
        btnReadEquipments = new javax.swing.JPanel();
        txtReadEquipmentsBtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(390, 375));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle.setText("Añadir Equipo");
        add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        txtCosto.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtCosto.setForeground(new java.awt.Color(135, 132, 132));
        txtCosto.setText("Costo unitario:   $");
        add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtTipoEquipo.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtTipoEquipo.setForeground(new java.awt.Color(135, 132, 132));
        txtTipoEquipo.setText("Tipo:");
        add(txtTipoEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

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
            .addComponent(txtConfirmbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        btnConfirmLayout.setVerticalGroup(
            btnConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConfirmLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtConfirmbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        spnQuantity.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        spnQuantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        spnQuantity.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnQuantity.setPreferredSize(new java.awt.Dimension(100, 24));
        add(spnQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 147, -1, -1));

        tfdType.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdType.setBorder(null);
        tfdType.setPreferredSize(new java.awt.Dimension(200, 20));
        tfdType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdTypeKeyTyped(evt);
            }
        });
        add(tfdType, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(135, 132, 132));
        txtCantidad.setText("Cantidad:");
        add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        fdlCost.setBorder(null);
        fdlCost.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        fdlCost.setText("0,00");
        add(fdlCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 190, -1));

        sptTipo.setBackground(new java.awt.Color(116, 178, 237));
        sptTipo.setForeground(new java.awt.Color(116, 178, 237));
        sptTipo.setMinimumSize(new java.awt.Dimension(197, 1));
        sptTipo.setOpaque(true);
        sptTipo.setPreferredSize(new java.awt.Dimension(205, 1));
        add(sptTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 122, -1, -1));

        sptCosto.setBackground(new java.awt.Color(116, 178, 237));
        sptCosto.setForeground(new java.awt.Color(116, 178, 237));
        sptCosto.setMinimumSize(new java.awt.Dimension(197, 1));
        sptCosto.setOpaque(true);
        sptCosto.setPreferredSize(new java.awt.Dimension(205, 1));
        add(sptCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 222, -1, -1));

        btnReadEquipments.setBackground(new java.awt.Color(63, 115, 193));
        btnReadEquipments.setPreferredSize(new java.awt.Dimension(138, 31));

        txtReadEquipmentsBtn.setFont(new java.awt.Font("Inter SemiBold", 0, 15)); // NOI18N
        txtReadEquipmentsBtn.setForeground(new java.awt.Color(255, 255, 255));
        txtReadEquipmentsBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtReadEquipmentsBtn.setText("Visualizar Equipos");
        txtReadEquipmentsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtReadEquipmentsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReadEquipmentsBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtReadEquipmentsBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtReadEquipmentsBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnReadEquipmentsLayout = new javax.swing.GroupLayout(btnReadEquipments);
        btnReadEquipments.setLayout(btnReadEquipmentsLayout);
        btnReadEquipmentsLayout.setHorizontalGroup(
            btnReadEquipmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtReadEquipmentsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        btnReadEquipmentsLayout.setVerticalGroup(
            btnReadEquipmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReadEquipmentsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtReadEquipmentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(btnReadEquipments, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 270, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseEntered
       btnConfirm.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtConfirmbtnMouseEntered

    private void txtConfirmbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseExited
        btnConfirm.setBackground(btnDefaultColor);
    }//GEN-LAST:event_txtConfirmbtnMouseExited

    private void tfdTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdTypeKeyTyped
            if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)){
        evt.consume();
    }
    }//GEN-LAST:event_tfdTypeKeyTyped

    private void txtConfirmbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseClicked
       boolean canContinue = validateData();

        if(canContinue){
            sendEquipmentData();
        }
    }//GEN-LAST:event_txtConfirmbtnMouseClicked

    private void txtReadEquipmentsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReadEquipmentsBtnMouseClicked
        FrmReadEquipment frmReadEquipment = new FrmReadEquipment();
        frmReadEquipment.setVisible(true);
    }//GEN-LAST:event_txtReadEquipmentsBtnMouseClicked

    private void txtReadEquipmentsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReadEquipmentsBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReadEquipmentsBtnMouseEntered

    private void txtReadEquipmentsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReadEquipmentsBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReadEquipmentsBtnMouseExited


    private boolean validateData(){
        boolean passed;
        String errorMessage;
        
        passed = HandleInput.validateEquipmentName(tfdType.getText());
        if(passed){
            EquipmentController eqmtc = new EquipmentController();
            passed = eqmtc.validateTypeName(tfdType.getText());
            if(passed){            
                passed = HandleInput.validateInteger(spnQuantity.getValue().toString());
                if(passed){
                    passed = HandleInput.validatePriceString(fdlCost.getText());
                    if(!passed){
                        errorMessage = "Asegúrese de haber insertado un valor monetario válido";
                        frmOrganiventMenu.showErrorPopup(errorMessage);
                    }
                }else{
                    errorMessage = "La cantidad especificada es inválida";
                    frmOrganiventMenu.showErrorPopup(errorMessage);
                }
            }else{
                errorMessage = "El tipo de equipo insertado ya existe, intente de nuevo";
                frmOrganiventMenu.showErrorPopup(errorMessage);
            }
        }else{
            errorMessage = "Asegúrese de haber insertado un nombre de equipo válido";
            frmOrganiventMenu.showErrorPopup(errorMessage);
        }
        
        return passed;
    }
    
    private void sendEquipmentData(){
        String insertedType = tfdType.getText();
        int insertedQty = Integer.parseInt(spnQuantity.getValue().toString());
        float insertedCost = HandleInput.returnFloat(fdlCost.getText());
        
        equipment = new Equipment(insertedType, insertedCost, insertedQty);
        
        EquipmentController eqmtc = new EquipmentController();
        eqmtc.create(equipment);
        
        emptyFields();
    }
    
    private void emptyFields(){
        tfdType.setText("");
        spnQuantity.setValue(1);
        fdlCost.setText("0,00");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConfirm;
    private javax.swing.JPanel btnReadEquipments;
    private javax.swing.JFormattedTextField fdlCost;
    private javax.swing.JSpinner spnQuantity;
    private javax.swing.JSeparator sptCosto;
    private javax.swing.JSeparator sptTipo;
    private javax.swing.JTextField tfdType;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtConfirmbtn;
    private javax.swing.JLabel txtCosto;
    private javax.swing.JLabel txtReadEquipmentsBtn;
    private javax.swing.JLabel txtTipoEquipo;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
