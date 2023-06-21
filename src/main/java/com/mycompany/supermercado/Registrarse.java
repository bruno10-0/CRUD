package com.mycompany.supermercado;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
 
public class Registrarse extends javax.swing.JFrame {

    //La variable direccion guarda la ruta principal de un directorio en Windows.
    //Para acceder y referenciar archivos y recursos del proyecto.
    String direccion = "C:\\Users\\Bruno\\Documents\\NetBeansProjects\\";
    boolean Modo = false;

    public Registrarse() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        tema = new javax.swing.JLabel();
        atras = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        titulo_crearcuenta = new javax.swing.JLabel();
        iconoPass1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtNomUsuario = new javax.swing.JTextField();
        user1 = new javax.swing.JLabel();
        txtPass1 = new javax.swing.JPasswordField();
        txtPass = new javax.swing.JPasswordField();
        user2 = new javax.swing.JLabel();
        iconoPass = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        titulo_pass1 = new javax.swing.JLabel();
        titulo_nombreUsuario = new javax.swing.JLabel();
        titulo_correo = new javax.swing.JLabel();
        titulo_pass = new javax.swing.JLabel();
        aviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(255, 255, 255));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tema.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\tema_negro.png")); // NOI18N
        tema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temaMouseClicked(evt);
            }
        });
        nav.add(tema, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 30));

        atras.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\atras_negro.png")); // NOI18N
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        nav.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        minimizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\minimizar_negro 24px.png")); // NOI18N
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        nav.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, 30));

        cerrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_negro 16px.png")); // NOI18N
        cerrar.setAlignmentY(0.0F);
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarMouseExited(evt);
            }
        });
        nav.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 30, 30));

        body.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 30));

        titulo_crearcuenta.setBackground(new java.awt.Color(0, 0, 0));
        titulo_crearcuenta.setFont(new java.awt.Font("Segoe UI Historic", 0, 24)); // NOI18N
        titulo_crearcuenta.setForeground(new java.awt.Color(0, 0, 0));
        titulo_crearcuenta.setText("Crear cuenta");
        body.add(titulo_crearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, 30));

        iconoPass1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\key_negro 24px.png")); // NOI18N
        body.add(iconoPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        body.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 180, 30));

        txtNomUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtNomUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtNomUsuario.setBorder(null);
        txtNomUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomUsuarioActionPerformed(evt);
            }
        });
        body.add(txtNomUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 180, 30));

        user1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\usuario_negro 24px.png")); // NOI18N
        body.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 30));

        txtPass1.setBackground(new java.awt.Color(255, 255, 255));
        txtPass1.setForeground(new java.awt.Color(0, 0, 0));
        txtPass1.setBorder(null);
        txtPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass1ActionPerformed(evt);
            }
        });
        body.add(txtPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 180, 30));

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.setBorder(null);
        body.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 180, 30));

        user2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\usuario_negro 24px.png")); // NOI18N
        body.add(user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 30));

        iconoPass.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\key_negro 24px.png")); // NOI18N
        body.add(iconoPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));
        body.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 180, 10));
        body.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 180, 10));
        body.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 180, 10));
        body.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 180, 10));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        body.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 210, 30));

        titulo_pass1.setBackground(new java.awt.Color(255, 255, 255));
        titulo_pass1.setForeground(new java.awt.Color(0, 0, 0));
        titulo_pass1.setText("Contraseña*");
        body.add(titulo_pass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        titulo_nombreUsuario.setBackground(new java.awt.Color(255, 255, 255));
        titulo_nombreUsuario.setForeground(new java.awt.Color(0, 0, 0));
        titulo_nombreUsuario.setText("Nombre de usuario*");
        body.add(titulo_nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 120, -1));

        titulo_correo.setBackground(new java.awt.Color(255, 255, 255));
        titulo_correo.setForeground(new java.awt.Color(0, 0, 0));
        titulo_correo.setText("Correo electronico*");
        body.add(titulo_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        titulo_pass.setBackground(new java.awt.Color(255, 255, 255));
        titulo_pass.setForeground(new java.awt.Color(0, 0, 0));
        titulo_pass.setText("Contraseña*");
        body.add(titulo_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        aviso.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        aviso.setForeground(new java.awt.Color(255, 0, 51));
        body.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNomUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomUsuarioActionPerformed

    private void txtPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPass1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseEntered
        cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_rojo 24px.png", cerrar);
    }//GEN-LAST:event_cerrarMouseEntered

    private void cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseExited
        if (Modo == false) {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_negro 16px.png", cerrar);
        } else {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_blanco 16px.png", cerrar);
        }
    }//GEN-LAST:event_cerrarMouseExited

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasMouseClicked

    private void temaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temaMouseClicked
        Cambiartema();
        if (Modo == false) {
            nav.setBackground(Color.WHITE);
            body.setBackground(Color.WHITE);
            jButton1.setForeground(Color.WHITE);
            txtCorreo.setBackground(Color.WHITE);
            txtNomUsuario.setBackground(Color.WHITE);
            txtPass.setBackground(Color.WHITE);
            txtPass1.setBackground(Color.WHITE);
            titulo_correo.setForeground(Color.BLACK);
            titulo_crearcuenta.setForeground(Color.BLACK);
            titulo_pass.setForeground(Color.BLACK);
            titulo_pass1.setForeground(Color.BLACK);
            titulo_nombreUsuario.setForeground(Color.BLACK);
            jSeparator1.setBackground(Color.BLACK);
            jSeparator2.setBackground(Color.BLACK);
            jSeparator3.setBackground(Color.BLACK);
            jSeparator4.setBackground(Color.BLACK);
            txtCorreo.setForeground(Color.BLACK);
            txtNomUsuario.setForeground(Color.BLACK);
            txtPass.setForeground(Color.BLACK);
            txtPass1.setForeground(Color.BLACK);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\minimizar_negro 24px.png", minimizar);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_negro 16px.png", cerrar);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\tema_negro.png", tema);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\atras_negro.png", atras);

            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\usuario_negro 24px.png", user1);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\usuario_negro 24px.png", user2);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\key_negro 24px.png", iconoPass);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\key_negro 24px.png", iconoPass1);
        } else {
            nav.setBackground(Color.BLACK);
            body.setBackground(Color.BLACK);
            jButton1.setForeground(Color.BLACK);
            txtCorreo.setBackground(Color.BLACK);
            txtNomUsuario.setBackground(Color.BLACK);
            txtPass.setBackground(Color.BLACK);
            txtPass1.setBackground(Color.BLACK);
            titulo_correo.setForeground(Color.WHITE);
            titulo_crearcuenta.setForeground(Color.WHITE);
            titulo_pass.setForeground(Color.WHITE);
            titulo_pass1.setForeground(Color.WHITE);
            titulo_nombreUsuario.setForeground(Color.WHITE);
            jSeparator1.setBackground(Color.WHITE);
            jSeparator2.setBackground(Color.WHITE);
            jSeparator3.setBackground(Color.WHITE);
            jSeparator4.setBackground(Color.WHITE);
            txtCorreo.setForeground(Color.WHITE);
            txtNomUsuario.setForeground(Color.WHITE);
            txtPass.setForeground(Color.WHITE);
            txtPass1.setForeground(Color.WHITE);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\minimizar_blanco 24px.png", minimizar);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_blanco 16px.png", cerrar);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\tema_blanco.png", tema);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\atras_blanco.png", atras);

            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\usuario_blanco 24px.png", user1);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\usuario_blanco 24px.png", user2);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\key_blanco 24px.png", iconoPass);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\key_blanco 24px.png", iconoPass1);
        }
    }//GEN-LAST:event_temaMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        boolean registro = true;
        if (txtCorreo.getText().isEmpty() || txtNomUsuario.getText().isEmpty() || txtPass.getText().isEmpty() || txtPass1.getText().isEmpty()) {
            aviso.setText("Complete todos los campos");
            registro = false;
        }
        char[] password1 = txtPass.getPassword();
        char[] password2 = txtPass.getPassword();

        if (password1.length != password2.length) {
            registro = false;
        } else {
            for (int i = 0; i < password1.length; i++) {
                if (password1[i] != password2[i]) {
                    registro = false;
                    break;
                }
            }
            String patron = "[aA-zZ]@(?:hotmail|outlook|gmail)\\.com";
            Pattern pattern = Pattern.compile(patron);
            Matcher matcher = pattern.matcher(txtCorreo.getText());
            if (!matcher.find()) {
                aviso.setText("Ingrese un correo electronico válido.");
                registro = false;
            }
            if (registro) {
                aviso.setText("exito");
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked
    private void cambiarIcono(String rutaIcono, JLabel label) {
        ImageIcon nuevoIcono = new ImageIcon(rutaIcono);
        label.setIcon(nuevoIcono);
    }

    public void Cambiartema() {
        Modo = !Modo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atras;
    private javax.swing.JLabel aviso;
    private javax.swing.JPanel body;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel iconoPass;
    private javax.swing.JLabel iconoPass1;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel minimizar;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel tema;
    private javax.swing.JLabel titulo_correo;
    private javax.swing.JLabel titulo_crearcuenta;
    private javax.swing.JLabel titulo_nombreUsuario;
    private javax.swing.JLabel titulo_pass;
    private javax.swing.JLabel titulo_pass1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNomUsuario;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user2;
    // End of variables declaration//GEN-END:variables
}
