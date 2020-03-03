package com.benjamin.young.uziless.common.context;

import com.benjamin.young.uziless.entity.OrderSourcePO;
import com.benjamin.young.uziless.entity.OrderVO;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderContext {

    private OrderVO orderVO;
    private OrderSourcePO source;
}
