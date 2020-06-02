package com.ginalucy.javacourse.lesson2;

import org.junit.test;

public class PersonTest {
    @Test
    public void shouldReturnHelloWorld(){
        Person gina = new Person();
        assertEquals("Hello World", gina.helloWorld())
    }
}
