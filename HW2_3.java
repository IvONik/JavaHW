// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


import java.io.File;
import java.util.Scanner;

public class HW2_3 {
    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/lapochka/Desktop/study/java/HW2_3.txt");
        Scanner scanner = new Scanner(file); // чтение файла с помощью сканера
        String line = scanner.nextLine();
        String line2 = line.replace("{", "").replace("}","").replace(":",",");
        String [] lineData = line2.split(",");
        String family = lineData[1];
        String mark = lineData[3];
        String subject = lineData[5];
        // System.out.println(line2);
        scanner.close();        
        System.out.printf("Студент %s получил %s по предмету %s  " , family, mark, subject);
    }
    
}

