package br.com.dio.coinconverter.data.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lbr/com/dio/coinconverter/data/services/AwesomeService;", "", "exchangeValue", "Ljava/util/HashMap;", "", "Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;", "Lbr/com/dio/coinconverter/data/model/ExchangeResponse;", "coins", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AwesomeService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "/json/last/{coins}")
    public abstract java.lang.Object exchangeValue(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "coins")
    java.lang.String coins, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.HashMap<java.lang.String, br.com.dio.coinconverter.data.model.ExchangeResponseValue>> p1);
}