package com.dca.sio.app.masterdata.service.model.service.implement;


import com.dca.sio.app.masterdata.service.model.entity.TipoTecho;
import com.dca.sio.app.masterdata.service.model.repository.ITipoTechoDao;
import com.dca.sio.app.masterdata.service.model.service.ITipoTechoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TipoTechoService implements ITipoTechoService {

    @Autowired
    private ITipoTechoDao tipoTechoDao;

    @Override
    @Transactional(readOnly = true)
    public List<TipoTecho> findAllTipoTecho() {
        return (List<TipoTecho>)tipoTechoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoTecho findByCodTipoTecho(String codTipoTecho) {
        return tipoTechoDao.findByCodTipoTecho(codTipoTecho);
    }

    @Override
    @Transactional
    public TipoTecho createTipoTecho(TipoTecho tipoTecho) {
        return tipoTechoDao.save(tipoTecho);
    }

    @Override
    @Transactional
    public TipoTecho editTipoTecho(Long id, TipoTecho tipoTecho) throws Exception {
        TipoTecho techo = tipoTechoDao.findById(id).orElse(null);

        if(techo == null){
            throw new Exception("El registro que trata de buscar no se encuentra disponible.");
        }

        techo.setCodTipoTecho(tipoTecho.getCodTipoTecho());
        techo.setDescripcion(tipoTecho.getDescripcion());

        return tipoTechoDao.save(techo);
    }

    @Override
    @Transactional
    public void deleteTipoTecho(Long id) {
        tipoTechoDao.deleteById(id);
    }
}
