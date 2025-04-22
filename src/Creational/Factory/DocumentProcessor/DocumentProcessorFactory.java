package Factory.DocumentProcessor;

public class DocumentProcessorFactory {
    public static DocumentProcessor createDocumentProcessor(DocumentType documentType, String documentName) {

        switch (documentType) {
            case TEXT -> {
                return new TextDocumentProcessor(documentName);
            }
            case SPREAD_SHEET -> {
                return new SpreadsheetDocumentProcessor(documentName);
            }
            case PRESENTATION -> {
                return new PresentationDocumentProcessor(documentName);
            }
        }

        throw new IllegalArgumentException("Unsupported DocumentType: " + documentType);
    }
}
