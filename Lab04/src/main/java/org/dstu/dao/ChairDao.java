package org.dstu.dao;

import org.dstu.domain.Chair;

public class ChairDao extends BaseDaoImpl<Chair, Integer> {
    public ChairDao() {
        super(Chair.class);
    }
}
