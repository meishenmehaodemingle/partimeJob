package com.vip.items.domain.vo;

import com.vip.items.domain.entity.*;
import lombok.Data;

@Data
public class ProgrammerVo extends Programmer {
    private Category category;
    private SubMenu3 subMenu3;
    private Grades grades;
}
