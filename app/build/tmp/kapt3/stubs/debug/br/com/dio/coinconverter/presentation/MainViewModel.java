package br.com.dio.coinconverter.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lbr/com/dio/coinconverter/presentation/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "saveExchangeUseCase", "Lbr/com/dio/coinconverter/domain/SaveExchangeUseCase;", "getExchangeValueUseCase", "Lbr/com/dio/coinconverter/domain/GetExchangeValueUseCase;", "(Lbr/com/dio/coinconverter/domain/SaveExchangeUseCase;Lbr/com/dio/coinconverter/domain/GetExchangeValueUseCase;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lbr/com/dio/coinconverter/presentation/MainViewModel$State;", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "getExchangeValue", "", "coins", "", "saveExchange", "exchange", "Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;", "State", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final br.com.dio.coinconverter.domain.SaveExchangeUseCase saveExchangeUseCase = null;
    private final br.com.dio.coinconverter.domain.GetExchangeValueUseCase getExchangeValueUseCase = null;
    private final androidx.lifecycle.MutableLiveData<br.com.dio.coinconverter.presentation.MainViewModel.State> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<br.com.dio.coinconverter.presentation.MainViewModel.State> state = null;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.domain.SaveExchangeUseCase saveExchangeUseCase, @org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.domain.GetExchangeValueUseCase getExchangeValueUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<br.com.dio.coinconverter.presentation.MainViewModel.State> getState() {
        return null;
    }
    
    public final void getExchangeValue(@org.jetbrains.annotations.NotNull()
    java.lang.String coins) {
    }
    
    public final void saveExchange(@org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.data.model.ExchangeResponseValue exchange) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lbr/com/dio/coinconverter/presentation/MainViewModel$State;", "", "()V", "Error", "Loading", "Saved", "Success", "Lbr/com/dio/coinconverter/presentation/MainViewModel$State$Loading;", "Lbr/com/dio/coinconverter/presentation/MainViewModel$State$Saved;", "Lbr/com/dio/coinconverter/presentation/MainViewModel$State$Success;", "Lbr/com/dio/coinconverter/presentation/MainViewModel$State$Error;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/dio/coinconverter/presentation/MainViewModel$State$Loading;", "Lbr/com/dio/coinconverter/presentation/MainViewModel$State;", "()V", "app_debug"})
        public static final class Loading extends br.com.dio.coinconverter.presentation.MainViewModel.State {
            @org.jetbrains.annotations.NotNull()
            public static final br.com.dio.coinconverter.presentation.MainViewModel.State.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/dio/coinconverter/presentation/MainViewModel$State$Saved;", "Lbr/com/dio/coinconverter/presentation/MainViewModel$State;", "()V", "app_debug"})
        public static final class Saved extends br.com.dio.coinconverter.presentation.MainViewModel.State {
            @org.jetbrains.annotations.NotNull()
            public static final br.com.dio.coinconverter.presentation.MainViewModel.State.Saved INSTANCE = null;
            
            private Saved() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lbr/com/dio/coinconverter/presentation/MainViewModel$State$Success;", "Lbr/com/dio/coinconverter/presentation/MainViewModel$State;", "exchange", "Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;", "(Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;)V", "getExchange", "()Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Success extends br.com.dio.coinconverter.presentation.MainViewModel.State {
            @org.jetbrains.annotations.NotNull()
            private final br.com.dio.coinconverter.data.model.ExchangeResponseValue exchange = null;
            
            @org.jetbrains.annotations.NotNull()
            public final br.com.dio.coinconverter.presentation.MainViewModel.State.Success copy(@org.jetbrains.annotations.NotNull()
            br.com.dio.coinconverter.data.model.ExchangeResponseValue exchange) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Success(@org.jetbrains.annotations.NotNull()
            br.com.dio.coinconverter.data.model.ExchangeResponseValue exchange) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final br.com.dio.coinconverter.data.model.ExchangeResponseValue component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final br.com.dio.coinconverter.data.model.ExchangeResponseValue getExchange() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lbr/com/dio/coinconverter/presentation/MainViewModel$State$Error;", "Lbr/com/dio/coinconverter/presentation/MainViewModel$State;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Error extends br.com.dio.coinconverter.presentation.MainViewModel.State {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final br.com.dio.coinconverter.presentation.MainViewModel.State.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable error) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getError() {
                return null;
            }
        }
    }
}