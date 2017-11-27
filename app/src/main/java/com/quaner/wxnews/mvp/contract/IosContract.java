package com.quaner.wxnews.mvp.contract;

import com.quaner.wxnews.ui.entity.GankEntity;
import com.wxandroid.common.http.HttpResult;
import com.wxandroid.common.mvp.IModel;
import com.wxandroid.common.mvp.IView;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by wenxin
 */
public interface IosContract {

    interface View extends IView{
        void hideLoading();

        void hideLoadingMore(boolean isFail);

        void setData(List<GankEntity> results);

        void addData(List<GankEntity> results);
    }


    interface Model extends IModel {
        Observable<HttpResult<List<GankEntity>>> getIosData(String type, int page);
    }
}