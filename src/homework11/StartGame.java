public class StartGame {
    public static void main(String[] args) {


        Player player1 = new Player("Гравець Ярослав Кошун");
        Player player2 = new Player("Гравець Андрій Коба");


        System.out.println(player1.getName() + ", ваш вибір:");
        player1.makeElement();


        System.out.println(player2.getName() + ", ваш вибір:");
        player2.makeElement();


        System.out.println();
        System.out.println("---------------");
        System.out.println();


        System.out.println(player1.getName() + " обрав: " + player1.getElement());
        System.out.println(player2.getName() + " обрав: " + player2.getElement());

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        Logic logic = new Logic();

        logic.generateAnswer(player1, player2);
    }

}
