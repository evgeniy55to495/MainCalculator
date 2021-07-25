public class Check {
    static boolean checkArabic (String a, String b) {
        int x,y;
        try {
            x = Integer.parseInt(a);
            y = Integer.parseInt(b);
        } catch (Exception e) {
            return false;
        } if ((x>=1&&x<=10) && (y>=1&&y<=10)) {
            return true;
        } else {
            System.exit(0);
            return false;
        }
    }
    static boolean checkRome(String a, String b) {
        if (Rome.romeToArab(a)>0&&Rome.romeToArab(b)>0){
            return true;
        } else {
            System.exit(0);
            return false;
        }
    }
}