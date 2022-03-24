package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) {
        BookMetadataFormatter bookMetadataFormatter = createFormatter();
        for (Book book: books){
            bookMetadataFormatter.append(book);
        }
        stream.println(bookMetadataFormatter.getMetadataString());
    }

    public abstract BookMetadataFormatter createFormatter();
}
