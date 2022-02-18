package co.pokeapi.service.impl;

import co.pokeapi.data.dto.response.MyPokeApiApiResponseDto;
import co.pokeapi.restClient.PokeApiRestClientService;
import co.pokeapi.service.PokeApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static co.pokeapi.mapper.ToDto.INSTANCE;

@Service
@RequiredArgsConstructor
public class PokeApiServiceImpl implements PokeApiService {

    private final PokeApiRestClientService pokeApiRestClientService;

    @Override
    public MyPokeApiApiResponseDto getPokemons() {
        return INSTANCE.toDto(pokeApiRestClientService.getPokemons());

    }
}
