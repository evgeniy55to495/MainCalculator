public enum Rome {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10);
    Rome (int romeNumber) {
        this.romeNumber = romeNumber;
    }
    int romeNumber;

    static int romeToArab(String a) {
        for (Rome r : Rome.values()) {
            if (r.name().equals(a)) {
                return Rome.valueOf(a).romeNumber;
            }
        }
        return 0;
    }

    static String arabToRome(int enter) {
        if (enter < 1 || enter > 100) {
            System.exit(0);
        }
        StringBuilder sb = new StringBuilder();
        while (enter >= 100) {
            sb.append("C");
            enter -= 100;
        }
        while (enter >= 90) {
            sb.append("XC");
            enter -= 90;
        }
        while (enter >= 50) {
            sb.append("L");
            enter -= 50;
        }
        while (enter >= 40) {
            sb.append("XL");
            enter -= 40;
        }
        while (enter >= 10) {
            sb.append("X");
            enter -= 10;
        }
        while (enter >= 9) {
            sb.append("IX");
            enter -= 9;
        }
        while (enter >= 5) {
            sb.append("V");
            enter -= 5;
        }
        while (enter >= 4) {
            sb.append("IV");
            enter -= 4;
        }
        while (enter >= 1) {
            sb.append("I");
            enter -= 1;
        }
        return sb.toString();
    }
}