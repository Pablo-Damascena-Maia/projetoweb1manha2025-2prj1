package com.senac.games.service;

import com.senac.games.entity.Participante;
import com.senac.games.repository.ParticipanteRepositry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParticipanteService {
    private ParticipanteRepositry participanteRepositry;

    public ParticipanteService(ParticipanteRepositry participanteRepositry) {
        this.participanteRepositry = participanteRepositry;

    }
    public List<Participante> listarParticipante(){
        return this.participanteRepositry.findAll();
    }
}
