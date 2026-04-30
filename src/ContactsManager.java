public class ContactsManager {

    // Tableau qui va contenir les objets Contact (liste des amis)
    Contact[] myFriends;

    // Variable qui garde le nombre actuel de contacts enregistrés
    int friendsCount;

    // Constructeur : s'exécute automatiquement lors de la création de l'objet
    ContactsManager() {

        // Initialisation du nombre de contacts à 0
        this.friendsCount = 0;

        // Création d'un tableau pouvant contenir jusqu'à 500 contacts
        this.myFriends = new Contact[500];
    }

    // Méthode pour ajouter un nouveau contact
    void addContact(Contact contact) {

        // Ajouter le contact à la position actuelle
        myFriends[friendsCount] = contact;

        // Incrémenter le nombre de contacts
        friendsCount++;
    }

    // Méthode pour rechercher un contact par son nom
    Contact searchContact(String searchName) {

        // Parcourir tous les contacts enregistrés
        for (int i = 0; i < friendsCount; i++) {

            // Comparer le nom du contact avec le nom recherché
            if (myFriends[i].name.equals(searchName)) {

                // Si trouvé, retourner le contact
                return myFriends[i];
            }
        }

        // Si aucun contact trouvé, retourner null
        return null;
    }
}