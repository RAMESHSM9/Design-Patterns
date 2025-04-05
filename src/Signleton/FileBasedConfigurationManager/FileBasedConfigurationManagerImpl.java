package Signleton.FileBasedConfigurationManager;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    //@ all the public and protected members of FileBasedConfigurationManager accessible here

    //@ static object
    private static  FileBasedConfigurationManagerImpl fileBasedConfigurationManagerImpl;

    //@ private constructor - so not accessiable outside
    private FileBasedConfigurationManagerImpl(){

    }

    //@ have public static method to create the instance
    public static  FileBasedConfigurationManagerImpl getInstance()
    {
        if(fileBasedConfigurationManagerImpl == null)
        {
            synchronized (FileBasedConfigurationManagerImpl.class)
            {
                if(fileBasedConfigurationManagerImpl == null)
                {
                    fileBasedConfigurationManagerImpl = new FileBasedConfigurationManagerImpl();
                }
            }
        }
        return fileBasedConfigurationManagerImpl;
    }

    public static void resetInstance()
    {
        fileBasedConfigurationManagerImpl = null;
    }

    @Override
    public String getConfiguration(String key) {
        String st =  properties.getProperty(key);
        if(st == null)
            return null;
        return st;
    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        String st =  properties.getProperty(key);
        if(st == null)
            return null;

        return convert(properties.getProperty(key), type);
    }

    @Override
    public void setConfiguration(String key, String value) {
            properties.setProperty(key, value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        if(value != null)
            properties.setProperty(key, value.toString());
    }

    @Override
    public void removeConfiguration(String key) {
        properties.remove(key);
    }

    @Override
    public void clear() {
        properties.clear();
    }
}
