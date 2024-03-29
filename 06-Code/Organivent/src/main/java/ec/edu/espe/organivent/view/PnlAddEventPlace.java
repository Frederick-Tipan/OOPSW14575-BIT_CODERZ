package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.EventPlaceController;
import ec.edu.espe.organivent.model.EventPlace;
import ec.edu.espe.organivent.utils.HandleInput;
import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author Frederick
 */
public class PnlAddEventPlace extends javax.swing.JPanel {

    private Color btnDefaultColor = new Color(63,115,193);
    private Color btnHoverColor = new Color(48,88,149);
    private EventPlace eventPlace;
    private FrmOrganiventMenu frmOrganiventMenu;
    
    /**
     * Creates new form PnlAddEmployee
     */
    public PnlAddEventPlace() {
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
        txtDireccion = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JPanel();
        txtConfirmbtn = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JLabel();
        txtCostoRenta = new javax.swing.JLabel();
        tfdName = new javax.swing.JTextField();
        tfdAdress = new javax.swing.JTextField();
        sldCapacity = new javax.swing.JSlider();
        etiValor = new javax.swing.JLabel();
        fdlRentCost = new javax.swing.JFormattedTextField();
        sptNombre = new javax.swing.JSeparator();
        sptDireccion = new javax.swing.JSeparator();
        sptCostoRenta = new javax.swing.JSeparator();
        btnReadEventPlace = new javax.swing.JPanel();
        txtReadEventPlaceBtn = new javax.swing.JLabel();
        tfdNumPeople = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(390, 375));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle.setText("Añadir Lugar");
        add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 20, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(135, 132, 132));
        txtDireccion.setText("Dirección:");
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 120, -1, -1));

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

        add(btnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        txtNombre.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(135, 132, 132));
        txtNombre.setText("Nombre del sitio:");
        add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        txtCapacidad.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtCapacidad.setForeground(new java.awt.Color(135, 132, 132));
        txtCapacidad.setText("Capacidad:");
        add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        txtCostoRenta.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtCostoRenta.setForeground(new java.awt.Color(135, 132, 132));
        txtCostoRenta.setText("Costo de renta:  $");
        add(txtCostoRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        tfdName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdName.setBorder(null);
        tfdName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdNameKeyTyped(evt);
            }
        });
        add(tfdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 68, 200, -1));

        tfdAdress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfdAdress.setBorder(null);
        tfdAdress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdAdressKeyTyped(evt);
            }
        });
        add(tfdAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 118, 200, -1));

        sldCapacity.setMajorTickSpacing(10000);
        sldCapacity.setMaximum(30000);
        sldCapacity.setMinorTickSpacing(1000);
        sldCapacity.setPaintLabels(true);
        sldCapacity.setPaintTicks(true);
        sldCapacity.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sldCapacity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldCapacityStateChanged(evt);
            }
        });
        add(sldCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 210, 50));
        add(etiValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 80, -1));

        fdlRentCost.setBorder(null);
        fdlRentCost.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        fdlRentCost.setText("0,00");
        add(fdlRentCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        sptNombre.setBackground(new java.awt.Color(116, 178, 237));
        sptNombre.setForeground(new java.awt.Color(116, 178, 237));
        sptNombre.setOpaque(true);
        sptNombre.setPreferredSize(new java.awt.Dimension(200, 1));
        add(sptNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        sptDireccion.setBackground(new java.awt.Color(116, 178, 237));
        sptDireccion.setForeground(new java.awt.Color(116, 178, 237));
        sptDireccion.setOpaque(true);
        sptDireccion.setPreferredSize(new java.awt.Dimension(200, 1));
        add(sptDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        sptCostoRenta.setBackground(new java.awt.Color(116, 178, 237));
        sptCostoRenta.setForeground(new java.awt.Color(116, 178, 237));
        sptCostoRenta.setOpaque(true);
        sptCostoRenta.setPreferredSize(new java.awt.Dimension(195, 1));
        add(sptCostoRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 190, -1, -1));

        btnReadEventPlace.setBackground(new java.awt.Color(63, 115, 193));
        btnReadEventPlace.setPreferredSize(new java.awt.Dimension(138, 31));

        txtReadEventPlaceBtn.setFont(new java.awt.Font("Inter SemiBold", 0, 15)); // NOI18N
        txtReadEventPlaceBtn.setForeground(new java.awt.Color(255, 255, 255));
        txtReadEventPlaceBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtReadEventPlaceBtn.setText("Visualizar Lugares");
        txtReadEventPlaceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtReadEventPlaceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReadEventPlaceBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtReadEventPlaceBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtReadEventPlaceBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnReadEventPlaceLayout = new javax.swing.GroupLayout(btnReadEventPlace);
        btnReadEventPlace.setLayout(btnReadEventPlaceLayout);
        btnReadEventPlaceLayout.setHorizontalGroup(
            btnReadEventPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtReadEventPlaceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        btnReadEventPlaceLayout.setVerticalGroup(
            btnReadEventPlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReadEventPlaceLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtReadEventPlaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(btnReadEventPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 160, -1));

        tfdNumPeople.setEditable(false);
        tfdNumPeople.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        tfdNumPeople.setText("0 personas");
        tfdNumPeople.setBorder(null);
        add(tfdNumPeople, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 272, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtConfirmbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseEntered
       btnConfirm.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtConfirmbtnMouseEntered

    private void txtConfirmbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseExited
        btnConfirm.setBackground(btnDefaultColor);
    }//GEN-LAST:event_txtConfirmbtnMouseExited

    private void sldCapacityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldCapacityStateChanged
        tfdNumPeople.setText(sldCapacity.getValue()+" personas");   
    }//GEN-LAST:event_sldCapacityStateChanged

    private void tfdNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdNameKeyTyped
        if (!(Character.isLetter(evt.getKeyChar())) && !(evt.getKeyChar() == KeyEvent.VK_SPACE)){
        evt.consume();
    }
    }//GEN-LAST:event_tfdNameKeyTyped

    private void tfdAdressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdAdressKeyTyped
        char keyChar = evt.getKeyChar();
    
        if (!(Character.isLetterOrDigit(keyChar) || Character.isWhitespace(keyChar))) {
            evt.consume();
        }
    }//GEN-LAST:event_tfdAdressKeyTyped

    private void txtConfirmbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmbtnMouseClicked
        boolean canContinue = validateData();

        if(canContinue){
            sendEventPlaceData();
        }
    }//GEN-LAST:event_txtConfirmbtnMouseClicked

    private void txtReadEventPlaceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReadEventPlaceBtnMouseClicked
        FrmReadEventPlace frmReadEventPlace = new FrmReadEventPlace();
        frmReadEventPlace.setVisible(true);
    }//GEN-LAST:event_txtReadEventPlaceBtnMouseClicked

    private void txtReadEventPlaceBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReadEventPlaceBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReadEventPlaceBtnMouseEntered

    private void txtReadEventPlaceBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReadEventPlaceBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReadEventPlaceBtnMouseExited

    private boolean validateData(){
        boolean passed;
        String errorMessage;
        
        passed = HandleInput.validateRealName(tfdName.getText());
        if(passed){
            EventPlaceController evplc = new EventPlaceController();
            passed = evplc.validateName(tfdName.getText());
            if(passed){            
                passed = HandleInput.validateStreetAdress(tfdAdress.getText());
                if(passed){
                    passed = HandleInput.validatePriceString(fdlRentCost.getText());
                    if(!passed){
                        errorMessage = "Asegúrese de haber insertado un valor monetario válido";
                        frmOrganiventMenu.showErrorPopup(errorMessage);
                    }
                }else{
                    errorMessage = "Asegúrese de haber insertado una dirección válida";
                    frmOrganiventMenu.showErrorPopup(errorMessage);
                }
            }else{
                errorMessage = "El lugar insertado ya existe, intente de nuevo";
                frmOrganiventMenu.showErrorPopup(errorMessage);
            }
        }else{
            errorMessage = "Asegúrese de haber insertado un nombre real válido";
            frmOrganiventMenu.showErrorPopup(errorMessage);
        }
        
        return passed;
    }
    
    private void sendEventPlaceData(){
        String insertedName = tfdName.getText();
        String insertedAdress = tfdAdress.getText();
        float insertedRentCost = HandleInput.returnFloat(fdlRentCost.getText());
        int insertedCapacity = sldCapacity.getValue();
        
        eventPlace = new EventPlace(insertedName, insertedAdress, insertedRentCost, insertedCapacity);
        
        EventPlaceController evplc = new EventPlaceController();
        evplc.create(eventPlace);
        
        emptyFields();
    }
    
    private void emptyFields(){
        tfdName.setText("");
        tfdAdress.setText("");
        sldCapacity.setValue(0);
        tfdNumPeople.setText("");
        fdlRentCost.setText("0,00");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnConfirm;
    private javax.swing.JPanel btnReadEventPlace;
    private javax.swing.JLabel etiValor;
    private javax.swing.JFormattedTextField fdlRentCost;
    private javax.swing.JSlider sldCapacity;
    private javax.swing.JSeparator sptCostoRenta;
    private javax.swing.JSeparator sptDireccion;
    private javax.swing.JSeparator sptNombre;
    private javax.swing.JTextField tfdAdress;
    private javax.swing.JTextField tfdName;
    private javax.swing.JTextField tfdNumPeople;
    private javax.swing.JLabel txtCapacidad;
    private javax.swing.JLabel txtConfirmbtn;
    private javax.swing.JLabel txtCostoRenta;
    private javax.swing.JLabel txtDireccion;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtReadEventPlaceBtn;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
