package org.om.design.pattern.decorator;

import org.junit.Test;
import org.om.design.pattern.decorator.Person;

import static org.junit.Assert.*;

public class PersonTest 
{
    @Test
    public void canConstructAPersonWithAName()
    {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }
}
