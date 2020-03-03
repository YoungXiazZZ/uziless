package com.benjamin.young.uziless.common.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

public enum OrderProcessPhase {
    SOURCE_ORDER_NEW(0, "新订单"),
    SOURCE_ORDER_PERSISTED(10, "订单已保存"),
    TARGET_LEADS_PERSISTED(20, "线索已保存"),
    TARGET_LEADS_COMPLETED(30, "线索已补全"),
    TARGET_LEADS_FORWARDED(40, "线索已转发");

    @EnumValue
    private final int code;
    private final String desc;

    OrderProcessPhase(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
