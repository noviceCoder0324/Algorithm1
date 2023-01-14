public class SmartDate implements Datable {

    private int month;
    private int day;
    private int year;

    private int[] month_day = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public SmartDate(int month, int day, int year) {
        check(month, day, year);
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private boolean check(int month, int day, int year) {
        if (year < 0) {
            throw new IllegalArgumentException("year should be bigger than 0");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("month should be bigger than 1 or less than 12");
        }
        if (isLeapYear(year)) {
            month_day[1] = 29;
        }
        if (day < 1 || day > month_day[month - 1]) {
            throw new IllegalArgumentException(String.format("month is %d, day must between 1~%d\n", month, month_day[month]));
        }
        return true;
    }

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    public String toString() {
        return "" + month + " " + day + " " + year;
    }
}
