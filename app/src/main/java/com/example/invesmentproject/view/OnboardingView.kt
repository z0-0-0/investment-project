package com.example.invesmentproject.view

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.invesmentproject.viewmodel.OnboardingViewViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingScreen(
    navController: NavController,
    viewModel: OnboardingViewViewModel = hiltViewModel()
) {

    val PagerState = rememberPagerState(pageCount = { 3 },
        initialPage = 0)
    
    HorizontalPager(state = PagerState) {
        page ->
        Text(text = "Page = $page",
            modifier = Modifier.fillMaxSize())
    }

}