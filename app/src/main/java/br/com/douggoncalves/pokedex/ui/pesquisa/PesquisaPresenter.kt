package br.com.douggoncalves.pokedex.ui.pesquisa

import br.com.douggoncalves.pokedex.data.remote.api.APIService
import br.com.douggoncalves.pokedex.data.repository.PokemonRepositoryImpl

class PesquisaPresenter (
    val pesquisaView: PesquisaContract.PesquisaView
) : PesquisaContract.PesquisaPresenter {


    override fun pesquisar(id: String) {

        val pokemonRepository = PokemonRepositoryImpl(APIService.instance)

        pokemonRepository.pesquisar(
            id, {
                pesquisaView.exibePokemon(it)
            }, {
                pesquisaView.exibeErro(it.message)
            }
        )
    }
}