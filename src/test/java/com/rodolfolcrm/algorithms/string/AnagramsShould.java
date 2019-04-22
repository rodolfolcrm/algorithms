package com.rodolfolcrm.algorithms.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramsShould {

    private Anagrams anagrams;

    @Before
    public void init(){
        anagrams = new Anagrams();
    }

    @Test
    public void
    hello_vs_billion_return_6() {
        assertEquals(6, anagrams.numberNeeded("hello","billion"));
    }

    @Test
    public void
    glue_vs_legs_return_2() {
        assertEquals(6, anagrams.numberNeeded("glue","legs"));
    }

    @Test
    public void
    candy_vs_day_return_2() {
        assertEquals(6, anagrams.numberNeeded("candy","day"));
    }
}