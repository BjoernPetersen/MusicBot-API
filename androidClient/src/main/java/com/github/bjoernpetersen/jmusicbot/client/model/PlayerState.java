/*
 * JMusicBot
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.bjoernpetersen.jmusicbot.client.model;

import java.util.Objects;
import com.github.bjoernpetersen.jmusicbot.client.model.SongEntry;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * PlayerState
 */

public class PlayerState implements Parcelable {
  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    PLAY("PLAY"),
    
    PAUSE("PAUSE"),
    
    STOP("STOP"),
    
    ERROR("ERROR");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("songEntry")
  private SongEntry songEntry = null;

  public PlayerState state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public PlayerState songEntry(SongEntry songEntry) {
    this.songEntry = songEntry;
    return this;
  }

   /**
   * Get songEntry
   * @return songEntry
  **/
  @ApiModelProperty(value = "")
  public SongEntry getSongEntry() {
    return songEntry;
  }

  public void setSongEntry(SongEntry songEntry) {
    this.songEntry = songEntry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerState playerState = (PlayerState) o;
    return Objects.equals(this.state, playerState.state) &&
        Objects.equals(this.songEntry, playerState.songEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, songEntry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerState {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    songEntry: ").append(toIndentedString(songEntry)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
  public void writeToParcel(Parcel out, int flags) {
     
    out.writeValue(state);

    out.writeValue(songEntry);
  }

  public PlayerState() {
    super();
  }

  PlayerState(Parcel in) {
    
    state = (StateEnum)in.readValue(null);
    songEntry = (SongEntry)in.readValue(SongEntry.class.getClassLoader());
  }
  
  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<PlayerState> CREATOR = new Parcelable.Creator<PlayerState>() {
    public PlayerState createFromParcel(Parcel in) {
      return new PlayerState(in);
    }
    public PlayerState[] newArray(int size) {
      return new PlayerState[size];
    }
  };
}

