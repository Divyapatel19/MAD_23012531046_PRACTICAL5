package com.example.mad_23012531046_practical5

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mad_23012531046_practical5.screens.LoginScreen
import com.example.mad_23012531046_practical5.screens.RegisterScreen


@Composable
fun AppNavigation(context: Context){
    val navcontroller = rememberNavController()

    NavHost(navcontroller, startDestination = "login"){
        composable("login"){
            LoginScreen(context, navcontroller)
        }
        composable("register"){
            RegisterScreen(context, navcontroller)
        }

    }
}