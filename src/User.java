import java.util.ArrayList;

public class User {
    private int userId;
    private String name;
    private String mail;
    private String password;
    private UserType userType;
    private Role role;
    private ArrayList<Route> favoriteRoute;
    private Ticket ticket;

    public User(int userId, String name, String mail, String password, UserType userType, Role role) {
        this.userId = userId;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.userType = userType;
        this.role = role;
        this.favoriteRoute = new ArrayList<>();
    }

    /**
      Metode for å legge til en favorittrute.
     */
    public void createFavoriteRoute(Route route) {
        this.favoriteRoute.add(route);
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public ArrayList<Route> getFavoriteRoute() {
        return favoriteRoute;
    }

    public void setFavoriteRoute(ArrayList<Route> favoriteRoute) {
        this.favoriteRoute = favoriteRoute;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}