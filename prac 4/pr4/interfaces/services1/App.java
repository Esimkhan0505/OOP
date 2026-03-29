package pr4.interfaces.services1;

import pr4.interfaces.model1.Game;

public class App {

    public void getStatistics(Game g) {
        System.out.println("Getting game statistics...");
        g.a();
        g.b();
        g.c();
    }
}