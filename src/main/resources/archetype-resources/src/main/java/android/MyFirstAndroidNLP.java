package ${package}.android;

import com.testsigma.sdk.AndroidNLP;
import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.annotation.NLP;
import com.testsigma.sdk.annotation.TestData;
import com.testsigma.sdk.annotation.UIIdentifier;
import com.testsigma.sdk.driver.AndroidDriver;

@NLP(grammar = "Scroll to ui-identifier with containing text test-data", applicationType = ApplicationType.ANDROID)
public class MyFirstAndroidNLP extends AndroidNLP {

  @TestData(reference = "test-data")
  private com.testsigma.sdk.TestData testData;
  @UIIdentifier(reference = "ui-identifier")
  private com.testsigma.sdk.UIIdentifier uiIdentifier;

  @Override
  protected void execute() throws Exception {
    //Your Awesome code starts here
    AndroidDriver driver = this.driver;
  }
}