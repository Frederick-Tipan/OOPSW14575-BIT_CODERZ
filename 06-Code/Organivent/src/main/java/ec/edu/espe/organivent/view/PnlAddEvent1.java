package ec.edu.espe.organivent.view;

import ec.edu.espe.organivent.controller.ArtistController;
import ec.edu.espe.organivent.controller.EventController;
import ec.edu.espe.organivent.controller.EventPlaceController;
import ec.edu.espe.organivent.model.Artist;
import ec.edu.espe.organivent.model.EventPlace;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Frederick Tipan, Gabriel Vivanco, Jefferson Yepez - Bit Coderz - DCCO ESPE
 */
public class PnlAddEvent1 extends javax.swing.JPanel {
    private Color btnDefaultColor = new Color(63,115,193);
    private Color btnHoverColor = new Color(48,88,149);

    /**
     * Creates new form PnlAddEvent
     */
    public PnlAddEvent1() {
        initComponents();
        asignNewId();
        loadArtists();
        loadEventPlaces();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        txtTitle = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        txtFechaInicio = new javax.swing.JLabel();
        txtFechaFin = new javax.swing.JLabel();
        txtArtista = new javax.swing.JLabel();
        txtLugar = new javax.swing.JLabel();
        btnNextPage = new javax.swing.JPanel();
        txtNextPagebtn = new javax.swing.JLabel();
        dtcEndTime = new com.toedter.calendar.JDateChooser();
        dtcStartTime = new com.toedter.calendar.JDateChooser();
        cmbArtist = new javax.swing.JComboBox<>();
        cmbEventPlace = new javax.swing.JComboBox<>();
        spnStartTime = new javax.swing.JSpinner();
        spnEndTime = new javax.swing.JSpinner();
        txtIdValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitle.setFont(new java.awt.Font("Inter SemiBold", 0, 20)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(32, 108, 141));
        txtTitle.setText("Crear Evento");
        add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 14, -1, -1));

        txtId.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(135, 132, 132));
        txtId.setText("Id:");
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 63, -1, -1));

        txtFechaInicio.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtFechaInicio.setForeground(new java.awt.Color(135, 132, 132));
        txtFechaInicio.setText("Fecha de inicio:");
        add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 105, -1, -1));

        txtFechaFin.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtFechaFin.setForeground(new java.awt.Color(135, 132, 132));
        txtFechaFin.setText("Fecha de Fin:");
        add(txtFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 163, -1, -1));

        txtArtista.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtArtista.setForeground(new java.awt.Color(135, 132, 132));
        txtArtista.setText("Artista:");
        add(txtArtista, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 218, -1, -1));

        txtLugar.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtLugar.setForeground(new java.awt.Color(135, 132, 132));
        txtLugar.setText("Lugar del evento:");
        add(txtLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 276, -1, -1));

        btnNextPage.setBackground(new java.awt.Color(63, 115, 193));
        btnNextPage.setPreferredSize(new java.awt.Dimension(142, 27));

        txtNextPagebtn.setFont(new java.awt.Font("Inter SemiBold", 0, 15)); // NOI18N
        txtNextPagebtn.setForeground(new java.awt.Color(255, 255, 255));
        txtNextPagebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNextPagebtn.setText("Siguiente");
        txtNextPagebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNextPagebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNextPagebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNextPagebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNextPagebtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnNextPageLayout = new javax.swing.GroupLayout(btnNextPage);
        btnNextPage.setLayout(btnNextPageLayout);
        btnNextPageLayout.setHorizontalGroup(
            btnNextPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNextPagebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        btnNextPageLayout.setVerticalGroup(
            btnNextPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtNextPagebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        add(btnNextPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 325, -1, -1));

        dtcEndTime.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        add(dtcEndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 163, 171, -1));

        dtcStartTime.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        add(dtcStartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 105, 171, -1));

        cmbArtist.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmbArtist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 215, 171, -1));

        cmbEventPlace.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        cmbEventPlace.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbEventPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 273, 169, -1));

        spnStartTime.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        spnStartTime.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add(spnStartTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 105, -1, -1));

        spnEndTime.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        add(spnEndTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 163, -1, -1));

        txtIdValue.setFont(new java.awt.Font("Inter", 0, 14)); // NOI18N
        txtIdValue.setText("0");
        add(txtIdValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 63, 50, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNextPagebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNextPagebtnMouseEntered
        btnNextPage.setBackground(btnHoverColor);
    }//GEN-LAST:event_txtNextPagebtnMouseEntered

    private void txtNextPagebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNextPagebtnMouseExited
        btnNextPage.setBackground(btnDefaultColor);
    }//GEN-LAST:event_txtNextPagebtnMouseExited

    private void txtNextPagebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNextPagebtnMouseClicked
        PnlAddEvent2 aevPnl2 = new PnlAddEvent2();
        
        aevPnl2.setSize(390, 375);
        aevPnl2.setLocation(0, 0);
        
        this.removeAll();
        this.add(aevPnl2, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
        
    }//GEN-LAST:event_txtNextPagebtnMouseClicked

     private void asignNewId(){
        EventController evtc = new EventController();
        int asignedId = evtc.asignNewId();
        String displayNewId = Integer.toString(asignedId);
        
        txtIdValue.setText(displayNewId);
    }
     
     private void loadArtists(){
         DefaultComboBoxModel<String> listModel = new DefaultComboBoxModel();
         ArtistController artsc = new ArtistController();
         
         ArrayList<Artist> availableArtists = artsc.read();
         
         String display;
         
         for(Artist currentArtist:availableArtists){
            display = currentArtist.getId() + " " + currentArtist.getName();
            listModel.addElement(display);
         }
         
         cmbArtist.setModel(listModel);
     }
     
     private void loadEventPlaces(){
         DefaultComboBoxModel<String> listModel = new DefaultComboBoxModel();
         EventPlaceController evtplc = new EventPlaceController();
         
         ArrayList<EventPlace> availablePlaces = evtplc.read();
         
         for(EventPlace currentPlace:availablePlaces){
            listModel.addElement(currentPlace.getName());
         }
         
         cmbEventPlace.setModel(listModel);
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnNextPage;
    private javax.swing.JComboBox<String> cmbArtist;
    private javax.swing.JComboBox<String> cmbEventPlace;
    private com.toedter.calendar.JDateChooser dtcEndTime;
    private com.toedter.calendar.JDateChooser dtcStartTime;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JSpinner spnEndTime;
    private javax.swing.JSpinner spnStartTime;
    private javax.swing.JLabel txtArtista;
    private javax.swing.JLabel txtFechaFin;
    private javax.swing.JLabel txtFechaInicio;
    private javax.swing.JLabel txtId;
    private javax.swing.JLabel txtIdValue;
    private javax.swing.JLabel txtLugar;
    private javax.swing.JLabel txtNextPagebtn;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
