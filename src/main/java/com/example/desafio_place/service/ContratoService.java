// package com.example.desafio_place.service;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.desafio_place.model.Contrato;
// import com.example.desafio_place.repository.ContratoRepository;

// @Service
// public class ContratoServiceImpl implements ContratoService {

//     @Autowired
//     private ContratoRepository contratoRepository; // Presumindo que você tenha um repositório

//     @Override
//     public Contrato criarContrato(Contrato contrato) {
//         return contratoRepository.save(contrato);
//     }

//     @Override
//     public List<Contrato> listarContratos() {
//         return contratoRepository.findAll();
//     }

//     @Override
//     public Optional<Contrato> obterContratoPorId(Long id) {
//         return contratoRepository.findById(id);
//     }

//     @Override
//     public Contrato atualizarContrato(Contrato contrato) {
//         return contratoRepository.save(contrato);
//     }

//     @Override
//     public void excluirContrato(Long id) {
//         contratoRepository.deleteById(id);
//     }
// }

//     public interface ContratoService {
//         Contrato criarContrato(Contrato contrato);
//         List<Contrato> listarContratos();
//         Optional<Contrato> obterContratoPorId(Long id);
//         Contrato atualizarContrato(Contrato contrato);
//         void excluirContrato(Long id);
//     }
    
// }
package com.example.desafio_place.service;

import java.util.List;
import java.util.Optional;

import com.example.desafio_place.model.Contrato;

public interface ContratoService {
    Contrato criarContrato(Contrato contrato);
    List<Contrato> listarContratos();
    Optional<Contrato> obterContratoPorId(Long id);
    Contrato atualizarContrato(Contrato contrato);
    void excluirContrato(Long id);
}
