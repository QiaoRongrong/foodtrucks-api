# foodtrucks-api
Food trucks of San Francisco Restful API Service.
- Supply a powerful endpoint for client to search the food trucks all in San Francisco.

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
Dear team, hope I can eat the Taco from food truck with you, one day :).

