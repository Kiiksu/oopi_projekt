package xmpp_bot;

/**
 * TODO
 */
public class Server {
  private String name;
  private String room;
  private String server;

  /**
   * TODO
   *
   * @param name TODO
   * @param room TODO
   * @param server TODO
   */
  public Server(String name, String room, String server) {
    this.name = name;
    this.room = room;
    this.server = server;
  }

  /**
   * TODO
   */
  public void listen() {
    while(true) {
      // TODO
      // siin tuleks tekitada ühendus serveriga ning seda hoida.
      // begin rescue commandid võivad samuti kasuks tulla.
      // peale ühenduse tekitamist peab server saatma iga sissetuleva
      // kirja MessageHandlerisse ning aegajalt kontrollima MessageHandlerist
      // kas on vaja midagi välja saata
    }
  }
}
