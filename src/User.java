public abstract class User {

    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password; // For now plain text (can hash later)
        this.role = role;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) &&
               this.password.equals(password);
    }

    public abstract void accessSystem();

    // Getters
    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    // Setters
    public void setRole(String role) {
        this.role = role;
    }

    public void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
        }
    }
}
