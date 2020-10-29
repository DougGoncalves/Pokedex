package br.com.douggoncalves.pokedex.domain.repository

interface PokemonRepository {

    fun pesquisar(id: String)
}