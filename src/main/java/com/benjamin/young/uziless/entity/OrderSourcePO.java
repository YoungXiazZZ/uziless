package com.benjamin.young.uziless.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import com.benjamin.young.uziless.common.enums.OrderProcessPhase;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@TableName("autohome_order_source")
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderSourcePO extends Model<OrderSourcePO> implements Serializable {

    private static final long serialVersionUID = -3169855904000821547L;

    @TableId(value = "order_id", type = IdType.UUID)
    private String orderId;

    @TableField("origin_order_id")
    private String originOrderId;

    @TableField(exist = false)
    private OrderProcessPhase lastProcessPhase;

    @TableField("last_process_phase")
    private String lastProcessPhaseValue;

    /**
     * 是否公共线索，0：私有线索； 1：公共线索
     */
    @TableField("is_public")
    private byte isPubulic;

    /**
     *  线索初始的经销商编号，取值为0为公共线索
     */
    @TableField("dealer_id")
    private int dealerId;

    /**
     * 车型id
     */
    @TableField("spec_id")
    private int specId;

    /**
     * 车型名称
     */
    @TableField("spec_name")
    private String specName;

    @TableField("series_id")
    private int seriesId;

    @TableField("series_name")
    private String seriesName;

    /**
     * 用户所在省份id
     */
    @TableField("province_id")
    private int provinceId;
    /**
     * 用户所在省名称
     */
    @TableField("province_name")
    private String provinceName;

    /**
     * 用户所在城市id
     */
    @TableField("city_id")
    private int cityId;

    /**
     * 用户所在城市名称
     */
    @TableField("city_name")
    private String cityName;

    /**
     * 用户所在县区ID
     */
    @TableField("county_id")
    private int countyId;
    /**
     * 用户所在县区名称
     */
    @TableField("county_name")
    private String countyName;

    /**
     * 用户手机
     */
    @TableField("phone")
    private String phone;

    /**
     * 用户姓名
     */
    @TableField("name")
    private String name;

    /**
     * 销售线索的创建时间
     */
    @TableField("create_time")
    private String createTime;

    /**
     * 实际分配线索的经销商编号
     */
    @TableField("re_dealer_id")
    private String reDealerId;

    /**
     * 分配时间
     */
    @TableField("handle_time")
    private String handleTime;

    /**
     * 分配销售代表电话
     */
    @TableField("assign_sales_phone")
    private String assignSalesPhone;

    /**
     * 分配销售代表姓名
     */
    @TableField("assign_sales_name")
    private String assignSalesName;

    /**
     * 与汽车之家ReDealerId对应的合作方经销商id
     */
    @TableField("fk_dealer_id")
    private String fKDealerID;

    /**
     * 对应厂商车系id
     */
    @TableField("fk_series_id")
    private String fkseriesId;
    /**
     * 对应厂商车型id
     */
    @TableField("fk_spec_id")
    private String fkSpecId;

    /**
     * 产品类型
     * 中文返回值：展厅、车商汇
     */
    @TableField("product_type")
    private String productType;

    /**
     * 1、询价 2、试驾 3、置换
     */
    @TableField("order_type")
    private int orderType;

    /**
     * 金线索
     */
    @TableField("gold_clue")
    private String goldClue;

    /**
     * H5用户画像
     */
    @TableField("zhwxurl")
    private String zhwxUrl;

    /**
     * 智能展厅中的智能车展专题线索
     */
    @TableField("car_clue")
    private String carClue;

    /**
     * 家家购车
     */
    @TableField("home_clue")
    private String homeClue;

    /**
     * 智能影响
     */
    @TableField("isinfluences")
    private String isInfluences;

    /**
     * 推送时间
     */
    @TableField(value = "first_create_time", fill = FieldFill.INSERT)
    private Date fistcreateTime;
    /**
     * 最后更新时间
     */
    @TableField(value = "last_update_time", fill = FieldFill.UPDATE)
    private Date lastUpdateTime;
}
