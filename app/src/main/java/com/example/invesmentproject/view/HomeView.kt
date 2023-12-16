@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.invesmentproject.view

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.invesmentproject.ui.theme.InvesmentAppTheme
import com.example.invesmentproject.viewmodel.HomeViewViewModel


@Composable
fun HomeView(
    navController: NavController,
    viewModel: HomeViewViewModel = hiltViewModel()
) {
    InvesmentAppTheme {
        Scaffold(
            topBar = { HomeTopBar() },
            bottomBar = { HomeNavigationBar() },
            modifier = Modifier
        )
        {innerPadding ->
                 HomeItems(innerPadding)
        }
    }

}



@Preview
@Composable
fun HomeTopBar(){
    CenterAlignedTopAppBar(title = { Text("Sample") })
}

@Preview
@Composable
fun HomeNavigationBar(){
    NavigationBar {
        NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = { /*TODO*/ }, label = {Text("Profile")})
        NavigationBarItem(selected = true, onClick = { /*TODO*/ }, icon = { /*TODO*/ }, label = {Text("Home")})
        NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = { /*TODO*/ }, label = {Text("Settings")})
    }
}

@Composable
fun HomeItems(paddingValues: PaddingValues){
    LazyColumn(modifier = Modifier.padding(paddingValues)){
    }
}