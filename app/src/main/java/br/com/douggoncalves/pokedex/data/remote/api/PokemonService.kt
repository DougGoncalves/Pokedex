package br.com.douggoncalves.pokedex.data.remote.api

import br.com.douggoncalves.pokedex.data.remote.model.PokemonPayload
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonService{

    @GET("/api/v2/pokemon/{id}")
    fun pesquisar(@Path("id") id:String) : Call<PokemonPayload>
}