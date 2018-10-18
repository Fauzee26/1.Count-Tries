package fauzi.hilmy.mvp32api.Main.presenter;

import java.util.List;

import fauzi.hilmy.mvp32api.Base.BasePresenter;
import fauzi.hilmy.mvp32api.Main.model.ResponseCountry;
import fauzi.hilmy.mvp32api.Main.model.ResponseItem;
import fauzi.hilmy.mvp32api.Main.view.MainView;
import fauzi.hilmy.mvp32api.Rest.ApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenter implements BasePresenter<MainView> {
    MainView mainView;

    public void getData(){
        call().enqueue(new Callback<ResponseCountry>() {
            @Override
            public void onResponse(Call<ResponseCountry> call, Response<ResponseCountry> response) {
                if (response.isSuccessful()){
                    List<ResponseItem> ResponseItems = response.body().getResponse();
                    mainView.onSuccess(ResponseItems);
                }else {
                    mainView.onError("Gagal Mengambil Data");
                }
            }

            @Override
            public void onFailure(Call<ResponseCountry> call, Throwable t) {
                mainView.onError(t.getMessage());
            }
        });
    }
    @Override
    public void onAttach(MainView v) {
        mainView = v;
    }

    @Override
    public void onDetach() {
        mainView = null;
    }

    Call<ResponseCountry> call(){
        return ApiClient.getInstance().getCountry();
    }
}
