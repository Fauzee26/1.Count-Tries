package fauzi.hilmy.mvp32api.Main.view;

import java.util.List;

import fauzi.hilmy.mvp32api.Base.BaseView;
import fauzi.hilmy.mvp32api.Main.model.ResponseItem;

public interface MainView extends BaseView {
    void onError(String msg);
    void onSuccess(List<ResponseItem> data);
}