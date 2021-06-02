import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException, InterruptedException {


        String url = "https://www.cbar.az/";


        Document doc = Jsoup.connect(url).get();
        Elements divTag = doc.select("div[class=relize_item]");
        for(int i = 0;i<divTag.eachText().size();i++){
            System.out.println(divTag.eachText().get(i));

        }
    }
}
