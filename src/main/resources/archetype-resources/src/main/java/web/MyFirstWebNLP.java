package ${package}.web;

import com.testsigma.sdk.WebNLP;
import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.annotation.NLP;
import com.testsigma.sdk.annotation.TestData;
import com.testsigma.sdk.annotation.UIIdentifier;
import com.testsigma.sdk.driver.RemoteWebDriver;

@NLP(grammar = "Scroll to ui-identifier with containing text test-data")
public class MyFirstWebNLP extends WebNLP {

  @TestData(reference = "test-data")
  private com.testsigma.sdk.TestData testData;
  @UIIdentifier(reference = "ui-identifier")
  private com.testsigma.sdk.UIIdentifier uiIdentifier;

  @Override
  protected void execute() throws Exception {
    //Your Awesome code starts here
    RemoteWebDriver driver = this.driver;
  }
}