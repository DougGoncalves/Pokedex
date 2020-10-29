package br.com.douggoncalves.pokedex.domain.repository

import br.com.douggoncalves.pokedex.domain.entity.Pokemon

interface PokemonRepository {

    fun pesquisar(
        id: String,
        onComplete: (Pokemon?) -> Unit,
        onError: (Throwable) -> Unit
    )
}