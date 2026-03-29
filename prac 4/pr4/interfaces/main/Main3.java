package pr4.interfaces.main;

import pr4.interfaces.model1.LogicGame;
import pr4.interfaces.model1.MemoryGame;
import pr4.interfaces.model1.iPhone;
import pr4.interfaces.services1.App;

public class Main3 {
    public static void main(String[] args) {
        App app = new App();

        LogicGame logicGame = new LogicGame();
        MemoryGame memoryGame = new MemoryGame();

        System.out.println("=== Problem 3: Game hierarchy ===");
        app.getStatistics(logicGame);
        app.getStatistics(memoryGame);

        logicGame.d();
        memoryGame.d();

        System.out.println();

        System.out.println("=== Problem 3: Sellable and Pluggable ===");
        iPhone phone = new iPhone();
        phone.sell();
        phone.plugIn();
    }
}