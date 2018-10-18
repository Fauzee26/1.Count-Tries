package fauzi.hilmy.mvp32api.Main.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import fauzi.hilmy.mvp32api.Adapter.MainAdapter;
import fauzi.hilmy.mvp32api.Main.model.ResponseItem;
import fauzi.hilmy.mvp32api.Main.presenter.MainPresenter;
import fauzi.hilmy.mvp32api.Main.view.MainView;
import fauzi.hilmy.mvp32api.R;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.recyclerCountry)
    RecyclerView recyclerCountry;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainPresenter();
        onAttachView();
    }

    @Override
    public void onError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onSuccess(List<ResponseItem> data) {
        recyclerCountry.setLayoutManager(new LinearLayoutManager(this));
        recyclerCountry.setAdapter(new MainAdapter(MainActivity.this, data));
    }

    @Override
    public void onAttachView() {
        presenter.getData();
        presenter.onAttach(this);
    }

    @Override
    public void onDetachView() {

    }
}