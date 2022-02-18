package co.pokeapi.restClient;

import co.pokeapi.config.ApplicationConfiguration;
import co.pokeapi.config.UrlConfiguration;
import co.pokeapi.restClient.response.PokeApiResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PokeApiRestClientService {

    private final ApplicationConfiguration applicationConfiguration;
    private final UrlConfiguration urlConfiguration;

    public PokeApiResponseDto getPokemons() {
        return applicationConfiguration.restTemplate().getForObject(urlConfiguration.getPokeApiUrl(), PokeApiResponseDto.class);
    }
}
