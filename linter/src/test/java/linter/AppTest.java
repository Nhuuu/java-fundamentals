/*
 * This Java source file was generated by the Gradle 'init' task.
 */

/*
Use JUnit to write a test for the linter.
You’ll need to create a JS file that will test each of these things!

Test the linter on a file that contains no errors.
Test the linter on a file that contains one error.
Test the linter on a file that contains few errors.
Test the linter on a file that contains many errors.
Test the linter on an empty file.
 */
package linter;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

import org.junit.Before;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class AppTest {

  // https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @Test public void testGetGates(){
    File path = new File("./src/main/resources/gates.js");
    assertNotNull("app should have a greeting", outContent);
  }

}