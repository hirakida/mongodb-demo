package com.example.config;

import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

@Configuration
public class MongoConfig {
    private static final String CONNECTION_STRING =
            "mongodb://127.0.0.1:27017,127.0.0.1:27018,127.0.0.1:27019/?replicaSet=rs1";
    private static final String DATABASE_NAME = "db1";

    @Bean
    public MongoClient mongoClient() {
        PojoCodecProvider provider = PojoCodecProvider.builder()
                                                      .automatic(true)
                                                      .build();
        CodecRegistry codecRegistry =
                CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                                               CodecRegistries.fromProviders(provider));
        MongoClientSettings settings =
                MongoClientSettings.builder()
                                   .applyConnectionString(new ConnectionString(CONNECTION_STRING))
                                   .codecRegistry(codecRegistry)
                                   .build();

        return MongoClients.create(settings);
    }

    @Bean
    public MongoDatabase mongoDatabase(MongoClient mongoClient) {
        return mongoClient.getDatabase(DATABASE_NAME);
    }
}