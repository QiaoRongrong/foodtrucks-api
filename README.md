# foodtrucks-api
Food trucks of San Francisco Restful API Service.
- Supply a powerful endpoint for client to search the food trucks all in San Francisco.

## how to get started
On linux
1. Prepare database on your MySQL. Create db and table by sql script. file: schema.sql and data.sql on ./src/main/resources
2. Config application-{your profile}.yaml for your DB of Env. MySQL IP:port and username, password.
3. 'gradle build' the project to get the jar file:[foodtrucks-api-0.0.1-SNAPSHOT.jar](build%2Flibs%2Ffoodtrucks-api-0.0.1-SNAPSHOT.jar) under ./build folder
4. java -jar
```bash
java -jar -Dspring.profiles.active=dev foodtrucks-api-0.0.1-SNAPSHOT.jar 
```
Docker (need more test...be limited to my network, I cannot do more try for it.)
```shell
 docker build -t spring-boot-docker:spring-docker .
```
Cloud platform
1. Depend on Cloud (PCF, Openshift). 

## Tradeoffs and thoughts
1. To estimate how many people to buy food on the food truck, then we can make sure the NFR.
2. Base on 1, we can consider if we need to cluster our service.
3. At the beginning, I consider to use the in-memory db to store data. Finally, I decide to use mysql, it could support cluster our app if need.
4. If customer need to login? if so, we could create gateway service to auth.
5. Jenkins(CI, CD) is very important for us, could make us to fail fast and deploy new feature quickly.
6. Can develop a crawler to get the food truck data periodically.
7. Add unit test.

## Biz
1. Get the food truck in San Francisco from website.
2. Supply an API for client/customer to search the food truck info.

- Endpoints: http://{IP}:{port}/api/v1/food-trucks?address=100%20GEARY 

## Tech
- java 17
- Spring boot 2.7.8
- gradle 7.6
- spring webflux
- cvs parser
- mysql 8

## Some Ideas 
1. Data: loop to get the data from sfgov.org; put the data into cache db for response speed, such as redis, memcache.
2. To prepare food truck and food items images for better customer experience.
3. Filter the result for more conditions, like: distance, status, expiration date and so on. (it is TODO items for the web API.)


## Ops 
1. Create Jenkins job/pipeline to run test cases and deploy to multiple Env.
2. Jenkins deploy to Prod. Create Unix script or docker container depends on the Prod Env, should be cloud platform.

## Last
Dear team, hope I can eat the Taco from food truck with you,one day :).

