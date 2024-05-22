package br.com.api.backend.servico;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.backend.modelo.Estado;
import br.com.api.backend.repository.EstadoRepository;


@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscaTodos(){

        return estadoRepository.findAll();
    }
    
    //METODO INSERIR NOVO ESTADO
    public Estado inserir(Estado estado){
        
        estado.setDataCriacao(new Date());
        Estado estadoNovo = estadoRepository.saveAndFlush(estado);
        return estadoNovo;

    }


    // METODO ALTERAR UM ESTADO
    public Estado alterar(Estado estado){
             
        estado.setDataAtualizacao(new Date());
        return estadoRepository.saveAndFlush(estado);
    }



    public void excluir(Long id){

        Estado estado = estadoRepository.findById(id).get();
        estadoRepository.delete(estado);
    }

}
