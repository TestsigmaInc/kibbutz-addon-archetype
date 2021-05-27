## Testsigma SDK Plugin Archetype

Archetype used to generate Testsigma SDK Addon


### Create
```
mvn archetype:generate -DgroupId=com.testsigma.addons -DartifactId=pdf-validations -Dversion=1.0.0 -DarchetypeArtifactId=kibbutz-plugin-archetype -DarchetypeGroupId=com.testsigma.kibbutz.archetypes -DarchetypeVersion=1.0.0 -DinteractiveMode=false -Dtestsigma-sdk-api-key=sample
```

### Code Analysis

```
mvn clean com.testsigma.sdk:testsigma-addon-maven-plugin:scan
```

### Upload

```
mvn clean pacakge
```

### Testing Upload to other than production
 add bellow lines to generated addon
```xml
<configuration>
  <host>http://dev-kibbutz.testsigma.com</host>
</configuration>
```

