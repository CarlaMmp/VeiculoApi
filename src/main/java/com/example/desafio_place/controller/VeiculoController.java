package com.example.desafio_place.controller;

import com.example.desafio_place.model.Veiculo;
import com.example.desafio_place.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping
    public List<Veiculo> getAllVeiculos() {
        return veiculoService.getAllVeiculos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> getVeiculoById(@PathVariable Long id) {
        Veiculo veiculo = veiculoService.getVeiculoById(id);
        return veiculo != null ? ResponseEntity.ok(veiculo) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Veiculo createVeiculo(@RequestBody Veiculo veiculo) {
        return veiculoService.saveOrUpdateVeiculo(veiculo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> updateVeiculo(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        if (veiculoService.getVeiculoById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        veiculo.setId(id);
        return ResponseEntity.ok(veiculoService.saveOrUpdateVeiculo(veiculo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVeiculo(@PathVariable Long id) {
        if (veiculoService.getVeiculoById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        veiculoService.deleteVeiculo(id);
        return ResponseEntity.noContent().build();
    }
}
