package fauzi.hilmy.mvp32api.Rest;

import fauzi.hilmy.mvp32api.Main.model.ResponseCountry;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("v1/Country/getCountries")
    Call<ResponseCountry> getCountry();
}