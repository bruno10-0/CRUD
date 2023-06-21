package com.mycompany.supermercado;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import org.bson.Document;
 
public class Iniciarsesion {

    public boolean Entrar(String contrasenia, String usuario) {
        boolean bandera = false;
        try {
            // Instaciamos un objeto de la clase ConexionMongo.
            ConexionMongo conexion = new ConexionMongo();
            
            // Obtiene una referencia a la base de datos "SUPERmercadoMayorista"
            MongoDatabase baseDatos = conexion.crearConexion().getDatabase("SUPERmercadoMayorista");
            MongoCollection<Document> coleccion = baseDatos.getCollection("Usuarios");
            
            // Crea un nuevo objeto Document que representa una consulta de búsqueda en MongoDB.
            // Utiliza el operador $and para combinar múltiples condiciones en una consulta lógica AND.
            // La consulta busca documentos donde se cumplan dos condiciones simultáneamente.
            // La primera condición es que el campo "usuario" debe ser igual al valor de la variable "usuario".
            // La segunda condición es que el campo "contrasenia" debe ser igual al valor de la variable "contrasenia".     
            Document consulta = new Document("$and", List.of(new Document("usuario", usuario), new Document("contrasenia", contrasenia)));
            
            // Realiza la consulta a la colección de usuarios
            Document resultado = coleccion.find(consulta).first();
            
            if (resultado != null) {
            // El usuario y contraseña coinciden
            //    System.out.println("Inicio de sesión exitoso.");
                bandera=true;
            } else {
            // El usuario y contraseña no coinciden
            //    System.out.println("Usuario o contraseña incorrectos.");
            }
        } catch (MongoException e) {
            System.out.println("Error: "+e.toString());
        }
        return bandera;
    }
}
