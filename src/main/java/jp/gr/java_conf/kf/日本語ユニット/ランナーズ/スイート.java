/**
 * 
 */
package jp.gr.java_conf.kf.日本語ユニット.ランナーズ;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;
import org.junit.runner.Runner;
/**
 * @author fukuhara
 *
 */
public class スイート extends Suite{
	
    /**
     * The <code>SuiteClasses</code> annotation specifies the classes to be run when a class
     * annotated with <code>@RunWith(Suite.class)</code> is run.
     */
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    @Inherited
    public @interface スイートクラス {
        /**
         * @return the classes to be run
         */
        public Class<?>[] value();
    }

    private static Class<?>[] getAnnotatedClasses(Class<?> klass) throws InitializationError {
        スイートクラス annotation = klass.getAnnotation(スイートクラス.class);
        if (annotation == null) {
            throw new InitializationError(String.format("class '%s' must have a SuiteClasses annotation", klass.getName()));
        }
        return annotation.value();
    }
    /**
     * Called reflectively on classes annotated with <code>@RunWith(Suite.class)</code>
     *
     * @param klass the root class
     * @param builder builds runners for classes in the suite
     */
    public スイート(Class<?> klass, RunnerBuilder builder) throws InitializationError {
        this(builder, klass, getAnnotatedClasses(klass));
    }
    
    /**
     * Called by this class and subclasses once the runners making up the suite have been determined
     *
     * @param klass root of the suite
     * @param runners for each class in the suite, a {@link Runner}
     */
    protected スイート(Class<?> klass, List<Runner> runners) throws InitializationError {
        super(klass, runners);
//        fRunners = Collections.unmodifiableList(runners);
    }
    /**
     * Called by this class and subclasses once the classes making up the suite have been determined
     *
     * @param builder builds runners for classes in the suite
     * @param klass the root of the suite
     * @param suiteClasses the classes in the suite
     */
    protected スイート(RunnerBuilder builder, Class<?> klass, Class<?>[] suiteClasses) throws InitializationError {
    	super(klass, builder.runners(klass, suiteClasses));
    }



}
