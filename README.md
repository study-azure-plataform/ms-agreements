# Microservice for Customer Agreements with Azure CosmosDB

### Description

This microservice is the customer agreement with products or services.

#### Get Started

- JDK 11
- Gradle
- Git
- Azure CosmosDB
- Azure Key Vault

#### Azure Spring Data CosmosDB

You need an Azure portal account and a CosmosDB instance.
If you don't want to use **Azure Key Vault**, you can manually configure **application.properties** file fill in the **endpoint**, **key** and **database**.
This configuration will give access to the cosmosDB instance by the application.

#### Azure Key Vault

Here use the guide reference of Microsoft Azure Documentation
[https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-key-vault](https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-key-vault)

`az ad sp create-for-rbac --name "AZ-AD-SERV-MAIN" --role Contributor --scopes /subscriptions/<<replace here with your subscription id>>/resourceGroups/<<replace here with your resourceGroup name>>`

OUTPUT to save and use in API:\
{\
  "appId": "this **id** will be your **client-id** for use in application.properties", \
  "displayName": "AZ-AD-SERV-MAIN",\
  "password": "this **password** will be your **client-secret** for use in application.properties",\
  "tenant": "this is your id tenant"\
}

Create variables environment for access Azure Key Vault and keep the save. You can create in your IDE, Terminal or environment. \ 

**ENV_AZ_KV_URI** = _vault URI_ \
**ENV_AZ_KV_TENANT** =  Tenant Id  \
**ENV_AZ_KV_APP_ID** = AppId returned from Json\
**ENV_AZ_KV_APP_SECRET** = password returned from Json \
 

