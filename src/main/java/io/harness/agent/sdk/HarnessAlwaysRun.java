package io.harness.agent.sdk;

import java.lang.annotation.*;

/**
 * Indicates that the annotated test should always be executed,
 * in disregard of the discovered call graph.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface HarnessAlwaysRun { }
