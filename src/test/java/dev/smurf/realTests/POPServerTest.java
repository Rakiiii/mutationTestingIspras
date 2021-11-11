package dev.smurf.realTests;

import dev.smurf.POPServer;
import dev.smurf.utils.FSMTest;
import dev.smurf.utils.InputConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import dev.smurf.results.Result;

import java.util.Arrays;
import java.util.List;

public class POPServerTest {
    private final InputConverter converter = new InputConverter();

    @Test
    public void univarsalVerify() {
        tests.forEach(this::verifyTestSet);
    }

    private void verifyTestSet(String test) {
        final POPServer popServer = new POPServer();

        FSMTest testData = converter.convert(test);

        List<Result> actual = popServer.execCommands(testData.getTestLine());

        Assertions.assertEquals(actual,testData.getExpected());
    }

    private final static List<String> tests = Arrays.asList(
            "0/0 0/1 0/1",
            "0/0 0/1 2/0",
            "0/0 0/1 3/1",
            "0/0 1/0 0/0",
            "0/0 1/0 2/1",
            "0/0 1/0 3/1",
            "0/0 2/0 0/1 0/1",
            "0/0 2/0 0/1 2/1",
            "0/0 2/0 0/1 3/0",
            "0/0 2/0 1/0 0/0",
            "0/0 2/0 1/0 2/1",
            "0/0 2/0 1/0 3/1",
            "0/0 2/0 2/1 0/1",
            "0/0 2/0 2/1 2/1",
            "0/0 2/0 2/1 3/0",
            "0/0 2/0 3/0 0/1 0/1",
            "0/0 2/0 3/0 0/1 2/1",
            "0/0 2/0 3/0 0/1 3/1",
            "0/0 2/0 3/0 1/0 0/0",
            "0/0 2/0 3/0 1/0 2/1",
            "0/0 2/0 3/0 1/0 3/1",
            "0/0 2/0 3/0 2/1 0/1",
            "0/0 2/0 3/0 2/1 2/1",
            "0/0 2/0 3/0 2/1 3/1",
            "0/0 2/0 3/0 3/1 0/1",
            "0/0 2/0 3/0 3/1 2/1",
            "0/0 2/0 3/0 3/1 3/1",
            "0/0 2/0 3/0 4/0 0/1",
            "0/0 2/0 3/0 4/0 2/1",
            "0/0 2/0 3/0 4/0 3/1",
            "0/0 2/0 3/0 5/0 0/1",
            "0/0 2/0 3/0 5/0 2/1",
            "0/0 2/0 3/0 5/0 3/1",
            "0/0 2/0 3/0 6/0 0/1",
            "0/0 2/0 3/0 6/0 2/1",
            "0/0 2/0 3/0 6/0 3/1",
            "0/0 2/0 3/0 7/0 0/1",
            "0/0 2/0 3/0 7/0 2/1",
            "0/0 2/0 3/0 7/0 3/1",
            "0/0 2/0 3/0 8/1 0/1",
            "0/0 2/0 3/0 8/1 2/1",
            "0/0 2/0 3/0 8/1 3/1",
            "0/0 2/0 4/1 0/1",
            "0/0 2/0 4/1 2/1",
            "0/0 2/0 4/1 3/0",
            "0/0 2/0 5/1 0/1",
            "0/0 2/0 5/1 2/1",
            "0/0 2/0 5/1 3/0",
            "0/0 2/0 6/1 0/1",
            "0/0 2/0 6/1 2/1",
            "0/0 2/0 6/1 3/0",
            "0/0 2/0 7/1 0/1",
            "0/0 2/0 7/1 2/1",
            "0/0 2/0 7/1 3/0",
            "0/0 2/0 8/1 0/1",
            "0/0 2/0 8/1 2/1",
            "0/0 2/0 8/1 3/0",
            "0/0 3/1 0/1",
            "0/0 3/1 2/0",
            "0/0 3/1 3/1",
            "0/0 4/1 0/1",
            "0/0 4/1 2/0",
            "0/0 4/1 3/1",
            "0/0 5/1 0/1",
            "0/0 5/1 2/0",
            "0/0 5/1 3/1",
            "0/0 6/1 0/1",
            "0/0 6/1 2/0",
            "0/0 6/1 3/1",
            "0/0 7/1 0/1",
            "0/0 7/1 2/0",
            "0/0 7/1 3/1",
            "0/0 8/1 0/1",
            "0/0 8/1 2/0",
            "0/0 8/1 3/1",
            "1/1 0/0",
            "1/1 2/1",
            "1/1 3/1",
            "2/1 0/0",
            "2/1 2/1",
            "2/1 3/1",
            "3/1 0/0",
            "3/1 2/1",
            "3/1 3/1",
            "4/1 0/0",
            "4/1 2/1",
            "4/1 3/1",
            "5/1 0/0",
            "5/1 2/1",
            "5/1 3/1",
            "6/1 0/0",
            "6/1 2/1",
            "6/1 3/1",
            "7/1 0/0",
            "7/1 2/1",
            "7/1 3/1",
            "8/1 0/0",
            "8/1 2/1",
            "8/1 3/1"
    );
}
