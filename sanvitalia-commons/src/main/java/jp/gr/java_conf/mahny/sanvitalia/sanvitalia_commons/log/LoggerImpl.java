package jp.gr.java_conf.mahny.sanvitalia.sanvitalia_commons.log;

import java.util.function.Supplier;

import org.slf4j.Marker;

/**
 * 遅延ロガー実装
 * @author mahny
 */
public class LoggerImpl implements Logger {

	org.slf4j.Logger log = null;

	/**
	 * 初期化
	 * @param log slf4j対応ロガー
	 */
	public 	LoggerImpl(org.slf4j.Logger log) {
		this.log = log;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void trace(Supplier<? extends CharSequence> paramString) {
		if (log.isTraceEnabled()) {
			log.trace(paramString != null ? paramString.get().toString() : null);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void trace(Supplier<? extends CharSequence> paramString, Object paramObject) {
		if (log.isTraceEnabled()) {
			log.trace(paramString != null ? paramString.get().toString() : null, paramObject);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void trace(Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void trace(Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void trace(Supplier<? extends CharSequence> paramString, Throwable paramThrowable) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void trace(Marker paramMarker, Supplier<? extends CharSequence> paramString) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void trace(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void trace(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void trace(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void trace(Marker paramMarker, Supplier<? extends CharSequence> paramString, Throwable paramThrowable) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void debug(Supplier<? extends CharSequence> paramString) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void debug(Supplier<? extends CharSequence> paramString, Object paramObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void debug(Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void debug(Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void debug(Supplier<? extends CharSequence> paramString, Throwable paramThrowable) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void debug(Marker paramMarker, Supplier<? extends CharSequence> paramString) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void debug(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void debug(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void debug(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void debug(Marker paramMarker, Supplier<? extends CharSequence> paramString, Throwable paramThrowable) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void info(Supplier<? extends CharSequence> paramString) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void info(Supplier<? extends CharSequence> paramString, Object paramObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void info(Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void info(Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void info(Supplier<? extends CharSequence> paramString, Throwable paramThrowable) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void info(Marker paramMarker, Supplier<? extends CharSequence> paramString) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void info(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void info(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void info(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void info(Marker paramMarker, Supplier<? extends CharSequence> paramString, Throwable paramThrowable) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void warn(Supplier<? extends CharSequence> paramString) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void warn(Supplier<? extends CharSequence> paramString, Object paramObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void warn(Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void warn(Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void warn(Supplier<? extends CharSequence> paramString, Throwable paramThrowable) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void warn(Marker paramMarker, Supplier<? extends CharSequence> paramString) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void warn(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void warn(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void warn(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void warn(Marker paramMarker, Supplier<? extends CharSequence> paramString, Throwable paramThrowable) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void error(Supplier<? extends CharSequence> paramString) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void error(Supplier<? extends CharSequence> paramString, Object paramObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void error(Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void error(Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void error(Supplier<? extends CharSequence> paramString, Throwable paramThrowable) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void error(Marker paramMarker, Supplier<? extends CharSequence> paramString) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void error(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void error(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void error(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject) {
		// TODO 自動生成されたメソッド・スタブ

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void error(Marker paramMarker, Supplier<? extends CharSequence> paramString, Throwable paramThrowable) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
