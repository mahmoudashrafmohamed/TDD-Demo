package com.example.tddapp.suitetest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/*
we use test suites to divide huge features into some parts and want to run test on all parts together
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({NoteTakingTest.AddTextNote.class, NoteTakingTest.AddImageNote.class, NoteTakingTest.AddAudioNote.class})
public class NoteTakingTest {

    public static class AddTextNote {
        @Test
        public void testEmptyNote(){
        }
        @Test
        public void testMultlinesTextNote(){
        }
    }

    public static class AddImageNote {

        @Test
        public void testVeryLargeImage(){
        }

        @Test
        public void testGifImage(){
        }
    }

    public static class AddAudioNote {
        @Test
        public void testMp3AudioFile(){
        }

        @Test
        public void testFlvAudioFile(){
        }
    }

}
