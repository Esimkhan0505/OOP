package lab1.p5;

import java.util.Scanner;

public class DragonLaunchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DragonLaunch dl = new DragonLaunch();

        System.out.print("Enter line (B/G), e.g. BBGG or BGBG: ");
        String s = sc.next().toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'B') dl.kidnap(new Person("P" + i, Gender.BOY));
            else if (ch == 'G') dl.kidnap(new Person("P" + i, Gender.GIRL));
            else {
                System.out.println("Invalid char: " + ch + ". Use only B or G.");
                return;
            }
        }

        boolean noOneLeft = dl.willDragonEatOrNot();
        System.out.println(noOneLeft
                ? "✅ No lunch (everyone vanished)"
                : "❌ Someone left (dragon eats)");
    }
}
