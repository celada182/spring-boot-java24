package com.celada.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.celada.openapi.model.RestGame;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RestUser
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T10:06:36.397743+02:00[Europe/Madrid]", comments = "Generator version: 7.14.0")
public class RestUser {

  private @Nullable Long id;

  private @Nullable String name;

  private @Nullable String email;

  private @Nullable String password;

  
  private List<RestGame> games = new ArrayList<>();

  public RestUser id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public RestUser name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", example = "theUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public RestUser email(@Nullable String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  
  @Schema(name = "email", example = "john@email.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public @Nullable String getEmail() {
    return email;
  }

  public void setEmail(@Nullable String email) {
    this.email = email;
  }

  public RestUser password(@Nullable String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  
  @Schema(name = "password", example = "12345", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public @Nullable String getPassword() {
    return password;
  }

  public void setPassword(@Nullable String password) {
    this.password = password;
  }

  public RestUser games(List<RestGame> games) {
    this.games = games;
    return this;
  }

  public RestUser addGamesItem(RestGame gamesItem) {
    if (this.games == null) {
      this.games = new ArrayList<>();
    }
    this.games.add(gamesItem);
    return this;
  }

  /**
   * Get games
   * @return games
   */
  
  @Schema(name = "games", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("games")
  public List<RestGame> getGames() {
    return games;
  }

  public void setGames(List<RestGame> games) {
    this.games = games;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestUser restUser = (RestUser) o;
    return Objects.equals(this.id, restUser.id) &&
        Objects.equals(this.name, restUser.name) &&
        Objects.equals(this.email, restUser.email) &&
        Objects.equals(this.password, restUser.password) &&
        Objects.equals(this.games, restUser.games);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, password, games);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

