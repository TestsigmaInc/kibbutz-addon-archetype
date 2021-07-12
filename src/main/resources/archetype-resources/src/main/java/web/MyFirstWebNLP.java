package ${package}.web;

import com.testsigma.sdk.WebNLP;
import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.annotation.NLP;
import com.testsigma.sdk.annotation.TestData;
import com.testsigma.sdk.annotation.UIIdentifier;
import com.testsigma.sdk.driver.RemoteWebDriver;

import java.util.List;

@NLP(grammar = "Verify no of options in select {element-locator} is equal to {values-count}",
        description = "validates options count in a select drop-down",
        applicationType = ApplicationType.WEB)
public class MyFirstWebNLP extends WebNLP {

  @Data
  public class SelectOptionsCountValidation extends WebNLP {

    @TestData(reference = "values-count")
    private com.testsigma.sdk.TestData testdata;
    @UIIdentifier(reference = "element-locator")
    private com.testsigma.sdk.UIIdentifier uiIdentifier;

    public void execute() throws Exception {
      WebElement element = uiIdentifier.getElement();
      Select selectElement = new Select(element);
      List<WebElement> optionsList = selectElement.getOptions();
      Assert.assertEquals(optionsList.size(),Integer.parseInt(testdata.getValue().toString()));
    }
  }
