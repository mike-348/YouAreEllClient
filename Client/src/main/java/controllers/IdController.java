package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mashape.unirest.http.exceptions.UnirestException;
import models.Id;

public class IdController {
    private HashMap<String, Id> allIds;

    Id myId;

    public List<Id> getIds() throws UnirestException, IOException {
        TransactionController controller = new TransactionController();
        return controller.getIds();
    }

    public Id postId(Id id) {
        // create json from id
        // call server, get json result Or error
        // result json to Id obj


        return null;
    }

    public Id putId(Id id) {
        return null;
    }
 
}