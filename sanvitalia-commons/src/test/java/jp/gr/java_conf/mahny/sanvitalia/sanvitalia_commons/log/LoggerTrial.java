package jp.gr.java_conf.mahny.sanvitalia.sanvitalia_commons.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTrial {

	@Test
	public void test() {

		Logger log = LoggerFactory.getLogger(LoggerTrial.class);
		log.debug("debug");
//		log.debug(() -> "debug");
	}
}
