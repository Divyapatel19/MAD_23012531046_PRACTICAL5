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

// SOLUTION 1: Modify the function to accept two distinct actions
@Composable
fun RegisterUI(onLoginClicked: () -> Unit) {
    var name by remember { mutableStateOf("") }
    var phonenumber by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Spacer(modifier = Modifier.height(10.dp))

        Image(
            painter = painterResource(id = R.drawable.guni_pink_logo),
            contentDescription = "Logo",
            modifier = Modifier
                .height(130.dp)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(10.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // ... (All your Row and FormField elements are correct)
                Row(modifier=Modifier.fillMaxWidth(),verticalAlignment=Alignment.CenterVertically){Text(text="Name",modifier=Modifier.width(100.dp),fontSize=15.sp);FormField(label="Name",textState=name,onTextField={name=it})}
                Spacer(modifier=Modifier.height(5.dp))
                Row(modifier=Modifier.fillMaxWidth(),verticalAlignment=Alignment.CenterVertically){Text(text="Phone No.",modifier=Modifier.width(100.dp),fontSize=15.sp);FormField(label="Phone Number",textState=phonenumber,onTextField={phonenumber=it})}
                Spacer(modifier=Modifier.height(8.dp))
                Row(modifier=Modifier.fillMaxWidth(),verticalAlignment=Alignment.CenterVertically){Text(text="City",modifier=Modifier.width(100.dp),fontSize=15.sp);FormField(label="City",textState=city,onTextField={city=it})}
                Spacer(modifier=Modifier.height(8.dp))
                Row(modifier=Modifier.fillMaxWidth(),verticalAlignment=Alignment.CenterVertically){Text(text="Email",modifier=Modifier.width(100.dp),fontSize=15.sp);FormField(label="Email",textState=email,onTextField={email=it})}
                Spacer(modifier=Modifier.height(8.dp))
                Row(modifier=Modifier.fillMaxWidth(),verticalAlignment=Alignment.CenterVertically){Text(text="Password",modifier=Modifier.width(100.dp),fontSize=15.sp);FormField(label="Password",textState=password,onTextField={password=it},isPasswordField=true)}
                Spacer(modifier=Modifier.height(8.dp))
                Row(modifier=Modifier.fillMaxWidth(),verticalAlignment=Alignment.CenterVertically){Text(text="Confirm Pwd",modifier=Modifier.width(100.dp),fontSize=15.sp);FormField(label="Confirm Password",textState=confirmPassword,onTextField={confirmPassword=it},isPasswordField=true)}
                Spacer(modifier = Modifier.height(10.dp))

                // SOLUTION 2: Assign the correct click action to the "Register" button.
                Button(
                    onClick = {  }, // This should handle registration logic.
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = blue
                    )
                ) {
                    Text(text = "Register", fontSize = 18.sp)
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        // This is correct: the "LOGIN" button should navigate back.
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Don you have an account?", color = MaterialTheme.colorScheme.onBackground)
            TextButton(onClick = { onLoginClicked() }) {
                Text("LOGIN", fontWeight = FontWeight.Bold, color = gunipink)


            }
        }
    }
}

// SOLUTION 3: Update the Preview to match the new function signature.
@Preview(showBackground = false)
@Composable
fun showRegisterUI(){
    MAD_23012531046_PRACTICAL5Theme(darkTheme = true) {
        RegisterUI(onLoginClicked = {})
    }
}