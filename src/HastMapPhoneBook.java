import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HastMapPhoneBook {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        // Добавление контактов в телефонную книгу
        addContact(phoneBook, "John Doe", "12345");
        addContact(phoneBook, "Jane Smith", "54321");
        addContact(phoneBook, "John Doe", "67890");
        addContact(phoneBook, "Alice Johnson", "13579");
        addContact(phoneBook, "John Doe", "98765");

        // Сортировка и вывод контактов
        List<Map.Entry<String, List<String>>> sortedContacts = new ArrayList<>(phoneBook.entrySet());

        sortedContacts.sort((contact1, contact2) -> contact2.getValue().size() - contact1.getValue().size());

        System.out.println("Контакты в телефонной книге:");

        for (Map.Entry<String, List<String>> entry : sortedContacts) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void addContact(Map<String, List<String>> phoneBook, String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            List<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }
}
