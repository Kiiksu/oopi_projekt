package xmpp_bot.plugins;

import xmpp_bot.*;

/**
 * TODO
 */
public class HelloPlugin extends Plugin {
  /** TODO */
  public HelloPlugin() {
    addTrigger("hello");
  }

  /**
   * @see Plugin
   */
  public void do_work(Message m) {
    String msg = "Tere" + m.params[0];
    create_message_and_send(msg);
  }
}
