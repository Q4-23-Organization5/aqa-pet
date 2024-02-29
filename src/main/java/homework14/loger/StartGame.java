package homework14.loger;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StartGame {


    public static void main(String[] args) {

        final Logger logger = LogManager.getLogger(StartGame.class);


        logger.info("The program is running");
        Player player1 = new Player("Гравець Ярослав Кошун");
        Player player2 = new Player("Гравець Андрій Коба");
        logger.debug("Players are created: {} and {}",player1.getName(),player2.getName() );


        System.out.println(player1.getName() + ", ваш вибір:");
        player1.makeElement();
        logger.trace(player1.getName()+ " enters choice");


        System.out.println(player2.getName() + ", ваш вибір:");
        player2.makeElement();
        logger.trace(player2.getName()+ " enters choice");


        System.out.println();
        System.out.println("---------------");
        System.out.println();


        System.out.println(player1.getName() + " обрав: " + player1.getElement());
        System.out.println(player2.getName() + " обрав: " + player2.getElement());

        System.out.println();
        System.out.println("---------------");
        System.out.println();

        Logic logic = new Logic();
        logger.trace("Class Logic is started");

        logic.generateAnswer(player1, player2);
        logger.info("data processing is complete");

        logger.info("Finish program");
    }

}
