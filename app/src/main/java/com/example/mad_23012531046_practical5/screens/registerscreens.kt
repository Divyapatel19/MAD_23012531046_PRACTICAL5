package com.example.mad_23012531046_practical5.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mad_23012531046_practical5.R
import com.example.mad_23012531046_practical5.screens.components.FormField
import com.example.mad_23012531046_practical5.ui.theme.MAD_23012531046_PRACTICAL5Theme
import com.example.mad_23012531046_practical5.ui.theme.blue
import com.example.mad_23012531046_practical5.ui.theme.gunipink


@Composable
fun RegisterUI() {
    var name by remember { mutableStateOf("") }
    var phonenumber by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    // Main parent Column for the whole screen
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            // Added a scroll state to prevent overflow on small screens
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.guni_pink_logo),
            contentDescription = "Logo",
            modifier = Modifier
                .width(400.dp)
                .height(100.dp) // Adjusted height slightly
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp) // Adjusted elevation
        ) {
            // This is the Column for all the content INSIDE the card
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Each field is a Row, one after the other. NOT nested.
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Name", modifier = Modifier.width(100.dp), fontSize = 15.sp)
                    FormField(
                        label = "Name",
                        textState = name,
                        onTextField = { name = it }
                    )
                }

                Spacer(modifier = Modifier.height(5.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Phone No.", modifier = Modifier.width(100.dp), fontSize = 15.sp)
                    FormField(
                        label = "Phone Number",
                        textState = phonenumber,
                        onTextField = { phonenumber = it }
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "City", modifier = Modifier.width(100.dp), fontSize = 15.sp)
                    FormField(
                        label = "City",
                        textState = city,
                        onTextField = { city = it }
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Email", modifier = Modifier.width(100.dp), fontSize = 15.sp)
                    FormField(
                        label = "Email",
                        textState = email,
                        onTextField = { email = it }
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Password", modifier = Modifier.width(100.dp), fontSize = 15.sp)
                    FormField(
                        label = "Password",
                        textState = password,
                        onTextField = { password = it },
                        isPasswordField = true
                    )
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Confirm Pwd", modifier = Modifier.width(100.dp), fontSize = 15.sp)
                    FormField(
                        label = "Confirm Password",
                        textState = confirmPassword,
                        onTextField = { confirmPassword = it },
                        isPasswordField = true
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))

                // Register Button is here, inside the Card's Column
                Button(
                    onClick = { /*TODO: Handle Register*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        // Using colorResource is safer
                        containerColor = blue
                    )
                ) {
                    Text(text = "Register", fontSize = 18.sp)
                }
            } // Card's Column ends here
        } // Card ends here

        Spacer(modifier = Modifier.height(20.dp))

        // "Login" Row is here, outside the Card
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Do You have an account?")
            TextButton(onClick = { /*TODO: Handle LOGIN navigation*/ }) {
                Text(
                    "LOGIN",
                    fontWeight = FontWeight.Bold,
                    color = gunipink
                )
            }
        }
    } // Main parent Column ends here
}

// Preview function is here, at the top level
@Preview(showBackground = true)
@Composable
fun showRegisterUI() {
    MAD_23012531046_PRACTICAL5Theme {
        RegisterUI()
    }
}
