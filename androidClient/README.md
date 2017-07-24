# musicbot-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.github.bjoernpetersen</groupId>
    <artifactId>musicbot-android-client</artifactId>
    <version>0.6.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.github.bjoernpetersen:musicbot-android-client:0.6.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/musicbot-android-client-0.6.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.github.bjoernpetersen.jmusicbot.client.*;
import com.github.bjoernpetersen.jmusicbot.client.auth.*;
import com.github.bjoernpetersen.jmusicbot.client.model.*;
import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        String authorization = "authorization_example"; // String | An authorization token
        String password = "password_example"; // String | A password
        String oldPassword = "oldPassword_example"; // String | The users old password. Only required if the user is no guest
        try {
            String result = apiInstance.changePassword(authorization, password, oldPassword);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#changePassword");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**changePassword**](docs/DefaultApi.md#changePassword) | **PUT** /user | Sets a new password
*DefaultApi* | [**deleteUser**](docs/DefaultApi.md#deleteUser) | **DELETE** /user | Deletes a user
*DefaultApi* | [**dequeue**](docs/DefaultApi.md#dequeue) | **DELETE** /player/queue | Removes a Song from the queue
*DefaultApi* | [**enqueue**](docs/DefaultApi.md#enqueue) | **PUT** /player/queue | Adds a Song to the queue
*DefaultApi* | [**getPlayerState**](docs/DefaultApi.md#getPlayerState) | **GET** /player | Returns the current player state
*DefaultApi* | [**getProviders**](docs/DefaultApi.md#getProviders) | **GET** /provider | Returns a list of all available providers
*DefaultApi* | [**getQueue**](docs/DefaultApi.md#getQueue) | **GET** /player/queue | Returns the current player queue
*DefaultApi* | [**getSuggesters**](docs/DefaultApi.md#getSuggesters) | **GET** /suggester | Returns a list of all available suggesters
*DefaultApi* | [**login**](docs/DefaultApi.md#login) | **GET** /user | Retrieves a token for a user
*DefaultApi* | [**lookupSong**](docs/DefaultApi.md#lookupSong) | **GET** /provider/{providerId}/{songId} | Looks up a song
*DefaultApi* | [**nextSong**](docs/DefaultApi.md#nextSong) | **PUT** /player/next | Skips to the next song
*DefaultApi* | [**pausePlayer**](docs/DefaultApi.md#pausePlayer) | **PUT** /player/pause | Pauses the player
*DefaultApi* | [**registerUser**](docs/DefaultApi.md#registerUser) | **POST** /user | Registers a new user
*DefaultApi* | [**removeSuggestion**](docs/DefaultApi.md#removeSuggestion) | **DELETE** /suggester/{suggesterId} | Removes a song from the suggestions
*DefaultApi* | [**resumePlayer**](docs/DefaultApi.md#resumePlayer) | **PUT** /player/play | Resumes the player
*DefaultApi* | [**searchSong**](docs/DefaultApi.md#searchSong) | **GET** /provider/{providerId} | Searches for songs
*DefaultApi* | [**suggestSong**](docs/DefaultApi.md#suggestSong) | **GET** /suggester/{suggesterId} | Returns a list of suggestions


## Documentation for Models

 - [NamedPlugin](docs/NamedPlugin.md)
 - [PlayerState](docs/PlayerState.md)
 - [QueueEntry](docs/QueueEntry.md)
 - [Song](docs/Song.md)
 - [SongEntry](docs/SongEntry.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



