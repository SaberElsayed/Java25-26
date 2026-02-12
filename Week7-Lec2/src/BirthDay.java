public class BirthDay {
    private int day;
    private int month;
    private int year;

    public BirthDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "BirthDay{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
