package com.example.shopping;

import org.junit.Test;

import static org.junit.Assert.*;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getShopDetails() throws IOException {
        OnService onService = new FakeApi().createFakeApiService();
        Call<List<Shop>> call = onService.fetchData();
        List<Shop> shop = call.execute().body();
        assertFalse(shop.isEmpty());
        assertNotNull(shop);
        System.out.println(new Gson().toJson(shop));
    }
}