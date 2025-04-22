package Factory.DocumentProcessorAbstarctFactory;

import Factory.DocumentProcessorAbstarctFactory.parser.DocumentParser;
import Factory.DocumentProcessorAbstarctFactory.parser.TextDocumentParser;
import Factory.DocumentProcessorAbstarctFactory.printer.DocumentPrinter;
import Factory.DocumentProcessorAbstarctFactory.printer.TextDocumentPrinter;
import Factory.DocumentProcessorAbstarctFactory.processor.DocumentProcessor;
import Factory.DocumentProcessorAbstarctFactory.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {
    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentProcessor createProcessor(String documentName) {
        return new TextDocumentProcessor(documentName);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentParser createParser(String path) {
        return new TextDocumentParser(path);
    }
}
