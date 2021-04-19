package stepdescription;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import cucumber.api.*;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"stepdescription"},monochrome = true, 
plugin = {"pretty","junit:target/loginreportxml.xml"})
public class TestRunner {

}
