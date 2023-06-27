package com.mycompany.supermercado;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.bson.Document;
import org.bson.conversions.Bson;

public class Subir extends javax.swing.JFrame {

    String direccion = "C:\\Users\\Bruno\\Documents\\NetBeansProjects\\";
    int modalidad = 0;
    Document documento;
    int indice;

    public Subir(int modalidad) {
        this.modalidad = modalidad;
        initComponents();
        this.setLocationRelativeTo(null);
        cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cargar_data.png", logo);
        titulo.setText("Estas subiendo datos...");
    }

    public Subir(int modalidad, int indice, Document documento) {
        this.modalidad = modalidad;
        this.indice = indice;
        this.documento = documento;
        initComponents();
        this.setLocationRelativeTo(null);
        cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\editar_data.png", logo);
        titulo.setText("Estas modificando datos...");
        datoModificar();
    }

    private void datoModificar() {
        txt_nombre.setText(documento.getString("nombre"));
        txt_direccion.setText(documento.getString("direccion"));
        txt_celular.setText(documento.getString("telefono"));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_celular = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        listo = new javax.swing.JLabel();
        aviso = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setUndecorated(true);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(255, 255, 255));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_negro 16px.png")); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        nav.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 20, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\minimizar_negro 24px.png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        nav.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 30, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\atras_negro.png")); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        nav.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        body.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\celular.png")); // NOI18N
        body.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 30, 30));

        txt_celular.setBackground(new java.awt.Color(255, 255, 255));
        txt_celular.setForeground(new java.awt.Color(0, 0, 0));
        txt_celular.setBorder(null);
        body.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 130, 30));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre.setBorder(null);
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        body.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 130, 30));

        txt_direccion.setBackground(new java.awt.Color(255, 255, 255));
        txt_direccion.setForeground(new java.awt.Color(0, 0, 0));
        txt_direccion.setBorder(null);
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        body.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 130, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\usuario_negro 24px.png")); // NOI18N
        body.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\direccion.png")); // NOI18N
        body.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 30, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        body.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 130, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        body.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 130, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        body.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 130, 10));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Celular*");
        body.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 140, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre*");
        body.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 140, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Dirección*");
        body.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 140, 30));

        listo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\listo_negro.png")); // NOI18N
        listo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listoMouseExited(evt);
            }
        });
        body.add(listo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 30, 40));

        aviso.setForeground(new java.awt.Color(255, 51, 51));
        body.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 200, 30));
        body.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 70, 70));

        titulo.setBackground(new java.awt.Color(0, 0, 0));
        titulo.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        body.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(Subir.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void listoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listoMouseEntered
        cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\listo_verde.png", listo);
    }//GEN-LAST:event_listoMouseEntered

    private void listoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listoMouseClicked
        if (modalidad == 1) {
            guardarDatosEnMongoDB(txt_nombre, txt_direccion, txt_celular);
        } else if (modalidad == 2) {
            MongoCollection colecciones = new ConexionMongo().crearConexion().getDatabase("SUPERmercadoMayorista").getCollection("Clientes");
            subirModificaciones(colecciones);
        }
    }//GEN-LAST:event_listoMouseClicked

    private void listoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listoMouseExited
        cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\listo_negro.png", listo);
    }//GEN-LAST:event_listoMouseExited

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Clientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked
    private void cambiarIcono(String rutaIcono, JLabel label) {
        ImageIcon nuevoIcono = new ImageIcon(rutaIcono);
        label.setIcon(nuevoIcono);
    }

    private void subirModificaciones(MongoCollection<Document> collection) {
        Object id = documento.get("_id");
        Document filtro = new Document("_id", id);
        Document nuevoValor = new Document("$set", new Document("nombre", txt_nombre.getText())
                .append("direccion", txt_direccion.getText())
                .append("telefono", txt_celular.getText()));
        collection.updateOne(filtro, nuevoValor);
        new Clientes().setVisible(true);
        this.dispose();

    }

    private void guardarDatosEnMongoDB(JTextField nombre, JTextField direccion, JTextField celular) {
        if (nombre.getText().isEmpty() || direccion.getText().isEmpty() || celular.getText().isEmpty()) {
            aviso.setText("Debe completar todos los campos.");
        } else {
            try {
                ConexionMongo conexion = new ConexionMongo();
                MongoCollection<Document> collection = conexion.crearConexion().getDatabase("SUPERmercadoMayorista").getCollection("Clientes");

                // Creación del documento a partir de los datos ingresados
                Document documentoGuardar = new Document()
                        .append("nombre", nombre.getText())
                        .append("direccion", direccion.getText())
                        .append("telefono", celular.getText());

                // Inserción del documento en la colección
                collection.insertOne(documentoGuardar);

                JOptionPane.showMessageDialog(null, "Éxito al Guardar los datos en MongoDB");
            } catch (MongoException e) {
                JOptionPane.showMessageDialog(null, "Error al intentar guardar los datos en Mongo, Codigo de error: " + e.toString());
            }
            new Clientes().setVisible(true);
            this.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JPanel body;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel listo;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
