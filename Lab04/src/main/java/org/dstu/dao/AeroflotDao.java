package org.dstu.dao;

import org.dstu.dao.AeroflotDao;
import org.dstu.domain.Aeroflot;

public class AeroflotDao extends BaseDaoImpl<AeroflotDao, Integer> {
    public AeroflotDao() {
        super(Aeroflot.class);
    }
}
