package repository

import api.PersonajesApi
import model.ListaPersonajes
import javax.inject.Inject

class PersonajesRepository @Inject constructor(
    private val personajesApi: PersonajesApi
) {
    suspend fun getPersonajes():ListaPersonajes{
        return personajesApi.getPersonajes()
    }
}