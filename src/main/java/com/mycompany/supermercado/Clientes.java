package com.mycompany.supermercado;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class Clientes extends javax.swing.JFrame {

    // este map nos va perimir ubicar de manera precisa un documento con un indice que agregaremos
    Map<Integer, Document> mapa = new HashMap<>();
    // y es este arraylist vamos a guardar los docuemntos mapeados
    String direccion = "C:\\Users\\Bruno\\Documents\\NetBeansProjects\\";
    boolean Modo = false;

    public Clientes() {

        initComponents();
        this.setLocationRelativeTo(null);
        inicializarTabla();
    }

    private void inicializarTabla() {

        try {
            // conexion: Instanciamos un objeto de la clase ConexionMongo.
            ConexionMongo conexion = new ConexionMongo();
            // colecciones: Obtiene una referencia a la base de datos "SUPERmercadoMayorista" y solicitamos una colección en este caso "Clientes"
            MongoCollection<Document> colecciones = conexion.crearConexion().getDatabase("SUPERmercadoMayorista").getCollection("Clientes");

            int fila = 0;

            for (Document documento : colecciones.find()) {
                mapa.put(fila, documento);
                Object id = documento.get("_id");
                String nombre = documento.getString("nombre");
                String dire = documento.getString("direccion");
                String telefono = documento.getString("telefono");
                agregarDatosFila(fila, id, nombre, dire, telefono);
                agregarCasillaSeleccion(tabla);
                fila++;
            }
        } catch (Exception e) {
            System.out.println("Error al conectar con la colección Clientes");
        }
    }

    private void agregarDatosFila(int fila, Object id, String nombre, String direccion, String telefono) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.addRow(new Object[]{false, fila, id, nombre, direccion, telefono});
    }

    private void agregarCasillaSeleccion(JTable tabla) {
        tabla.getColumnModel().getColumn(0).setCellRenderer(tabla.getDefaultRenderer(Boolean.class));
        tabla.getColumnModel().getColumn(0).setCellEditor(tabla.getDefaultEditor(Boolean.class));
        tabla.getColumnModel().getColumn(0).getCellEditor().addCellEditorListener(tabla);
    }

    private void eliminarFilasSeleccionadas(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int rowCount = modelo.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            boolean seleccionado = (boolean) tabla.getValueAt(i, 0);

            if (seleccionado) {
                // Obtiene el identificador del registro a eliminar
                String idRegistro = tabla.getValueAt(i, 2).toString();
                try {
                    // Conecta a la base de datos
                    ConexionMongo conexion = new ConexionMongo();
                    MongoCollection<Document> colecciones = conexion.crearConexion().getDatabase("SUPERmercadoMayorista").getCollection("Clientes");

                    // Crea un filtro utilizando el identificador del registro
                    Bson filtro = Filters.eq("_id", new ObjectId(idRegistro));
                    // Elimina el registro de la base de datos
                    colecciones.deleteOne(filtro);
                    System.out.println("Se elimino el cliente con el ID: " + idRegistro);

                } catch (Exception e) {
                    System.out.println("Error al eliminar el registro: " + idRegistro);
                }
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        nav = new javax.swing.JPanel();
        atras = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        minimar = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        borrar = new javax.swing.JLabel();
        subir = new javax.swing.JLabel();
        editar = new javax.swing.JLabel();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(255, 255, 255));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atras.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\atras_negro.png")); // NOI18N
        atras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasMouseClicked(evt);
            }
        });
        nav.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        cerrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\cerrar_negro 16px.png")); // NOI18N
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFocusable(false);
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
        nav.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 30, 30));

        minimar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\minimizar_negro 24px.png")); // NOI18N
        minimar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimarMouseClicked(evt);
            }
        });
        nav.add(minimar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 30, 30));

        getContentPane().add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 30));

        ScrollPane.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPane.setBorder(null);
        ScrollPane.setForeground(new java.awt.Color(255, 255, 255));
        ScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Indice", "Id del Cliente", "Nombre", "Direccion", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setColumnSelectionAllowed(true);
        tabla.setGridColor(new java.awt.Color(0, 0, 0));
        tabla.setName(""); // NOI18N
        tabla.setRowHeight(35);
        tabla.setRowMargin(0);
        tabla.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tabla.setShowGrid(true);
        tabla.setSurrendersFocusOnKeystroke(true);
        ScrollPane.setViewportView(tabla);
        tabla.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(40);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(0).setMaxWidth(40);
            tabla.getColumnModel().getColumn(1).setMinWidth(50);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabla.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        getContentPane().add(ScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 730, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        borrar.setForeground(new java.awt.Color(0, 0, 0));
        borrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\eliminar.png")); // NOI18N
        borrar.setText("BORRAR");
        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarMouseClicked(evt);
            }
        });
        jPanel1.add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 40));

        subir.setForeground(new java.awt.Color(0, 0, 0));
        subir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\subir.png")); // NOI18N
        subir.setText("SUBIR");
        subir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subirMouseClicked(evt);
            }
        });
        jPanel1.add(subir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 90, 40));

        editar.setForeground(new java.awt.Color(0, 0, 0));
        editar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bruno\\Documents\\NetBeansProjects\\SuperMercado\\src\\main\\java\\com\\mycompany\\resources\\Imagenes\\editar.png")); // NOI18N
        editar.setText("EDITAR");
        editar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editarMouseEntered(evt);
            }
        });
        jPanel1.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 730, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked
        dispose();
    }//GEN-LAST:event_cerrarMouseClicked

    private void minimarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimarMouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_minimarMouseClicked

    private void atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseClicked
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasMouseClicked

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

    private void borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarMouseClicked
        eliminarFilasSeleccionadas(tabla);
        new Clientes().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_borrarMouseClicked

    private void subirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subirMouseClicked
        new Subir(1).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_subirMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked
        String entrada = JOptionPane.showInputDialog(null, "Indice de la fila a modificar:", "Indice", JOptionPane.PLAIN_MESSAGE);
        try {
            int numeroFila = Integer.parseInt(entrada);
            new Subir(2, numeroFila, mapa.get(numeroFila)).setVisible(true);
            dispose();
        } catch (Exception e) {
            System.out.println("Error al leer el indice ingresado. " + e.getMessage());
        }
    }//GEN-LAST:event_editarMouseClicked

    private void editarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editarMouseEntered
    private void cambiarIcono(String rutaIcono, JLabel label) {
        ImageIcon nuevoIcono = new ImageIcon(rutaIcono);
        label.setIcon(nuevoIcono);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel atras;
    private javax.swing.JLabel borrar;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel editar;
    private javax.swing.JPanel jPanel1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JLabel minimar;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel subir;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
