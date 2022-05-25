package repository;

public interface Storage {
    void addUser(String data);
    void printUser();

    void printUsers();

    void removeUser(String name);
    int count();
}
