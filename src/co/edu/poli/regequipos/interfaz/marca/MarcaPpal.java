/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package co.edu.poli.regequipos.interfaz.marca;
import co.edu.poli.regequipos.entidades.Marca;
import co.edu.poli.regequipos.entidades.TipoEquipo;
import co.edu.poli.regequipos.model.MarcaModel;
import co.edu.polo.regequipos.dao.MarcaDao;
import co.edu.polo.regequipos.dao.TipoEquipoDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Duban Ruiz
 */ 
public class MarcaPpal extends javax.swing.JFrame {

    private MarcaDao marcaDao;
    private TipoEquipoDao tipoEquipoDao;
    
    /**
     * Creates new form MarcaPpal
     */
    public MarcaPpal() {
        
       try {
            marcaDao = new MarcaDao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
        llenarListaTipoEquipos();
    }
        
    public void refrescarTabla() {
        try {
            List<Marca> lstMarca = marcaDao.consultaMarca(null);
            MarcaModel model = new MarcaModel(lstMarca);
            this.tblMarca.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(),
                    " Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void llenarListaTipoEquipos(){
        List<TipoEquipo> lstTipoEquipos = new ArrayList<>();
        try{
            this.cmb_tipo_equipo.addItem("0 - Seleccione");
            tipoEquipoDao = new TipoEquipoDao();
            lstTipoEquipos = tipoEquipoDao.consultaTipoEquipo(null);
            if(lstTipoEquipos!=null && lstTipoEquipos.size()>0){
                for(TipoEquipo t : lstTipoEquipos){
                    this.cmb_tipo_equipo.addItem(t.getIdTipoEquipo()+" - "+t.getNomTipoEquipo());
                }                    
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
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
        lblTitulo = new javax.swing.JLabel();
        lblNomMarca = new javax.swing.JLabel();
        lblIdTipoEquipo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMarca = new javax.swing.JTable();
        btn_M_marca = new javax.swing.JButton();
        btn_E_marca = new javax.swing.JButton();
        txtNomMarca = new javax.swing.JTextField();
        cmb_tipo_equipo = new javax.swing.JComboBox<>();
        btn_N_marca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTitulo.setText("Gestión marcas");

        lblNomMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNomMarca.setText("Nombre marca:");

        lblIdTipoEquipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblIdTipoEquipo.setText("Tipo de equipo:");

        btnBuscar.setBackground(new java.awt.Color(26, 84, 147));
        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMarca);

        btn_M_marca.setBackground(new java.awt.Color(26, 84, 147));
        btn_M_marca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_M_marca.setForeground(new java.awt.Color(255, 255, 255));
        btn_M_marca.setText("Modificar marca");
        btn_M_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_M_marcaActionPerformed(evt);
            }
        });

        btn_E_marca.setBackground(new java.awt.Color(26, 84, 147));
        btn_E_marca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_E_marca.setForeground(new java.awt.Color(255, 255, 255));
        btn_E_marca.setText("Eliminar marca");
        btn_E_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_E_marcaActionPerformed(evt);
            }
        });

        txtNomMarca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cmb_tipo_equipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        btn_N_marca.setBackground(new java.awt.Color(26, 84, 147));
        btn_N_marca.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_N_marca.setForeground(new java.awt.Color(255, 255, 255));
        btn_N_marca.setText("Nueva marca");
        btn_N_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_N_marcaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_N_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_M_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btn_E_marca))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblIdTipoEquipo)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_tipo_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(lblNomMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btnBuscar)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_tipo_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdTipoEquipo))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_M_marca)
                    .addComponent(btn_E_marca)
                    .addComponent(btn_N_marca))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_N_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_N_marcaActionPerformed
        GestionMarca gm = new GestionMarca(marcaDao, this, null, false);
        gm.setVisible(true);
        
    }//GEN-LAST:event_btn_N_marcaActionPerformed

    private void btn_M_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_M_marcaActionPerformed
       
        int row = this.tblMarca.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar un parametro", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    /**    Marca tmpMarca = (Marca) this.tblMarca.getValueAt(row, MarcaModel.OBJECT_COL);
        GestionMarca gp = new GestionMarca(marcaDao, this, tmpMarca, true);
        gp.setVisible(true);
        
       **/ 
    }//GEN-LAST:event_btn_M_marcaActionPerformed

    private void btn_E_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_E_marcaActionPerformed
        
        try {
            int row = this.tblMarca.getSelectedRow();
            if (row < 0) {
                JOptionPane.showMessageDialog(this, "Debe Seleccionar un parametro", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }int rta = JOptionPane.showConfirmDialog(this, "¿Está seguro de ELIMINAR este parametro?",
                    "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(rta!= JOptionPane.YES_OPTION){
                return;
            }
            Marca tmpMarca = (Marca) this.tblMarca.getValueAt(row, MarcaModel.OBJECT_COL);
            marcaDao.eliminarMarca(tmpMarca);
            refrescarTabla();
            JOptionPane.showMessageDialog(this, "Marca Eliminado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
}       catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error eliminando Datos: " + e.getMessage(),
                                          "Error en proceso", JOptionPane.ERROR_MESSAGE);
        }    
            
    }//GEN-LAST:event_btn_E_marcaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nomMarca = this.txtNomMarca.getText();
        String valorParam = this.cmb_tipo_equipo.getSelectedItem().toString();
        
        List<Marca> lstMarcas = null;
        try {
            lstMarcas = marcaDao.consultaMarca(nomMarca != null ? nomMarca.toUpperCase() : nomMarca);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error consultando Datos: " + e.getMessage(),
                                          "Error en consulta", JOptionPane.ERROR_MESSAGE);
        }
        MarcaModel model = new MarcaModel(lstMarcas);
        this.tblMarca.setModel(model);
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(MarcaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarcaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarcaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarcaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcaPpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btn_E_marca;
    private javax.swing.JButton btn_M_marca;
    private javax.swing.JButton btn_N_marca;
    private javax.swing.JComboBox<String> cmb_tipo_equipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdTipoEquipo;
    private javax.swing.JLabel lblNomMarca;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblMarca;
    private javax.swing.JTextField txtNomMarca;
    // End of variables declaration//GEN-END:variables
}
