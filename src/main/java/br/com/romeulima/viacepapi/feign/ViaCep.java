package br.com.romeulima.viacepapi.feign;

import br.com.romeulima.viacepapi.dto.address.AddressRequest;
import br.com.romeulima.viacepapi.dto.address.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface ViaCep {

    @GetMapping("{cep}/json")
    public AddressResponse fetchViaCep(@PathVariable String cep);
}
