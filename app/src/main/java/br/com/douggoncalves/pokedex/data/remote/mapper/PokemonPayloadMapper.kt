package br.com.douggoncalves.pokedex.data.remote.mapper

import br.com.douggoncalves.pokedex.data.remote.model.PokemonPayload
import br.com.douggoncalves.pokedex.domain.entity.Pokemon

object PokemonPayloadMapper {



    fun map (pokemon : PokemonPayload) = Pokemon(
        pokemon.nome,
        pokemon.sprites.other.oficialArtWork.frontDefault
    )
}