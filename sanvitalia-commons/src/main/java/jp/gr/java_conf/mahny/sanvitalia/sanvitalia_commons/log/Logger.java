package jp.gr.java_conf.mahny.sanvitalia.sanvitalia_commons.log;

import java.util.function.Supplier;

import org.slf4j.Marker;

/**
 * <p>拡張ロガー</p>
 * slf4jの文字パラメータをラムダ式にしただけ
 * @author mahny
 *
 */
public interface Logger {

	public abstract void trace(Supplier<? extends CharSequence> paramString);

	public abstract void trace(Supplier<? extends CharSequence> paramString, Object paramObject);

	public abstract void trace(Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2);

	public abstract void trace(Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject);

	public abstract void trace(Supplier<? extends CharSequence> paramString, Throwable paramThrowable);

	public abstract void trace(Marker paramMarker, Supplier<? extends CharSequence> paramString);

	public abstract void trace(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject);

	public abstract void trace(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2);

	public abstract void trace(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject);

	public abstract void trace(Marker paramMarker, Supplier<? extends CharSequence> paramString, Throwable paramThrowable);

	public abstract void debug(Supplier<? extends CharSequence> paramString);

	public abstract void debug(Supplier<? extends CharSequence> paramString, Object paramObject);

	public abstract void debug(Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2);

	public abstract void debug(Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject);

	public abstract void debug(Supplier<? extends CharSequence> paramString, Throwable paramThrowable);

	public abstract void debug(Marker paramMarker, Supplier<? extends CharSequence> paramString);

	public abstract void debug(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject);

	public abstract void debug(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2);

	public abstract void debug(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject);

	public abstract void debug(Marker paramMarker, Supplier<? extends CharSequence> paramString, Throwable paramThrowable);

	public abstract void info(Supplier<? extends CharSequence> paramString);

	public abstract void info(Supplier<? extends CharSequence> paramString, Object paramObject);

	public abstract void info(Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2);

	public abstract void info(Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject);

	public abstract void info(Supplier<? extends CharSequence> paramString, Throwable paramThrowable);

	public abstract void info(Marker paramMarker, Supplier<? extends CharSequence> paramString);

	public abstract void info(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject);

	public abstract void info(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2);

	public abstract void info(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject);

	public abstract void info(Marker paramMarker, Supplier<? extends CharSequence> paramString, Throwable paramThrowable);

	public abstract void warn(Supplier<? extends CharSequence> paramString);

	public abstract void warn(Supplier<? extends CharSequence> paramString, Object paramObject);

	public abstract void warn(Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject);

	public abstract void warn(Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2);

	public abstract void warn(Supplier<? extends CharSequence> paramString, Throwable paramThrowable);

	public abstract void warn(Marker paramMarker, Supplier<? extends CharSequence> paramString);

	public abstract void warn(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject);

	public abstract void warn(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2);

	public abstract void warn(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject);

	public abstract void warn(Marker paramMarker, Supplier<? extends CharSequence> paramString, Throwable paramThrowable);

	public abstract void error(Supplier<? extends CharSequence> paramString);

	public abstract void error(Supplier<? extends CharSequence> paramString, Object paramObject);

	public abstract void error(Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2);

	public abstract void error(Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject);

	public abstract void error(Supplier<? extends CharSequence> paramString, Throwable paramThrowable);

	public abstract void error(Marker paramMarker, Supplier<? extends CharSequence> paramString);

	public abstract void error(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject);

	public abstract void error(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object paramObject1, Object paramObject2);

	public abstract void error(Marker paramMarker, Supplier<? extends CharSequence> paramString, Object[] paramArrayOfObject);

	public abstract void error(Marker paramMarker, Supplier<? extends CharSequence> paramString, Throwable paramThrowable);
}
