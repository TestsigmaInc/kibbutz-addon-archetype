package ${package}.android;

import com.testsigma.sdk.AndroidNLP;
import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.annotation.NLP;
import com.testsigma.sdk.annotation.TestData;
import com.testsigma.sdk.annotation.UIIdentifier;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

@NLP(grammar = "Enter {test-data} in element {ui-identifier} if visible", applicationType = ApplicationType.ANDROID)
public class MyFirstAndroidNLP extends AndroidNLP {

  @TestData(reference = "test-data")
  private com.testsigma.sdk.TestData testData;
  @UIIdentifier(reference = "ui-identifier")
  private com.testsigma.sdk.UIIdentifier uiIdentifier;

  @Override
  protected void execute() throws Exception {
    //Your Awesome code starts here
    logger.info("Initiating execution");
    logger.debug("ui-identifier: "+ this.uiIdentifier.getValue() +" by:"+ this.uiIdentifier.getBy() + ", test-data: "+ this.testData.getValue());
    AndroidDriver androidDriver = (AndroidDriver)this.driver;
    WebElement element = uiIdentifier.getElement();
    if(element.isDisplayed()){
      log("Element is displayed, entering data");
      element.sendKeys(testData.getValue().toString());
    }else{
      throw new Exception(String.format("Element with locator %s is not visible",uiIdentifier.getBy()));
    }
  }
}