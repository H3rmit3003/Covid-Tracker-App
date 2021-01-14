package com.example.covidtracker

interface CovidService {
    @GET("")
    fun getNationalData()

}