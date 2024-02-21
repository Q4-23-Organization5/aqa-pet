package org.learn.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.learn.Adad;

@Suite
@SelectClasses(Adad.class)
public class SmokeSuite {
}
