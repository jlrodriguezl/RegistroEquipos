/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.poli.regequipos.interfaz.persona;

import co.edu.poli.regequipos.entidades.Persona;
import co.edu.poli.regequipos.model.PersonaModel;
import co.edu.polo.regequipos.dao.PersonaDao;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PersonaPpal extends javax.swing.JFrame {
    /**
     * Crear variable para los metodos Dao de persona
     **/
    private PersonaDao personaDao;

    /**
     * Creates new form PersonaPpal
     */
    public PersonaPpal() {
        try {
            personaDao = new PersonaDao();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        initComponents();
    }
    public void refrescarTabla() {
        try {
            List<Persona> lstPersona = personaDao.consultaPersona(null, null, null);
            PersonaModel model = new PersonaModel(lstPersona);
            this.tbl_personas.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(),
                    " Error", JOptionPane.ERROR_MESSAGE);
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

        jTextField3 = new javax.swing.JTextField();
        pnl_Persona = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_iden = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        txt_iden = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_personas = new javax.swing.JTable();
        btn_buscar = new javax.swing.JButton();
        btn_nueva_persona = new javax.swing.JButton();
        btn_mod_persona = new javax.swing.JButton();
        btn_eliminar_persona = new javax.swing.JButton();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("PERSONAS GENERAL");

        lbl_iden.setText("Identificacion:");

        lbl_nombres.setText("Nombres:");

        lbl_apellidos.setText("Apellidos:");

        tbl_personas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_personas);

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_nueva_persona.setText("Nueva Persona");
        btn_nueva_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueva_personaActionPerformed(evt);
            }
        });

        btn_mod_persona.setText("Modificar Persona");
        btn_mod_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mod_personaActionPerformed(evt);
            }
        });

        btn_eliminar_persona.setText("Eliminar Persona");
        btn_eliminar_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_personaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_PersonaLayout = new javax.swing.GroupLayout(pnl_Persona);
        pnl_Persona.setLayout(pnl_PersonaLayout);
        pnl_PersonaLayout.setHorizontalGroup(
            pnl_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PersonaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnl_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_iden)
                    .addComponent(lbl_apellidos)
                    .addComponent(lbl_nombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nombres)
                    .addComponent(txt_iden)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addComponent(btn_buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_PersonaLayout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(pnl_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_PersonaLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_nueva_persona)
                        .addGap(27, 27, 27)
                        .addComponent(btn_mod_persona)
                        .addGap(36, 36, 36)
                        .addComponent(btn_eliminar_persona)))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_PersonaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(185, 185, 185))
        );
        pnl_PersonaLayout.setVerticalGroup(
            pnl_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_PersonaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnl_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_iden)
                    .addComponent(txt_iden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(18, 18, 18)
                .addGroup(pnl_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(pnl_PersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_nueva_persona)
                    .addComponent(btn_mod_persona)
                    .addComponent(btn_eliminar_persona))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_Persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_Persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminar_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_personaActionPerformed
        try {
            int row = this.tbl_personas.getSelectedRow();
            if (row < 0) {
                JOptionPane.showMessageDialog(this, "Debe Seleccionar una Persona", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int rta = JOptionPane.showConfirmDialog(this, "¿Está seguro de ELIMINAR esta Persona?",
                    "Confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(rta!= JOptionPane.YES_OPTION){
                return;
            }
            Persona tmpPersona = (Persona) this.tbl_personas.getValueAt(row, PersonaModel.OBJECT_COL);
            personaDao.eliminarPersona(tmpPersona);
            refrescarTabla();
            JOptionPane.showMessageDialog(this, "Persona Eliminado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error eliminando Datos: " + e.getMessage(),
                                          "Error en proceso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_eliminar_personaActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        Long identificacion;        
        String apellidos = this.txt_apellidos.getText();
        String nombres = this.txt_nombres.getText();
        List<Persona> lstPersona = null;
        
        try{
            if(txt_iden!=null){
                identificacion=Long.parseLong(this.txt_iden.getText());
            }else{
                identificacion=0L;
            }
            lstPersona = personaDao.consultaPersona(identificacion != null ? identificacion : identificacion,
                    apellidos != null ? apellidos.toUpperCase() : apellidos,
                    nombres != null ? nombres.toUpperCase() : nombres);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error consultando Datos: " + e.getMessage(),
                                          "Error en consulta", JOptionPane.ERROR_MESSAGE);
        }
        PersonaModel model= new PersonaModel(lstPersona);
        tbl_personas.setModel(model);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_mod_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mod_personaActionPerformed
        int row = this.tbl_personas.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Debe Seleccionar una Persona", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        /*Convierto el objeto en un parametro, mediante el cast*/
        try{
        Persona tmpPersona = (Persona) this.tbl_personas.getValueAt(row, PersonaModel.OBJECT_COL);
        GestionPersonas gp = new GestionPersonas(personaDao, this, tmpPersona, true);
        gp.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error consultando Datos: " + e.getMessage(),
                                          "Error en consulta", JOptionPane.ERROR_MESSAGE);        }
    }//GEN-LAST:event_btn_mod_personaActionPerformed

    private void btn_nueva_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueva_personaActionPerformed
        try{
        GestionPersonas gp = new GestionPersonas(personaDao, this, null, false);
        gp.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Error consultando Datos: " + e.getMessage(),
                                          "Error en consulta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_nueva_personaActionPerformed

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
            java.util.logging.Logger.getLogger(PersonaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonaPpal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonaPpal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar_persona;
    private javax.swing.JButton btn_mod_persona;
    private javax.swing.JButton btn_nueva_persona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_iden;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JPanel pnl_Persona;
    private javax.swing.JTable tbl_personas;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_iden;
    private javax.swing.JTextField txt_nombres;
    // End of variables declaration//GEN-END:variables
}
