package Signleton.Logger;

/*
import java.io.FileWriter;
import java.io.IOException;

public class LoggerImpl implements Logger {

    private static LoggerImpl loggerImpl;
    private FileWriter  fileWriter;
    private String fp;
    private LoggerImpl() {}

    public static Logger getInstance() {
        if (loggerImpl == null) {
            synchronized (LoggerImpl.class) {
                if (loggerImpl == null) {
                    loggerImpl = new LoggerImpl();
                }
            }
        }
        return loggerImpl;
    }

    public static void resetInstance() {
            loggerImpl = null;
    }
    @Override
    public void log(LogLevel level, String message) {

        if(fileWriter == null) {
            throw  new IllegalStateException();
        }

        try {
            fileWriter.write(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void setLogFile(String filePath) {
        fp = filePath;
        try {
            fileWriter = new FileWriter(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getLogFile() {
        return fp;
    }

    @Override
    public void flush() {
        try {
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        try {
            fileWriter.close();
            fileWriter = null;
            fp = null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
*/