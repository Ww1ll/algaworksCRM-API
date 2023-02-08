package algaworksCRMapi.algaCRM.controller;

import algaworksCRMapi.algaCRM.model.Cliente;
import algaworksCRMapi.algaCRM.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public List<Cliente> listar(){
        return clientRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente adicionarCliente(@RequestBody Cliente cliente){
        return clientRepository.save(cliente);
    }
}
