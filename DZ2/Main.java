

/*
 * запускалка генеалогического дерева
 */


import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in, "Cp866");
    public static void main(String[] args) {



        
        //создаём меню и его обработку
        boolean stopWhile = true;
        while (stopWhile){
            System.out.println(menu());
            int whatDo = input.nextInt();
            switch(whatDo) {
            case 1: 
                System.out.println("Тут будет - Загрузка из файла списка людей и связей между ними");
                break;
            case 2:
                System.out.println("Тут будет - Просмотреть список людей");
                break;
            case 3:
                System.out.println("Тут будет - Посмотреть родственные связи между людьми");
                break;
            case 4:
                System.out.println("Тут будет - Сохранить в файл список людей и связей между ними");
                break;                                
            case 5:
                stopWhile = false;
                break;
            default:
                System.out.println((char) 27 + "[31mНет такого пункта меню!"+ (char)27 + "[0m");
            }
        }
        

        
    }






    // создаём меню 
    private static String menu() {
        String menuStr = new StringBuilder()
        .append((char) 27 + "[34m\nВыберите действие: \n"+ (char)27 + "[0m")
        .append("1 - Загрузить из файла список людей и связи \n")
        .append("2 - Посмотреть людей \n")
        .append("3 - Посмотреть родственные связи \n")
        .append("4 - Сохранить в фаайл список людей и связи \n")
        .append("5 - Выход ")
        .toString();

        return menuStr;
    } 

}