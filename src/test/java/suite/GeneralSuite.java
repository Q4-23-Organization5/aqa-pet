package suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CucumberRun.class, SelenideSuite.class, SmokeSuite.class})
public class GeneralSuite {
}
