public class ConvertRomanNumber {

    public static void main(String[] args) {
        System.out.println(convertRomanNumber("MMCCXC"));
    }

    public static int convertRomanNumber(String romaChart) {
        String[] romaCharts = (romaChart.split(""));

        int result = 0;
        for (int i = 0; i < romaCharts.length; i++) {
            for (int j = i + 1; j < romaCharts.length; j++) {
                if (checkRomaChart(romaCharts[i]) >= checkRomaChart(romaCharts[i + 1])) {
                    break;
                } else {
                    result = result - 2 * checkRomaChart(romaCharts[i]);
                }
            }
            result += checkRomaChart(romaCharts[i]);

        }
        return result;
    }

    public static int checkRomaChart(String roma) {
        int value = 0;
        switch (roma.toUpperCase()) {
            case "I":
                value = 1;
                break;
            case "V":
                value = 5;
                break;
            case "X":
                value = 10;
                break;
            case "L":
                value = 50;
                break;
            case "C":
                value = 100;
                break;
            case "D":
                value = 500;
                break;
            case "M":
                value = 1000;
                break;
        }
        return value;
    }
}
