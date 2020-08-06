package optionals;

public class Year {
    private int year;

    public Year(int year) {
        this.year = year;
        System.out.println("Year " + year);
    }

    @Override
    public String toString() {
        return "Year{" +
                "year=" + year +
                '}';
    }
}
