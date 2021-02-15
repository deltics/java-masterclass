package nz.co.deltics.udemy.javamasterclass;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public void setFirstName(String value) { firstName = value; }
    public void setLastName(String value) { lastName = value; }
    public void setAge(int value) { age = (value >= 0) && (value <= 100) ? value : 0; }

    public boolean isTeen() {
        return (age >= 13) && (age <= 19);
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
