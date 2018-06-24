package com.sunildroid.moviecorn;

import android.content.Context;

import com.sunildroid.moviecorn.utils.Validator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(MockitoJUnitRunner.class)
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void substration_isCorrect(){
        assertEquals(4, 6-2);
    }

    @Test
    public void EmailValidator_isValidEmail(){
        assertThat(Validator.emailValidator("name@email.com"), is(true));

    }

    @Mock
    Context context;
    private static final String FAKE_STRING="HELLO WORLD";

    @Test
    public void readStringFromContext_LocalizedString(){

    }
}