package com.example.shopping;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OnService {
    @GET("renukaTemplates")
    Call <List<Shop>> fetchData();
}
