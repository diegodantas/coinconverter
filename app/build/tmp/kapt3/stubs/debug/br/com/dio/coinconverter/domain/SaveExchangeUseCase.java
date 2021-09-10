package br.com.dio.coinconverter.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lbr/com/dio/coinconverter/domain/SaveExchangeUseCase;", "Lbr/com/dio/coinconverter/core/UseCase$NoSource;", "Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;", "repository", "Lbr/com/dio/coinconverter/data/repository/CoinRepository;", "(Lbr/com/dio/coinconverter/data/repository/CoinRepository;)V", "execute", "Lkotlinx/coroutines/flow/Flow;", "", "param", "(Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class SaveExchangeUseCase extends br.com.dio.coinconverter.core.UseCase.NoSource<br.com.dio.coinconverter.data.model.ExchangeResponseValue> {
    private final br.com.dio.coinconverter.data.repository.CoinRepository repository = null;
    
    public SaveExchangeUseCase(@org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.data.repository.CoinRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.data.model.ExchangeResponseValue param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Unit>> p1) {
        return null;
    }
}