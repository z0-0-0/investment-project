package com.example.invesmentproject.viewmodel.repository

import com.example.invesmentproject.utils.Resource
import java.util.concurrent.Flow

interface StockRepository  {

    suspend fun getCompanyListings(

    ): Flow<Resource<List</* TODO */>>>
}