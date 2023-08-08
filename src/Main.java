public class Main {
    public static void main(String[] args) {
        int day = 8;
        int month = 8;
        int year = 2023;
        System.out.println(getTypeOfMonthWithSwitchStatement(day, month, year));
    }

    public static  String getTypeOfMonthWithSwitchStatement(int day, int month, int year) {
        String typeOfMonth = switch (month) {
            case 1 -> " January ";
            case 2 -> " February ";
            case 3 -> " March ";
            case 4 -> " April ";
            case 5 -> " May ";
            case 6 -> " June ";
            case 7 -> " July ";
            case 8 -> " August ";
            case 9 -> " September ";
            case 10 -> " October ";
            case 11 -> " November ";
            case 12 -> " December ";
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };
        return (day<10 ? "0" : "") + day + ".q" + typeOfMonth + year;
    }
}