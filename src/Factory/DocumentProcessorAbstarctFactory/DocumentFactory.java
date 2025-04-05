package Factory.DocumentProcessorAbstarctFactory;

import Factory.DocumentProcessorAbstarctFactory.parser.DocumentParser;
import Factory.DocumentProcessorAbstarctFactory.printer.DocumentPrinter;
import Factory.DocumentProcessorAbstarctFactory.processor.DocumentProcessor;



public abstract class DocumentFactory {
    public abstract DocumentType supportsType();
    public abstract DocumentProcessor createProcessor(String documentName);
    public abstract DocumentPrinter createPrinter(DocumentProcessor processor);
    public abstract DocumentParser createParser(String path);
}
