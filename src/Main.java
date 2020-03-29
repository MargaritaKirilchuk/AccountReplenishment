public class Main<total> {
    public static void main(String[] args) {
        int bonus;
        int refill = 100;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int account = 100;
        int total = account + refill + bonus;
        System.out.println(total);
    }
}

