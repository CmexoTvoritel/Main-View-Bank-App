package com.aiweapps.main_view_bank_app.presentation.screens.main.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationModel(val route: String, val icon: ImageVector, val label: String) {
    object Main : BottomNavigationModel("main", Icons.Default.Home, "Main")
    object Payment : BottomNavigationModel("payment", Icons.Default.ShoppingCart, "Payment")
    object Chats : BottomNavigationModel("chats", Icons.Default.Email, "Chats")
    object Account: BottomNavigationModel("account", Icons.Default.Person, "Account")
}