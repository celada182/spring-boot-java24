package com.celada.openapi.model;

import java.net.URI;
import java.util.Objects;
import com.celada.openapi.model.RestGame;
import com.celada.openapi.model.RestUser;
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
 * RestTeam
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-09-03T10:06:36.397743+02:00[Europe/Madrid]", comments = "Generator version: 7.14.0")
public class RestTeam {

  private @Nullable Long id;

  private @Nullable String name;

  
  private List<RestUser> members = new ArrayList<>();

  private @Nullable RestGame game;

  public RestTeam id(@Nullable Long id) {
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

  public RestTeam name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", example = "theTeam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public RestTeam members(List<RestUser> members) {
    this.members = members;
    return this;
  }

  public RestTeam addMembersItem(RestUser membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Get members
   * @return members
   */
  
  @Schema(name = "members", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("members")
  public List<RestUser> getMembers() {
    return members;
  }

  public void setMembers(List<RestUser> members) {
    this.members = members;
  }

  public RestTeam game(@Nullable RestGame game) {
    this.game = game;
    return this;
  }

  /**
   * Get game
   * @return game
   */
  
  @Schema(name = "game", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("game")
  public @Nullable RestGame getGame() {
    return game;
  }

  public void setGame(@Nullable RestGame game) {
    this.game = game;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestTeam restTeam = (RestTeam) o;
    return Objects.equals(this.id, restTeam.id) &&
        Objects.equals(this.name, restTeam.name) &&
        Objects.equals(this.members, restTeam.members) &&
        Objects.equals(this.game, restTeam.game);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, members, game);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestTeam {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    game: ").append(toIndentedString(game)).append("\n");
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

