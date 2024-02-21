package homework14.loger;

public class Logic {
    public void generateAnswer(Player player1, Player player2) {
        Element element1 = player1.getElement();
        Element element2 = player2.getElement();

        if (element1 == element2) {
            System.out.println("Нічия!");
        } else if ((element1 == Element.ROCK && element2 == Element.SCISSORS) ||
                (element1 == Element.PAPER && element2 == Element.ROCK) ||
                (element1 == Element.SCISSORS && element2 == Element.PAPER)) {
            System.out.println(player1.getName() + " перемагає!");
        } else {
            System.out.println(player2.getName() + " перемагає!");
        }
    }

}