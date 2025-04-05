package Factory.DocumentProcessorAbstarctFactory.printer;

import Factory.DocumentProcessorAbstarctFactory.processor.DocumentProcessor;
import Factory.DocumentProcessorAbstarctFactory.DocumentType;

public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
