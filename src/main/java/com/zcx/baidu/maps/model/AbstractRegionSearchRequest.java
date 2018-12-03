package com.zcx.baidu.maps.model;

import com.google.gson.FieldNamingPolicy;
import com.zcx.baidu.maps.common.ApiConfig;
import com.zcx.baidu.maps.common.GeoApiContext;

/**
 * @description: 区域检索请求基类
 * @author: zhangchunxing
 * @create: 2018-12-03
 **/
public abstract class AbstractRegionSearchRequest<T extends AbstractRegionSearchRequest>
        extends PendingResultBase<T> {

    private static final ApiConfig API_CONFIG = new ApiConfig("/place/v2/search?output=json")
            .fieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);

    public AbstractRegionSearchRequest(GeoApiContext context) {
        super(context, API_CONFIG);
    }

    public T query(String placeName) {
        return param("query", placeName);
    }

    public T tag(String tag) {
        return param("tag", tag);
    }

    public T scope(PoiInfoEnum poiInfoEnum) {
        return param("scope", poiInfoEnum);
    }

    public T timestamp(long timestamp) {
        return param("timestamp", timestamp);
    }

}
