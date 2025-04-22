package Prototype.UserClone;

import java.util.HashMap;

public class UserPrototypeRegistryImpl implements UserPrototypeRegistry {

    HashMap<UserType, User> users;
    public UserPrototypeRegistryImpl() {
        users = new HashMap<>();
    }
    @Override
    public void addPrototype(User user) {
        if (!users.containsKey(user.getType())) {
            users.put(user.getType(), user);
        }
    }

    @Override
    public User getPrototype(UserType type) {
        if (!users.containsKey(type)) {
            return null;
        }
        return users.get(type);
    }

    @Override
    public User clone(UserType type) {
        if (!users.containsKey(type)) {
            return null;
        }
        return users.get(type).cloneObject();
    }
}
