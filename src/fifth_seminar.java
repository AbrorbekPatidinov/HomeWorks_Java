public class fifth_seminar {
    public static void main(String[] args) {
        System.out.println();

        PhoneBook book = new PhoneBook();
        book.addContact("Ivanov", "1234567");
        book.addContact("Petrov", "2345678");
        book.addContact("Sidorov", "3456789");
        book.addContact("Ivanov", "4567890");
        book.addContact("Petrov", "5678901");
        book.addContact("Petrov", "6789012");

        System.out.println(book.getPhonesByName("Ivanov"));
        System.out.println(book.getAllContacts());

        System.out.println();
    }
}
