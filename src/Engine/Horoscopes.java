package Engine;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static org.apache.commons.lang3.text.WordUtils.wrap;

public class Horoscopes {
    
    String url = "https://www.horoscope.com/us/horoscopes/general/";
    
    Document doc = Jsoup.connect(url).get();
    
    public Horoscopes() throws IOException {
    }
    
    public void AriesHoroscope() throws IOException {
        doc = Jsoup.connect(url + "horoscope-general-daily-today.aspx?sign=1").get();
        parseScopeDescription(doc);
    }
    
    public void TaurusHoroscope() throws IOException {
        doc = Jsoup.connect(url + "horoscope-general-daily-today.aspx?sign=2").get();
        parseScopeDescription(doc);
    }
    
    public void GeminiHoroscope() throws IOException {
        doc = Jsoup.connect(url + "horoscope-general-daily-today.aspx?sign=3").get();
        parseScopeDescription(doc);
    }
    
    public void CancerHoroscope() throws IOException {
        doc = Jsoup.connect(url + "horoscope-general-daily-today.aspx?sign=4").get();
        parseScopeDescription(doc);
    }
    
    public void LeoHoroscope() throws IOException {
        doc = Jsoup.connect(url + "horoscope-general-daily-today.aspx?sign=5").get();
        parseScopeDescription(doc);
    }
    
    public void VirgoHoroscope() throws IOException {
        doc = Jsoup.connect(url + "horoscope-general-daily-today.aspx?sign=6").get();
        parseScopeDescription(doc);
    }
    
    public void LibraHoroscope() throws IOException {
        doc = Jsoup.connect(url + "horoscope-general-daily-today.aspx?sign=7").get();
        parseScopeDescription(doc);
    }
    
    public void ScorpioHoroscope() throws IOException {
        doc = Jsoup.connect(url + "horoscope-general-daily-today.aspx?sign=8").get();
        parseScopeDescription(doc);
    }
    
    public void SagittariusHoroscope() throws IOException {
        doc = Jsoup.connect(url + "horoscope-general-daily-today.aspx?sign=9").get();
        parseScopeDescription(doc);
    }
    
    public void CapricornHoroscope() throws IOException {
        doc = Jsoup.connect(url + "horoscope-general-daily-today.aspx?sign=10").get();
        parseScopeDescription(doc);
    }
    
    public void AquariusHoroscope() throws IOException {
        doc = Jsoup.connect(url + "horoscope-general-daily-today.aspx?sign=11").get();
        parseScopeDescription(doc);
    }
    
    public void PiscesHoroscope() throws IOException {
        doc = Jsoup.connect(url + "horoscope-general-daily-today.aspx?sign=12").get();
        parseScopeDescription(doc);
    }
    
    //parses web page and finds the horoscope description, then displays the text
    private void parseScopeDescription(Document doc) throws IOException {
        //finds horoscope description
        Element link = doc.select("p").get(0);
        
        System.out.println(wrap(link.text(), 75));
        Main.ScopeSelection();
    }
}
