package com.vip.items.service;

import com.vip.items.domain.entity.Programmer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author song
 */
public interface Collection2Service {

    List<Programmer> findProgrammers(@Param("uid") int uid);
}
