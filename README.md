# Spring Boot and jwt

## Get token
#### URL: http://localhost:8080/authenticate
#### Method: POST
#### Request body:
```
{
  "username": iamtheuser,
  "password": mystrongpassword
}
```
#### Response
```
{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpYW10aGV1c2VyIiwiZXhwIjoxNTk0MDEyMjk1LCJpYXQiOjE1OTM5OTQyOTV9.4fIP8k2l_BxkcWuUYNXU0ALCB4zcocm-c2veNb2SSdmKG3T0bhhCGR4JrjWNJtaN98vG5mg2Xa6G9W7GaZgueA"
}
```
## Use token to call REST service
#### URL: http://localhost:8080/hello
#### Method: GET
#### Authorization: Bearer Token
#### Token: Received from `/authenticate` URL
#### Response: When token is correct, HTTP status is 200
```
Hello world !!
```
#### Response: When token is *NOT* correct, HTTP status is 401
