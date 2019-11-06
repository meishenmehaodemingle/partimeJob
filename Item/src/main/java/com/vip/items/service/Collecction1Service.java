package com.vip.items.service;

import com.vip.items.domain.entity.Collection1;

public interface Collecction1Service {
    Collection1 getCollection1(Integer uid, Integer proid);

    int addCollection1(int uid, int proid);

    int updateCollection1(int uid, int proid);
}
