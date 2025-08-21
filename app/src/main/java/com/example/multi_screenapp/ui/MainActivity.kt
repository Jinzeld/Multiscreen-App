/*
* Assignment 4 Demo
* Jinhui Zhen / Zhenjin@oregonstate.edu
* CS 492 / Oregon State University
*/
package com.example.multi_screenapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.multi_screenapp.ui.theme.MultiscreenAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultiscreenAppTheme {
                val viewModel: CityViewModel = viewModel()
                CityScreen(viewModel)
            }
        }
    }
}