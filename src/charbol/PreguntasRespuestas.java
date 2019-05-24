/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charbol;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Raul
 */
public class PreguntasRespuestas extends javax.swing.JFrame {
    private static Arbol obj = new Arbol();
    private static ArbolDir objDir = new ArbolDir();

    private static String posibleQuestion ="";
    private static String posibleAnswer = "";
    
    /**
     * Creates new form PreguntasRespuestas
     */
    public PreguntasRespuestas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupJsons = new javax.swing.ButtonGroup();
        txtQuestion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAnswer = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnBackToMenu = new javax.swing.JButton();
        jRadioButtonMenu = new javax.swing.JRadioButton();
        jRadioButtonNecesitoDoctor = new javax.swing.JRadioButton();
        jRadioButtonAtencionMedica = new javax.swing.JRadioButton();
        jRadioButtonCentroDiagnostico = new javax.swing.JRadioButton();
        jRadioButtonSeguroIndividual = new javax.swing.JRadioButton();
        jRadioButtonCotizar = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pregunta");

        jLabel2.setText("Respuesta");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnBackToMenu.setText("Back to Menu");
        btnBackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToMenuActionPerformed(evt);
            }
        });

        buttonGroupJsons.add(jRadioButtonMenu);
        jRadioButtonMenu.setText("Menu");

        buttonGroupJsons.add(jRadioButtonNecesitoDoctor);
        jRadioButtonNecesitoDoctor.setText("Necesito Un Doctor");

        buttonGroupJsons.add(jRadioButtonAtencionMedica);
        jRadioButtonAtencionMedica.setText("Atencion Medica");

        buttonGroupJsons.add(jRadioButtonCentroDiagnostico);
        jRadioButtonCentroDiagnostico.setText("Centro de Diagnostico");

        jRadioButtonSeguroIndividual.setText("Seguro Individual");

        buttonGroupJsons.add(jRadioButtonCotizar);
        jRadioButtonCotizar.setText("Cotizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonCotizar)
                        .addGap(71, 71, 71)
                        .addComponent(btnIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackToMenu))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonMenu)
                            .addComponent(jRadioButtonNecesitoDoctor)
                            .addComponent(jRadioButtonAtencionMedica)
                            .addComponent(jRadioButtonCentroDiagnostico)
                            .addComponent(jRadioButtonSeguroIndividual))
                        .addComponent(txtAnswer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonNecesitoDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonAtencionMedica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonCentroDiagnostico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonSeguroIndividual)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIngresar)
                            .addComponent(btnBackToMenu))
                        .addGap(48, 48, 48))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonCotizar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Método para ingresar preguntas con posibles respuestas
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        posibleQuestion = txtQuestion.getText();
        posibleAnswer = txtAnswer.getText();
        
        if(jRadioButtonMenu.isSelected()){
            String dirMenu = "Menu.txt";
            escribirArchivo(dirMenu,posibleQuestion,posibleAnswer);
        }
        
        if(jRadioButtonNecesitoDoctor.isSelected()){
            String dirNecesitoDoctor = "NecesitoDoctor.txt";
            escribirArchivo(dirNecesitoDoctor,posibleQuestion,posibleAnswer);
        }
        
        if(jRadioButtonAtencionMedica.isSelected()){
            String dirAtencionMedica = "AtencionMedica.txt";
            escribirArchivo(dirAtencionMedica,posibleQuestion,posibleAnswer);
        }
        
        if(jRadioButtonCentroDiagnostico.isSelected()){
            String dirCentroDiagnostico = "CentroDiagnostico.txt";
            escribirArchivo(dirCentroDiagnostico,posibleQuestion,posibleAnswer);
        }
        
        if(jRadioButtonSeguroIndividual.isSelected()){
            String dirSeguroIndividual = "SeguroIndividual.txt";
            escribirArchivo(dirSeguroIndividual,posibleQuestion,posibleAnswer);
        }
        
        if(jRadioButtonCotizar.isSelected()){
            String dirCotizar = "Cotizar.txt";
            escribirArchivo(dirCotizar,posibleQuestion,posibleAnswer);
        }
        
       
        
        txtQuestion.setText("");
        txtAnswer.setText("");
        txtQuestion.requestFocus();
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnBackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu irMenu = new Menu();
        irMenu.setVisible(true);
        irMenu.pack();
    }//GEN-LAST:event_btnBackToMenuActionPerformed

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
            java.util.logging.Logger.getLogger(PreguntasRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreguntasRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreguntasRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreguntasRespuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreguntasRespuestas().setVisible(true);
            }
        });
    }
    //Metodo testing no usar mas
    public static void recorridoInOrden(){
        if(!obj.verificarVacio()){
            obj.inOrden(obj.getRaiz());
        }else{
            JOptionPane.showMessageDialog(null, "El arbol esta vacío");
        }
    }
    //Metodo testing no usar mas
    public static void recorridoPreOrden(){
        if(!objDir.verificarVacio()){
            objDir.preOrden(objDir.getRaiz());
        }else{
            JOptionPane.showMessageDialog(null, "El arbol esta vacío!");
        }
    }
    //Metodo Indispensable
    public static void escribirArchivo(String dir,String quest,String answ){
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        
        archivo = new File(dir);//tiene que tener .txt
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                //Escritura en el archivo
                linea.println(quest);
                linea.println(answ);
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(PreguntasRespuestas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                //Escritura en el archivo
                linea.println(quest);
                linea.println(answ);
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(PreguntasRespuestas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToMenu;
    private javax.swing.JButton btnIngresar;
    private javax.swing.ButtonGroup buttonGroupJsons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButtonAtencionMedica;
    private javax.swing.JRadioButton jRadioButtonCentroDiagnostico;
    private javax.swing.JRadioButton jRadioButtonCotizar;
    private javax.swing.JRadioButton jRadioButtonMenu;
    private javax.swing.JRadioButton jRadioButtonNecesitoDoctor;
    private javax.swing.JRadioButton jRadioButtonSeguroIndividual;
    private javax.swing.JTextField txtAnswer;
    private javax.swing.JTextField txtQuestion;
    // End of variables declaration//GEN-END:variables
}
