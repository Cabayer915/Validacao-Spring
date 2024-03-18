package com.example.validacao;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musicas")
public class MusicaController {
    private List<Musica> musicas = new ArrayList<>();

    @GetMapping
    public ResponseEntity<List<Musica>> listar(){
        if (musicas.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).build();
    }

    @PostMapping
    public ResponseEntity<Musica> cadastrar(@RequestBody @Valid Musica musica) {
        this.musicas.add(musica);
        return ResponseEntity.status(201).body(musica);
    }
}
