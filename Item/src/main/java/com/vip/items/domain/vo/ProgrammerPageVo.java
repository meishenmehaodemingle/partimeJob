package com.vip.items.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author song
 */
@Data
public class ProgrammerPageVo<Programmer> implements Serializable {
    private List<Programmer> pageData;
    private Integer currentPage;
    private Integer pageSize;
    private Integer totalCount;

    public ProgrammerPageVo(List<Programmer> pageData, Integer currentPage, Integer pageSize, Integer totalCount) {
        this.pageData = pageData;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
    }
}
