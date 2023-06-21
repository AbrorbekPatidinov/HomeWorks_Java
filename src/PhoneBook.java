import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> contacts;
    public PhoneBook() {
        contacts = new HashMap<>();
    }
    public void addContact(String name, String phone) {
        Set<String> phones = contacts.getOrDefault(name, new HashSet<>());
        phones.add(phone);
        contacts.put(name, phones);
    }
    public String getPhonesByName(String name) {
        Set<String> phones = contacts.get(name);
        if (phones != null && !phones.isEmpty()) {
            return String.join(", ", phones);
        } else return "No contacts found !";
    }
    public List<String> getAllContacts() {
        List<String> result = new ArrayList<>();
        contacts.entrySet().stream().sorted((e1, e2) -> {
            return Integer.compare(e2.getValue().size(), e1.getValue().size());
        }).forEach(e -> {
            String name = e.getKey();
            Set<String> phones = e.getValue();
            if (!phones.isEmpty()) {
                result.add(name + ": " + String.join(", ", phones));
            }
        });
        return result;
    }
}
