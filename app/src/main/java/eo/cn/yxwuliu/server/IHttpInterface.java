package eo.cn.yxwuliu.server;

import eo.cn.yxwuliu.api.Api;
import eo.cn.yxwuliu.bean.GoodsBean;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by mk on 2017/5/26.
 */

public interface IHttpInterface {

    /**
     * 获取货源
     * @return
     */
    @GET(Api.GOODS_URL)
    Observable<GoodsBean> getGoodSource(
            @Query("num") String num,@Query("page") String page);

    /**
     * 获取车源
     * @return
     */
    @GET(Api.GOODS_URL)//暂时使用货源接口来测试
    Observable<GoodsBean> getCarSource(
            @Query("num") String num,@Query("page") String page);
}
