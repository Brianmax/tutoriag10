package com.tutoria.tutoria.service.impl;

import com.tutoria.tutoria.entity.EditorialEntity;
import com.tutoria.tutoria.repository.EditorialRepository;
import com.tutoria.tutoria.request.EditorialRequest;
import com.tutoria.tutoria.service.EditorialService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EditorialServiceImpl implements EditorialService {
    private final EditorialRepository editorialRepository;

    public EditorialServiceImpl(EditorialRepository editorialRepository) {
        this.editorialRepository = editorialRepository;
    }

    @Override
    public EditorialEntity save(EditorialRequest editorialRequest) {
        EditorialEntity editorialEntity = getEntity(editorialRequest);
        if(editorialEntity.getRuc().length() !=10) {
            return null;
        }
        return editorialRepository.save(editorialEntity);
    }

    private EditorialEntity getEntity(EditorialRequest editorialRequest) {
        EditorialEntity editorialEntity = new EditorialEntity();
        editorialEntity.setRuc(editorialRequest.getRuc());
        editorialEntity.setDescripcion(editorialRequest.getDescripcion());
        editorialEntity.setNombre(editorialRequest.getNombre());
        editorialEntity.setFechaFundacion(editorialRequest.getFechaFundacion());

        editorialEntity.setFechaCreacion(new Date());
        editorialEntity.setEstado(true);
        return editorialEntity;
    }
}
