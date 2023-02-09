package com.foodtrucks.foodtrucksapi.repo;

import com.foodtrucks.foodtrucksapi.domain.FoodTruck;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodTruckRepository extends PagingAndSortingRepository<FoodTruck, Integer> {

    List<FoodTruck> findAllByAddressContains(String address, Pageable pageable);

}