package org.store.dao.custom;


import org.store.dao.CrudDao;
import org.store.dto.OrderDetailDto;
import org.store.dto.tm.ItemTM;
import org.store.dto.tm.OrderDetailTM;

import java.sql.SQLException;
import java.util.List;

public interface OrderDetailDao extends CrudDao<OrderDetailDto,Integer> {
    List<OrderDetailTM> findAll() throws SQLException, ClassNotFoundException;
}