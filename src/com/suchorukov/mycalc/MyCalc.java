package com.suchorukov.mycalc;

//import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by IT-Academy on 19.09.2015.
 */
public class MyCalc {
    Map<String, Command> commandMap = new HashMap<>();
    void MyCalc(){
        commandMap.put("push", new Push());

    }

    public void performCalc(Scanner scanner) {
        System.out.println();
        String strCommands;
        System.out.println("Введите команду:");
        while (scanner.hasNext()){
            strCommands  = scanner.nextLine();
//            System.out.println("Команда: " + strCommands);
            String[] arrCommands = strCommands.split(" ");
            String cmdName = arrCommands[0].toLowerCase();
            System.out.println("Имя команды: " + cmdName);
            Command cmdObj = commandMap.get(cmdName);
            if(arrCommands.length > 1 && arrCommands[1] != null) {
                String cmdVal = arrCommands[1];
                System.out.println("Аргумент команды: " + cmdVal);
            }
            if(cmdName.toLowerCase().equals("exit"))
            {
                break;
            }
            System.out.println("Введите ещё команду:");
        }
        System.out.println("Завершаем работу калькулятора.");

    }
}
