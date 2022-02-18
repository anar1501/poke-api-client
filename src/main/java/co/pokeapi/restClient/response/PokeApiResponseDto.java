package co.pokeapi.restClient.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class PokeApiResponseDto {

    private List<Abilities> abilities;
    @JsonProperty("base_experience")
    private Long baseExperience;
    private List<Form> forms;
    @JsonProperty("game_indices")
    private List<GameIndices> gameIndices;
    private Long height;
    @JsonProperty("is_default")
    private boolean isDefault;
    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;
    private List<Moves> moves;
    private String name;
    private BigDecimal order;
    @JsonProperty("past_types")
    private List<PastType> pastTypes;
    private Species species;
    private Sprites sprites;

    @Data
    @Builder
    public static class Abilities {
        private Ability ability;
        @JsonProperty("is_hidden")
        private boolean isHidden;
        private Long slot;
    }

    @Data
    @Builder
    public static class Ability {
        private String name;
        private String url;
    }

    @Data
    @Builder
    public static class Form {
        private String name;
        private String url;
    }

    @Data
    @Builder
    public static class GameIndices {
        @JsonProperty("game_index")
        private String gameIndex;
        private Version version;
    }

    @Data
    @Builder
    public static class Version {
        private String name;
        private String url;
    }

    @Data
    @Builder
    public static class Moves {
        private Move move;
        @JsonProperty("version_group_details")
        private List<VersionGroupDetail> versionGroupDetails;
    }

    @Data
    @Builder
    public static class Move {
        private String name;
        private String url;
    }

    @Data
    @Builder
    public static class VersionGroupDetail {
        @JsonProperty("level_learned_at")
        private Long levelLearnedAt;
        @JsonProperty("move_learn_method")
        private MoveLearnMethod moveLearnMethod;
        @JsonProperty("version_group")
        private VersionGroup versionGroup;
    }

    @Data
    @Builder
    public static class MoveLearnMethod {
        private String name;
        private String url;
    }

    @Data
    @Builder
    public static class VersionGroup {
        private String name;
        private String url;
    }


    @Data
    @Builder
    public static class PastType {
        private String name;
        private String url;
    }

    @Data
    @Builder
    public static class Species {
        private String name;
        private String url;
    }

    @Data
    @Builder
    public static class Sprites {
        @JsonProperty("back_default")
        private String backDefault;
        @JsonProperty("back_female")
        private String backFemale;
        @JsonProperty("back_shiny")
        private String backShiny;
        @JsonProperty("back_shiny_female")
        private String backShinyFemale;
        @JsonProperty("front_default")
        private String frontDefault;
        @JsonProperty("front_female")
        private String frontFemale;
        @JsonProperty("front_shiny")
        private String frontShiny;
        @JsonProperty("front_shiny_female")
        private String frontShinyFemale;
        private Other other;
        private Version version;


    }

    @Data
    @Builder
    public static class Other {
        private DreamWorld dreamWorld;
        private Home home;
        @JsonProperty("official-artwork")
        private OfficialArtWork officialArtWork;
    }

    @Data
    @Builder
    public static class DreamWorld {
        @JsonProperty("front_default")
        private String frontDefault;
        @JsonProperty("front_female")
        private String frontFemale;
    }

    @Data
    @Builder
    public static class Home {
        @JsonProperty("front_default")
        private String frontDefault;
        @JsonProperty("front_female")
        private String frontFemale;
        @JsonProperty("front_shiny")
        private String frontShiny;
        @JsonProperty("front_shiny_female")
        private String frontShinyFemale;

    }

    @Data
    @Builder
    public static class OfficialArtWork {
        @JsonProperty("front_default")
        private String frontDefault;
    }


}
