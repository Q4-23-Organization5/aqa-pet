package suite;

import io.chucknorris.Runner;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

    @Suite
    @SelectClasses({Runner.class})
    public class CucumberRun {
    }
