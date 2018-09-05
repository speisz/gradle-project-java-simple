package com.github.speisz;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;

class ExampleTest {

    @Test
    void doesSomething() {
        assertThat(1, is(greaterThan(0)));
    }
}
