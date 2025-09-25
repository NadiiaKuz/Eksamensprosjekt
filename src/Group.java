import java.util.ArrayList;

public class Group {
    private int groupId;
    private ArrayList<User> listOfUsers;
    private Trip trip;

    public Group(int groupId, Trip trip) {
        this.groupId = groupId;
        this.trip = trip;
        this.listOfUsers = new ArrayList<>();
    }

    public void addUser(User user) {
        this.listOfUsers.add(user);
    }

    // Getters and Setters
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public ArrayList<User> getListOfUsers() {
        return listOfUsers;
    }

    public void setListOfUsers(ArrayList<User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }
}
