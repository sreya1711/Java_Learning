public class Nestedif {

    public static void main(String[] args) {

        String username = "admin";
        String password = "java123";

        if (username.equals("admin")) {

            if (password.equals("java123")) {
                System.out.println("Login Successful");
            }

        }

        System.out.println("Program Ended");
    }
}