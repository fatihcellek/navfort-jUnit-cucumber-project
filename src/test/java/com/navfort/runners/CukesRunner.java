package com.navfort.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                 "pretty",
                 "html:target/cucumber-reports.html",
                 "rerun:target/rerun.txt",
                 "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                 "json:target/cucumber.jason"

        },
        features = "src/test/resources/features",
        glue = "com/navfort/stepDefinitions",

        dryRun =false,

        tags = "",

        publish = true //generating a report with public link
)

public class CukesRunner { }
