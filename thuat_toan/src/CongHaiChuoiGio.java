public class CongHaiChuoiGio {
    public static void main(String[] args) {
        System.out.println(addTimeString("10:12:12", "13:13:13"));
    }

    public static String addTimeString(String str1, String str2) {
        int[] arrTime1 = new int[3];
        int[] arrTime2 = new int[3];
        String[] timeString1 = str1.split(":");
        String[] timeString2 = str2.split(":");
        for (int i = 0; i < timeString1.length; i++) {
            arrTime1[i] = Integer.parseInt(timeString1[0]);
            arrTime2[i] = Integer.parseInt(timeString2[0]);
        }
        int d = 0;
        int hh;
        int mm;
        int ss;
        ss = arrTime1[2] + arrTime2[2];
        mm = arrTime1[1] + arrTime2[1];
        hh = arrTime1[0] + arrTime2[0];
        if (ss >= 60) {
            ss -= 60;
            mm += 1;
        }
        if (mm >= 60) {
            mm -= 60;
            hh += 1;
        }
        if (hh >= 24) {
            hh -= 24;
            d += 1;
        }
        if (d == 0) {
            return String.format("%02d:%02d:%02d", hh, mm, ss);
        } else {
            String result = String.format("%02d:%02d:%02d", hh, mm, ss);
            return "1 day " + result;
        }
    }
}
