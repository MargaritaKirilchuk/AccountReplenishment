public class Main<total> {
    public static void main(String[] args) {
        boolean replenished = true;
        int bonus;
        int refill = 1100;
        if (replenished) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int account = 100;
        int total = account + refill + bonus;
        System.out.println(total);
    }
}

