package Factory.DocumentProcessorAbstarctFactory;

import Factory.DocumentProcessorAbstarctFactory.parser.DocumentParser;
import Factory.DocumentProcessorAbstarctFactory.printer.DocumentPrinter;
import Factory.DocumentProcessorAbstarctFactory.processor.DocumentProcessor;

public class Main {
    public static void main(String[] args) {

        DocumentFactory documentFactory = new SpreadsheetDocumentFactory();
        DocumentProcessor dp = documentFactory.createProcessor("Doc1");

        System.out.println(dp.getDocumentName());
        dp.processDocument();

        DocumentParser documentParser = documentFactory.createParser("Doc2");
        documentParser.parseDocument();

        DocumentPrinter documentPrinter = documentFactory.createPrinter(dp);
        documentPrinter.printDocument();


    }
}
