package com.example.invesmentproject.view

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.invesmentproject.ui.theme.InvesmentAppTheme
import com.example.invesmentproject.viewmodel.OnboardingViewViewModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnboardingView(
    navController: NavController,
    viewModel: OnboardingViewViewModel = hiltViewModel(),
) {

    val pagerState = rememberPagerState(pageCount = { 3 }, initialPage = 0)

    HorizontalPager(state = pagerState) { page ->
        InvesmentAppTheme {
            Surface(
                Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
            ) {
                Column(
                    Modifier
                        .systemBarsPadding()
                        .padding(horizontal = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                //    Image(painter = , contentDescription = )
                    Text("test")
                }
            }
        }

    }
}