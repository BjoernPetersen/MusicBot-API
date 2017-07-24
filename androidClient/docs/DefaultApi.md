# DefaultApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePassword**](DefaultApi.md#changePassword) | **PUT** /user | Sets a new password
[**deleteUser**](DefaultApi.md#deleteUser) | **DELETE** /user | Deletes a user
[**dequeue**](DefaultApi.md#dequeue) | **DELETE** /player/queue | Removes a Song from the queue
[**enqueue**](DefaultApi.md#enqueue) | **PUT** /player/queue | Adds a Song to the queue
[**getPlayerState**](DefaultApi.md#getPlayerState) | **GET** /player | Returns the current player state
[**getProviders**](DefaultApi.md#getProviders) | **GET** /provider | Returns a list of all available providers
[**getQueue**](DefaultApi.md#getQueue) | **GET** /player/queue | Returns the current player queue
[**getSuggesters**](DefaultApi.md#getSuggesters) | **GET** /suggester | Returns a list of all available suggesters
[**login**](DefaultApi.md#login) | **GET** /user | Retrieves a token for a user
[**lookupSong**](DefaultApi.md#lookupSong) | **GET** /provider/{providerId}/{songId} | Looks up a song
[**nextSong**](DefaultApi.md#nextSong) | **PUT** /player/next | Skips to the next song
[**pausePlayer**](DefaultApi.md#pausePlayer) | **PUT** /player/pause | Pauses the player
[**registerUser**](DefaultApi.md#registerUser) | **POST** /user | Registers a new user
[**removeSuggestion**](DefaultApi.md#removeSuggestion) | **DELETE** /suggester/{suggesterId} | Removes a song from the suggestions
[**resumePlayer**](DefaultApi.md#resumePlayer) | **PUT** /player/play | Resumes the player
[**searchSong**](DefaultApi.md#searchSong) | **GET** /provider/{providerId} | Searches for songs
[**suggestSong**](DefaultApi.md#suggestSong) | **GET** /suggester/{suggesterId} | Returns a list of suggestions


<a name="changePassword"></a>
# **changePassword**
> String changePassword(authorization, password, oldPassword)

Sets a new password

Sets a new password for the caller. If the user was a guest account, this makes him a full user.

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An authorization token |
 **password** | **String**| A password |
 **oldPassword** | **String**| The users old password. Only required if the user is no guest | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain; charset=utf-8

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(authorization)

Deletes a user

Deletes the user associated with the Authorization token.

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authorization = "authorization_example"; // String | An authorization token
try {
    apiInstance.deleteUser(authorization);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| An authorization token |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain; charset=utf-8

<a name="dequeue"></a>
# **dequeue**
> List&lt;QueueEntry&gt; dequeue(authorization, songId, providerId)

Removes a Song from the queue

Removes the specified Song from the current queue. If the queue did not contain the song, nothing is done.

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authorization = "authorization_example"; // String | Authorization token with 'skip' permission
String songId = "songId_example"; // String | the song ID of the song to dequeue
String providerId = "providerId_example"; // String | the provider ID of the song to dequeue
try {
    List<QueueEntry> result = apiInstance.dequeue(authorization, songId, providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#dequeue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization token with &#39;skip&#39; permission |
 **songId** | **String**| the song ID of the song to dequeue |
 **providerId** | **String**| the provider ID of the song to dequeue |

### Return type

[**List&lt;QueueEntry&gt;**](QueueEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enqueue"></a>
# **enqueue**
> List&lt;QueueEntry&gt; enqueue(authorization, songId, providerId)

Adds a Song to the queue

Adds the specified Song to the current queue. If the queue already contains the Song, it won&#39;t be added.

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authorization = "authorization_example"; // String | Authorization token
String songId = "songId_example"; // String | The song's ID
String providerId = "providerId_example"; // String | The ID of the provider the song is from
try {
    List<QueueEntry> result = apiInstance.enqueue(authorization, songId, providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#enqueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization token |
 **songId** | **String**| The song&#39;s ID |
 **providerId** | **String**| The ID of the provider the song is from |

### Return type

[**List&lt;QueueEntry&gt;**](QueueEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlayerState"></a>
# **getPlayerState**
> PlayerState getPlayerState()

Returns the current player state

Returns the current player state. If the state is PLAY or PAUSE, it also contains the current song.

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    PlayerState result = apiInstance.getPlayerState();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getPlayerState");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PlayerState**](PlayerState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProviders"></a>
# **getProviders**
> List&lt;NamedPlugin&gt; getProviders()

Returns a list of all available providers

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<NamedPlugin> result = apiInstance.getProviders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getProviders");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;NamedPlugin&gt;**](NamedPlugin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQueue"></a>
# **getQueue**
> List&lt;QueueEntry&gt; getQueue()

Returns the current player queue

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<QueueEntry> result = apiInstance.getQueue();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getQueue");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;QueueEntry&gt;**](QueueEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSuggesters"></a>
# **getSuggesters**
> List&lt;NamedPlugin&gt; getSuggesters()

Returns a list of all available suggesters

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<NamedPlugin> result = apiInstance.getSuggesters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSuggesters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;NamedPlugin&gt;**](NamedPlugin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="login"></a>
# **login**
> String login(userName, password, uuid)

Retrieves a token for a user

Retrieves an Authorization token for a user. Either a password or a UUID must be supplied. Not both.

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userName = "userName_example"; // String | The user to log in as
String password = "password_example"; // String | The users password. Guest users should use the uuid parameter.
String uuid = "uuid_example"; // String | The UUID (or device ID) authenticating this guest user. Full users should use the password parameter.
try {
    String result = apiInstance.login(userName, password, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| The user to log in as |
 **password** | **String**| The users password. Guest users should use the uuid parameter. | [optional]
 **uuid** | **String**| The UUID (or device ID) authenticating this guest user. Full users should use the password parameter. | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain; charset=utf-8

<a name="lookupSong"></a>
# **lookupSong**
> Song lookupSong(songId, providerId)

Looks up a song

Looks up a song using its ID and a provider ID

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String songId = "songId_example"; // String | A song ID
String providerId = "providerId_example"; // String | A provider ID
try {
    Song result = apiInstance.lookupSong(songId, providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#lookupSong");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **songId** | **String**| A song ID |
 **providerId** | **String**| A provider ID |

### Return type

[**Song**](Song.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="nextSong"></a>
# **nextSong**
> PlayerState nextSong(authorization)

Skips to the next song

Skips the current song and plays the next song.

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String authorization = "authorization_example"; // String | Authorization token with 'skip' permission
try {
    PlayerState result = apiInstance.nextSong(authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#nextSong");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization token with &#39;skip&#39; permission |

### Return type

[**PlayerState**](PlayerState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="pausePlayer"></a>
# **pausePlayer**
> PlayerState pausePlayer()

Pauses the player

Pauses the current playback. If the current player state is not PLAY, does nothing.

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    PlayerState result = apiInstance.pausePlayer();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#pausePlayer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PlayerState**](PlayerState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="registerUser"></a>
# **registerUser**
> String registerUser(userName, uuid)

Registers a new user

Adds a new guest user to the database. The user is identified by his username.

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String userName = "userName_example"; // String | The desired user name
String uuid = "uuid_example"; // String | A uuid (or device ID) to authenticate the user while he doesn't have a password
try {
    String result = apiInstance.registerUser(userName, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#registerUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userName** | **String**| The desired user name |
 **uuid** | **String**| A uuid (or device ID) to authenticate the user while he doesn&#39;t have a password |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain; charset=utf-8

<a name="removeSuggestion"></a>
# **removeSuggestion**
> removeSuggestion(suggesterId, authorization, songId, providerId)

Removes a song from the suggestions

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String suggesterId = "suggesterId_example"; // String | the ID of the suggester
String authorization = "authorization_example"; // String | An authorization token with 'dislike' permission
String songId = "songId_example"; // String | The ID of the song to remove
String providerId = "providerId_example"; // String | The ID of the provider of the song to remove
try {
    apiInstance.removeSuggestion(suggesterId, authorization, songId, providerId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#removeSuggestion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suggesterId** | **String**| the ID of the suggester |
 **authorization** | **String**| An authorization token with &#39;dislike&#39; permission |
 **songId** | **String**| The ID of the song to remove |
 **providerId** | **String**| The ID of the provider of the song to remove |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resumePlayer"></a>
# **resumePlayer**
> PlayerState resumePlayer()

Resumes the player

Pauses the current playback. If the current player state is not PAUSE, does nothing.

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    PlayerState result = apiInstance.resumePlayer();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#resumePlayer");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PlayerState**](PlayerState.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchSong"></a>
# **searchSong**
> List&lt;Song&gt; searchSong(providerId, query)

Searches for songs

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String providerId = "providerId_example"; // String | The provider with which to search
String query = "query_example"; // String | A search query
try {
    List<Song> result = apiInstance.searchSong(providerId, query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#searchSong");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **String**| The provider with which to search |
 **query** | **String**| A search query |

### Return type

[**List&lt;Song&gt;**](Song.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="suggestSong"></a>
# **suggestSong**
> List&lt;Song&gt; suggestSong(suggesterId, max)

Returns a list of suggestions

### Example
```java
// Import classes:
//import com.github.bjoernpetersen.jmusicbot.client.ApiException;
//import com.github.bjoernpetersen.jmusicbot.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String suggesterId = "suggesterId_example"; // String | A suggester ID
Integer max = 56; // Integer | The maximum size of the response. Defaults to 16.
try {
    List<Song> result = apiInstance.suggestSong(suggesterId, max);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#suggestSong");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **suggesterId** | **String**| A suggester ID |
 **max** | **Integer**| The maximum size of the response. Defaults to 16. | [optional]

### Return type

[**List&lt;Song&gt;**](Song.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

