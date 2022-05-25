package repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

public class UserStorage implements Storage {

    private HashMap<String, UserStorage> storage;

    public UserStorage(){
        storage = new HashMap<>();

    }

    public UserStorage(String name, String component, String component1) {
    }

    @Override
    public void addUser(String data){
        String[] components = data.split("\\s+");
        String name = components[1] + " " + components[2];
        storage.put(name, new UserStorage(name, components[3], components[4]));

    }

    @Override
    public void printUser() {

    }

    @Override
    public void printUsers(){
        storage.values().forEach(System.out::println);

    }
    @Override
    public void removeUser(String name){
        storage.remove(name);
    }

    @Override
    public int count() {
        return storage.size();
    }
}
