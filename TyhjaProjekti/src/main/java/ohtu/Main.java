package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // vaihda oma opiskelijanumerosi seuraavaan
        String studentNr = "012359163";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats2017.herokuapp.com/students/"+studentNr+"/submissions";
        String urlSummary = "https://ohtustats2017.herokuapp.com/courses/1.json";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
        String bodyTextSummary = Request.Get(urlSummary).execute().returnContent().asString(); 
        
        //System.out.println("json-muotoinen data:");
        //System.out.println( bodyText );
        //System.out.println(bodyTextSummary);

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
        Summary summary = mapper.fromJson(bodyTextSummary, Summary.class);
        PrintStat print = new PrintStat(summary, subs);
        System.out.println(print.print());
        
        //System.out.println("Oliot:");
        
        //for (Submission submission : subs) {
        //    System.out.println(submission);
        //}

    }
}