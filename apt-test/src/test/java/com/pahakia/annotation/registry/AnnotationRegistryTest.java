package com.pahakia.annotation.registry;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.pahakia.annotation.processor.test.Hockey;
import com.pahakia.annotation.processor.test.Soccer;
import com.pahakia.annotation.processor.test.annotation.Region;
import com.pahakia.annotation.processor.test.annotation.Sport;
import com.pahakia.annotation.processor.test.test.TestHockey;
import com.pahakia.annotation.processor.test.test.TestSoccer;

public class AnnotationRegistryTest {

    @Test
    public void test() throws IOException {
        AnnotationRegistry.register(getClass().getClassLoader());
        assertNull("@Override should not be in the annotation registry",
                AnnotationRegistry.getAnnotatedClasses(java.lang.Override.class.getName()));

        Set<Pair> sportAnnotated = AnnotationRegistry.getAnnotatedClasses(Sport.class.getName());
        assertNotNull("@Sport should be present", sportAnnotated);
        assertEquals(4, sportAnnotated.size());
        assertSetEquals(sportAnnotated, Hockey.class, Soccer.class, TestSoccer.class, TestHockey.class);

        Set<Pair> regionAnnotated = AnnotationRegistry.getAnnotatedClasses(Region.class.getName());
        assertNotNull("@Region should be present", regionAnnotated);
        assertEquals(2, regionAnnotated.size());
        assertSetEquals(regionAnnotated, Hockey.class, TestHockey.class);
    }

    private void assertSetEquals(Set<Pair> set, Class<?>... classes) {
        Set<String> classNames = new HashSet<>();
        for (Class<?> c : classes) {
            classNames.add(c.getName());
        }
        Set<String> classNames2 = new HashSet<>();
        for (Pair p : set) {
            classNames2.add(p.className);
        }
        assertEquals(classNames, classNames2);

    }

}
