package xmpp_bot;

import java.util.ArrayList;

/**
 * MessageHandler klass (Singleton)
 * Tegeleb kirjade vastu võtmisega ning saatmisega.
 */
public class MessageHandler {
  /** TODO */
  private static MessageHandler ref;

  /** TODO Võimalik, et on vaja kasutada sünkroniseerimist */
  private ArrayList<String> queue;

  /** TODO */
  private MessageHandler() {
  }

  /** TODO */
  public static MessageHandler getInstance() {
    if(ref == null) {
      ref = new MessageHandler();
    } 
    return ref;
  }
  
  /** Seda objekti ei tohi lasta kloonida */
  public Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException(); 
  }

  /**
   * Tegeleb kirjade vastuvõtmisega
   *
   * @param s String tüüpi XML formaadis kiri
   */
  public void receive(String s) {
    // TODO
    // XML vaja lahti parseda ning lõpuks vaja saada Message objekt
    // Edasi tuleb see Message saata RoutingDispatcherile
    // RoutingDispatcher peaks olema saadaval selles klassis kogu aeg.
    // St. ei tee kogu aeg uut objekti.
  }

  /**
   * Tegeleb kirjade saatmisega
   *
   * @param m Message objekt
   */
  public void send(Message m) {
    // TODO
    // Message vaja konvertida XMLiks ning lisada 
    // see saadetavate kirjade järjekord
  }
}
