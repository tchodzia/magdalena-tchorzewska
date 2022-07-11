import java.util.Date;

public class Guest {

    private String fName;
    private String lName;
    private Date birthdate;
    public Guest() {}

    public Guest(String fName, String lName, Date birthdate) {
        this.fName = fName;
        this.lName = lName;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
