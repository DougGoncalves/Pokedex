package br.com.douggoncalves.pokedex.data.repository

import br.com.douggoncalves.pokedex.data.remote.api.APIService
import br.com.douggoncalves.pokedex.data.remote.mapper.PokemonPayloadMapper
import br.com.douggoncalves.pokedex.data.remote.model.PokemonPayload
import br.com.douggoncalves.pokedex.domain.entity.Pokemon
import br.com.douggoncalves.pokedex.domain.repository.PokemonRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PokemonRepositoryImpl : PokemonRepository{

    override fun pesquisar(
        id: String,
        onComplete: (Pokemon?) -> Unit,
        onError: (Throwable) -> Unit
    ) {
        APIService.instance
            ?.pesquisar(id)
            ?.enqueue(object : Callback<PokemonPayload> {
                override fun onResponse(call: Call<PokemonPayload>, response: Response<PokemonPayload>) {
                    if(response.isSuccessful) {
                        val pokemonPayload = response.body()
                        if (pokemonPayload == null) {
                            onError(Throwable("Pokémon não encontrado!"))
                        } else {
                            onComplete(PokemonPayloadMapper.map(pokemonPayload))
                        }

                    } else {
                        onError(Throwable("Pokémon não encontrado!"))
                    }
                }

                override fun onFailure(call: Call<PokemonPayload>, t: Throwable) {
                    onError(t)
                }


            })
    }
}