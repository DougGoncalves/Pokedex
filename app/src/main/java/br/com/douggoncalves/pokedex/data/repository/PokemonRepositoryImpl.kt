package br.com.douggoncalves.pokedex.data.repository

import br.com.douggoncalves.pokedex.data.remote.api.APIService
import br.com.douggoncalves.pokedex.domain.entity.Pokemon
import br.com.douggoncalves.pokedex.domain.repository.PokemonRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonRepositoryImpl : PokemonRepository{

    override fun pesquisar(id: String) {
        APIService.instance
            ?.pesquisar(id)
            ?.enqueue(object : Callback<Pokemon> {
                override fun onResponse(call: Call<Pokemon>, response: Response<Pokemon>) {
                    TODO("Not yet implemented")
                }

                override fun onFailure(call: Call<Pokemon>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
    }
}