package com.vip.items.service.impl;

import com.vip.items.domain.entity.Collection1;
import com.vip.items.mapper.Collection1Mapper;
import com.vip.items.service.Collecction1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Collection1ServiceImpl implements Collecction1Service {
    @Resource
    Collection1Mapper collection1Mapper;
    @Override
    public Collection1 getCollection1(Integer uid, Integer proid) {
        Collection1 collection1 = collection1Mapper.findByUidProid(uid, proid);
        return collection1;
    }

    @Override
    public int addCollection1(int uid, int proid) {
        int i = collection1Mapper.addCollection1(uid, proid);
        return i;
    }

    @Override
    public int updateCollection1(int uid, int proid) {
        int i = collection1Mapper.updateCollection1(uid,proid);
        return i;
    }
}
