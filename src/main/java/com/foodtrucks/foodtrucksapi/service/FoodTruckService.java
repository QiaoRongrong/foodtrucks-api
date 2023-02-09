package com.foodtrucks.foodtrucksapi.service;

import com.foodtrucks.foodtrucksapi.domain.FoodTruck;
import com.foodtrucks.foodtrucksapi.vo.FoodTruckVo;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Flux;

public interface FoodTruckService {

    Flux<FoodTruckVo> getFoodTruck(String address, Pageable pageable);

    Flux<FoodTruck> getRawFoodTrucks(Pageable pageable);
}
