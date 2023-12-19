package com.example.invesmentproject.viewmodel

import android.util.Log
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.invesmentproject.model.repository.Portfolio
import com.example.invesmentproject.model.repository.PortfolioPosition
import com.example.invesmentproject.model.repository.StockRepositoryImpl
import com.example.invesmentproject.navigation.Screens
import com.example.invesmentproject.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeViewViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle, stockRepositoryImpl: StockRepositoryImpl
) : ViewModel() {
    private lateinit var portfolioListFlow: Flow<Resource<Portfolio>>

    init {
        Log.d(TAG, "init of block HomeViewViewModel")
        viewModelScope.launch {
            val symbol = savedStateHandle.get<String>("symbol") ?: return@launch
            state = state.copy(isLoading = true)

            portfolioListFlow = stockRepositoryImpl.getPortfolio(true)
            portfolioListFlow.collect { portfolio ->
                _portfolioValue.value = portfolio.data?.totalAmountPortfolio?.units
                _portfolioList.value = portfolio.data?.positions!!
            }
        }
    }

    var state by mutableStateOf(HomeViewState())
    private val _portfolioValue = MutableStateFlow<Int?>(0)
    val portfolioValue: StateFlow<Int?> = _portfolioValue
    private val _portfolioList =
        MutableStateFlow<List<PortfolioPosition>>(List<PortfolioPosition>(0) {
            PortfolioPosition(
                null,
                null,
                null,
                null,
                null
            )
        })
    val portfolioList: StateFlow<List<PortfolioPosition>> = _portfolioList

    companion object {
        const val TAG = "HomeViewViewModel"
    }
}

object BottomNavItemsList {
    val BottomNavItems = listOf(
        BottomBarItem(
            label = "Profile", icon = Icons.Filled.AccountBox, route = Screens.Profile.route
        ), BottomBarItem(
            label = "Home", icon = Icons.Filled.Home, route = Screens.Home.route
        ), BottomBarItem(
            label = "Settings", icon = Icons.Filled.Settings, route = Screens.Settings.route
        )
    )
}

data class BottomBarItem(
    val label: String, val icon: ImageVector, val route: String
)