package Prototype.Configurations;

import java.util.HashMap;

//@ this has to be singleton
public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry {

    HashMap<ConfigurationType, Configuration> configurations;
    private static ConfigurationPrototypeRegistryImpl instance;
    private ConfigurationPrototypeRegistryImpl() {
        configurations = new HashMap<>();
    }

    public static ConfigurationPrototypeRegistryImpl getInstance() {
        if (instance == null) {
            synchronized (ConfigurationPrototypeRegistryImpl.class) {
                if (instance == null) {
                    instance = new ConfigurationPrototypeRegistryImpl();
                }
            }
        }
        return instance;
    }



    @Override
    public void addPrototype(Configuration user) {
        if (user.getType().equals(ConfigurationType.BASIC)) {
            configurations.put(ConfigurationType.BASIC, user);
        }
        else if (user.getType().equals(ConfigurationType.ADVANCED)) {
            configurations.put(ConfigurationType.ADVANCED, user);
        }
        else if (user.getType().equals(ConfigurationType.CUSTOM)) {
            configurations.put(ConfigurationType.CUSTOM, user);
        }
        else
        {
            configurations.put(ConfigurationType.DEFAULT, user);
        }
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        if(configurations.containsKey(type))
        {
            return configurations.get(type);
        }
        return null;
    }

    @Override
    public Configuration clone(ConfigurationType type) {

        if(configurations.containsKey(type))
        {
            return configurations.get(type).cloneObject();
        }
        return null;
    }
}
