package com.qf.entity.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Info implements Serializable {



    private Long id;

    private Long deptId;

    private String wanIp;

    private Date eventTime;

    private Integer eventType;

    private Integer eventStatus;

    private String eventReasons;

    private String deptName;

    private String eventTypes;

    private String eventStatuss;
}