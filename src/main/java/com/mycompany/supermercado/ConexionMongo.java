package com.mycompany.supermercado;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
//import javax.swing.JOptionPane;
 
public class ConexionMongo {
    MongoClient mongo;
    public MongoClient crearConexion() {
        MongoClient mongo = null;
            
        try {
            String user="brunobrodon75";
            String password="4321";
            // Crea la cadena de conexión utilizando el String de conexion de MongoDB
            String connectionUri = "mongodb+srv://"+user+":"+password+"@mainclusterbienperron.vxm12dx.mongodb.net/";
            MongoClientURI analizar = new MongoClientURI(connectionUri);
            mongo = new MongoClient(analizar);
            

            //Opcional, sirve para verificar los nombres de las bases de datos
            //List<String> datos = mongo.getDatabaseNames();
            
            

            //JOptionPane.showMessageDialog(null, "Éxito al conectarse");
            //JOptionPane.showMessageDialog(null, "Las bases de datos son :"+ datos.toString());
        } catch (MongoException error) {
            System.out.println("Error al conectar con MongoDB: " + error.getMessage());
        }

        return this.mongo=mongo;
    }

    public MongoClient getMongo() {
        return mongo;
    }
    
}
