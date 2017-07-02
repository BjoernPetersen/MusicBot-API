# JMusicBot-API

The API description for the JMusicBot written in Swagger / OpenAPI.   
For every version an Android client library is generated. It can be found in the androidClient folder.    

## Documentation
The latest documentation can be found here: [documentation](https://felixgail.github.io/CircleCIArtifactProvider/index.html?vcs-type=github&user=BjoernPetersen&project=JMusicBot-API&build=latest&branch=master&filter=successful&path=root/app/docs/index.html&token=46dc7aefa69e32721cbdf9ec6e74645f52055c13).

## Usage
You can use the library by adding the following to your projects build file:

### Gradle
```groovy
compile "com.github.bjoernpetersen:jmusicbot-android-client:0.3.0"
```

### Maven
```xml
<dependency>
    <groupId>com.github.bjoernpetersen</groupId>
    <artifactId>jmusicbot-android-client</artifactId>
    <version>0.3.0</version>
    <scope>compile</scope>
</dependency>
```

### Other
If the library doesn't fulfill your needs, you could also create a different client stub with the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) tool.
