package xmpp_bot;

import java.util.ArrayList;

/**
 * TODO
 */
public abstract class Plugin {
  /** TODO */
  private ArrayList<String> triggers;

  /**
   * TODO
   *
   * @param trigger TODO
   */
  public void addTrigger(String trigger) {
    triggers.add(trigger);
  }

  /**
   * TODO
   *
   * @param m Message objekt
   */
  public abstract void do_work(Message m);

  /**
   * TODO
   *
   */
  public void create_and_send_message(String msg) {
    Message m = new Message();
    m.message = msg;
    // seada vajalikud parameetrid messagele.
    // TODO: Saata message MessageHandler-ile
  }
}
