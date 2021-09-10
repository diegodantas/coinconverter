package br.com.dio.coinconverter.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lbr/com/dio/coinconverter/domain/GetExchangeValueUseCase;", "Lbr/com/dio/coinconverter/core/UseCase;", "", "Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;", "repository", "Lbr/com/dio/coinconverter/data/repository/CoinRepository;", "(Lbr/com/dio/coinconverter/data/repository/CoinRepository;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "param", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetExchangeValueUseCase extends br.com.dio.coinconverter.core.UseCase<java.lang.String, br.com.dio.coinconverter.data.model.ExchangeResponseValue> {
    private final br.com.dio.coinconverter.data.repository.CoinRepository repository = null;
    
    public GetExchangeValueUseCase(@org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.data.repository.CoinRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    java.lang.String param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<br.com.dio.coinconverter.data.model.ExchangeResponseValue>> p1) {
        return null;
    }
}