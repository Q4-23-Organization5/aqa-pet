package org.learn.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.learn.Tests;

@Suite
@SelectClasses(Tests.class)
public class SmokeSuite {
}
