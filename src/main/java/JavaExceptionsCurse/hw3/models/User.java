package JavaExceptionsCurse.hw3.models;

public class User {
    private String userName;
    private String userMiddleName;
    private String userSurname;
    private int phoneNumber;

    public User(String userName, String userMiddleName, String userSurname, int phoneNumber) {
        this.userName = userName;
        this.userMiddleName = userMiddleName;
        this.userSurname = userSurname;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "<" + userSurname + "><" +
                userMiddleName + "><" +
                userName + "><" +
                phoneNumber + '>';
    }
}
