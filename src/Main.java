import repository.Storage;
import repository.UserStorage;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static final String ADD_COMMAND_EXAMPLE = "add Иван Петров 78001234545 testmail@mail.ru";
    public static final String LIST = "list";
    public static final String REMOVE = "remove Иван Петров";
    public static final String COMMANDS_EXAMPLE = ADD_COMMAND_EXAMPLE + "\nlist\ncount\nremove Иван Петров";
    public static final String COMMAND_ERROR_INPUT = "Wrong command! Available commands examples: \n" + COMMANDS_EXAMPLE;
    public static final String COMMAND_HELP = "Commands examples: \n" + COMMANDS_EXAMPLE;

    public static void main(String[] args){
        Storage userStorage = new UserStorage();
        while (true){
            System.out.println("Введите команду: ");
            String command = new Scanner(System.in).nextLine();
            if (command.toLowerCase().startsWith("add")){
                userStorage.addUser(command);
            } else if (command.toLowerCase().startsWith("list")){
                userStorage.printUsers();
            } else if (command.toLowerCase().startsWith("remove")){
                userStorage.removeUser(command.split("\\s+",2)[1]);
            } else if (command.toLowerCase().matches("count")){
                System.out.println("There're " + userStorage.count() + " users");
            } else if (command.toLowerCase().startsWith("help")){
                System.out.println(COMMAND_HELP);
            } else {
                System.out.println(COMMAND_ERROR_INPUT);
            }
        }
    }
}
