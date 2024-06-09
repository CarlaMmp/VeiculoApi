package com.example.desafio_place.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.desafio_place.model.Contrato;
import com.example.desafio_place.repository.ContratoRepository;
import com.example.desafio_place.service.ContratoService;

@Service
public class ContratoServiceImpl implements ContratoService {

    @Autowired
    private ContratoRepository contratoRepository;

    @Override
    public Contrato criarContrato(Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    @Override
    public List<Contrato> listarContratos() {
        return contratoRepository.findAll();
    }

    @Override
    public Optional<Contrato> obterContratoPorId(Long id) {
        return contratoRepository.findById(id);
    }

    @Override
    public Contrato atualizarContrato(Contrato contrato) {
        return contratoRepository.save(contrato);
    }

    @Override
    public void excluirContrato(Long id) {
        contratoRepository.deleteById(id);
    }
}
