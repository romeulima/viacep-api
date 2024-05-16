package br.com.romeulima.viacepapi.dto.address;

public record AddressResponse(
        String cep,
        String logradouro,
        String bairro,
        String localidade,
        String uf)
{

}
