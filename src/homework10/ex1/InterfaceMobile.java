package ex1;

public interface InterfaceMobile {
    /**
     *  - <h3>call</h3>
     *  - <h3>send message</h3>
     */

    String calling = "I can calls";
    void call();

    default void sendMessage () {
        System.out.println("i can sends message");
    }


}
