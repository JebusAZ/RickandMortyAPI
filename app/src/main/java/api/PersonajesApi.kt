package api

import model.ListaPersonajes
import retrofit2.http.GET

interface PersonajesApi {
    @GET("character")
    suspend fun getPersonajes():ListaPersonajes
}