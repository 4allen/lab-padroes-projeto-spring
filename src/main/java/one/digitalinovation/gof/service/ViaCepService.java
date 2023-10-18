package one.digitalinovation.gof.service;

import one.digitalinovation.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")

public class ViaCepService {
    @GetMapping("/{cep}/json/")
    public Endereco consultarCep(@PathVariable("cep") String cep) {
        return null;
    }
}
