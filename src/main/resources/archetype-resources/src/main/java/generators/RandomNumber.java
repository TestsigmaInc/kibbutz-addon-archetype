package ${package}.generators;

import com.testsigma.sdk.TestDataFunction;
import com.testsigma.sdk.ApplicationType;
import com.testsigma.sdk.TestData;
import com.testsigma.sdk.annotation.TestDataFunctionParameter;
import lombok.Data;

@Data
@com.testsigma.sdk.annotation.TestDataFunction(displayName = "Generate random number with min and max",
        description = "Generates Random Number within range")
public class RandomNumber extends TestDataFunction {

  @TestDataFunctionParameter (reference = "min")
  private com.testsigma.sdk.TestDataParameter min;
  @TestDataFunctionParameter (reference = "max")
  private com.testsigma.sdk.TestDataParameter max;

  public TestData generate() throws Exception {
    // Try use of run time data
    logger.info("Initiating execution");
    int number = (int) ((Math.random() * ((int)max.getValue() - (int)min.getValue())) + (int)min.getValue());
    TestData testData = new TestData(number);
    return testData;
  }
}