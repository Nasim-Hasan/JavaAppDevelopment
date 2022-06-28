/**
 * 
 */
package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * @author BJIT
 *
 */

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"stepDefinitions"})
public class Runner {

}
