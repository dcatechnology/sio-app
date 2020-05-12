package com.dca.sio.app.masterdata.service.model.service.implement;

import com.dca.sio.app.masterdata.service.model.entity.TipoAforo;
import com.dca.sio.app.masterdata.service.model.repository.ITipoAforoDao;
import com.dca.sio.app.masterdata.service.model.service.ITipoAforoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TipoAforoService implements ITipoAforoService {

    @Autowired
    private ITipoAforoDao aforoDao;


    @Override
    @Transactional(readOnly = true)
    public List<TipoAforo> findAllTipoAforo() {
        return (List<TipoAforo>)aforoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoAforo findByCodTipoAforo(String codTipoAforo) {
        return aforoDao.findByCodTipoaforo(codTipoAforo);
    }

    @Override
    @Transactional
    public TipoAforo createTipoAforo(TipoAforo tipoAforo) {
        return aforoDao.save(tipoAforo);
    }

    @Override
    @Transactional
    public TipoAforo editTipoAforo(Long id, TipoAforo tipoAforo) throws Exception {
        TipoAforo aforo = aforoDao.findById(id).orElse(null);

        if(aforo == null){
            throw new Exception("El registro que trata de buscar no se encuentra disponible.");
        }

        aforo.setCodTipoaforo(tipoAforo.getCodTipoaforo());
        aforo.setDescripcion(tipoAforo.getDescripcion());

        return aforoDao.save(aforo);
    }

    @Override
    @Transactional
    public void deleteTipoAforo(Long id) {
        aforoDao.deleteById(id);
    }
}
