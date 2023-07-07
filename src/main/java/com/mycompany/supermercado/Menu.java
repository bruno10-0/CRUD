package com.mycompany.supermercado;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Menu extends javax.swing.JFrame {

    String direccion = "C:\\Users\\Bruno\\Documents\\NetBeansProjects\\";
    boolean Modo = false;
   public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        saludo.setText("Esta muy bueno, verdad? :D");
    }
    public Menu(JTextField usuario) {
        initComponents();
        this.setLocationRelativeTo(null);
        saludo.setText("Hola "+usuario.getText()+", bienvenido!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Body = new javax.swing.JPanel();
        nav = new javax.swing.JPanel();
        minimizar = new javax.swing.JLabel();
        tema = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        INICIO = new javax.swing.JLabel();
        img_clientes = new javax.swing.JLabel();
        txt_clientes = new javax.swing.JLabel();
        img_empleados = new javax.swing.JLabel();
        txt_empleados = new javax.swing.JLabel();
        img_inventario = new javax.swing.JLabel();
        txt_inventario = new javax.swing.JLabel();
        txt_proveedores = new javax.swing.JLabel();
        img_proveedores = new javax.swing.JLabel();
        img_sucursales = new javax.swing.JLabel();
        txt_sucursales = new javax.swing.JLabel();
        img_ventas = new javax.swing.JLabel();
        txt_ventas = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        saludo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Body.setBackground(new java.awt.Color(255, 255, 255));
        Body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(255, 255, 255));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\minimizar_negro 24px.png")); // NOI18N
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        nav.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 30, 30));

        tema.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\tema_negro.png")); // NOI18N
        tema.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temaMouseClicked(evt);
            }
        });
        nav.add(tema, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        cerrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_negro 16px.png")); // NOI18N
        cerrar.setToolTipText("");
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
        nav.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 30, 30));

        INICIO.setBackground(new java.awt.Color(0, 0, 0));
        INICIO.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        INICIO.setForeground(new java.awt.Color(0, 0, 0));
        INICIO.setText("INICIO");
        nav.add(INICIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 60, -1));

        Body.add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 30));

        img_clientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\clientes_ negro 64px.png")); // NOI18N
        img_clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_clientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img_clientesMouseExited(evt);
            }
        });
        Body.add(img_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 70, 70));

        txt_clientes.setBackground(new java.awt.Color(0, 0, 0));
        txt_clientes.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txt_clientes.setForeground(new java.awt.Color(0, 0, 0));
        txt_clientes.setText("Clientes");
        Body.add(txt_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 70, -1));

        img_empleados.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\empleados_negro 64px.png")); // NOI18N
        img_empleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img_empleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img_empleadosMouseExited(evt);
            }
        });
        Body.add(img_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 70, 70));

        txt_empleados.setBackground(new java.awt.Color(0, 0, 0));
        txt_empleados.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txt_empleados.setForeground(new java.awt.Color(0, 0, 0));
        txt_empleados.setText("Empleados");
        Body.add(txt_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 90, -1));

        img_inventario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\inventario_negro.png")); // NOI18N
        img_inventario.setToolTipText("");
        img_inventario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        img_inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_inventario.setVerifyInputWhenFocusTarget(false);
        img_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img_inventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img_inventarioMouseExited(evt);
            }
        });
        Body.add(img_inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 70, 70));

        txt_inventario.setBackground(new java.awt.Color(0, 0, 0));
        txt_inventario.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txt_inventario.setForeground(new java.awt.Color(0, 0, 0));
        txt_inventario.setText("Inventario");
        Body.add(txt_inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 90, -1));

        txt_proveedores.setBackground(new java.awt.Color(0, 0, 0));
        txt_proveedores.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txt_proveedores.setForeground(new java.awt.Color(0, 0, 0));
        txt_proveedores.setText("Proveedores");
        Body.add(txt_proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 100, -1));

        img_proveedores.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\Proveedores_negro.png")); // NOI18N
        img_proveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img_proveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img_proveedoresMouseExited(evt);
            }
        });
        Body.add(img_proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 70, 70));

        img_sucursales.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\sucursales_negro.png")); // NOI18N
        img_sucursales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_sucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img_sucursalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img_sucursalesMouseExited(evt);
            }
        });
        Body.add(img_sucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 70, 70));

        txt_sucursales.setBackground(new java.awt.Color(0, 0, 0));
        txt_sucursales.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txt_sucursales.setForeground(new java.awt.Color(0, 0, 0));
        txt_sucursales.setText("Sucursales");
        Body.add(txt_sucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 100, -1));

        img_ventas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\Ventas_negro.png")); // NOI18N
        img_ventas.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        img_ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                img_ventasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                img_ventasMouseExited(evt);
            }
        });
        Body.add(img_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 70, 70));

        txt_ventas.setBackground(new java.awt.Color(0, 0, 0));
        txt_ventas.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txt_ventas.setForeground(new java.awt.Color(0, 0, 0));
        txt_ventas.setText("Ventas");
        Body.add(txt_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 100, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Body.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 120, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        Body.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 120, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        Body.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 120, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        Body.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 120, 10));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        Body.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 120, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        Body.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 120, 10));

        saludo.setBackground(new java.awt.Color(0, 0, 0));
        saludo.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        saludo.setForeground(new java.awt.Color(0, 0, 0));
        Body.add(saludo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 430, 30));

        getContentPane().add(Body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setState(Menu.ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

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

    private void img_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_clientesMouseEntered
        cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\clientes_ color 64px.png", img_clientes);
    }//GEN-LAST:event_img_clientesMouseEntered

    private void img_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_clientesMouseExited
        if (Modo == false) {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\clientes_ negro 64px.png", img_clientes);
        } else {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\clientes_ blanco 64px.png", img_clientes);
        }
    }//GEN-LAST:event_img_clientesMouseExited

    private void img_empleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_empleadosMouseEntered
        cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\empleados_color 64px.png", img_empleados);
    }//GEN-LAST:event_img_empleadosMouseEntered

    private void img_inventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_inventarioMouseEntered
        cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\inventario_color.png", img_inventario);
    }//GEN-LAST:event_img_inventarioMouseEntered

    private void img_proveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_proveedoresMouseEntered
        cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\Proveedores_color.png", img_proveedores);

    }//GEN-LAST:event_img_proveedoresMouseEntered

    private void img_sucursalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_sucursalesMouseEntered
        cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\sucursales_color.png", img_sucursales);

    }//GEN-LAST:event_img_sucursalesMouseEntered

    private void img_ventasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_ventasMouseEntered
        cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\Ventas_color.png", img_ventas);

    }//GEN-LAST:event_img_ventasMouseEntered

    private void temaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temaMouseClicked
        Cambiartema();
        if (Modo == false) {
            nav.setBackground(Color.WHITE);
            Body.setBackground(Color.WHITE);
            INICIO.setForeground(Color.BLACK);
            txt_clientes.setForeground(Color.BLACK);
            txt_empleados.setForeground(Color.BLACK);
            txt_inventario.setForeground(Color.BLACK);
            txt_proveedores.setForeground(Color.BLACK);
            txt_sucursales.setForeground(Color.BLACK);
            txt_ventas.setForeground(Color.BLACK);
            jSeparator1.setBackground(Color.BLACK);
            jSeparator2.setBackground(Color.BLACK);
            jSeparator3.setBackground(Color.BLACK);
            jSeparator4.setBackground(Color.BLACK);
            jSeparator5.setBackground(Color.BLACK);
            jSeparator6.setBackground(Color.BLACK);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_negro 16px.png", cerrar);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\minimizar_negro 24px.png", minimizar);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\tema_negro.png", tema);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\clientes_ negro 64px.png", img_clientes);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\empleados_negro 64px.png", img_empleados);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\inventario_negro.png", img_inventario);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\Proveedores_negro.png", img_proveedores);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\sucursales_negro.png", img_sucursales);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\Ventas_negro.png", img_ventas);
        } else {
            nav.setBackground(Color.BLACK);
            Body.setBackground(Color.BLACK);
            INICIO.setForeground(Color.WHITE);
            txt_clientes.setForeground(Color.WHITE);
            txt_empleados.setForeground(Color.WHITE);
            txt_inventario.setForeground(Color.WHITE);
            txt_proveedores.setForeground(Color.WHITE);
            txt_sucursales.setForeground(Color.WHITE);
            txt_ventas.setForeground(Color.WHITE);
            jSeparator1.setBackground(Color.WHITE);
            jSeparator2.setBackground(Color.WHITE);
            jSeparator3.setBackground(Color.WHITE);
            jSeparator4.setBackground(Color.WHITE);
            jSeparator5.setBackground(Color.WHITE);
            jSeparator6.setBackground(Color.WHITE);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_blanco 16px.png", cerrar);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\minimizar_blanco 24px.png", minimizar);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\tema_blanco.png", tema);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\clientes_ blanco 64px.png", img_clientes);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\empleados_blanco 64px.png", img_empleados);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\inventario_blanco.png", img_inventario);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\Proveedores_blanco.png", img_proveedores);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\sucursales_blanco.png", img_sucursales);
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\Ventas_blanco.png", img_ventas);
        }

    }//GEN-LAST:event_temaMouseClicked

    private void img_empleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_empleadosMouseExited
        if (Modo == false) {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\empleados_negro 64px.png", img_empleados);
        } else {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\empleados_blanco 64px.png", img_empleados);
        }
    }//GEN-LAST:event_img_empleadosMouseExited

    private void img_inventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_inventarioMouseExited
        if (Modo == false) {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\inventario_negro.png", img_inventario);
        } else {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\inventario_blanco.png", img_inventario);
        }
    }//GEN-LAST:event_img_inventarioMouseExited

    private void img_proveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_proveedoresMouseExited
        if (Modo == false) {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\Proveedores_negro.png", img_proveedores);
        } else {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\Proveedores_blanco.png", img_proveedores);
        }
    }//GEN-LAST:event_img_proveedoresMouseExited

    private void img_sucursalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_sucursalesMouseExited
        if (Modo == false) {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\sucursales_negro.png", img_sucursales);
        } else {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\sucursales_blanco.png", img_sucursales);
        }
    }//GEN-LAST:event_img_sucursalesMouseExited
 
    private void img_ventasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_ventasMouseExited
        if (Modo == false) {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\Ventas_negro.png", img_ventas);
        } else {
            cambiarIcono(direccion + "SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\img_Menu\\Ventas_blanco.png", img_ventas);
        }
    }//GEN-LAST:event_img_ventasMouseExited

    private void img_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_clientesMouseClicked
        new Clientes().setVisible(true);
        dispose();
    }//GEN-LAST:event_img_clientesMouseClicked
    private void cambiarIcono(String rutaIcono, JLabel label) {
        ImageIcon nuevoIcono = new ImageIcon(rutaIcono);
        label.setIcon(nuevoIcono);
    }

    public void Cambiartema() {
        Modo = !Modo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JLabel INICIO;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel img_clientes;
    private javax.swing.JLabel img_empleados;
    private javax.swing.JLabel img_inventario;
    private javax.swing.JLabel img_proveedores;
    private javax.swing.JLabel img_sucursales;
    private javax.swing.JLabel img_ventas;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel minimizar;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel saludo;
    private javax.swing.JLabel tema;
    private javax.swing.JLabel txt_clientes;
    private javax.swing.JLabel txt_empleados;
    private javax.swing.JLabel txt_inventario;
    private javax.swing.JLabel txt_proveedores;
    private javax.swing.JLabel txt_sucursales;
    private javax.swing.JLabel txt_ventas;
    // End of variables declaration//GEN-END:variables
}
