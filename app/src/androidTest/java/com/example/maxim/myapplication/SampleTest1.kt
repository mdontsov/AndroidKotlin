package com.example.maxim.myapplication

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SampleTest1 {
    @Rule
    @JvmField
    val activity = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    @Throws(Exception::class)
    fun testInputField() {
        onView(withId(R.id.enterMessage))
                .perform(ViewActions.clearText())
                .perform(ViewActions.typeText("Hello Kotlin!"))
    }

    @Test
    @Throws(Exception::class)
    fun testSendMessageButton() {

    }

    @Test
    @Throws(Exception::class)
    fun testSendEmail() {

    }
}