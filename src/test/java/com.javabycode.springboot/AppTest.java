package com.javabycode.springboot;


import org.assertj.core.api.Assertions;
import org.junit.Test;


public class AppTest {

    @Test
    public void apply() {
        Assertions.assertThat("Click me to say Hello").contains("Hello");
    }
}
