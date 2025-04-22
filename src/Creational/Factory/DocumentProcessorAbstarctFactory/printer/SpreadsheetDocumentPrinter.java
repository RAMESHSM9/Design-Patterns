package Factory.DocumentProcessorAbstarctFactory.printer;

import Factory.DocumentProcessorAbstarctFactory.processor.DocumentProcessor;
import Factory.DocumentProcessorAbstarctFactory.DocumentType;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print spreadsheet document
        System.out.println("Printing Spreed sheet Document");
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
