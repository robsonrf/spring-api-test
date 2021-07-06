# Projeto Teste: WineStore

### Info
Informações sobre o projeto:

* Utiliza entidade Base para simplificação do mapeamento das entidades. Ver classe _ModelBase.java_
* Utiliza Controller Genérico que já implementa alguns métodos HTTP padrões. Ver: _GenericController.java_
* Utiliza Repository Genérico que extende a interface _JpaRepository_. Ver: _GenericRepository.java_
* Projeto utilizando o DB MySql. Script em: wine\src\main\resources\db\migration\V1__Initial.sql
* Dependencias: Ver _build.gradle_
* Parametros da aplicação, Ver: wine\src\main\resources\application.properties
* Foi incluído alguns comentários no código

### Rest API

### Requests de exemplo
**GET**
* Por RequestParam: 
[localhost:8080/winestore/wine/get-wine-store-by-cep?cep=10000001](localhost:8080/winestore/wine/get-wine-store-by-cep?cep=10000001)


**POST** 
* [localhost:8080/winestore/wine/](localhost:8080/winestore/wine/)

```
Params (JSON):
{
     "code": "LOJA_PINHEIROS",
     "startRange": "10000000",
     "endRange": "20000000",
     "createdAt": "2021-07-05",
     "updatedAt": "2021-07-05"
 }
```

**PUT** 
* [localhost:8080/winestore/wine/1](localhost:8080/winestore/wine/1)

```
Params (JSON):
{
     "code": "NOVA_LOJA_PINHEIROS",
     "startRange": "10000000",
     "endRange": "20000000",
     "createdAt": "2021-07-05",
     "updatedAt": "2021-07-05"
 }
```

**DELETE**
* [localhost:8080/winestore/wine/1](localhost:8080/winestore/wine/1)

```
Params (PathVariable):

localhost:8080/winestore/wine/{id}

exemplo: localhost:8080/winestore/wine/1
```

