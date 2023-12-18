@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.invesmentproject.view

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.invesmentproject.ui.theme.InvesmentAppTheme
import com.example.invesmentproject.viewmodel.BottomNavItemsList
import com.example.invesmentproject.viewmodel.HomeViewViewModel


@Composable
fun HomeView(
    navController: NavController,
    viewModel: HomeViewViewModel = hiltViewModel()
) {
    val state = viewModel.state

    InvesmentAppTheme {
        Scaffold(
            topBar = { HomeTopBar() },
            bottomBar = { HomeNavigationBar(navController) },
            modifier = Modifier
        )
        { innerPadding ->
            HomeItems(innerPadding)
        }
    }

}


@Preview
@Composable
fun HomeTopBar() {
    CenterAlignedTopAppBar(title = { Text("Sample") })
}

//@Preview
@Composable
fun HomeNavigationBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val currentRoute = navBackStackEntry?.destination?.route

    NavigationBar {
        for (bottomNavItem in BottomNavItemsList.BottomNavItems) {
            NavigationBarItem(
                selected = currentRoute == bottomNavItem.route,
                onClick = { navController.navigate(bottomNavItem.route) },
                icon = {
                    Icon(
                        imageVector = bottomNavItem.icon,
                        contentDescription = bottomNavItem.label
                    )
                },
                label = { Text(text = bottomNavItem.label) })
        }
    }
}

@Composable
fun HomeItems(paddingValues: PaddingValues) {
    LazyColumn(modifier = Modifier.padding(paddingValues)) {
    }
}
