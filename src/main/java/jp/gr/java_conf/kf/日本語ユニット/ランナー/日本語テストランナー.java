package jp.gr.java_conf.kf.日本語ユニット.ランナー;

import java.util.List;

import jp.gr.java_conf.kf.日本語ユニット.クラス事前処理;
import jp.gr.java_conf.kf.日本語ユニット.クラス事後処理;
import jp.gr.java_conf.kf.日本語ユニット.テスト;
import jp.gr.java_conf.kf.日本語ユニット.テスト.なし;
import jp.gr.java_conf.kf.日本語ユニット.事前処理;
import jp.gr.java_conf.kf.日本語ユニット.事後処理;

import org.junit.internal.runners.statements.ExpectException;
import org.junit.internal.runners.statements.FailOnTimeout;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

public class 日本語テストランナー extends BlockJUnit4ClassRunner {

	public 日本語テストランナー(Class<?> klass) throws InitializationError {
		super(klass);
	}

	/**
	 * Returns the methods that run tests. Default implementation returns all
	 * methods annotated with {@code @Test} on this class and superclasses that
	 * are not overridden.
	 */
	@Override
	protected List<FrameworkMethod> computeTestMethods() {
		return getTestClass().getAnnotatedMethods(テスト.class);
	}

	@Override
	protected Statement withBefores(FrameworkMethod method, Object target,
			Statement statement) {
		List<FrameworkMethod> befores = getTestClass().getAnnotatedMethods(
				事前処理.class);
		return befores.isEmpty() ? statement : new RunBefores(statement,
				befores, target);
	}

	@Override
	protected Statement withAfters(FrameworkMethod method, Object target,
			Statement statement) {
		List<FrameworkMethod> afters = getTestClass().getAnnotatedMethods(
				事後処理.class);
		return afters.isEmpty() ? statement : new RunAfters(statement, afters,
				target);
	}

//	protected void collectInitializationErrors(List<Throwable> errors) {
//		validatePublicVoidNoArgMethods(クラス事前処理.class, true, errors);
//		validatePublicVoidNoArgMethods(クラス事後処理.class, true, errors);
//		validateClassRules(errors);
//		invokeValidators(errors);
//	}

	@Override
	protected Statement withBeforeClasses(Statement statement) {
		List<FrameworkMethod> befores = getTestClass().getAnnotatedMethods(
				クラス事前処理.class);
		return befores.isEmpty() ? statement : new RunBefores(statement,
				befores, null);
	}

	@Override
	protected Statement withAfterClasses(Statement statement) {
		List<FrameworkMethod> afters = getTestClass().getAnnotatedMethods(
				クラス事後処理.class);
		return afters.isEmpty() ? statement : new RunAfters(statement, afters,
				null);
	}
	@Override
    protected Statement possiblyExpectingExceptions(FrameworkMethod method,
            Object test, Statement next) {
		テスト annotation = method.getAnnotation(テスト.class);
        return expectsException(annotation) ? new ExpectException(next,
                getExpectedException(annotation)) : next;
    }
	
    @Deprecated @Override
    protected Statement withPotentialTimeout(FrameworkMethod method,
            Object test, Statement next) {
        long timeout = getTimeout(method.getAnnotation(テスト.class));
        return timeout > 0 ? new FailOnTimeout(next, timeout) : next;
    }
    private Class<? extends Throwable> getExpectedException(テスト annotation) {
        if (annotation == null || annotation.想定例外() == なし.class) {
            return null;
        } else {
            return annotation.想定例外();
        }
    }

    private boolean expectsException(テスト annotation) {
        return getExpectedException(annotation) != null;
    }

    private long getTimeout(テスト annotation) {
        if (annotation == null) {
            return 0;
        }
        return annotation.タイムアウト();
    }
}
