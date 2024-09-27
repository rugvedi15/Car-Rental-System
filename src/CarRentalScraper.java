import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CarRentalScraper {
    private final String url;
    private final String textFileName;

    public CarRentalScraper(String url, String textFileName) {
        this.url = url;
        this.textFileName = textFileName;
    }

    public void saveData() {
        try {
            parseAndSaveData(url, textFileName);
            System.out.println("Data saved to " + textFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void parseAndSaveData(String url, String outputFile) throws IOException {
        Document doc = Jsoup.connect(url).get();
        String path = "/Users/rishinpandit/Desktop/Projects/Car Rental Project/FinalProject 4/htmlparser/" + outputFile;
        Elements allElements = doc.getAllElements();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (Element element : allElements) {
                String elementText = element.text();
                writer.write(elementText);
                writer.newLine();
            }
        }
    }
}
