package com;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static cucumber.api.junit.Cucumber.*;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        features={"src/cucumber"},
        plugin={"pretty","json:target/"}
        )
public class Cucu {


}
