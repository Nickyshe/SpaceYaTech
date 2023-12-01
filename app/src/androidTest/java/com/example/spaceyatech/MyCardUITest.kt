package com.example.spaceyatech

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.spaceyatech.ui.theme.Screen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MyCardUITest {


        @get:Rule
        val composeTestRule = createComposeRule()

        @Test
        fun testScreenContent() {
            composeTestRule.setContent {
                Screen()
            }
            //visibility of text
            composeTestRule.onNodeWithTag("upcoming_trips").assertIsDisplayed()

            composeTestRule.onNodeWithTag("beach_and_sand_card").assertIsDisplayed()

            composeTestRule.onNodeWithTag("dates_and_dinner_card").assertIsDisplayed()



        }
    }


