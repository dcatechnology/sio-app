package com.dca.sio.app.masterdata.service.model.service.implement;

import com.dca.sio.app.masterdata.service.model.entity.UnidadMedida;
import com.dca.sio.app.masterdata.service.model.repository.IUnidadMedidaDao;
import com.dca.sio.app.masterdata.service.model.service.IUnidadMedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UnidadMedidaService implements IUnidadMedidaService {

    @Autowired
    private IUnidadMedidaDao unidadMedidaDao;

    @Override
    @Transactional(readOnly = true)
    public List<UnidadMedida> findAllUnidadMedida() {
        return (List<UnidadMedida>)unidadMedidaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public UnidadMedida findByCodUnidadMedida(String codUnidadMedida) {
        return unidadMedidaDao.findByCodUnidadMedida(codUnidadMedida);
    }

    @Override
    @Transactional
    public UnidadMedida createUnidadMedida(UnidadMedida unidadMedida) {
        return unidadMedidaDao.save(unidadMedida);
    }

    @Override
    @Transactional
    public UnidadMedida editUnidadMedida(Long id, UnidadMedida unidadMedida) throws Exception {
        UnidadMedida medida = unidadMedidaDao.findById(id).orElse(null);

        if(medida == null){
            throw new Exception("El registro que trata de buscar no se encuentra disponible.");
        }

        medida.setCodUnidadMedida(unidadMedida.getCodUnidadMedida());
        medida.setDescripcion(unidadMedida.getDescripcion());

        return unidadMedidaDao.save(medida);
    }

    @Override
    @Transactional
    public void deleteUnidadMedida(Long id) {
        unidadMedidaDao.deleteById(id);
    }
}
