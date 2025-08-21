/*
* Assignment 4 Demo
* Jinhui Zhen / Zhenjin@oregonstate.edu
* CS 492 / Oregon State University
*/
package com.example.multi_screenapp.ui

import androidx.lifecycle.ViewModel
import com.example.multi_screenapp.model.Category
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class CityViewModel : ViewModel() {

    private val _categories = MutableStateFlow<List<Category>>(listOf(
        Category("Food"),
        Category("Drinks"),
        Category("Entertainment")

    ))
    val categories: StateFlow<List<Category>> = _categories

    fun addCategory(newCategory: String) {
        val trimmed = newCategory.trim()
        if (trimmed.isNotEmpty() && _categories.value.none { it.name.equals(trimmed, true) }) {
            _categories.update { it + Category(trimmed) }
        }
    }

    fun deleteCategory(category: Category) {
        _categories.update { it.filterNot { it.name == category.name } }
    }
}