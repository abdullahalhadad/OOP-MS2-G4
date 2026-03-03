public class AdminUser extends User {
        public AdminUser(String username, String password) {
                super(username, password, "Admin");
        }

        @Override
        public void accessSystem() {
                System.out.println("Accessing system administration panel...");
        }

        // Admin-spceific operations
        public void createUser(User user) {
                System.out.println("Admin created user: " + user.getUsername());
        }

        public void assignRole(User user, String role) {
                user.setRole(role);
                System.out.println("Role assigned: " + role);
        }
}

