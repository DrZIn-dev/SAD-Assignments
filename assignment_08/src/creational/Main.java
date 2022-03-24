package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Current usage
        BookMetadataFormatter formatter = null;
        try {
            formatter = BookMetadataFormatterFactory.getBookMetadataFormatter(BookMetadataFormatterFactory.Format.JSON);
            formatter.append(TestData.dragonBook);
            formatter.append(TestData.dinosaurBook);
            System.out.print(formatter.getMetadataString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        // JSONBookMetadataExporter
        BookMetadataExporter exporter = new JSONBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.export(System.out);

        // CSVBookMetadataExporter
        BookMetadataExporter csvBookMetadataExporter = new CSVBookMetadataExporter();
        csvBookMetadataExporter.add(TestData.sailboatBook);
        csvBookMetadataExporter.add(TestData.GoFBook);
        csvBookMetadataExporter.export(System.out);

        // XMLBookMetadataExporter
        BookMetadataExporter xmlBookMetadataExporter = new XMLBookMetadataExporter();
        xmlBookMetadataExporter.add(TestData.sailboatBook);
        xmlBookMetadataExporter.add(TestData.GoFBook);
        xmlBookMetadataExporter.export(System.out);
    }
}
