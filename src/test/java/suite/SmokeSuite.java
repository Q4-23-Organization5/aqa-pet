package suite;

import in.preqres.PreqresApiTests;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.learn.homework19.AutoRiaRefactoring;

@Suite
@SelectClasses({PreqresApiTests.class, AutoRiaRefactoring.class})
public class SmokeSuite {
}
