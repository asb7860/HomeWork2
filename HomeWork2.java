class HomeWork2 {
 public static void main(String[] args) {
        System.out.println(doTask1(1, 7));
        doTask2(9);
        System.out.println(doTask3(-23));
        doTask4("Anna", 10);
    }

    public static boolean doTask1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void doTask2(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }

    public static boolean doTask3(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void doTask4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
}