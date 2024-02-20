package com.aiweapps.main_view_bank_app.presentation.screens.main

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.aiweapps.main_view_bank_app.R

class MainScreen: Screen {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    override fun Content() {
        val scrollState = rememberScrollState()
        Scaffold(
            topBar = {
                TopAppBar(
                    modifier = Modifier.fillMaxWidth(),
                    title = { Text(text = "My Toolbar") },
                    navigationIcon = {

                    },
                    actions = {
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = Icons.Default.Settings,
                                contentDescription = null
                            )
                        }
                        IconButton(onClick = { }) {
                            Icon(
                                imageVector = Icons.Default.Settings,
                                contentDescription = null
                            )
                        }
                    }
                )
            },
            bottomBar = {
            },
            content = {
                MainContent()
            }
        )
    }

    @Preview
    @Composable
    private fun MainContent() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 75.dp)
                .background(Color(red = 0x12, green = 0x11, blue = 0x11))
        ) {
            // SearchBar
            var searchText by remember { mutableStateOf("") }
            TextField(
                value = searchText,
                onValueChange = { searchText = it },
                label = { Text("Search") },
                keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Search),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Search, contentDescription = null)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Total balance",
                    fontSize = 19.sp,
                    color = Color(red = 0xFF, green = 0xFF, blue = 0xFF)
                )
                Text(
                    text = "$154,06",
                    modifier = Modifier,
                    color = Color(red = 0xFF, green = 0xFF, blue = 0xFF)
                )
            }
            Row() {
                Text(
                    text = "$3.945,94",
                    color = Color(red = 0xFF, green = 0xFF, blue = 0xFF)
                )
                Text(
                    text = "usd",
                    color = Color(red = 0xFF, green = 0xFF, blue = 0xFF)
                )
            }
            Text(
                text = "My cards",
                color = Color(red = 0xFF, green = 0xFF, blue = 0xFF)
            )
            Text(
                text = "Latest transactions",
                color = Color(red = 0xFF, green = 0xFF, blue = 0xFF)
            )
        }
    }
}