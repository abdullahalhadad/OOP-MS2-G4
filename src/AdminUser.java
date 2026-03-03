public class AdminUser extends User {
        public AdminUser(String username, String password) {
                super(username, password, "Admin");
        }

        @Override
        public void accessSystem() {
                System.out.printLn("Accessing system administration panel...");
        }

        // Admin-spceific operations
        public void createUser(User user) {
                System.out.println("User created successfully.");
        }

        public void assignRole(User user, String role) {
                user.setRole(role);
                System.out.println("Role assigned: " + role);
        }
}
