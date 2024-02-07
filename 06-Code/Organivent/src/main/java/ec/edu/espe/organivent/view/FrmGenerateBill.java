package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.BillController;
import ec.edu.espe.organivent.controller.EventController;
import ec.edu.espe.organivent.model.Bill;
import ec.edu.espe.organivent.model.Event;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Frederick
 */
public class FrmGenerateBill extends javax.swing.JFrame {

    private Color btnDefaultColor = new Color(63,115,193);
    private Color btnHoverColor = new Color(48,88,149);
    private Bill bill;
    private Event event;
    private boolean canPrint = false;
    
    /**
     * Creates new form FrmGenerateBill
     */
    public FrmGenerateBill() {
        initComponents();
        loadEventIds();
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
        pnlPrintArea = new javax.swing.JPanel();
        txtTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtId = new javax.swing.JLabel();
        txtArtistCost1 = new javax.swing.JLabel();
        txtVenueCost1 = new javax.swing.JLabel();
        txtStaffCost1 = new javax.swing.JLabel();
        txtEquipmentCost1 = new javax.swing.JLabel();
        txtGeneralExpensesCost1 = new javax.swing.JLabel();
        txtPenaltyFeesCost1 = new javax.swing.JLabel();
        txtTotalAmount1 = new javax.swing.JLabel();
        txtArtistCost = new javax.swing.JLabel();
        txtVenueCost = new javax.swing.JLabel();
        txtStaffCost = new javax.swing.JLabel();
        txtEquipmentCost = new javax.swing.JLabel();
        txtGeneralExpensesCost = new javax.swing.JLabel();
        txtPenaltyFeesCost = new javax.swing.JLabel();
        txtTotalAmount = new javax.swing.JLabel();
        cmbIdEvent = new javax.swing.JComboBox<>();
        bottomLayer = new javax.swing.JPanel();
        btnPrint = new javax.swing.JPanel();
        txtPrintbtn = new javax.swing.JLabel();
        btnGenerate = new javax.swing.JPanel();
        txtGeneratebtn = new javax.swing.JLabel();
        btnReturn = new javax.swing.JPanel();
        txtReturnbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPrintArea.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrintArea.setMaximumSize(new java.awt.Dimension(470, 362));
        pnlPrintArea.setMinimumSize(new java.awt.Dimension(470, 362));
        pnlPrintArea.setPreferredSize(new java.awt.Dimension(470, 362));

        txtTitle.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(32, 108, 141));
        txtTitle.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtTitle.text")); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(116, 178, 237));
        jSeparator1.setForeground(new java.awt.Color(116, 178, 237));
        jSeparator1.setMaximumSize(new java.awt.Dimension(430, 1));
        jSeparator1.setMinimumSize(new java.awt.Dimension(430, 1));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(430, 1));

        txtId.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtId.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtId.text")); // NOI18N

        txtArtistCost1.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtArtistCost1.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtArtistCost1.text")); // NOI18N

        txtVenueCost1.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtVenueCost1.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtVenueCost1.text")); // NOI18N

        txtStaffCost1.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtStaffCost1.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtStaffCost1.text")); // NOI18N

        txtEquipmentCost1.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtEquipmentCost1.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtEquipmentCost1.text")); // NOI18N

        txtGeneralExpensesCost1.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtGeneralExpensesCost1.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtGeneralExpensesCost1.text")); // NOI18N

        txtPenaltyFeesCost1.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtPenaltyFeesCost1.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtPenaltyFeesCost1.text")); // NOI18N

        txtTotalAmount1.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
        txtTotalAmount1.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtTotalAmount1.text")); // NOI18N

        txtArtistCost.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtArtistCost.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtArtistCost.text")); // NOI18N

        txtVenueCost.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtVenueCost.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtVenueCost.text")); // NOI18N

        txtStaffCost.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtStaffCost.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtStaffCost.text")); // NOI18N

        txtEquipmentCost.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtEquipmentCost.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtEquipmentCost.text")); // NOI18N

        txtGeneralExpensesCost.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtGeneralExpensesCost.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtGeneralExpensesCost.text")); // NOI18N

        txtPenaltyFeesCost.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        txtPenaltyFeesCost.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtPenaltyFeesCost.text")); // NOI18N

        txtTotalAmount.setFont(new java.awt.Font("Inter", 1, 15)); // NOI18N
        txtTotalAmount.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtTotalAmount.text")); // NOI18N

        cmbIdEvent.setFont(new java.awt.Font("Inter", 0, 15)); // NOI18N
        cmbIdEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbIdEvent.setMaximumSize(new java.awt.Dimension(123, 25));
        cmbIdEvent.setMinimumSize(new java.awt.Dimension(123, 25));
        cmbIdEvent.setPreferredSize(new java.awt.Dimension(123, 25));

        javax.swing.GroupLayout pnlPrintAreaLayout = new javax.swing.GroupLayout(pnlPrintArea);
        pnlPrintArea.setLayout(pnlPrintAreaLayout);
        pnlPrintAreaLayout.setHorizontalGroup(
            pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrintAreaLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(pnlPrintAreaLayout.createSequentialGroup()
                .addGroup(pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrintAreaLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(txtTitle))
                    .addGroup(pnlPrintAreaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEquipmentCost1)
                            .addComponent(txtGeneralExpensesCost1)
                            .addComponent(txtStaffCost1)
                            .addComponent(txtId)
                            .addComponent(txtArtistCost1)
                            .addComponent(txtVenueCost1)
                            .addComponent(txtPenaltyFeesCost1)
                            .addComponent(txtTotalAmount1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtArtistCost, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVenueCost, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStaffCost, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEquipmentCost, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeneralExpensesCost, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPenaltyFeesCost, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbIdEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPrintAreaLayout.setVerticalGroup(
            pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrintAreaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId)
                    .addComponent(cmbIdEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArtistCost1)
                    .addComponent(txtArtistCost))
                .addGap(18, 18, 18)
                .addGroup(pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVenueCost1)
                    .addComponent(txtVenueCost))
                .addGap(18, 18, 18)
                .addGroup(pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStaffCost1)
                    .addComponent(txtStaffCost))
                .addGap(18, 18, 18)
                .addGroup(pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEquipmentCost1)
                    .addComponent(txtEquipmentCost))
                .addGap(18, 18, 18)
                .addGroup(pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGeneralExpensesCost1)
                    .addComponent(txtGeneralExpensesCost))
                .addGap(18, 18, 18)
                .addGroup(pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPenaltyFeesCost1)
                    .addComponent(txtPenaltyFeesCost))
                .addGap(29, 29, 29)
                .addGroup(pnlPrintAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalAmount1)
                    .addComponent(txtTotalAmount))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        background.add(pnlPrintArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        bottomLayer.setBackground(new java.awt.Color(172, 204, 234));
        bottomLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrint.setBackground(new java.awt.Color(154, 173, 200));
        btnPrint.setMaximumSize(new java.awt.Dimension(138, 31));
        btnPrint.setMinimumSize(new java.awt.Dimension(138, 31));
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrintMouseEntered(evt);
            }
        });

        txtPrintbtn.setFont(new java.awt.Font("Inter SemiBold", 0, 15)); // NOI18N
        txtPrintbtn.setForeground(new java.awt.Color(193, 199, 215));
        txtPrintbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPrintbtn.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtPrintbtn.text")); // NOI18N
        txtPrintbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrintbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPrintbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPrintbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnPrintLayout = new javax.swing.GroupLayout(btnPrint);
        btnPrint.setLayout(btnPrintLayout);
        btnPrintLayout.setHorizontalGroup(
            btnPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPrintbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        btnPrintLayout.setVerticalGroup(
            btnPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPrintbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        bottomLayer.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        btnGenerate.setBackground(new java.awt.Color(63, 115, 193));
        btnGenerate.setMaximumSize(new java.awt.Dimension(122, 31));
        btnGenerate.setMinimumSize(new java.awt.Dimension(122, 31));
        btnGenerate.setPreferredSize(new java.awt.Dimension(122, 31));

        txtGeneratebtn.setFont(new java.awt.Font("Inter SemiBold", 0, 15)); // NOI18N
        txtGeneratebtn.setForeground(new java.awt.Color(255, 255, 255));
        txtGeneratebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGeneratebtn.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtGeneratebtn.text")); // NOI18N
        txtGeneratebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtGeneratebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGeneratebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtGeneratebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtGeneratebtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnGenerateLayout = new javax.swing.GroupLayout(btnGenerate);
        btnGenerate.setLayout(btnGenerateLayout);
        btnGenerateLayout.setHorizontalGroup(
            btnGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGeneratebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnGenerateLayout.setVerticalGroup(
            btnGenerateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGeneratebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        bottomLayer.add(btnGenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 110, -1));

        btnReturn.setBackground(new java.awt.Color(63, 115, 193));
        btnReturn.setMaximumSize(new java.awt.Dimension(138, 31));
        btnReturn.setMinimumSize(new java.awt.Dimension(138, 31));
        btnReturn.setPreferredSize(new java.awt.Dimension(138, 31));

        txtReturnbtn.setFont(new java.awt.Font("Inter SemiBold", 0, 15)); // NOI18N
        txtReturnbtn.setForeground(new java.awt.Color(255, 255, 255));
        txtReturnbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtReturnbtn.setText(org.openide.util.NbBundle.getMessage(FrmGenerateBill.class, "FrmGenerateBill.txtReturnbtn.text")); // NOI18N
        txtReturnbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtReturnbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReturnbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtReturnbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtReturnbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnReturnLayout = new javax.swing.GroupLayout(btnReturn);
        btnReturn.setLayout(btnReturnLayout);
        btnReturnLayout.setHorizontalGroup(
            btnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnReturnLayout.createSequentialGroup()
                .addComponent(txtReturnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        btnReturnLayout.setVerticalGroup(
            btnReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtReturnbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        bottomLayer.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, -1));

        background.add(bottomLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 470, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtReturnbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReturnbtnMouseEntered
        btnReturn.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtReturnbtnMouseEntered

    private void txtReturnbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReturnbtnMouseExited
        btnReturn.setBackground(btnDefaultColor);
    }//GEN-LAST:event_txtReturnbtnMouseExited

    private void txtGeneratebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGeneratebtnMouseEntered
        btnGenerate.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtGeneratebtnMouseEntered

    private void txtGeneratebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGeneratebtnMouseExited
        btnGenerate.setBackground(btnDefaultColor);
    }//GEN-LAST:event_txtGeneratebtnMouseExited

    private void txtReturnbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReturnbtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtReturnbtnMouseClicked

    private void txtGeneratebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGeneratebtnMouseClicked
        int idSelected = getSelectedId();
        bill = generateBillFromId(idSelected);
        
        showBillInScreen();
        addBillInDB();
        
        enablePrintButton();
    }//GEN-LAST:event_txtGeneratebtnMouseClicked

    private void btnPrintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseEntered
        if(canPrint){
            btnPrint.setBackground(btnHoverColor);
        }
    }//GEN-LAST:event_btnPrintMouseEntered

    private void txtPrintbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrintbtnMouseEntered
        if(canPrint){
            btnPrint.setBackground(btnHoverColor);
        }
    }//GEN-LAST:event_txtPrintbtnMouseEntered

    private void txtPrintbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrintbtnMouseExited
        if(canPrint){
            btnPrint.setBackground(btnDefaultColor);
        }
    }//GEN-LAST:event_txtPrintbtnMouseExited

    private void txtPrintbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrintbtnMouseClicked
        if(canPrint){
            printBill();
        }
    }//GEN-LAST:event_txtPrintbtnMouseClicked

    private void printBill(){
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");
        
        job.setPrintable(new Printable(){
            public int print(Graphics pg,PageFormat pf, int pageNum){
                pf.setOrientation(PageFormat.LANDSCAPE);
                if(pageNum>0){
                   return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.24,0.24);
                
                pnlPrintArea.paint(g2);

                return Printable.PAGE_EXISTS;
            }
        });
        boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){}
        }
    }
    
    private void enablePrintButton(){
        canPrint=true;
        btnPrint.setBackground(btnDefaultColor);
        txtPrintbtn.setForeground(Color.white);
        txtPrintbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    private void addBillInDB(){
        BillController billc = new BillController();
        boolean isInDB = billc.decectIdinDB(bill.getId());
        
        if(isInDB){
            //billc.update(bill);
        }else{
            billc.create(bill);
        }
        
    }
    
    private void showBillInScreen(){
        txtArtistCost.setText(String.valueOf(bill.getArtistCost()));
        txtVenueCost.setText(String.valueOf(bill.getVenueCost()));
        txtStaffCost.setText(String.valueOf(bill.getStaffCost()));
        txtEquipmentCost.setText(String.valueOf(bill.getEquipmentCost()));
        txtGeneralExpensesCost.setText(String.valueOf(bill.getGeneralExpensesCost()));
        txtPenaltyFeesCost.setText(String.valueOf(bill.getPenaltyFeesCost()));      
        txtTotalAmount.setText(String.valueOf(bill.getTotalAmount()));
    }
    
    private Bill generateBillFromId(int searchId){
        EventController evtc = new EventController();
        event = evtc.findOne(searchId);
        
        return evtc.calculateEventCost(event);
    }
    
    private int getSelectedId(){
        int relatedId;
        
        String index = String.valueOf(cmbIdEvent.getSelectedItem());
        
        relatedId = Integer.parseInt(Character.toString(index.charAt(0)));
        return relatedId;
        
    }
    
    private void loadEventIds(){
        DefaultComboBoxModel<String> listModel = new DefaultComboBoxModel();
        EventController evtc = new EventController();
        ArrayList<Event> availableEvents = evtc.readTable();
        
        String display;
        
        for(Event currentEvent:availableEvents ){
            display = Integer.toString(currentEvent.getId());
            listModel.addElement(display);
        }
        cmbIdEvent.setModel(listModel);
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
            java.util.logging.Logger.getLogger(FrmGenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGenerateBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGenerateBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel bottomLayer;
    private javax.swing.JPanel btnGenerate;
    private javax.swing.JPanel btnPrint;
    private javax.swing.JPanel btnReturn;
    private javax.swing.JComboBox<String> cmbIdEvent;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlPrintArea;
    private javax.swing.JLabel txtArtistCost;
    private javax.swing.JLabel txtArtistCost1;
    private javax.swing.JLabel txtEquipmentCost;
    private javax.swing.JLabel txtEquipmentCost1;
    private javax.swing.JLabel txtGeneralExpensesCost;
    private javax.swing.JLabel txtGeneralExpensesCost1;
    private javax.swing.JLabel txtGeneratebtn;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtPenaltyFeesCost;
    private javax.swing.JLabel txtPenaltyFeesCost1;
    private javax.swing.JLabel txtPrintbtn;
    private javax.swing.JLabel txtReturnbtn;
    private javax.swing.JLabel txtStaffCost;
    private javax.swing.JLabel txtStaffCost1;
    private javax.swing.JLabel txtTitle;
    private javax.swing.JLabel txtTotalAmount;
    private javax.swing.JLabel txtTotalAmount1;
    private javax.swing.JLabel txtVenueCost;
    private javax.swing.JLabel txtVenueCost1;
    // End of variables declaration//GEN-END:variables
}