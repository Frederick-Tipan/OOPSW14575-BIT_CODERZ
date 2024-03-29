package ec.edu.espe.organivent.utils;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Frederick
 */
public class ManageMongoDB {
    private static volatile ManageMongoDB instance;
    protected String connectionString;
    private String dataBaseName;
    protected MongoDatabase db;
    protected MongoCollection<Document> coll;
    
    private ManageMongoDB(){
        this.connectionString = "mongodb+srv://frederick:frederick@cluster0.gteqor0.mongodb.net/?retryWrites=true&w=majority";
        this.dataBaseName = "OrganiventDB";
        connectToDatabase();
    }
    
    public static ManageMongoDB getInstance(){
        ManageMongoDB result = instance;
        if(result==null){
            synchronized (ManageMongoDB.class){
                result = instance;
                if(result==null){
                    instance = result = new ManageMongoDB();
                }
            }
        }
        return result;
    }
    
    private void connectToDatabase(){
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        
        MongoClient mongoClient = MongoClients.create(settings);
        db = mongoClient.getDatabase(dataBaseName); 
    }
    
    public void getFromCollection(String collectionName){
        coll = getDB().getCollection(collectionName);
    }
    
    public MongoDatabase getDB(){
        return db;
    }
        
}
