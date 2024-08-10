package com.kanahia.unit

import android.annotation.SuppressLint
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest{

    @get:Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()

    @SuppressLint("CheckResult")
    @Test
    fun testEditView_OnButtonClick(){
        Espresso.onView(withId(R.id.button)).perform(click())
    }
}