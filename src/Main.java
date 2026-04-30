public class Main {

    public static void main(String[] args) {

        // Création du gestionnaire de contacts
        // Cet objet permet d'ajouter et de rechercher des contacts
        ContactsManager myContactsManager = new ContactsManager();

        // ======== Création et ajout des contacts ========

        // Contact 1
        Contact contact1 = new Contact(); // Création d’un objet Contact vide
        contact1.name = "Jean";           // Attribution du nom
        contact1.phoneNumber = "0102030405"; // Attribution du numéro
        myContactsManager.addContact(contact1); // Ajout au gestionnaire

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

        // ======== Recherche d’un contact ========

        // On recherche un contact par son nom ("Marie")
        Contact result = myContactsManager.searchContact("Marie");

        // Vérification du résultat de la recherche
        if (result != null) {

            // Si le contact est trouvé, afficher son numéro
            System.out.println("Numéro trouvé : " + result.phoneNumber);

        } else {

            // Si aucun contact n'est trouvé
            System.out.println("Contact non trouvé");
        }
    }
}