package GmailRunner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "C:\\Users\\malli\\Desktop\\guru\\CucumberClasses_Arif\\Features\\feature3.feature",glue="GmailStepDef",tags="@Regression")
public class GmailTagsRunner {

}
