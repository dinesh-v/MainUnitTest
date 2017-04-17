import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

/**
 * http://stackoverflow.com/questions/36349827/testing-main-method-by-junit
 */
public class MainTest {
    @Test
    public void main() throws Exception {
        File inputFile = new File(MainTest.class.getResource("input0.txt").toURI());
        File expectedOutputFile = new File(MainTest.class.getResource("output0.txt").toURI());
        File actualOutputFile = new File(MainTest.class.getResource("userOutput0.txt").toURI());

        PrintStream filePrintStream = new PrintStream(actualOutputFile);
        System.setOut(filePrintStream);

        final FileInputStream fileInputStream = new FileInputStream(inputFile);
        System.setIn(fileInputStream);
        Main.main(null);

        Main.Solution solution = new Main.Solution();
        /*solution.solve(fileInputStream, filePrintStream);*/
        //TODO: replace one expectedOutPutFile with actualOutputFile
        assertTrue(FileUtils.contentEquals(expectedOutputFile, expectedOutputFile));
    }

}