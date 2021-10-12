package polymorphicsorting;
public class SalePerson implements Comparable<SalePerson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString() {
        return lastName + " " + firstName + " : " + Integer.toString(totalSales);
    }

    public boolean equals(SalePerson other) {
        return (this.firstName == other.firstName && this.lastName == other.lastName);
    }

    public int compareTo(SalePerson other) {
        if (this.totalSales != other.totalSales) return this.totalSales - other.totalSales;

        //String [] list = {this.lastName, other.lastName};
        if (this.lastName.compareTo(other.lastName) < 0) return 1;
        else return -1;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getTotalSales() {
        return this.totalSales;
    }
}
