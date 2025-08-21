/*
* Assignment 4 Demo
* Jinhui Zhen / Zhenjin@oregonstate.edu
* CS 492 / Oregon State University
*/

package com.example.multi_screenapp.model

data class Category(
    val name: String,
    val recommendations: List<Recommendation> = emptyList()
)
