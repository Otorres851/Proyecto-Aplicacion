/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author FAMILIA
 */
public class panel extends javax.swing.JFrame {
String Ruta = "d:\\datos.txt";
    /**
     * Creates new form panel
     */
    public panel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        salir2 = new javax.swing.JButton();
        foto = new javax.swing.JButton();
        genero = new javax.swing.JComboBox();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        edad = new javax.swing.JComboBox();
        juguetes = new javax.swing.JCheckBox();
        pastel = new javax.swing.JCheckBox();
        regalo = new javax.swing.JCheckBox();
        dulce = new javax.swing.JCheckBox();
        comida = new javax.swing.JCheckBox();
        globo = new javax.swing.JCheckBox();
        piñata = new javax.swing.JCheckBox();
        videojuegos = new javax.swing.JCheckBox();
        deporte = new javax.swing.JCheckBox();
        television = new javax.swing.JCheckBox();
        fotogenero = new javax.swing.JLabel();
        foticos = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        fondo2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 90, 20));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setText("Genero");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 90, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Edad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Fecha de Nacimiento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 210, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 153));
        jLabel6.setText("Gustos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, -1));

        salir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/SALIR_1.png"))); // NOI18N
        salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir2ActionPerformed(evt);
            }
        });
        getContentPane().add(salir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 120, 60));

        foto.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        foto.setForeground(new java.awt.Color(204, 0, 204));
        foto.setText("Cargar Foto");
        foto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 0)));
        foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoActionPerformed(evt);
            }
        });
        getContentPane().add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 160, 30));

        genero.setBackground(new java.awt.Color(102, 102, 0));
        genero.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        genero.setForeground(new java.awt.Color(0, 51, 51));
        genero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        genero.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));
        genero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                generoItemStateChanged(evt);
            }
        });
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });
        getContentPane().add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 160, 30));

        nombre.setBackground(new java.awt.Color(0, 0, 51));
        nombre.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 0)));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 320, 30));

        apellido.setBackground(new java.awt.Color(0, 0, 51));
        apellido.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        apellido.setForeground(new java.awt.Color(255, 255, 255));
        apellido.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 0)));
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 320, 30));

        edad.setBackground(new java.awt.Color(153, 0, 255));
        edad.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        edad.setMaximumRowCount(18);
        edad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" }));
        edad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255)));
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 160, -1));

        juguetes.setBackground(new java.awt.Color(0, 204, 204));
        juguetes.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        juguetes.setText("Juguetes");
        juguetes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        getContentPane().add(juguetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 110, 30));

        pastel.setBackground(new java.awt.Color(255, 102, 102));
        pastel.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        pastel.setText("Pastel");
        getContentPane().add(pastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 110, 30));

        regalo.setBackground(new java.awt.Color(255, 255, 51));
        regalo.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        regalo.setText("Regalos");
        getContentPane().add(regalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 110, 30));

        dulce.setBackground(new java.awt.Color(102, 102, 255));
        dulce.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        dulce.setText("Dulces");
        dulce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dulceActionPerformed(evt);
            }
        });
        getContentPane().add(dulce, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 110, 30));

        comida.setBackground(new java.awt.Color(255, 153, 204));
        comida.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        comida.setText("Comida");
        getContentPane().add(comida, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 110, 30));

        globo.setBackground(new java.awt.Color(153, 255, 153));
        globo.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        globo.setText("Globos");
        getContentPane().add(globo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 130, 30));

        piñata.setBackground(new java.awt.Color(0, 153, 153));
        piñata.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        piñata.setText("Piñatas");
        getContentPane().add(piñata, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 130, 30));

        videojuegos.setBackground(new java.awt.Color(153, 0, 153));
        videojuegos.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        videojuegos.setText("Videojuegos");
        getContentPane().add(videojuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 130, 30));

        deporte.setBackground(new java.awt.Color(0, 153, 0));
        deporte.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        deporte.setText("Deportes");
        getContentPane().add(deporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 130, 30));

        television.setBackground(new java.awt.Color(204, 204, 0));
        television.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        television.setText("Television");
        getContentPane().add(television, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 130, 30));

        fotogenero.setBackground(new java.awt.Color(0, 0, 51));
        fotogenero.setToolTipText("");
        fotogenero.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(fotogenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 190));

        foticos.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        foticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/happy-emoticon-with-one-tooth_318-58501_1.png"))); // NOI18N
        foticos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        getContentPane().add(foticos, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 160, 160));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/30324826-Icono-de-Ba-os-y-Pictograma-Hombre-Mujer-sesi-n-en-el-muro-de-cemento-de-dise-o-textura-de-fondo-Foto-de-archivo.jpg"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "PADRES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(204, 51, 0))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 140, 100));

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abstract-blue-branding.jpg"))); // NOI18N
        fondo2.setMaximumSize(new java.awt.Dimension(1050, 800));
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 490));

        jButton3.setText("guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        jButton1.setText("buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salir2ActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoActionPerformed

    private void dulceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dulceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dulceActionPerformed

    private void generoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_generoItemStateChanged
        // TODO add your handling code here:
              
        int posicion;
        String lugarImagen;
        URL url = null;
        posicion=genero.getSelectedIndex();
        switch(posicion){
            case 0:
                lugarImagen ="/imagenes/200w.gif";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen = new ImageIcon(url);
                fotogenero.setIcon(imagen);
                            
                break;
            
        }
        switch(posicion){
            case 1:
                lugarImagen ="/imagenes/niño2.png";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen = new ImageIcon(url);
                fotogenero.setIcon(imagen);
                            
                break;
            
        }
        switch(posicion){
            case 2:
                lugarImagen ="/imagenes/niña2.png";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen = new ImageIcon(url);
                fotogenero.setIcon(imagen);
                            
                break;
            
        }
        
    }//GEN-LAST:event_generoItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         panel5 juan4  = new panel5();
        juan4.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    /// para cargar imagen 
    File fichero;
    private void fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoActionPerformed
        // TODO add your handling code here: cargar fotos,,, no olvidar
        
     int resultado;
     cargarfotos ventan = new cargarfotos();
     FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG ","jpg","png");
     
        
        ventan.cargar.setFileFilter(filtro);
        resultado = ventan.cargar.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == resultado){
            
            fichero = ventan.cargar.getSelectedFile();
            
            try {
                ImageIcon icon = new ImageIcon(fichero.toString());
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(foticos.getWidth(),foticos.getHeight(), Image.SCALE_DEFAULT));
                foticos.setText(null);
                foticos.setIcon(icono);
                
            }catch(Exception ex){
            
                JOptionPane.showMessageDialog(null," Upss,, error abriendo la imagen seleccionada" + ex);
        }
        } 
        
    }//GEN-LAST:event_fotoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String Ruta = "d:\\datos.txt";
        FileWriter fichero = null;
        try {
            
                        
                    fichero = new FileWriter(Ruta,true);
                    
                    fichero.write(nombre.getText() + ",");
                    fichero.write(apellido.getText() + ",");
                    
                  
                    fichero.write(edad.getSelectedItem()+ ",");
                    fichero.write(genero.getSelectedItem()+",");
                    
                    
                    if ( juguetes.isSelected() )
                       fichero.write("juguete,");
                    
                    if ( pastel.isSelected() )
                       fichero.write("pastel,");
                    
                    if ( regalo.isSelected() )
                       fichero.write("regalo,");

                    if ( dulce.isSelected() )
                       fichero.write("dulce,");
                    
                   if ( globo.isSelected() )
                       fichero.write("globo,");
                   if ( piñata.isSelected() )
                       fichero.write("piñata,");
                   if ( television.isSelected() )
                       fichero.write("television,");
                   if ( videojuegos.isSelected() )
                       fichero.write("videojuegos,");
                   if ( deporte.isSelected() )
                       fichero.write("deporte,");
                    
                                                          
                   
                    fichero.write("\r\n");
                    fichero.close();
             
    }       
                       
    catch(IOException e){
		//Error.setText("No se pudo guardar el archivo " + Ruta);
	}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         panel4 juan  = new panel4();
        juan.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed
           
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
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JCheckBox comida;
    private javax.swing.JCheckBox deporte;
    private javax.swing.JCheckBox dulce;
    private javax.swing.JComboBox edad;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel foticos;
    private javax.swing.JButton foto;
    private javax.swing.JLabel fotogenero;
    private javax.swing.JComboBox genero;
    private javax.swing.JCheckBox globo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JCheckBox juguetes;
    private javax.swing.JTextField nombre;
    private javax.swing.JCheckBox pastel;
    private javax.swing.JCheckBox piñata;
    private javax.swing.JCheckBox regalo;
    private javax.swing.JButton salir2;
    private javax.swing.JCheckBox television;
    private javax.swing.JCheckBox videojuegos;
    // End of variables declaration//GEN-END:variables
}