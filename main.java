// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации 
// можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package HW.HW_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        List<noteBooks> noteBooks = new ArrayList<>();

        noteBooks note1 = new noteBooks("Aser", "Windows", "aaa", "8", "256");       
        noteBooks.add(note1);
        noteBooks note2 = new noteBooks("Apple", "MacOS", "sss", "16", "512");        
        noteBooks.add(note2);
        noteBooks note3 = new noteBooks("Asus", "Windows", "ddd", "16", "512");        
        noteBooks.add(note3);
        noteBooks note4 = new noteBooks("Apple", "MacOS", "fff", "16", "512");        
        noteBooks.add(note4);
        noteBooks note5 = new noteBooks("Aser", "Windows", "ggg", "4", "128");       
        noteBooks.add(note5);

        System.out.println("Достуаные варианты:");
        for (noteBooks elem : noteBooks) {
            System.out.println(elem);
        }
        
        select(noteBooks);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        // scanner.close();
        return scan;
    }


// ПОСЛЕДОВАТЕЛЬНЫЙ ВЫБОР. выбираем производителя, программа предлагает доступные варианты, потом выбираем марку, программа выбирает ноутбуки из уже отобранных по предыдущему запросу

//     public static void select(List<noteBooks> noteBooks) {

//         Set<String> select = new HashSet<>();
        
//             System.out.println("Введите желаемые характеристики: производитель: ");
//             String manufacturer = scanner();

//             for (noteBooks elem : noteBooks) {
//                 String str = elem.toString();
//                 if (str.contains(manufacturer)) {
//                     select.add(str);
//                     System.out.println(str);
//                 } else {
//                     System.out.println("Такого в наличии нет.");
//                     break;
//                 }
//             }
//             // }

//             System.out.println("Введите желаемые характеристики: OC(Windows, MacOS): ");
//             String OS = scanner();

//             for (String elem : select) {
//                 String str = elem.toString();
//                 if (str.contains(OS)) {
//                     select.add(str);
//                     System.out.println(str);
//                 } else {
//                     System.out.println("Такого в наличии нет.");
//                 }
//             }

//             System.out.println("Введите модель: ");
//             String model = scanner();

//             for (String elem : select) {
//                 String str = elem.toString();
//                 if (str.contains(model)) {
//                     select.add(str);
//                     System.out.println(str);
//                 } else {
//                     System.out.println("Такого в наличии нет.");
//                 }
//             }

        

//     }
// }



// выбор по конкретной характеристике
        public static void select (List<noteBooks> noteBooks) {           
            
            System.out.println("Введите желаемые характеристики: 1 - производитель, 2 - ОС, 3 - модель, 4 - оперативная память, 5 - жесткий диск ");
            String userSelect = scanner();
                if( userSelect.equals("1")){                   
                   
                    selectManufacturer(noteBooks);
                }
                if  (userSelect.equals("2")){
                    selectOS(noteBooks);
                }
                if (userSelect.equals("3")){
                    selectModel(noteBooks);
                }
                if (userSelect.equals("4")){
                    selectRAM(noteBooks);
                }
                if (userSelect.equals("5")){
                    selectHardDrive(noteBooks);
                }
        }

      
        public static void  selectManufacturer(List<noteBooks> noteBooks) {  
            Set<String> select = new HashSet<>();
            System.out.println("Введите желаемые характеристики: производитель: ");
            String manufacturer = scanner();
            System.out.println("Достуаные варианты:");
            for (noteBooks elem : noteBooks) {
                String str = elem.toString();
                if (str.contains(manufacturer)) {                    
                    System.out.println(str);
                }                 
            }
        }
    

        public static void selectOS(List<noteBooks> noteBooks) {
        System.out.println("Введите желаемые характеристики: OC(Windows, MacOS): ");
        String OS = scanner();
        System.out.println("Достуаные варианты:");
        for (noteBooks elem : noteBooks) {
                String str = elem.toString();
                if (str.contains(OS)) {                    
                    System.out.println(str);
                }                
            }
        }


        public static void selectModel(List<noteBooks> noteBooks) {
            System.out.println("Введите модель: ");
            String model = scanner();
            System.out.println("Достуаные варианты:");
            for (noteBooks elem : noteBooks) {
                String str = elem.toString();
                if (str.contains(model)) {                   
                    System.out.println(str);                
                }            
            }
        }

        public static void selectRAM(List<noteBooks> noteBooks) {
            System.out.println("Введите оперативную память 4/8/16 Гб: ");
            String RAM = scanner();
            System.out.println("Достуаные варианты:");
            for (noteBooks elem : noteBooks) {
                String str = elem.toString();
                if (str.contains(RAM)) {                 
                    System.out.println(str);                
                }
            }
        }

        public static void selectHardDrive(List<noteBooks> noteBooks) {
            System.out.println("Жесткий диск 128/256/512 Гб: ");
            String HardDrive = scanner();
            System.out.println("Достуаные варианты:");
            for (noteBooks elem : noteBooks) {
                String str = elem.toString();
                if (str.contains(HardDrive)) {                
                    System.out.println(str);                
                }
            }
        }
}

