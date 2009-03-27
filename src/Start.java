import xmpp_bot.*;

/**
 * TODO
 */
public class Start {

  /**
   * TODO
   */
  public static void main(String[] args) {
    // TODO: Andmed tuleks võtta kuskilt failist
    Server s = new Server("bot", "oopi_projekt", "conference.drop.io");
    s.listen();
  }

}
