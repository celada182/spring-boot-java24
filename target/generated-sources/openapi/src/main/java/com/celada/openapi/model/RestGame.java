package com.celada.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import java.time.OffsetDateTime;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RestGame
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T10:06:36.397743+02:00[Europe/Madrid]", comments = "Generator version: 7.14.0")
public class RestGame {

  private @Nullable Long id;

  private @Nullable String name;

  private @Nullable Boolean multiplayer;

  private @Nullable Long users;

  private @Nullable Integer teamSize;

  public RestGame id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", example = "100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public RestGame name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", example = "theGame", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public RestGame multiplayer(@Nullable Boolean multiplayer) {
    this.multiplayer = multiplayer;
    return this;
  }

  /**
   * Get multiplayer
   * @return multiplayer
   */
  
  @Schema(name = "multiplayer", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("multiplayer")
  public @Nullable Boolean getMultiplayer() {
    return multiplayer;
  }

  public void setMultiplayer(@Nullable Boolean multiplayer) {
    this.multiplayer = multiplayer;
  }

  public RestGame users(@Nullable Long users) {
    this.users = users;
    return this;
  }

  /**
   * Get users
   * @return users
   */
  
  @Schema(name = "users", example = "100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("users")
  public @Nullable Long getUsers() {
    return users;
  }

  public void setUsers(@Nullable Long users) {
    this.users = users;
  }

  public RestGame teamSize(@Nullable Integer teamSize) {
    this.teamSize = teamSize;
    return this;
  }

  /**
   * Get teamSize
   * @return teamSize
   */
  
  @Schema(name = "teamSize", example = "5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teamSize")
  public @Nullable Integer getTeamSize() {
    return teamSize;
  }

  public void setTeamSize(@Nullable Integer teamSize) {
    this.teamSize = teamSize;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestGame restGame = (RestGame) o;
    return Objects.equals(this.id, restGame.id) &&
        Objects.equals(this.name, restGame.name) &&
        Objects.equals(this.multiplayer, restGame.multiplayer) &&
        Objects.equals(this.users, restGame.users) &&
        Objects.equals(this.teamSize, restGame.teamSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, multiplayer, users, teamSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestGame {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    multiplayer: ").append(toIndentedString(multiplayer)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    teamSize: ").append(toIndentedString(teamSize)).append("\n");
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

