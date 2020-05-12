package com.dca.sio.app.masterdata.service.model.service.implement;

import com.dca.sio.app.masterdata.service.model.entity.Color;
import com.dca.sio.app.masterdata.service.model.repository.IColorDao;
import com.dca.sio.app.masterdata.service.model.service.IColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ColorService implements IColorService {

    @Autowired
    private IColorDao colorDao;

    @Override
    @Transactional(readOnly = true)
    public List<Color> findAllColors() {
        return (List<Color>)colorDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Color findByCodColor(String codColor) {
        return colorDao.findByCodColor(codColor);
    }

    @Override
    @Transactional
    public Color createColor(Color color) {
        return colorDao.save(color);
    }

    @Override
    @Transactional
    public Color editColor(Long id, Color color) throws Exception {
        Color getColor = colorDao.findById(id).orElse(null);

        if(getColor == null){
            throw new Exception("El registro que trata de buscar no se encuentra disponible.");
        }

        getColor.setCodColor(color.getCodColor());
        getColor.setDescripcion(color.getDescripcion());

        return colorDao.save(getColor);
    }

    @Override
    @Transactional
    public void deleteColor(Long id) {
        colorDao.deleteById(id);
    }
}
