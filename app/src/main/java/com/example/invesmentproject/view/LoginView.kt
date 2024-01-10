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
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.invesmentproject.ui.theme.InvesmentAppTheme
import com.example.invesmentproject.viewmodel.LoginViewViewModel
import kotlinx.coroutines.flow.update

@Composable
fun LoginView(
    navController: NavController,
    viewModel: LoginViewViewModel = hiltViewModel()
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
                    LoginCard(viewModel)
                }
        }

    }
}

@Composable
fun LoginCard(viewModel: LoginViewViewModel) {
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
                TextField(
                    value = viewModel.login.toString(),
                    onValueChange = { value -> viewModel.login.update { value } })
                TextField(
                    value = viewModel.password.toString(),
                    onValueChange = { value -> viewModel.password.update { value } })
                Button(onClick = { viewModel.sendAuth() }) {
                    Text(text = "Go")
                }
            }
        }
    }
}