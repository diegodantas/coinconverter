package br.com.dio.coinconverter.data.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u0002H\u0006\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082\b\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lbr/com/dio/coinconverter/data/di/DataModules;", "", "()V", "HTTP_TAG", "", "createService", "T", "client", "Lokhttp3/OkHttpClient;", "factory", "Lretrofit2/converter/gson/GsonConverterFactory;", "(Lokhttp3/OkHttpClient;Lretrofit2/converter/gson/GsonConverterFactory;)Ljava/lang/Object;", "databaseModule", "Lorg/koin/core/module/Module;", "load", "", "networkModule", "repositoryModule", "app_debug"})
public final class DataModules {
    @org.jetbrains.annotations.NotNull()
    public static final br.com.dio.coinconverter.data.di.DataModules INSTANCE = null;
    private static final java.lang.String HTTP_TAG = "OhHttp";
    
    private DataModules() {
        super();
    }
    
    public final void load() {
    }
    
    private final org.koin.core.module.Module networkModule() {
        return null;
    }
    
    private final org.koin.core.module.Module repositoryModule() {
        return null;
    }
    
    private final org.koin.core.module.Module databaseModule() {
        return null;
    }
}