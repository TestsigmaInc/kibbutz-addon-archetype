package ${package}.web;

import com.testsigma.sdk.StepActionType;
import com.testsigma.sdk.Result;
import com.testsigma.sdk.WebAction;
import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.annotation.Action;
import com.testsigma.sdk.annotation.TestData;
import lombok.Data;
import org.openqa.selenium.NoSuchElementException;

@Data
@Action(actionText = "while values-count selectable-list values-count2",
        description = "Stores run time data",
        applicationType = ApplicationType.WEB,
        actionType = StepActionType.WHILE_LOOP)
public class MyThirdWebAction extends WebAction {

  @TestData(reference = "values-count")
  private com.testsigma.sdk.TestData testData1;
  @TestData(reference = "values-count2")
  private com.testsigma.sdk.TestData testData2;
  @TestData(reference = "selectable-list", allowedValues= {">", "<", "="})
  private com.testsigma.sdk.TestData testData3;

  @Override
  public com.testsigma.sdk.Result execute() throws NoSuchElementException {
    Result result = Result.SUCCESS;
    logger.info("Initiating execution");
    switch (testData3.getValue().toString()){
      case "<":
        if(testData1.getValue().toString().compareTo(testData2.getValue().toString()) < 0){
          setSuccessMessage("Successfully executed step");
        } else {
          return Result.FAILED;
        }
        break;
      case ">":
        if(testData1.getValue().toString().compareTo(testData2.getValue().toString()) > 0){
          setSuccessMessage("Successfully executed step");
        } else {
          return Result.FAILED;
        }
        break;
      case "=":
        if(testData1.getValue().toString().compareTo(testData2.getValue().toString()) == 0){
          setSuccessMessage("Successfully executed step");
        } else {
          return Result.FAILED;
        }
        break;
    }
    return result;
  }
}