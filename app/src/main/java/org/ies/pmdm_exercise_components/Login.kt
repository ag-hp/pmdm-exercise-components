package org.ies.pmdm_exercise_components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.ies.pmdm_exercise_components.ui.theme.PmdmexercisecomponentsTheme

class Login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PmdmexercisecomponentsTheme {
                LoginContent()
            }
        }
    }
}

@Composable
fun LoginContent() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "logo"
            )
            Spacer(modifier = Modifier.height(5.dp))
            TextField(
                value = username,
                onValueChange = { username = it },
                label = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Username"
                        )
                        Text("Username")
                    }
                }
            )
            Spacer(modifier = Modifier.height(5.dp))
            TextField(
                value = password,
                onValueChange = { password = it },
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    val image =
                        if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(imageVector = image, contentDescription = null)
                }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                label = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "Password"
                        )
                        Text("Password")
                    }
                }
            )
            Spacer(modifier = Modifier.height(5.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()

            ) {
                // Boton 1
                Spacer(modifier = Modifier.width(10.dp))
                Button(onClick = {}, enabled = false) {
                    Text("Aceptar")
                }

                // Boton 2
                Spacer(modifier = Modifier.width(5.dp))
                Button(onClick = {}) {
                    Spacer(modifier = Modifier.height(15.dp))
                    Text("Cancelar")
                }
            }
            // Boton 3
            Spacer(modifier = Modifier.height(5.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()

            ) {
                Spacer(modifier = Modifier.height(10.dp))
                Button(onClick = {}) {
                    Text("Registrarse")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    PmdmexercisecomponentsTheme {
        LoginContent()
    }
}