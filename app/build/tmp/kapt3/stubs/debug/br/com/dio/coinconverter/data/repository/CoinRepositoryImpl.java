package br.com.dio.coinconverter.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00100\nH\u0016J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lbr/com/dio/coinconverter/data/repository/CoinRepositoryImpl;", "Lbr/com/dio/coinconverter/data/repository/CoinRepository;", "appDatabase", "Lbr/com/dio/coinconverter/data/database/AppDatabase;", "service", "Lbr/com/dio/coinconverter/data/services/AwesomeService;", "(Lbr/com/dio/coinconverter/data/database/AppDatabase;Lbr/com/dio/coinconverter/data/services/AwesomeService;)V", "dao", "Lbr/com/dio/coinconverter/data/database/dao/ExchangeDao;", "getExchangeValue", "Lkotlinx/coroutines/flow/Flow;", "Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;", "coins", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "list", "", "save", "", "exchange", "(Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CoinRepositoryImpl implements br.com.dio.coinconverter.data.repository.CoinRepository {
    private final br.com.dio.coinconverter.data.services.AwesomeService service = null;
    private final br.com.dio.coinconverter.data.database.dao.ExchangeDao dao = null;
    
    public CoinRepositoryImpl(@org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.data.database.AppDatabase appDatabase, @org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.data.services.AwesomeService service) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getExchangeValue(@org.jetbrains.annotations.NotNull()
    java.lang.String coins, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<br.com.dio.coinconverter.data.model.ExchangeResponseValue>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object save(@org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.data.model.ExchangeResponseValue exchange, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.util.List<br.com.dio.coinconverter.data.model.ExchangeResponseValue>> list() {
        return null;
    }
}