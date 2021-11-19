package com.shf.springcloud.entities;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@SuppressWarnings("serial")
public class Dept implements Serializable {
    private Long deptNo;
    private String dname;
    private String db_source;
}
