package com.benjamin.young.uziless.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderVO {
    /**
     * 线索id
     */
    @JsonProperty("Id")
    private String id;
    /**
     * 是否公共线索，0：私有线索； 1：公共线索
     */
    @JsonProperty("IsPublic")
    private byte isPubulic;

    /**
     *  线索初始的经销商编号，取值为0为公共线索
     */
    @JsonProperty("DealerId")
    private int dealerId;

    /**
     * 车型id
     */
    @JsonProperty("SpecId")
    private int specId;

    /**
     * 车型名称
     */
    @JsonProperty("SpecName")
    private String specName;

    @JsonProperty("SeriesId")
    private int seriesId;

    @JsonProperty("SeriesName")
    private String seriesName;

    /**
     * 用户所在省份id
     */
    @JsonProperty("ProvinceId")
    private int provinceId;
    /**
     * 用户所在省名称
     */
    @JsonProperty("ProvinceName")
    private String provinceName;

    /**
     * 用户所在城市id
     */
    @JsonProperty("CityId")
    private int cityId;

    /**
     * 用户所在城市名称
     */
    @JsonProperty("CityName")
    private String cityName;

    /**
     * 用户所在县区ID
     */
    @JsonProperty("CountyId")
    private int countyId;
    /**
     * 用户所在县区名称
     */
    @JsonProperty("CountyName")
    private String countyName;

    /**
     * 用户手机
     */
    @JsonProperty("Phone")
    private String phone;

    /**
     * 用户姓名
     */
    @JsonProperty("Name")
    private String name;

    /**
     * 销售线索的创建时间
     */
    @JsonProperty("CreateTime")
    private String createTime;

    /**
     * 实际分配线索的经销商编号
     */
    @JsonProperty("ReDealerId")
    private String reDealerId;

    /**
     * 分配时间
     */
    @JsonProperty("HandleTime")
    private String handleTime;

    /**
     * 分配销售代表电话
     */
    @JsonProperty("AssignSalesPhone")
    private String assignSalesPhone;

    /**
     * 分配销售代表姓名
     */
    @JsonProperty("AssignSalesName")
    private String assignSalesName;

    /**
     * 与汽车之家ReDealerId对应的合作方经销商id
     */
    @JsonProperty("FKDealerID")
    private String fKDealerID;

    /**
     * 对应厂商车系id
     */
    @JsonProperty("FKSeriesID")
    private String fkseriesId;
    /**
     * 对应厂商车型id
     */
    @JsonProperty("FKSpecID")
    private String fkSpecId;

    /**
     * 产品类型
     * 中文返回值：展厅、车商汇
     */
    @JsonProperty("ProductType")
    private String productType;

    /**
     * 1、询价 2、试驾 3、置换
     */
    @JsonProperty("orderTypes")
    private int orderType;

    /**
     * 金线索
     */
    private String goldClue;

    /**
     * H5用户画像
     */
    @JsonProperty("ZhwxUrl")
    private String zhwxUrl;

    /**
     * 智能展厅中的智能车展专题线索
     */
    @JsonProperty("CarClue")
    private String carClue;

    /**
     * 家家购车
     */
    @JsonProperty("HomeClue")
    private String homeClue;

    /**
     * 智能影响
     */
    private String isInfluences;
}
