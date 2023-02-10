// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что один человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HW_5_1 {
    

    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put ("Ivanov", List.of("46454464", "34556543"));
        phoneBook.put ("Ivanova", List.of("46455656" ));
        phoneBook.put ("Petrov", List.of("45435454", "57464647"));
        phoneBook.put ("Sidorov",List.of("56456565", "45535353" ));
        phoneBook.put ("Sidorova",List.of("56564654" ));
        phoneBook.put ("Petrova", List.of("87876454", "76575775"));
        
        System.out.println("телефонная книга:");
        System.out.println(phoneBook);
        find(phoneBook);
    }
    private static String scanned() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine(); 
        scanner.close();       
        return scan;
    }         
    public static void find (Map<String, List<String>> phoneBook) {
        System.out.println("Введите имя: ");
        String scan = scanned();
        // System.out.println(phoneBook.get(scan));
        System.out.printf("%s", phoneBook.get(scan));

}
}
