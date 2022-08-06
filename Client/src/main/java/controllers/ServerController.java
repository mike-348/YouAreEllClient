package controllers;

//import spiffyUrlManipulator

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sun.security.ntlm.Server;
import models.Id;
import org.apache.http.HttpRequest;
import org.apache.http.client.HttpClient;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.List;

public class ServerController {
    private String rootURL = "http://zipcode.rocks:8085";
    private String ids = "/ids";
    private String messages = "/messages";

    private static ServerController server = new ServerController();
    private ServerController(){};
    public static ServerController getServer() {
        return server;
    }
        public String getIds() throws UnirestException, IOException {
        String jsonResponse = Unirest.get(rootURL + ids)
                .asJson()
                .getBody()
                .toString();

               return jsonResponse;
        }

        public void postID(){};

        public static void main(String[] args) throws UnirestException, IOException {
            System.out.println(server.getIds());
        }

//    public JsonString idGet() {
//         url -> /ids/
//         send the server a get with url
//         return json from server
//    }
//    public JsonString idPost(Id) {
//         url -> /ids/
//         create json from Id
//         request
//         reply
//         return json
//    }
//    public JsonString idPut(Id) {
        // url -> /ids/
//    }


}

// ServerController.shared.doGet()