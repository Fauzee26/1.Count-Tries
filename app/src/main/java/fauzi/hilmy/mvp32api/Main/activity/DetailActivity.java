package fauzi.hilmy.mvp32api.Main.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import fauzi.hilmy.mvp32api.R;

public class DetailActivity extends AppCompatActivity {

    @BindView(R.id.imgFlag)
    ImageView imgFlag;
    @BindView(R.id.txtName)
    TextView txtName;
    @BindView(R.id.txtSubregion)
    TextView txtSubregion;
    @BindView(R.id.txtNativeName)
    TextView txtNativeName;
    @BindView(R.id.txtRegion)
    TextView txtRegion;
    @BindView(R.id.txtCurrency)
    TextView txtCurrency;

    public static String EXTRA_FLAG = "flag";
    public static String EXTRA_NAME = "name";
    public static String EXTRA_SUB_REGION = "subRegion";
    public static String EXTRA_NATIVE_NAME = "native";
    public static String EXTRA_REGION = "region";
    public static String EXTRA_CURRENCY = "currency";

    String flag, name, subRegion, nativeName, region, currency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        flag = getIntent().getStringExtra(EXTRA_FLAG);
        name = getIntent().getStringExtra(EXTRA_NAME);
        subRegion = getIntent().getStringExtra(EXTRA_SUB_REGION);
        nativeName = getIntent().getStringExtra(EXTRA_NATIVE_NAME);
        region = getIntent().getStringExtra(EXTRA_REGION);
        currency = getIntent().getStringExtra(EXTRA_CURRENCY);

        getSupportActionBar().setTitle(name);

        Glide.with(this)
                .load(flag)
                .into(imgFlag);
        txtName.setText(name);
        txtSubregion.setText(subRegion);
        txtNativeName.setText(nativeName);
        txtRegion.setText(region);
        txtCurrency.setText(currency);
    }
}