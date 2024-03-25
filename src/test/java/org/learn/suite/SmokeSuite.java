package org.learn.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.learn.Tests;
import org.learn.homework19.AutoRiaRefactoring;

@Suite
@SelectClasses(AutoRiaRefactoring.class)
public class SmokeSuite {
}
