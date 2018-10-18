package fauzi.hilmy.mvp32api.Main.model;

import com.google.gson.annotations.SerializedName;

public class ResponseItem{

	@SerializedName("NativeLanguage")
	private String nativeLanguage;

	@SerializedName("NumericCode")
	private int numericCode;

	@SerializedName("Alpha3Code")
	private String alpha3Code;

	@SerializedName("Latitude")
	private String latitude;

	@SerializedName("Longitude")
	private String longitude;

	@SerializedName("Flag")
	private String flag;

	@SerializedName("CurrencySymbol")
	private String currencySymbol;

	@SerializedName("Name")
	private String name;

	@SerializedName("CurrencyName")
	private String currencyName;

	@SerializedName("CurrencyCode")
	private String currencyCode;

	@SerializedName("Area")
	private int area;

	@SerializedName("Alpha2Code")
	private String alpha2Code;

	@SerializedName("NativeName")
	private String nativeName;

	@SerializedName("Region")
	private String region;

	@SerializedName("FlagPng")
	private String flagPng;

	@SerializedName("SubRegion")
	private String subRegion;

	public void setNativeLanguage(String nativeLanguage){
		this.nativeLanguage = nativeLanguage;
	}

	public String getNativeLanguage(){
		return nativeLanguage;
	}

	public void setNumericCode(int numericCode){
		this.numericCode = numericCode;
	}

	public int getNumericCode(){
		return numericCode;
	}

	public void setAlpha3Code(String alpha3Code){
		this.alpha3Code = alpha3Code;
	}

	public String getAlpha3Code(){
		return alpha3Code;
	}

	public void setLatitude(String latitude){
		this.latitude = latitude;
	}

	public String getLatitude(){
		return latitude;
	}

	public void setLongitude(String longitude){
		this.longitude = longitude;
	}

	public String getLongitude(){
		return longitude;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getFlag(){
		return flag;
	}

	public void setCurrencySymbol(String currencySymbol){
		this.currencySymbol = currencySymbol;
	}

	public String getCurrencySymbol(){
		return currencySymbol;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCurrencyName(String currencyName){
		this.currencyName = currencyName;
	}

	public String getCurrencyName(){
		return currencyName;
	}

	public void setCurrencyCode(String currencyCode){
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	public void setArea(int area){
		this.area = area;
	}

	public int getArea(){
		return area;
	}

	public void setAlpha2Code(String alpha2Code){
		this.alpha2Code = alpha2Code;
	}

	public String getAlpha2Code(){
		return alpha2Code;
	}

	public void setNativeName(String nativeName){
		this.nativeName = nativeName;
	}

	public String getNativeName(){
		return nativeName;
	}

	public void setRegion(String region){
		this.region = region;
	}

	public String getRegion(){
		return region;
	}

	public void setFlagPng(String flagPng){
		this.flagPng = flagPng;
	}

	public String getFlagPng(){
		return flagPng;
	}

	public void setSubRegion(String subRegion){
		this.subRegion = subRegion;
	}

	public String getSubRegion(){
		return subRegion;
	}

	@Override
 	public String toString(){
		return 
			"ResponseItem{" + 
			"nativeLanguage = '" + nativeLanguage + '\'' + 
			",numericCode = '" + numericCode + '\'' + 
			",alpha3Code = '" + alpha3Code + '\'' + 
			",latitude = '" + latitude + '\'' + 
			",longitude = '" + longitude + '\'' + 
			",flag = '" + flag + '\'' + 
			",currencySymbol = '" + currencySymbol + '\'' + 
			",name = '" + name + '\'' + 
			",currencyName = '" + currencyName + '\'' + 
			",currencyCode = '" + currencyCode + '\'' + 
			",area = '" + area + '\'' + 
			",alpha2Code = '" + alpha2Code + '\'' + 
			",nativeName = '" + nativeName + '\'' + 
			",region = '" + region + '\'' + 
			",flagPng = '" + flagPng + '\'' + 
			",subRegion = '" + subRegion + '\'' + 
			"}";
		}
}