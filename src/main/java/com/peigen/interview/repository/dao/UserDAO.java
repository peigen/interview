/**
 * Copyright (c) 2016-2018 Haofenqi.Co.Ltd. All rights reserved.
 */
package com.peigen.interview.repository.dao;

import com.peigen.interview.repository.entity.User;

/**
 * <b>(UserDAO)</b>
 * @author Peigen
 * @date 2018/04/16
 * @version 1.0.0
 */
public interface UserDAO {

    public User find(String id);
}
