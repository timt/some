package io.shaka.some;

import org.junit.Test;

import static io.shaka.some.SomeValues.*;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SomeIntegerBuilderTest {

    @Test
    public void generatesSomeRandomInteger() {
        assertThat(some(integer), is(not(some(integer))));
    }

    @Test
    public void naturalNumber_generatesSomeNaturalNumber() {
        assertThat(some(naturalNumber), is(greaterThan(0)));
    }

    @Test
    public void fromToWorks() {
        Integer i = some(integer.from(3).to(100));
        assertThat(i, is(greaterThan(2)));
        assertThat(i, is(lessThan(101)));
    }

}
