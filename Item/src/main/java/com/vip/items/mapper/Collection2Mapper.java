package com.vip.items.mapper;

import com.vip.items.domain.entity.Programmer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author song
 * 收藏接包人
 */
public interface Collection2Mapper {

    Integer save(@Param("uid") int uid,@Param("pid") int pid);

    Integer delete(@Param("uid") int uid,@Param("pid") int pid);

    List<Programmer> findProgrammers(@Param("uid") int uid);

}
