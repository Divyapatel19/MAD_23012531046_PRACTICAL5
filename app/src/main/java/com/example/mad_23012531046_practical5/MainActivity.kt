package com.example.mad_23012531046_practical5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
// Make sure to import your LoginUI composable
import com.example.mad_23012531046_practical5.screens.LoginUI
import com.example.mad_23012531046_practical5.screens.RegisterUI
import com.example.mad_23012531046_practical5.ui.theme.MAD_23012531046_PRACTICAL5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MAD_23012531046_PRACTICAL5Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    var isLoginScreen by rememberSaveable { mutableStateOf(true) }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        if (isLoginScreen) {
                            // Pass a lambda to navigate to the Register screen
                            LoginUI(onSignUpClicked = { isLoginScreen = false })
                        } else {
                            // Pass a lambda to navigate back to the Login screen
                            RegisterUI( { isLoginScreen = true })
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   MAD_23012531046_PRACTICAL5Theme {
        var isLoginScreen by rememberSaveable { mutableStateOf(true) }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (isLoginScreen) {
                LoginUI(onSignUpClicked = { isLoginScreen = false })
            } else {
                RegisterUI() { isLoginScreen = true }
            }
        }
    }
}