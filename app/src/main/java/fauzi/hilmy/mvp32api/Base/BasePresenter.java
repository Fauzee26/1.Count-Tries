package fauzi.hilmy.mvp32api.Base;

public interface BasePresenter<T extends BaseView> {
    void onAttach(T v);
    void onDetach();
}
