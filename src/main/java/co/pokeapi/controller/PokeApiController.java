package co.pokeapi.controller;

import co.pokeapi.data.dto.response.MyPokeApiApiResponseDto;
import co.pokeapi.restClient.PokeApiRestClientService;
import co.pokeapi.service.PokeApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static co.pokeapi.mapper.ToDto.*;

@RestController
@RequiredArgsConstructor
//@RequestMapping("")
public class PokeApiController {

    private final PokeApiService pokeApiService;

    @GetMapping
    private MyPokeApiApiResponseDto getPokemons() {

        return pokeApiService.getPokemons();
    }

}
