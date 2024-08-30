package com.example.create.endpoints.controllers;

import com.example.create.endpoints.dtos.Customer;
import com.example.create.endpoints.dtos.GenericResponse;
import com.example.create.endpoints.dtos.Product;
import com.example.create.endpoints.util.StaticData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "commons")
@RestController
public class CommonController {

    StaticData data = new StaticData();

    @GetMapping("/getAllCustomer")
    public ResponseEntity<GenericResponse> getAllCustomers(){
        List<Customer> customers = data.getCustomers();
        GenericResponse<List<Customer>>  response = new GenericResponse<>();
        response.setDataList(customers);
        response.setMessage("SUCCESS");
        response.setStatusCode(1);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/getAllProducts")
    public ResponseEntity<GenericResponse> getAllProducts(){
        List<Product> products = data.getProducts();
        GenericResponse<List<Product>>  response = new GenericResponse<>();
        response.setDataList(products);
        response.setMessage("SUCCESS");
        response.setStatusCode(1);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/getProduct")
    public ResponseEntity<GenericResponse> getProduct(@RequestParam String name){

        GenericResponse response = new GenericResponse();

        Optional<Product> optionalProduct = data.getProducts().stream().filter(data->data.getName().equals(name)).findFirst();
        if (optionalProduct.isPresent())
            response.setData(optionalProduct.get());
        response.setMessage("SUCCESS");
        response.setStatusCode(1);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
