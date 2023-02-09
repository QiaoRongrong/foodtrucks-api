package com.foodtrucks.foodtrucksapi.controller;

import com.foodtrucks.foodtrucksapi.domain.FoodTruck;
import com.foodtrucks.foodtrucksapi.service.FoodTruckService;
import com.foodtrucks.foodtrucksapi.vo.FoodTruckVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
@RequestMapping("api/v1/food-trucks")
public class FoodTrucksController {
    private final FoodTruckService foodTruckService;
    public FoodTrucksController(FoodTruckService foodTruckService) {
        this.foodTruckService = foodTruckService;
    }

    @Profile("default, test")
    @GetMapping("raw")
    public Flux<FoodTruck> getRawFoodTrucks(@RequestParam(defaultValue = "0") int page,
                                            @RequestParam(defaultValue = "5") int size) {

        return foodTruckService.getRawFoodTrucks(PageRequest.of(page, size));
    }

    //TODO: search by food items, address, food truck position ans so on.
    @GetMapping
    public Flux<FoodTruckVo> getFoodTrucks(@RequestParam(required = false, name = "address") String address,
                                           @RequestParam(defaultValue = "0") int page,
                                           @RequestParam(defaultValue = "5") int size) {
        log.info("search food for our dear team - address: {}", address);
        return foodTruckService.getFoodTruck(address, PageRequest.of(page, size));
    }



}
