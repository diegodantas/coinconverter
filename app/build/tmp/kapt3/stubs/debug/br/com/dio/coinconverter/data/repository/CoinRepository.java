package br.com.dio.coinconverter.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u0003H&J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lbr/com/dio/coinconverter/data/repository/CoinRepository;", "", "getExchangeValue", "Lkotlinx/coroutines/flow/Flow;", "Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;", "coins", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "list", "", "save", "", "exchange", "(Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CoinRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getExchangeValue(@org.jetbrains.annotations.NotNull()
    java.lang.String coins, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<br.com.dio.coinconverter.data.model.ExchangeResponseValue>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object save(@org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.data.model.ExchangeResponseValue exchange, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<br.com.dio.coinconverter.data.model.ExchangeResponseValue>> list();
}