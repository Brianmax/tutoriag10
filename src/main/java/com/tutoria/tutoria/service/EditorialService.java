package com.tutoria.tutoria.service;

import com.tutoria.tutoria.entity.EditorialEntity;
import com.tutoria.tutoria.request.EditorialRequest;

public interface EditorialService {
    EditorialEntity save(EditorialRequest editorialRequest);
}
