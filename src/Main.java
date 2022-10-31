public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Ivanov Ivan", "89250000000");
        phoneBook.addContact("Ivanov Ivan2", "89250000001");
        phoneBook.addContact("Ivanov Ivan3", "89250000002");
        phoneBook.addContact("Ivanov Ivan4", "89250000003");
        phoneBook.addContact("Ivanov Ivan5", "89250000004");

        phoneBook.printAllContacts();
        System.out.println();

        System.out.println("Phone book current size: " + phoneBook.getCurrentSize());
        System.out.println();

        phoneBook.findContact("Ivanov Ivan4");
        System.out.println();

        phoneBook.removeContact("Ivanov Ivan4");
        phoneBook.findContact("Ivanov Ivan4");


        phoneBook.printAllContacts();

        System.out.println();
        System.out.println("Phone book current size: " + phoneBook.getCurrentSize());

        System.out.println(new Contact("Ivan", "123"));
        Contact c = new Contact("Ivan", "123");
        String s = c.toString();
        System.out.println(s);

        //Contact c = new Contact("Ivan", "123");
        Contact c2 = new Contact("Ivan", "123");
        System.out.println(c.equals(c2));

        Contact c22 = c;

        System.out.println(c.equals(c22));


        ////////////////////////////////////////////////////////////////////////////
        PersonService personSerive = new PersonService();
        Person sara = new Person("Sara", 30);
        if (personSerive.isAdult(sara)) {
            System.out.println("You can go to bar");
        } else{
            System.out.println("Go to school");
        }
        System.out.println(sara);
        //sara.setAge(-9);


    }
}