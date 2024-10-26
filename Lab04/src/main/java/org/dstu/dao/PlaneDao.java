package org.dstu.dao;

import org.dstu.domain.Plane;

public class PlaneDao  extends BaseDaoImpl <PlaneDao, Integer> {
    public PlaneDao() {
        super(Plane.class);
    }
}
