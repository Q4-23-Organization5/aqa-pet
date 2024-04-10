package suite;

import in.preqres.PreqresApiTests;
import io.chucknorris.ChuckNorrisSteps;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.learn.homework19.AutoRiaRefactoring;

@Suite
@SelectClasses({PreqresApiTests.class, AutoRiaRefactoring.class, ChuckNorrisSteps.class})
public class SmokeSuite {
}

