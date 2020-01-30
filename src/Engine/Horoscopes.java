package Engine;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

import static org.apache.commons.lang3.text.WordUtils.wrap;

public class Horoscopes {
    
    String url = "https://www.ganeshaspeaks.com/horoscopes/daily-horoscope/";
    
    Document doc = Jsoup.connect(url).get();
    
    public Horoscopes() throws IOException {
    }
    
    public void AriesHoroscope() throws IOException {
        doc = Jsoup.connect(url + "aries/").get();
        parseScopeDescription(doc);
    }
    
    public void TaurusHoroscope() throws IOException {
        doc = Jsoup.connect(url + "taurus/").get();
        parseScopeDescription(doc);
    }
    
    public void GeminiHoroscope() throws IOException {
        doc = Jsoup.connect(url + "gemini/").get();
        parseScopeDescription(doc);
    }
    
    public void CancerHoroscope() throws IOException {
        doc = Jsoup.connect(url + "cancer/").get();
        parseScopeDescription(doc);
    }
    
    public void LeoHoroscope() throws IOException {
        doc = Jsoup.connect(url + "leo/").get();
        parseScopeDescription(doc);
    }
    
    public void VirgoHoroscope() throws IOException {
        doc = Jsoup.connect(url + "virgo/").get();
        parseScopeDescription(doc);
    }
    
    public void LibraHoroscope() throws IOException {
        doc = Jsoup.connect(url + "libra/").get();
        parseScopeDescription(doc);
    }
    
    public void ScorpioHoroscope() throws IOException {
        doc = Jsoup.connect(url + "scorpio/").get();
        parseScopeDescription(doc);
    }
    
    public void SagittariusHoroscope() throws IOException {
        doc = Jsoup.connect(url + "sagittarius/").get();
        parseScopeDescription(doc);
    }
    
    public void CapricornHoroscope() throws IOException {
        doc = Jsoup.connect(url + "capricorn/").get();
        parseScopeDescription(doc);
    }
    
    public void AquariusHoroscope() throws IOException {
        doc = Jsoup.connect(url + "aquarius/").get();
        parseScopeDescription(doc);
    }
    
    public void PiscesHoroscope() throws IOException {
        doc = Jsoup.connect(url + "pisces/").get();
        parseScopeDescription(doc);
    }
    
    //parses web page and finds the horoscope description, then displays the text
    private void parseScopeDescription(Document doc) throws IOException {
        //finds horoscope description
        Element link = doc.select("p").get(2);
    
        System.out.println(wrap(link.text(), 75));
        Main.ScopeSelection();
    }
}
