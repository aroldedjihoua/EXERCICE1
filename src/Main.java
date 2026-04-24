public class Main {


        public static void main(String[] args) {

            // Création du gestionnaire
            ContactsManager myContactsManager = new ContactsManager();

            // Contact 1
            Contact contact1 = new Contact();
            contact1.name = "Jean";
            contact1.phoneNumber = "0102030405";
            myContactsManager.addContact(contact1);

            // Contact 2
            Contact contact2 = new Contact();
            contact2.name = "Marie";
            contact2.phoneNumber = "0708091011";
            myContactsManager.addContact(contact2);

            // Contact 3
            Contact contact3 = new Contact();
            contact3.name = "Paul";
            contact3.phoneNumber = "1112131415";
            myContactsManager.addContact(contact3);

            // Contact 4
            Contact contact4 = new Contact();
            contact4.name = "Sophie";
            contact4.phoneNumber = "1617181920";
            myContactsManager.addContact(contact4);

            // Contact 5
            Contact contact5 = new Contact();
            contact5.name = "Alice";
            contact5.phoneNumber = "2122232425";
            myContactsManager.addContact(contact5);

            // Recherche d’un contact
            Contact result = myContactsManager.searchContact("Marie");

            if (result != null) {
                System.out.println("Numéro trouvé : " + result.phoneNumber);
            } else {
                System.out.println("Contact non trouvé");
            }
        }

}
