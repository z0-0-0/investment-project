package com.example.invesmentproject.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.invesmentproject.ui.theme.InvesmentAppTheme

@Preview
@Composable
fun LoginView(
    //  navController: NavController,
    // viewModel: LoginViewViewModel = hiltViewModel()
) {
    InvesmentAppTheme {
        Surface(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    LoginCard()
                }
        }

    }
}

@Preview
@Composable
fun LoginCard() {
    InvesmentAppTheme {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 6.dp
            ),
            modifier = Modifier
                .fillMaxWidth(0.8F)
                .fillMaxHeight(0.7F),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor =  MaterialTheme.colorScheme.primary
            )
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    text = "Login Screen"
                )
               // Spacer(modifier = Modifier.size(20.dp))
                TextField(value = "Login", onValueChange = {/*TODO*/})
                TextField(value = "Password", onValueChange = {/*TODO*/})
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Go")
                }
            }
        }
    }
}