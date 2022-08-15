package io.harness.agent.sdk;

import java.lang.annotation.*;

/**
 * Indicates that a test depends on all subclasses of the types that are
 * specified by this annotation, even if a dependency to these types could
 * not be discovered explicitly. Such an explicit specification is necessary
 * if a test depends on such types without executing any of their methods or
 * constructors.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface HarnessHierarchy {

    /**
     * The types on which the annotated tests depend, either directly or
     * by a subclass.
     *
     * @return The types to consider.
     */
    Class<?> value();
}
