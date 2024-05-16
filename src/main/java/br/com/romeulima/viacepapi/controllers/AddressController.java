package br.com.romeulima.viacepapi.controllers;

import br.com.romeulima.viacepapi.dto.address.AddressRequest;
import br.com.romeulima.viacepapi.dto.address.AddressResponse;
import br.com.romeulima.viacepapi.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    @Autowired
    private final AddressService service;

    @GetMapping
    public ResponseEntity<AddressResponse> getCepDetails(@RequestBody AddressRequest cep){
        return ResponseEntity.ok(service.callApiViacep(cep));
    }
}
