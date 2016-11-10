package jp.gr.java_conf.mahny.sanvitalia.sanvitalia_commons.log;

/**
 * ロガー生成工場
 * @author mahny
 */
public class LoggerFactory {

	/**
	 * 生成禁止
	 */
	private LoggerFactory() {
		// nop
	}

	/**
	 * 対象クラスのロガーインスタンスを生成
	 * @param clazz ログ出力対象クラス
	 */
	public static Logger getLogger(Class<?> clazz) {
		return new LoggerImpl(org.slf4j.LoggerFactory.getLogger(clazz));
	}
}
