package com.example.starwars.people.data

data class PlanetWrapper(
    val count :Int,
    val next :String?,
    val previous :String?,
    val results :List<Planet>?
)

data class Planet (
    val name :String,
    val rotation_period :String,
    val orbital_period :String,
    val diameter :String,
    val climate :String,
    val gravity :String,
    val terrain :String,
    val surface_water :String,
    val population :String,
    val residents :List<String>?,
    val films :List<String>?,
    val created :String,
    val edited :String,
    val url :String
)