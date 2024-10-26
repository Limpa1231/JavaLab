package org.dstu.dao;

import org.dstu.domain.Ship;
import org.hibernate.query.Query;

import java.util.List;



public class ShipDao extends BaseDaoImpl<ShipDao, Integer>  {
    public ShipDao() {
        super(Ship.class);
    }

    public List<Ship> getAllByGroup(String builder) {
        Query q = getSession().createQuery("This ship was built in  \"" + builder + "\"");
        return q.list();
}
    }














