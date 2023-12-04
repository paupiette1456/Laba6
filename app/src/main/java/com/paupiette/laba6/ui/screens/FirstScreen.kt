package com.paupiette.laba6.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.paupiette.laba6.Screen
import com.paupiette.laba6.UserData
import com.paupiette.laba6.user

@Composable
fun FirstScreen(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Первый экран")
            Button(
                onClick = {
                          navController.navigate(route = Screen.Second.route)
                },
                modifier = Modifier.padding(16.dp)
            ) {
                Text(text = "Перейти на 2 экран")

            }
        }

    }
}