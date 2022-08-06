package youareell;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import controllers.*;

import java.io.IOException;

public class YouAreEll {

    TransactionController tt;

    public YouAreEll (TransactionController t) {
        this.tt = t;
    }

    public static void main(String[] args) throws UnirestException, IOException {
        // hmm: is this Dependency Injection?


        YouAreEll url = new YouAreEll(new TransactionController(
               new MessageController(), new IdController()
       ));

//       tt.postId();
//        YouAreEll urlhandler = new YouAreEll(
//            new TransactionController(
//                new MessageController(), new IdController()
//        ));
//        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
//        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));
    }

//    public String get_ids() {
//        return tt.makecall("/ids", "GET", "");
//    }

//    public String get_messages() {
//        return MakeURLCall("/messages", "GET", "");
//    }


}
