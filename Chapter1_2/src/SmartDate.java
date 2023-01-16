public class SmartDate implements Datable {

    private int month;
    private int day;
    private int year;

    private int[] month_day = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    //{Jan, Feb, ... , leapyear Jan, leapyear Feb};
    private final int[] keyNumberForThatMonth = new int[]{1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6, 0, 3};

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
        return "" + month + " " + day + " " + year + " " + dayOfTheWeek();
    }

    public String dayOfTheWeek() {
        int x = checkDayOfTheWeek();
        return switch (x) {
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            default -> "";
        };
    }

    //https://www.almanac.com/how-find-day-week
    private int checkDayOfTheWeek() {
        int lastTwoDigitOfYear = this.year % 100;
        int oneQuarterOfTheDay = lastTwoDigitOfYear / 4;
        int dayOfTheMonth = this.day;
        int keyNumber = findKeyNumberOfTheMonth(isLeapYear(this.year));
        int sum = lastTwoDigitOfYear + oneQuarterOfTheDay + dayOfTheMonth + keyNumber;
        return (sum - 1) % 7; //searching from 2000-2099

    }

    private int findKeyNumberOfTheMonth(boolean leapYear) {
        if (this.month() >= 3) {
            return keyNumberForThatMonth[this.month() - 1];
        } else {
            if (leapYear) {
                return keyNumberForThatMonth[this.month() + 11];
            } else {
                return keyNumberForThatMonth[this.month() - 1];
            }
        }

    }
}
