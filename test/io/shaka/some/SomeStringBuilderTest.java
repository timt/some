package io.shaka.some;

import org.junit.Test;

import static io.shaka.some.SomeValues.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class SomeStringBuilderTest {

    @Test
    public void generatesSomeRandomString() {
        assertThat(some(string), is(not(some(string))));
    }

    @Test
    public void defaultGeneratesSomeStringIs10CharactersLong() {
        assertThat(some(string).length(), is(10));
    }

    @Test
    public void ofLengthX_willGenerateSomeStringOfLengthX() {
        int X = some(naturalNumber.to(1000));
        assertThat(some(string.ofLength(X)).length(), is(X));
    }
}
