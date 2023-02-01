// 1. В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
// Значения null не включаются в запрос.

import java.io.File;
// import java.util.Arrays;
import java.util.Scanner;

public class HW2_1 {   
public static void main(String[] args) throws Exception {

    File file = new File("C:/Users/lapochka/Desktop/study/java/HW2_1.txt");
    Scanner scanner = new Scanner(file); // чтение файла с помощью сканера
    String line = scanner.nextLine();
    String line2 = line.replace("{", "").replace("}","").replace(":","=");
    String [] lineData = line2.split(",");
    
    scanner.close();

    StringBuilder result = new StringBuilder("SELECT * FROM students WHERE");
    
    for (int i =0; i < lineData.length; i++) {        
        if(lineData[1].equals("null") == false) {
            result.append(lineData[0]);
            result.append(" AND ");
            result.append(lineData[1]);
            result.append(" AND ");
            result.append(lineData[2]);
            }            
        }
    System.out.println(result);    
    }    
}

// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";