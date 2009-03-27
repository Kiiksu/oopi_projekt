package xmpp_bot;

import java.util.ArrayList;
import xmpp_bot.plugins.*;

/**
 * TODO
 */
public class RoutingDispatcher {
  /** TODO */
  private ArrayList<Plugin> plugins;

  /** TODO */
  public RoutingDispatcher() {
    addPlugin(new HelloPlugin());
  }

  /**
   * TODO
   *
   * @param m Message objekt
   */
  public void dispatch(Message m) {
    // siin tuleks käia läbi kõik pluginad ning kontrollida missugune neist
    // sööb seda kirja. Võib juhtuda, et on ka mitu pluginat
  }

  /** TODO */
  private void addPlugin(Plugin p) {
    plugins.add(p);
  }
}
