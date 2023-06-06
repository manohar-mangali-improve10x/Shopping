package com.example.shopping;

import com.google.gson.annotations.SerializedName;

public class SetPrice {
    @SerializedName("shop_money")
    private Money shopMoney;
    @SerializedName("presentment_money")
    private Money presentmentMoney;

    public Money getShopMoney() {
        return shopMoney;
    }

    public void setShopMoney(Money shopMoney) {
        this.shopMoney = shopMoney;
    }

    public Money getPresentmentMoney() {
        return presentmentMoney;
    }

    public void setPresentmentMoney(Money presentmentMoney) {
        this.presentmentMoney = presentmentMoney;
    }
}
