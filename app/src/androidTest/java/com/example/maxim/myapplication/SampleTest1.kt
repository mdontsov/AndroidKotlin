package com.example.maxim.myapplication

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SampleTest1 {
    @Rule
    @JvmField
    val mainActivity = ActivityTestRule<MainActivity>(MainActivity::class.java)

    val textToInput = "Hello Kotlin!"

    @Test
    @Throws(Exception::class)
    fun testInputField() {
        onView(withId(R.id.enterMessage))
                .perform(ViewActions.clearText())
                .perform(ViewActions.typeText(textToInput))
    }

    @Test
    @Throws(Exception::class)
    fun testSendMessageButton() {
        testInputField()
        onView(withId(R.id.sendButton))
                .perform(ViewActions.click())
        onView(withId(R.id.newTextView))
                .check(ViewAssertions.matches(withText(textToInput)))
    }

    @Test
    @Throws(Exception::class)
    fun testSendEmail() {
        testSendMessageButton()
        onView(withId(R.id.send_email))
                .perform(ViewActions.click())
    }
}