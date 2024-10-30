public class GetLoopy {
    public static void main(String[] args) {
        System.out.println("Task 1: Count up by 1 from 0 to 30");
        task1();

        System.out.println("\nTask 2: Count down by 1 from 30 to 0");
        task2();

        System.out.println("\nTask 3: Count up by 3 from 0 to 18");
        task3();

        System.out.println("\nTask 4: Count down by 2 from 10 to 0");
        task4();

        System.out.println("\nTask 5: Triangle Pattern");
        task5();

        System.out.println("\nTask 6: Inverted Triangle Pattern");
        task6();

        System.out.println("\nTask 7: Square Pattern");
        task7();
    }

    // Task 1: Count up by 1 from 0 to 30
    public static void task1() {
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 2: Count down by 1 from 30 to 0
    public static void task2() {
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 3: Count up by 3 from 0 to 18
    public static void task3() {
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 4: Count down by 2 from 10 to 0
    public static void task4() {
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Task 5: Triangle Pattern
    public static void task5() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Task 6: Inverted Triangle Pattern
    public static void task6() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Task 7: Square Pattern
    public static void task7() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
