package optionals;

public class Database {

    private User user1;

    public Database() {
        user1 = new User("John", 30);
    }

    User getUser(long id) {
        if(id == 1) {
            return user1;
        }

        return null;
    }
}
