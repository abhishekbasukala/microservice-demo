package com.altimetrik.microservicedemo.client;

import com.altimetrik.microservicedemo.model.PartsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "parts-client", url= "http://localhost:8080")
public interface PartClient {

    @GetMapping("/api/part/directory/{id}")
    ResponseEntity<PartsResponse> printPart(@PathVariable Long id);

}
