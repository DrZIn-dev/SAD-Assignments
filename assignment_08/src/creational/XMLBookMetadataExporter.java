package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XMLBookMetadataExporter extends BookMetadataExporter{

    @Override
    public BookMetadataFormatter createFormatter(){
        try {
            return new XMLBookMetadataFormatter();
        }catch (ParserConfigurationException parserConfigurationException){
            parserConfigurationException.printStackTrace();
            return  null;
        }
    }
}
