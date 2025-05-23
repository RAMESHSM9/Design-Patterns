package Factory.DocumentProcessorAbstarctFactory.printer;

import Factory.DocumentProcessorAbstarctFactory.processor.DocumentProcessor;
import Factory.DocumentProcessorAbstarctFactory.DocumentType;

public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}