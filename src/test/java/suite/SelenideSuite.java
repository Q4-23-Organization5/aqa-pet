package suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import selenideTests.SelenideTests;

@Suite
@SelectClasses({SelenideTests.class})
public class SelenideSuite {}
