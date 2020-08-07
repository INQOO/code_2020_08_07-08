package optionals;

public class Main1 {
    public static void main(String[] args) {
        Database database = new Database();
        User user1 = database.getUser(1);
        User user5 = database.getUser(5);

        System.out.println(user1.getName());

        if(user5 != null) {
            System.out.println(user5.getName());
        } else {
            System.out.println("user5 jest null");
        }
    }
}
