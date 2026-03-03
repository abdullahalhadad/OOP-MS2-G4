public abstract class User {

  private String username;
  private String password;
  private String role;

  public User(String username, String password, String role) [
    this.username = username;
    this.password = password;
    this.role = role;
}

    public boolean login(String username, String password) {
      return this.usernamne.equals(username) && this.password.equals(password);
}

  public abstract void accessSystem();

  public String getRole() {
      return role;
}

    public void setRole(String role) {
        this.role = role;
  }
}
