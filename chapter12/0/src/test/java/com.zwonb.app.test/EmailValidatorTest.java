package com.zwonb.app.test;

import android.graphics.CornerPathEffect;

import com.zwonb.app.EmailValidator;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

/**
 * 说明
 *
 * @author zwonb
 * @date 2020-01-06
 */
public class EmailValidatorTest {

    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        Assert.assertThat(EmailValidator.isValidEmail("zwonb@email.com"), is(true));
    }

    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsFalse() {
        Assert.assertThat(EmailValidator.isValidEmail("name"), is(false));
    }
}
