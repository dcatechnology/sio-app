package com.dca.sio.app.masterdata.service.model.service.implement;

import com.dca.sio.app.masterdata.service.model.entity.TipoTanque;
import com.dca.sio.app.masterdata.service.model.repository.ITipoTanqueDao;
import com.dca.sio.app.masterdata.service.model.service.ITipoTanqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TipoTanqueService implements ITipoTanqueService {

    @Autowired
    private ITipoTanqueDao tanqueDao;

    @Override
    @Transactional(readOnly = true)
    public List<TipoTanque> findAllTipoTanque() {
        return (List<TipoTanque>)tanqueDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoTanque findByCodTipoTanque(String codTipoTanque) {
        return tanqueDao.findByCodTipotanque(codTipoTanque);
    }

    @Override
    @Transactional
    public TipoTanque createTipoTanque(TipoTanque tipoTanque) {
        return tanqueDao.save(tipoTanque);
    }

    @Override
    @Transactional
    public TipoTanque editTipoTanque(Long id, TipoTanque tipoTanque) throws Exception {
        TipoTanque tanque = tanqueDao.findById(id).orElse(null);

        if(tanque == null){
            throw new Exception("El registro que trata de buscar no se encuentra disponible.");
        }

        tanque.setCodTipotanque(tipoTanque.getCodTipotanque());
        tanque.setDescripcion(tipoTanque.getDescripcion());

        return tanqueDao.save(tanque);
    }

    @Override
    @Transactional
    public void deleteTipoTanque(Long id) {
        tanqueDao.deleteById(id);
    }
}
