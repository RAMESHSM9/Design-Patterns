package Factory.DocumentProcessorAbstarctFactory.parser;

import Factory.DocumentProcessorAbstarctFactory.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse spreadsheet document
        System.out.println("Parsing spread sheet Document");
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
