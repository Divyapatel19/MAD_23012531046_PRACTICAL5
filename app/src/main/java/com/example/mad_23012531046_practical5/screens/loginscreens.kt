package com.example.mad_23012531046_practical5.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
// Import ButtonDefaults to access button colors
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
import com.example.mad_23012531046_practical5.ui.theme.black
import com.example.mad_23012531046_practical5.ui.theme.blue
import com.example.mad_23012531046_practical5.ui.theme.gunipink

@Composable
fun LoginUI(onSignUpClicked: () -> Unit) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)) {
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.guni_pink_logo),
            contentDescription = "Logo",
            modifier = Modifier
                .height(130.dp)
                .align(Alignment.CenterHorizontally)

        )

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(defaultElevation = 20.dp),
            //colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ){
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                // Email Row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = "Email", modifier = Modifier.width(80.dp), fontSize = 18.sp)
                    FormField(
                        label = "Email",
                        textState = email,
                        onTextField = { email = it }
                    )
                }


                // Password Row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.Top
                ) {
                    Text(text = "Password", modifier = Modifier.width(80.dp).padding(top = 35.dp), fontSize = 18.sp)
                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.End
                    ) {
                        FormField(
                            modifier = Modifier.fillMaxWidth(),
                            label = "Password",
                            textState = password,
                            onTextField = { password = it },
                            isPasswordField = true
                        )
                        TextButton(
                            onClick = onSignUpClicked,

                            contentPadding = PaddingValues(bottom = 20.dp, end = 10.dp, start = 5.dp),
                            colors = ButtonDefaults.textButtonColors(
                                contentColor = black
                            )
                        ) {
                            Text(text = "Forgot Password?")
                        }
                    }
                }


                Spacer(modifier = Modifier.height(10.dp))

                Button(
                    onClick = onSignUpClicked,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = blue
                    )
                ) {
                    Text(text = "Login", fontSize = 18.sp)
                }

            }
        }

        Spacer(modifier = Modifier.height(50.dp))
        //Spacer(modifier = Modifier.weight(1f))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Don't have an account?")
            TextButton(onClick = onSignUpClicked) {
                Text("SIGN UP", fontWeight = FontWeight.Bold, color = gunipink)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun showLoginUI() {
    MAD_23012531046_PRACTICAL5Theme {
        LoginUI(onSignUpClicked = { })
    }
}


