package com.example.mongoexam;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import com.mongodb.ConnectionString;

public class ConexionMongo {
    ConnectionString connectionString = new ConnectionString("mongodb+srv://kevinmartinez:12345@cluster0.ypxijuf.mongodb.net/?retryWrites=true&w=majority");
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(connectionString)
            .build();

    MongoClient mongoClient = MongoClients.create(settings);
    MongoDatabase database = mongoClient.getDatabase("501Origianl");

    public boolean insertar(Jugador jugador) {
        MongoCollection<Document> collection = database.getCollection("Jugador");
        Document document = new Document("idJugador", jugador.getIdJugador())
                .append("nombre", jugador.getNombre())
                .append("apellidoP", jugador.getApellidoP())
                .append("apellidoM", jugador.getApellidoM())
                .append("numeroJ", jugador.getNumeroJ())
                .append("posicion", jugador.getPosicion())
                .append("equipo", jugador.getEquipo());

        collection.insertOne(document);
        return true;
    }

    public boolean actualizar(Jugador jugadorAnterior, Jugador jugadorNuevo) {
        MongoCollection<Document> collection = database.getCollection("Jugador");
        Bson filter = Filters.eq("idJugador", jugadorAnterior.getIdJugador());
        Document document = new Document("idJugador", jugadorNuevo.getIdJugador())
                .append("nombre", jugadorNuevo.getNombre())
                .append("apellidoP", jugadorNuevo.getApellidoP())
                .append("apellidoM", jugadorNuevo.getApellidoM())
                .append("numeroJ", jugadorNuevo.getNumeroJ())
                .append("posicion", jugadorNuevo.getPosicion())
                .append("equipo", jugadorNuevo.getEquipo());
        Bson update = new Document("$set", document);
        UpdateResult result = collection.updateOne(filter, update);
        System.out.println(result.getModifiedCount() + " documentos modificados");
        return true;


    }

    public boolean mostrar() {
        try {
            MongoCollection<Document> collection = database.getCollection("Jugador");
            FindIterable<Document> documents = collection.find();
            for (Document document : documents) {
                System.out.println(document.toJson());
            }
            return true;
        } catch (Exception e) {
            System.out.println("Hubo un error");
            return false;
        }

    }
}

