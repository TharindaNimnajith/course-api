# openapi-java-client

course_api API

- API version: 1.0.0
    - Build date: 2023-01-09T01:59:54.317945100+05:30[Asia/Colombo]

course_api API

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml

<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://course_api");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            apiInstance.redirectAll();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#redirectAll");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://course_api*

 Class        | Method                                                      | HTTP request                                  | Description              
--------------|-------------------------------------------------------------|-----------------------------------------------|--------------------------
 *DefaultApi* | [**redirectAll**](docs/DefaultApi.md#redirectAll)           | **GET** /&lt;unknown&gt;                      | GET ${..}                
 *DefaultApi* | [**redirectRequest1**](docs/DefaultApi.md#redirectRequest1) | **GET** /                                     | GET                      
 *DefaultApi* | [**redirectRequest2**](docs/DefaultApi.md#redirectRequest2) | **GET** /redirect                             | GET redirect             
 *DefaultApi* | [**sayBye**](docs/DefaultApi.md#sayBye)                     | **GET** /bye                                  | GET bye                  
 *DefaultApi* | [**sayBye1**](docs/DefaultApi.md#sayBye1)                   | **GET** /bye*                                 | GET bye*                 
 *DefaultApi* | [**sayBye2**](docs/DefaultApi.md#sayBye2)                   | **GET** /bye/{variable}                       | GET bye/_*               
 *DefaultApi* | [**sayBye3**](docs/DefaultApi.md#sayBye3)                   | **GET** /bye/&lt;unknown&gt;                  | GET bye/${..}            
 *DefaultApi* | [**sayBye4**](docs/DefaultApi.md#sayBye4)                   | **GET** /bye*/{variable}/test/&lt;unknown&gt; | GET bye*_/_*_/test/${..} 
 *DefaultApi* | [**sayHello1**](docs/DefaultApi.md#sayHello1)               | **GET** /hello                                | GET hello                
 *DefaultApi* | [**sayHello2**](docs/DefaultApi.md#sayHello2)               | **GET** /welcome                              | GET welcome              
 *DefaultApi* | [**sayHi**](docs/DefaultApi.md#sayHi)                       | **GET** /hi                                   | GET hi                   
 *DefaultApi* | [**saySorry1**](docs/DefaultApi.md#saySorry1)               | **GET** /api/sorry                            | GET api/sorry            
 *DefaultApi* | [**saySorry2**](docs/DefaultApi.md#saySorry2)               | **PUT** /api/sorry                            | PUT api/sorry            
 *DefaultApi* | [**saySorry3**](docs/DefaultApi.md#saySorry3)               | **POST** /api/sorry                           | POST api/sorry           
 *DefaultApi* | [**saySorry4**](docs/DefaultApi.md#saySorry4)               | **DELETE** /api/sorry                         | DELETE api/sorry         
 *DefaultApi* | [**saySorry5**](docs/DefaultApi.md#saySorry5)               | **OPTIONS** /api/sorry                        | OPTIONS api/sorry        
 *DefaultApi* | [**saySorry6**](docs/DefaultApi.md#saySorry6)               | **HEAD** /api/sorry                           | HEAD api/sorry           
 *DefaultApi* | [**saySorry7**](docs/DefaultApi.md#saySorry7)               | **PATCH** /api/sorry                          | PATCH api/sorry          
 *DefaultApi* | [**saySorry8**](docs/DefaultApi.md#saySorry8)               | **TRACE** /api/sorry                          | TRACE api/sorry          

## Documentation for Models

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential
issues.

## Author

Tharinda Nimnajith Rajapaksha