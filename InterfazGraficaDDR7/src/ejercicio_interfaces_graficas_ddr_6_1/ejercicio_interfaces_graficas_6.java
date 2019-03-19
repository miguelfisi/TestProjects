package ejercicio_interfaces_graficas_ddr_6_1;

import baraja.Baraja;
import baraja.BarajaEspañola;
import baraja.BarajaFrancesa;
import baraja.Carta;
import javax.swing.JOptionPane;

public class ejercicio_interfaces_graficas_6 extends javax.swing.JFrame {
  
    public ejercicio_interfaces_graficas_6() {
        initComponents();

        //añadimos los botones al grupo
        buttonGroup1.add(this.mrdbBarFranConJoker);
        buttonGroup1.add(this.mrdbBarFranSinJoker);
        buttonGroup1.add(this.mrdbBarEsCon89);
        buttonGroup1.add(this.mrdbBarEsSin89);

        //ponemos la tapa inicial
        Metodos.mostrarImagen(this.lblCarta, TAPA);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblCarta = new javax.swing.JLabel();
        btnSiguienteCarta = new javax.swing.JButton();
        btnBarajar = new javax.swing.JButton();
        txtCartasSacadas = new javax.swing.JTextField();
        txtCartaDisponible = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        mrdbBarFranConJoker = new javax.swing.JRadioButtonMenuItem();
        mrdbBarFranSinJoker = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mrdbBarEsCon89 = new javax.swing.JRadioButtonMenuItem();
        mrdbBarEsSin89 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Carta");

        btnSiguienteCarta.setText("Siguiente carta");
        btnSiguienteCarta.setEnabled(false);
        btnSiguienteCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteCartaActionPerformed(evt);
            }
        });

        btnBarajar.setText("Barajar");
        btnBarajar.setEnabled(false);
        btnBarajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarajarActionPerformed(evt);
            }
        });

        txtCartasSacadas.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCartasSacadas.setText("0");
        txtCartasSacadas.setEnabled(false);

        txtCartaDisponible.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCartaDisponible.setText("0");
        txtCartaDisponible.setEnabled(false);

        jLabel3.setText("Cartas sacadas");

        jLabel4.setText("Cartas disponibles");

        jMenu1.setText("Baraja");

        jMenu2.setText("Francesa");

        mrdbBarFranConJoker.setText("Con joker");
        mrdbBarFranConJoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrdbBarFranConJokerActionPerformed(evt);
            }
        });
        jMenu2.add(mrdbBarFranConJoker);

        mrdbBarFranSinJoker.setText("Sin joker");
        mrdbBarFranSinJoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrdbBarFranSinJokerActionPerformed(evt);
            }
        });
        jMenu2.add(mrdbBarFranSinJoker);

        jMenu1.add(jMenu2);

        jMenu3.setText("Española");

        mrdbBarEsCon89.setText("Con 8 y 9");
        mrdbBarEsCon89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrdbBarEsCon89ActionPerformed(evt);
            }
        });
        jMenu3.add(mrdbBarEsCon89);

        mrdbBarEsSin89.setText("Sin 8 y 9");
        mrdbBarEsSin89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrdbBarEsSin89ActionPerformed(evt);
            }
        });
        jMenu3.add(mrdbBarEsSin89);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtCartaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtCartasSacadas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnBarajar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSiguienteCarta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnSiguienteCarta)
                        .addGap(18, 18, 18)
                        .addComponent(btnBarajar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCartasSacadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCartaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mrdbBarFranConJokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrdbBarFranConJokerActionPerformed

        //Creo la baraja francesa con Joker (true)
        baraja = new BarajaFrancesa(true);

        btnSiguienteCarta.setEnabled(true);
        btnBarajar.setEnabled(true);

        Metodos.mostrarImagen(this.lblCarta, TAPA);
        
        //Reinicio los txt
        this.txtCartasSacadas.setText((baraja.getPosSiguienteCarta())+"");
        this.txtCartaDisponible.setText(baraja.cartasDisponible()+"");
        
        
    }//GEN-LAST:event_mrdbBarFranConJokerActionPerformed

    private void mrdbBarFranSinJokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrdbBarFranSinJokerActionPerformed

        //Creo la baraja francesa con Joker (false)
        baraja = new BarajaFrancesa(false);
        
        btnSiguienteCarta.setEnabled(true);
        btnBarajar.setEnabled(true);

        Metodos.mostrarImagen(this.lblCarta, TAPA);
        
        //Reinicio los txt
        this.txtCartasSacadas.setText((baraja.getPosSiguienteCarta())+"");
        this.txtCartaDisponible.setText(baraja.cartasDisponible()+"");
        
    }//GEN-LAST:event_mrdbBarFranSinJokerActionPerformed

    private void mrdbBarEsCon89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrdbBarEsCon89ActionPerformed

        //Creo la baraja española con 8 y 9 (true)
        baraja = new BarajaEspañola(true);

        btnSiguienteCarta.setEnabled(true);
        btnBarajar.setEnabled(true);

        Metodos.mostrarImagen(this.lblCarta, TAPA);
        
        //Reinicio los txt
        this.txtCartasSacadas.setText((baraja.getPosSiguienteCarta())+"");
        this.txtCartaDisponible.setText(baraja.cartasDisponible()+"");
        
    }//GEN-LAST:event_mrdbBarEsCon89ActionPerformed

    private void mrdbBarEsSin89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrdbBarEsSin89ActionPerformed

        //Creo la baraja española sin 8 y 9 (false)
        baraja = new BarajaEspañola(false);

        btnSiguienteCarta.setEnabled(true);
        btnBarajar.setEnabled(true);

        Metodos.mostrarImagen(this.lblCarta, TAPA);
        
        //Reinicio los txt
        this.txtCartasSacadas.setText((baraja.getPosSiguienteCarta())+"");
        this.txtCartaDisponible.setText(baraja.cartasDisponible()+"");
    }//GEN-LAST:event_mrdbBarEsSin89ActionPerformed

    private void btnSiguienteCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteCartaActionPerformed
        
        //Cojo la siguiente carta
        Carta c = baraja.siguienteCarta();
        
        if(c!=null){
            
            //segun el tipo de baraja, cogera una carpeta u otra
            if(baraja instanceof BarajaEspañola){
                 Metodos.mostrarImagen(this.lblCarta, DIR_IMG+"\\cartas_espanolas\\"+c.getPalo().toString().toLowerCase()+ "\\"+c.getNumero()+".jpg");
            }else{
                 Metodos.mostrarImagen(this.lblCarta, DIR_IMG+"\\cartas_francesas\\"+c.getPalo().toString().toLowerCase()+ "\\"+c.getNumero()+".jpg");
            }
            
            //Actualizo los txt
            this.txtCartasSacadas.setText((baraja.getPosSiguienteCarta())+"");
            this.txtCartaDisponible.setText(baraja.cartasDisponible()+"");
            
        }else{
            JOptionPane.showMessageDialog(this, "No hay mas cartas", "Error", JOptionPane.ERROR_MESSAGE);
            this.btnSiguienteCarta.setEnabled(false);
            
        }
        
    }//GEN-LAST:event_btnSiguienteCartaActionPerformed

    private void btnBarajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarajarActionPerformed
        
        //Barajo las cartas
        baraja.barajar();
        this.btnSiguienteCarta.setEnabled(true);
        Metodos.mostrarImagen(this.lblCarta, TAPA);
        
        this.txtCartasSacadas.setText((baraja.getPosSiguienteCarta())+"");
        this.txtCartaDisponible.setText(baraja.cartasDisponible()+"");
        
    }//GEN-LAST:event_btnBarajarActionPerformed

    
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
            java.util.logging.Logger.getLogger(ejercicio_interfaces_graficas_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio_interfaces_graficas_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio_interfaces_graficas_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio_interfaces_graficas_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio_interfaces_graficas_6().setVisible(true);
            }
        });
    }

    //Atributos creados por mi
    private Baraja baraja;
   
    //Constantes
    private final String DIR_IMG = "img";
    private final String TAPA = DIR_IMG+"\\otras\\tapa.jpg";
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarajar;
    private javax.swing.JButton btnSiguienteCarta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCarta;
    private javax.swing.JRadioButtonMenuItem mrdbBarEsCon89;
    private javax.swing.JRadioButtonMenuItem mrdbBarEsSin89;
    private javax.swing.JRadioButtonMenuItem mrdbBarFranConJoker;
    private javax.swing.JRadioButtonMenuItem mrdbBarFranSinJoker;
    private javax.swing.JTextField txtCartaDisponible;
    private javax.swing.JTextField txtCartasSacadas;
    // End of variables declaration//GEN-END:variables
}
