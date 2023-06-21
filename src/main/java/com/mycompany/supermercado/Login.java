package com.mycompany.supermercado;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
 
public class Login extends javax.swing.JFrame {
    //La variable direccion guarda la ruta principal de un directorio en Windows.
    //Para acceder y referenciar archivos y recursos del proyecto.
    String direccion = "C:\\Users\\Bruno\\Documents\\NetBeansProjects\\";
    boolean Modo = false;
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Body = new javax.swing.JPanel();
        Ingreso = new javax.swing.JPanel();
        Contraseña = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        txtNomUsu = new javax.swing.JTextField();
        txtContra = new javax.swing.JPasswordField();
        imagenUser = new javax.swing.JLabel();
        imagenUser2 = new javax.swing.JLabel();
        imagenKey = new javax.swing.JLabel();
        aviso = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        separador2 = new javax.swing.JSeparator();
        enter = new javax.swing.JLabel();
        Registrarse = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        minimizar = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        tema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Body.setBackground(new java.awt.Color(255, 255, 255));
        Body.setForeground(new java.awt.Color(255, 255, 255));
        Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ingreso.setBackground(new java.awt.Color(255, 255, 255));
        Ingreso.setForeground(new java.awt.Color(255, 255, 255));
        Ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contraseña.setBackground(new java.awt.Color(0, 153, 255));
        Contraseña.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        Contraseña.setText("Contraseña:");
        Ingreso.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        UserName.setBackground(new java.awt.Color(0, 153, 255));
        UserName.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        UserName.setForeground(new java.awt.Color(0, 0, 0));
        UserName.setText("Nombre de usuario:");
        Ingreso.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        txtNomUsu.setBackground(new java.awt.Color(255, 255, 255));
        txtNomUsu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNomUsu.setForeground(new java.awt.Color(0, 0, 0));
        txtNomUsu.setBorder(null);
        txtNomUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomUsuActionPerformed(evt);
            }
        });
        Ingreso.add(txtNomUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 220, 30));

        txtContra.setBackground(new java.awt.Color(255, 255, 255));
        txtContra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtContra.setForeground(new java.awt.Color(0, 0, 0));
        txtContra.setBorder(null);
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        Ingreso.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 220, 30));

        imagenUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenUser.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\java_negro.png")); // NOI18N
        Ingreso.add(imagenUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 140, 140));

        imagenUser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenUser2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\usuario_negro 24px.png")); // NOI18N
        Ingreso.add(imagenUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 30, 30));

        imagenKey.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenKey.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\key_negro 24px.png")); // NOI18N
        Ingreso.add(imagenKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 30, 30));

        aviso.setBackground(new java.awt.Color(255, 51, 51));
        aviso.setFont(new java.awt.Font("Segoe UI Historic", 0, 14)); // NOI18N
        aviso.setForeground(new java.awt.Color(255, 51, 51));
        Ingreso.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 210, 30));

        separador.setBackground(new java.awt.Color(0, 0, 0));
        separador.setForeground(new java.awt.Color(0, 0, 0));
        Ingreso.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 210, 20));

        separador2.setBackground(new java.awt.Color(0, 0, 0));
        separador2.setForeground(new java.awt.Color(0, 0, 0));
        Ingreso.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 210, 20));

        enter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enter.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\entrar_negro 64px.png")); // NOI18N
        enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterMouseClicked(evt);
            }
        });
        Ingreso.add(enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 70, 70));

        Registrarse.setBackground(new java.awt.Color(0, 0, 0));
        Registrarse.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(153, 153, 153));
        Registrarse.setText("Registrarse");
        Registrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarseMouseExited(evt);
            }
        });
        Ingreso.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 90, -1));

        Body.add(Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 290, 550));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\minimizar_negro 24px.png")); // NOI18N
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        header.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 40, 30));

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setForeground(new java.awt.Color(255, 255, 255));
        cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_negro 16px.png")); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        header.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 40, 30));

        tema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tema.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\tema_negro.png")); // NOI18N
        tema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temaMouseClicked(evt);
            }
        });
        header.add(tema, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, -1));

        Body.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Body, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomUsuActionPerformed

    }//GEN-LAST:event_txtNomUsuActionPerformed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed

    }//GEN-LAST:event_txtContraActionPerformed

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked
    private void cambiarIcono(String rutaIcono, JLabel label) {
        ImageIcon nuevoIcono = new ImageIcon(rutaIcono);
        label.setIcon(nuevoIcono);
    }
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

    private void temaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temaMouseClicked
        Cambiartema();
        if (Modo == true) {
            header.setBackground(Color.BLACK);
            Ingreso.setBackground(Color.BLACK);
            txtContra.setBackground(Color.BLACK);
            txtContra.setForeground(Color.WHITE);
            txtNomUsu.setBackground(Color.BLACK);
            txtNomUsu.setForeground(Color.WHITE);
            separador.setBackground(Color.BLACK);
            separador.setForeground(Color.WHITE);
            separador2.setBackground(Color.BLACK);
            separador2.setForeground(Color.WHITE);
            UserName.setForeground(Color.WHITE);
            Contraseña.setForeground(Color.WHITE);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\minimizar_blanco 24px.png", minimizar);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_blanco 16px.png", cerrar);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\tema_blanco.png", tema);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\java_blanco.png", imagenUser);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\usuario_blanco 24px.png", imagenUser2);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\key_blanco 24px.png", imagenKey);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\entrar_blanco 64px.png", enter);
        } else {
            header.setBackground(Color.WHITE);
            Ingreso.setBackground(Color.WHITE);
            txtContra.setBackground(Color.WHITE);
            txtContra.setForeground(Color.BLACK);
            txtNomUsu.setBackground(Color.WHITE);
            txtNomUsu.setForeground(Color.BLACK);
            separador.setBackground(Color.WHITE);
            separador.setForeground(Color.BLACK);
            separador2.setBackground(Color.WHITE);
            separador2.setForeground(Color.BLACK);
            UserName.setForeground(Color.BLACK);
            Contraseña.setForeground(Color.BLACK);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\minimizar_negro 24px.png", minimizar);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_negro 16px.png", cerrar);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\tema_negro.png", tema);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\usuario_negro 24px.png", imagenUser2);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\key_negro 24px.png", imagenKey);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\entrar_negro 64px.png", enter);
        }
    }//GEN-LAST:event_temaMouseClicked

    private void enterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterMouseClicked
        if (txtContra.getText().isEmpty() || txtNomUsu.getText().isEmpty()) {
            aviso.setText("Cargue su contraseña y usuario.");
        } else {
            // caracteres ingresados en el campo de contraseña
            char[] caracteresIngresados = txtContra.getPassword();
            // Los caracteres en una cadena de texto
            String textoIngresado = new String(caracteresIngresados);
            Iniciarsesion iniciar = new Iniciarsesion();
            boolean a;
            a = iniciar.Entrar(textoIngresado, txtNomUsu.getText());
            Menu menu = new Menu();
            if (a == true) {
                menu.setVisible(true);
                dispose();
            } else {
                aviso.setText("Verifique el Usuario y Contraseña");
            }
        }
    }//GEN-LAST:event_enterMouseClicked

    private void RegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseEntered
        Registrarse.setForeground(Color.GREEN);
    }//GEN-LAST:event_RegistrarseMouseEntered

    private void RegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseExited
        Registrarse.setForeground(Color.GRAY);
    }//GEN-LAST:event_RegistrarseMouseExited

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
        Registrarse registrarse = new Registrarse();
        registrarse.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegistrarseMouseClicked
    public void Cambiartema() {
        Modo = !Modo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JLabel Contraseña;
    private javax.swing.JPanel Ingreso;
    private javax.swing.JLabel Registrarse;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel aviso;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel enter;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imagenKey;
    private javax.swing.JLabel imagenUser;
    private javax.swing.JLabel imagenUser2;
    private javax.swing.JLabel minimizar;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel tema;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtNomUsu;
    // End of variables declaration//GEN-END:variables
}
