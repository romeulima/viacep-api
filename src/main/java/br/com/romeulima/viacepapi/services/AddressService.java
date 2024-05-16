package br.com.romeulima.viacepapi.services;

import br.com.romeulima.viacepapi.dto.address.AddressRequest;
import br.com.romeulima.viacepapi.dto.address.AddressResponse;
import br.com.romeulima.viacepapi.feign.ViaCep;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    @Autowired
    private final ViaCep viaCep;

    public AddressResponse callApiViacep(AddressRequest cep){
        return viaCep.fetchViaCep(cep.getCep());
    }
}
