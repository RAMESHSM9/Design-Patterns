package Factory.DocumentProcessorAbstarctFactory;

import Factory.DocumentProcessorAbstarctFactory.parser.DocumentParser;
import Factory.DocumentProcessorAbstarctFactory.parser.SpreadsheetDocumentParser;
import Factory.DocumentProcessorAbstarctFactory.printer.DocumentPrinter;
import Factory.DocumentProcessorAbstarctFactory.printer.SpreadsheetDocumentPrinter;
import Factory.DocumentProcessorAbstarctFactory.processor.DocumentProcessor;
import Factory.DocumentProcessorAbstarctFactory.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {
    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentProcessor createProcessor(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentParser createParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }
}
