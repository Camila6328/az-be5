package hw_StepProject;

public class Passengers {
    String name;
    String surname;
    String passportNo;

    public Passengers(String name, String surname, String passportNo) {
        this.name = name;
        this.surname = surname;
        this.passportNo = passportNo;
    }
    public String toStringAll() {
        return "Passengers{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passportNo='" + passportNo + '\'' +
                '}';
    }
    @Override
    public String toString() {
        return "Passengers{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
    public Passengers(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }
}
