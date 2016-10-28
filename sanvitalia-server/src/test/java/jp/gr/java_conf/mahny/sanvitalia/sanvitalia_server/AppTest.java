package jp.gr.java_conf.mahny.sanvitalia.sanvitalia_server;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author mahny
 *
 */
public class AppTest {

	/**
	 * {@link jp.gr.java_conf.mahny.sanvitalia.sanvitalia_server.App#say(java.lang.String)} のためのテスト・メソッド。
	 */
	@Test
	public void testSay() {
		assertThat(App.say("こんにちは、世界！"), is("こんにちは、世界！"));
	}

}
