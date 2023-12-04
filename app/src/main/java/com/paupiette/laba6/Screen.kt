package com.paupiette.laba6

sealed class Screen(val route: String) {
    data object First: Screen(route = "first_screen")
    data object Second: Screen(route = "second_screen")
}