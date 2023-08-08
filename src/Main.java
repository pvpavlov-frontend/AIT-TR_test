public class Main {
    public static void main(String[] args) {
        int day = 8;
        int month = 8;
        int year = 2023;
        System.out.println(getTypeOfMonthWithSwitchStatement(day, month, year));
    }

    public static  String getTypeOfMonthWithSwitchStatement(int day, int month, int year) {
        String typeOfMonth;
        switch (month) {
            case 1:
                typeOfMonth = " January ";
                break;
            case 2:
                typeOfMonth = " February ";
                break;
            case 3:
                typeOfMonth = " March ";
                break;
            case 4:
                typeOfMonth = " April ";
                break;
            case 5:
                typeOfMonth = " May ";
                break;
            case 6:
                typeOfMonth = " June ";
                break;
            case 7:
                typeOfMonth = " July ";
                break;
            case 8:
                typeOfMonth = " August ";
                break;
            case 9:
                typeOfMonth = " September ";
                break;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
        return day + typeOfMonth + year;
    }
}