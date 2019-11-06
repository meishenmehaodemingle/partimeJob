package com.vip.items.service.impl;

import com.vip.items.domain.entity.Programmer;
import com.vip.items.mapper.Collection2Mapper;
import com.vip.items.service.Collection2Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author song
 */
@Service
public class Collection2ServiceImpl implements Collection2Service {

    @Resource
    Collection2Mapper collection2Mapper;

    @Override
    public List<Programmer> findProgrammers(int uid) {
        return collection2Mapper.findProgrammers(uid);
    }
}
