package io.chucknorris;

import io.qameta.allure.Feature;
import org.apache.logging.log4j.core.config.plugins.Plugin;
import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@SelectClasspathResource("features")
@IncludeEngines("cucumber")
public class Runner {
}
