
package s10_proyectofinal_mia.belen;

import javax.swing.JOptionPane;
import static s10_proyectofinal_mia.belen.S10_ProyectoFinal_MiaBelen.getOption;



 
public class productos extends javax.swing.JFrame {
    Administrador b;

    public productos() {
        b =new Administrador();
        
        initComponents();
       
        b.listas();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ingrese = new javax.swing.JButton();
        muestre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reporte = new javax.swing.JTextArea();
        borrar = new javax.swing.JButton();
        modificarnombre = new javax.swing.JButton();
        modificarcantidad = new javax.swing.JButton();
        modificarId = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        opciones = new javax.swing.JMenu();
        Regreso = new javax.swing.JCheckBoxMenuItem();
        salidainventario = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PRODUCTOS");

        ingrese.setBackground(new java.awt.Color(153, 153, 153));
        ingrese.setForeground(new java.awt.Color(0, 0, 0));
        ingrese.setText("Ingrese");
        ingrese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreseActionPerformed(evt);
            }
        });

        muestre.setBackground(new java.awt.Color(153, 153, 153));
        muestre.setForeground(new java.awt.Color(0, 0, 0));
        muestre.setText("Muestre");
        muestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muestreActionPerformed(evt);
            }
        });

        reporte.setBackground(new java.awt.Color(204, 204, 204));
        reporte.setColumns(20);
        reporte.setForeground(new java.awt.Color(0, 0, 0));
        reporte.setRows(5);
        jScrollPane1.setViewportView(reporte);

        borrar.setBackground(new java.awt.Color(153, 153, 153));
        borrar.setForeground(new java.awt.Color(0, 0, 0));
        borrar.setText("Borrar");
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarMouseClicked(evt);
            }
        });
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        modificarnombre.setBackground(new java.awt.Color(153, 153, 153));
        modificarnombre.setForeground(new java.awt.Color(0, 0, 0));
        modificarnombre.setText("Modificar nombre");
        modificarnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarnombreActionPerformed(evt);
            }
        });

        modificarcantidad.setBackground(new java.awt.Color(153, 153, 153));
        modificarcantidad.setForeground(new java.awt.Color(0, 0, 0));
        modificarcantidad.setText("Modificar cantidad");
        modificarcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarcantidadActionPerformed(evt);
            }
        });

        modificarId.setBackground(new java.awt.Color(153, 153, 153));
        modificarId.setForeground(new java.awt.Color(0, 0, 0));
        modificarId.setText("Modificar ID");
        modificarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modificarcantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(modificarnombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modificarId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(muestre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ingrese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingrese)
                .addGap(18, 18, 18)
                .addComponent(muestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(borrar)
                .addGap(18, 18, 18)
                .addComponent(modificarId)
                .addGap(18, 18, 18)
                .addComponent(modificarnombre)
                .addGap(18, 18, 18)
                .addComponent(modificarcantidad)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        opciones.setText("Opciones");

        Regreso.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Regreso.setSelected(true);
        Regreso.setText("Regresar al ventana principal");
        Regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresoActionPerformed(evt);
            }
        });
        opciones.add(Regreso);

        salidainventario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        salidainventario.setSelected(true);
        salidainventario.setText("Salir ");
        salidainventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidainventarioActionPerformed(evt);
            }
        });
        opciones.add(salidainventario);

        jMenuBar1.add(opciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingreseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreseActionPerformed
        // 
        String codigo=JOptionPane.showInputDialog(" Ingrese el  ID producto : ");
        String nombre=JOptionPane.showInputDialog(" Ingrese el nombre producto : ");
        String cant=JOptionPane.showInputDialog(" Ingrese la cantidad en stock: : ");
        Flores prod=new Flores(codigo,nombre, cant);
        b.producto(prod);
        
        
    }//GEN-LAST:event_ingreseActionPerformed

    private void muestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muestreActionPerformed
        // limpiar info
        reporte.setText(" ");
        reporte.setText(b.imprimir());// devuelve la info
        
    }//GEN-LAST:event_muestreActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
         
    }//GEN-LAST:event_borrarActionPerformed

    private void borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseClicked
        String codigo=JOptionPane.showInputDialog(" Ingrese el ID producto que desea eliminar  : ");
        if (b.eliminar(codigo)==true){
             b.eliminar(codigo);
            reporte.setText(" ");
            reporte.setText(b.imprimir());
            JOptionPane.showMessageDialog(null, " Se borro con exito ");
          
          } else {
            JOptionPane.showMessageDialog(null, " El ID del producto no existe, por favor ingreso un ID existente ");
        
        }
         
         
        
         
    }//GEN-LAST:event_borrarMouseClicked

    private void modificarnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarnombreActionPerformed
        
         String codigo=JOptionPane.showInputDialog(" Ingrese el ID producto que desea modificar  : ");
         String nombre=JOptionPane.showInputDialog(" Ingrese el nuevo nombre del producto  : ");
         Flores produ=new Flores(codigo, nombre, " ");
         if (b.modificar(produ)==true){
             b.modificar(produ);
             reporte.setText(" ");
             reporte.setText(b.imprimir());
         }
         else {
            JOptionPane.showMessageDialog(null, " El ID del producto no existe, por favor ingreso un ID existente ");
        
        }
          
         
        
    }//GEN-LAST:event_modificarnombreActionPerformed

    private void modificarcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarcantidadActionPerformed

         String codigo=JOptionPane.showInputDialog(" Ingrese el ID producto que desea modificar  : "); 
         String cant=JOptionPane.showInputDialog(" Ingrese la nueva cantidad en stock : : ");
         Flores produ=new Flores(codigo, " ", cant);
         if (b.modificarcant(produ)==true){
             b.modificarcant(produ);
            reporte.setText(" ");
            reporte.setText(b.imprimir());
         }
         else {
            JOptionPane.showMessageDialog(null, " El ID del producto no existe, por favor ingreso un ID existente ");
        
        }
        
    }//GEN-LAST:event_modificarcantidadActionPerformed

    private void modificarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarIdActionPerformed
        // TODO add your handling code here:
        
         String nombre=JOptionPane.showInputDialog(" Ingrese el nombre : ");
         String codigo=JOptionPane.showInputDialog(" Ingrese el nuevo ID del producto  : ");
         Flores produ=new Flores(codigo, nombre , " ");
         if (b.modificarId(produ)==true){
             b.modificarId(produ);
            reporte.setText(" ");
            reporte.setText(b.imprimir());
         
         }
         else {
            JOptionPane.showMessageDialog(null, " El nombre del producto no existe, por favor ingreso un ID existente ");
        
        }
        
         
        
    }//GEN-LAST:event_modificarIdActionPerformed

    private void RegresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresoActionPerformed
        // regreso
        Panel menu=new Panel ();
       
    }//GEN-LAST:event_RegresoActionPerformed

    private void salidainventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidainventarioActionPerformed
        // salida del programa
        this.setVisible(false); 
        
        
//        int opcion = getOption("--- MENU ---\n1. Les Chats de cuisine\n2. Inventario Elegancia Botanica\n3. Recursivas\n4. Salir o 'Presione cancelar");
//        System.exit(0);
    }//GEN-LAST:event_salidainventarioActionPerformed

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
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem Regreso;
    private javax.swing.JButton borrar;
    private javax.swing.JButton ingrese;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarId;
    private javax.swing.JButton modificarcantidad;
    private javax.swing.JButton modificarnombre;
    private javax.swing.JButton muestre;
    private javax.swing.JMenu opciones;
    private javax.swing.JTextArea reporte;
    private javax.swing.JCheckBoxMenuItem salidainventario;
    // End of variables declaration//GEN-END:variables
}
