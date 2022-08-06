package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import models.Id;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";
    private MessageController msgCtrl;
    private IdController idCtrl;

//    com.fasterxml.jackson.databind.ObjectMapper mapper
//            = new com.fasterxml.jackson.databind.ObjectMapper();
    List<Id> list = new ArrayList<>();
    public TransactionController(MessageController m, IdController j) {}
    public TransactionController(){};

    public List<Id> getIds() throws UnirestException, IOException {
        String idString = ServerController.getServer().getIds();

        ObjectMapper mapper = new ObjectMapper();

//        Unirest.setObjectMapper(new ObjectMapper() {
//            public <T> T readValue(String s, Class<T> aClass) {
//                try {
//                    return mapper.readValue(s, aClass);
//                } catch (JsonProcessingException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//            public String writeValue(Object o) {
//                try {
//                    return mapper.writeValueAsString(o);
//                } catch (JsonProcessingException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//        list.add(mapper.readValue(idString, new TypeReference<List<Id>>(){}));
       list = mapper.readValue(idString, new TypeReference<List<Id>>(){});
        return list;
    }
    
    public String postId(String idtoRegister, String githubName) {
        Id tid = new Id(idtoRegister, githubName);
        tid = idCtrl.postId(tid);
        return ("Id registered.");
    }

//    public String makecall(String s, String get, String s1) {
//    }
}
