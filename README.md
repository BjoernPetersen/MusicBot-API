# JMusicBot-API ![GitHub (pre-)release](https://img.shields.io/github/release/BjoernPetersen/JMusicBot-API/all.svg)

The OpenAPI specification for the [JMusicBot](https://github.com/BjoernPetersen/JMusicBot).

**Note: This documentation applies to version 0.10.0, which has not been released yet.**

## Android client library

TODO

# Documentation

The latest documentation, automatically generated from the specification, can be found here: [documentation](https://felixgail.github.io/CircleCIArtifactProvider/index.html?vcs-type=github&user=BjoernPetersen&project=JMusicBot-API&build=latest&branch=master&filter=successful&path=docs/index.html&token=46dc7aefa69e32721cbdf9ec6e74645f52055c13).

## Auth

This is a tricky subject for the MusicBot, because the API is only available in the
local network, which makes full HTTPS impossible. Another consideration is that
client end users should not have to worry too much about the authentication process.

For most users, a `Guest` account ([see below](#users)) is sufficient, which does not
require them to enter a password, but only to choose a name.
Client implementations should not ask the user for a password, unless:

- the user explicitly wishes to set a password
- a login attempt as a `Guest` has been made and the user already exists as a `Full` user

### Tokens

Most endpoints require a bearer token for authentication/authorization.
Issued tokens are JWT tokens with a JSON payload.

The payload is a JSON object with at least a `permissions` array:

```json
{
    "permissions": [
        "pause",
        "skip"
    ]
}
```

### Users

There are two types of users: `Guest` users and `Full` users.

`Guest` users:

- are only temporarily stored by the server (in memory)
- have an automatically generated password, for example an Android device ID
- only have the default set of permissions

`Full` users:

- are permanently stored by the server (in a database)
- have an actual password chosen by the user
- can have additional permissions

When registering a new user, first a `Guest` user is created.
That user can then be converted to a `Full` user by setting a password ([see OpenAPI docs under `changePassword`](#documentation)).
