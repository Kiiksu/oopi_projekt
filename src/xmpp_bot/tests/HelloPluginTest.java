package xmpp_bot.tests;

// boti asjad
import xmpp_bot.*;
import xmpp_bot.plugins.HelloPlugin;

// Testimiseks
import org.jmock.Mockery;
import org.jmock.Expectations;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.*;
import org.junit.Assert.*;
import org.junit.runner.RunWith;

@RunWith(JMock.class)
public class HelloPluginTest {
  private Mockery context = new JUnit4Mockery() {{
    setImposteriser(ClassImposteriser.INSTANCE);
  }};
  private HelloPlugin plugin = context.mock(HelloPlugin.class);

  @Test
  public void testWithOneParam() {
    // saabunud kiri
    final Message m = new Message();
    m.params = new String[2];
    m.params[0] = "Inimene";

    // ootused (expectations)
    context.checking(new Expectations() {{
      oneOf(plugin).create_and_send_message("Tere Inimene");
    }});

    // testimine
    plugin.do_work(m);
  }
}
