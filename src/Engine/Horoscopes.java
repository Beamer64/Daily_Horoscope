package Engine;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Horoscopes {
    String url = "https://www.ganeshaspeaks.com/horoscopes/daily-horoscope/";
    Document doc;
    
    public Horoscopes() throws IOException {
    }
    
    public void AriesHoroscope() throws IOException {
        doc = Jsoup.connect(url + "aries/").get();
    
    }
    public void TaurusHoroscope() throws IOException {
        doc = Jsoup.connect(url + "taurus/").get();
    
    }
    public void GeminiHoroscope() throws IOException {
        doc = Jsoup.connect(url + "gemini/").get();
    
    }
    public void CancerHoroscope() throws IOException {
        doc = Jsoup.connect(url + "cancer/").get();
    
    }
    public void LeoHoroscope() throws IOException {
        doc = Jsoup.connect(url + "leo/").get();
    
    }
    public void VirgoHoroscope() throws IOException {
        doc = Jsoup.connect(url + "virgo/").get();
        System.out.println(doc.toString());
    }
    public void LibraHoroscope() throws IOException {
        doc = Jsoup.connect(url + "libra/").get();
    
    }
    public void ScorpioHoroscope() throws IOException {
        doc = Jsoup.connect(url + "scorpio/").get();
        
    }
    public void SagittariusHoroscope() throws IOException {
        doc = Jsoup.connect(url + "sagittarius/").get();
        
    }
    public void CapricornHoroscope() throws IOException {
        doc = Jsoup.connect(url + "capricorn/").get();
    
    }
    public void AquariusHoroscope() throws IOException {
        doc = Jsoup.connect(url + "aquarius/").get();
    
    }
    public void PiscesHoroscope() throws IOException {
        doc = Jsoup.connect(url + "pisces/").get();
    
    }
}
