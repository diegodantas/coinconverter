package br.com.dio.coinconverter.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0003\n\u000b\fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lbr/com/dio/coinconverter/core/UseCase;", "Param", "Source", "", "()V", "execute", "Lkotlinx/coroutines/flow/Flow;", "param", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "NoParam", "NoSource", "None", "app_debug"})
public abstract class UseCase<Param extends java.lang.Object, Source extends java.lang.Object> {
    
    public UseCase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object execute(Param param, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends Source>> p1);
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object invoke(Param p0, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends Source>> p1) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0002B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0019\u0010\u0006\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004H\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lbr/com/dio/coinconverter/core/UseCase$NoParam;", "Source", "Lbr/com/dio/coinconverter/core/UseCase;", "Lbr/com/dio/coinconverter/core/UseCase$None;", "Lkotlinx/coroutines/flow/Flow;", "()V", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "param", "(Lbr/com/dio/coinconverter/core/UseCase$None;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "app_debug"})
    public static abstract class NoParam<Source extends java.lang.Object> extends br.com.dio.coinconverter.core.UseCase<br.com.dio.coinconverter.core.UseCase.None, kotlinx.coroutines.flow.Flow<? extends Source>> {
        
        public NoParam() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Object execute(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends Source>> p0);
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public final java.lang.Object execute(@org.jetbrains.annotations.NotNull()
        br.com.dio.coinconverter.core.UseCase.None param, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<?> p1) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends Source>> p0) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00028\u0002H\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lbr/com/dio/coinconverter/core/UseCase$NoSource;", "Params", "Lbr/com/dio/coinconverter/core/UseCase;", "", "()V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "param", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract class NoSource<Params extends java.lang.Object> extends br.com.dio.coinconverter.core.UseCase<Params, kotlin.Unit> {
        
        public NoSource() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object invoke(Params p0, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Unit>> p1) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/dio/coinconverter/core/UseCase$None;", "", "()V", "app_debug"})
    public static final class None {
        @org.jetbrains.annotations.NotNull()
        public static final br.com.dio.coinconverter.core.UseCase.None INSTANCE = null;
        
        private None() {
            super();
        }
    }
}