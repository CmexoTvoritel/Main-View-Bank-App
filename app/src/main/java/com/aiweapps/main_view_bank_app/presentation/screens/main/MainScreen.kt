package com.aiweapps.main_view_bank_app.presentation.screens.main

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.aiweapps.main_view_bank_app.R

class MainScreen: Screen {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @Preview
    @Composable
    override fun Content() {
        val scrollState = rememberScrollState()
        Scaffold(
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
            Row(modifier = Modifier.padding(all = 12.dp)) {
                Image(
                    painter = painterResource(R.drawable.ic_profile_picture),
                    contentDescription = "profile picture",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                )

                // Add a horizontal space between the image and the column
                Spacer(modifier = Modifier.width(8.dp))

                Column {
                    Text(
                        text = "Alex",
                        color = Color(red = 0xFF, green = 0xFF, blue = 0xFF)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Good Morning",
                        color = Color(red = 0xFF, green = 0xFF, blue = 0xFF)
                    )
                }
            }
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
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Total balance",
                    fontSize = 19.sp,
                    color = Color(red = 0xFF, green = 0xFF, blue = 0xFF)
                )
                Box(
                    modifier = Modifier
                        .background(
                            Color(red = 0x28, green = 0x27, blue = 0x27),
                            shape = RoundedCornerShape(6.dp)
                        )
                        .padding(horizontal = 4.dp, vertical = 4.dp)
                        .align(Alignment.CenterVertically)
                ) {
                    Row() {
                        Image(
                            painter = painterResource(R.drawable.ic_cashback),
                            contentDescription = "cashback picture",
                            modifier = Modifier
                                .size(20.dp)
                        )
                        Text(
                            text = "$154,06",
                            modifier = Modifier,
                            color = Color(red = 0xFF, green = 0xFF, blue = 0xFF)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    text = "$3.945,94",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(red = 0xFF, green = 0xFF, blue = 0xFF)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Box(
                    modifier = Modifier
                        .background(
                            Color(red = 0xD3, green = 0xFF, blue = 0x52),
                            shape = RoundedCornerShape(6.dp)
                        )
                        .padding(horizontal = 4.dp)
                        .align(Alignment.CenterVertically)
                ) {
                    Text(
                        text = "usd",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(red = 0x00, green = 0x00, blue = 0x00)
                    )
                }
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