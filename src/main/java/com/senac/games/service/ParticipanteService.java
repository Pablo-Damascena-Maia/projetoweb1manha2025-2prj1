package com.senac.games.service;

import com.senac.games.dto.request.ParticipanteDTORequest;
import com.senac.games.dto.response.ParticipanteDTOResponse;
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
    public Participante listarPorParticipanteId(Integer participanteId){
        return this.participanteRepositry.findById(participanteId).orElse(null);
    }

    public ParticipanteDTOResponse criarParticipante(ParticipanteDTORequest participanteDTO) {
        Participante participante =new Participante();
        participante.setNome(participanteDTO.getNome());
        participante.setEmail(participanteDTO.getEmail());
        participante.setIdentificacao(participanteDTO.getIdentificador());
        participante.setEndereco(participanteDTO.getEndereco());
        participante.setStatus(participanteDTO.getStatus());

        Participante participanteSave = this.participanteRepositry.save(participante);
        ParticipanteDTOResponse participanteDTOResponse = new ParticipanteDTOResponse();
        participanteDTOResponse.setId(participanteSave.getId());
        participanteDTOResponse.setNome(participanteSave.getNome());
        participanteDTOResponse.setEmail(participanteSave.getEmail());
        participanteDTOResponse.setIdentificador(participanteSave.getIdentificacao());
        participanteDTOResponse.setEndereco(participanteSave.getEndereco());
        participanteDTOResponse.setStatus(participanteSave.getStatus());
        ;
        return participanteDTOResponse;
    }
}


