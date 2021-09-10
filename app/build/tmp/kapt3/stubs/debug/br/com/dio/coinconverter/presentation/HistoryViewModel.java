package br.com.dio.coinconverter.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0003R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lbr/com/dio/coinconverter/presentation/HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "listExchangeUseCase", "Lbr/com/dio/coinconverter/domain/ListExchangeUseCase;", "(Lbr/com/dio/coinconverter/domain/ListExchangeUseCase;)V", "_state", "Landroidx/lifecycle/MutableLiveData;", "Lbr/com/dio/coinconverter/presentation/HistoryViewModel$State;", "state", "Landroidx/lifecycle/LiveData;", "getState", "()Landroidx/lifecycle/LiveData;", "getExchanges", "", "State", "app_debug"})
public final class HistoryViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    private final br.com.dio.coinconverter.domain.ListExchangeUseCase listExchangeUseCase = null;
    private final androidx.lifecycle.MutableLiveData<br.com.dio.coinconverter.presentation.HistoryViewModel.State> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<br.com.dio.coinconverter.presentation.HistoryViewModel.State> state = null;
    
    public HistoryViewModel(@org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.domain.ListExchangeUseCase listExchangeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<br.com.dio.coinconverter.presentation.HistoryViewModel.State> getState() {
        return null;
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    private final void getExchanges() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lbr/com/dio/coinconverter/presentation/HistoryViewModel$State;", "", "()V", "Error", "Loading", "Success", "Lbr/com/dio/coinconverter/presentation/HistoryViewModel$State$Loading;", "Lbr/com/dio/coinconverter/presentation/HistoryViewModel$State$Success;", "Lbr/com/dio/coinconverter/presentation/HistoryViewModel$State$Error;", "app_debug"})
    public static abstract class State {
        
        private State() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lbr/com/dio/coinconverter/presentation/HistoryViewModel$State$Loading;", "Lbr/com/dio/coinconverter/presentation/HistoryViewModel$State;", "()V", "app_debug"})
        public static final class Loading extends br.com.dio.coinconverter.presentation.HistoryViewModel.State {
            @org.jetbrains.annotations.NotNull()
            public static final br.com.dio.coinconverter.presentation.HistoryViewModel.State.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lbr/com/dio/coinconverter/presentation/HistoryViewModel$State$Success;", "Lbr/com/dio/coinconverter/presentation/HistoryViewModel$State;", "list", "", "Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Success extends br.com.dio.coinconverter.presentation.HistoryViewModel.State {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<br.com.dio.coinconverter.data.model.ExchangeResponseValue> list = null;
            
            @org.jetbrains.annotations.NotNull()
            public final br.com.dio.coinconverter.presentation.HistoryViewModel.State.Success copy(@org.jetbrains.annotations.NotNull()
            java.util.List<br.com.dio.coinconverter.data.model.ExchangeResponseValue> list) {
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
            java.util.List<br.com.dio.coinconverter.data.model.ExchangeResponseValue> list) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<br.com.dio.coinconverter.data.model.ExchangeResponseValue> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<br.com.dio.coinconverter.data.model.ExchangeResponseValue> getList() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lbr/com/dio/coinconverter/presentation/HistoryViewModel$State$Error;", "Lbr/com/dio/coinconverter/presentation/HistoryViewModel$State;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Error extends br.com.dio.coinconverter.presentation.HistoryViewModel.State {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable error = null;
            
            @org.jetbrains.annotations.NotNull()
            public final br.com.dio.coinconverter.presentation.HistoryViewModel.State.Error copy(@org.jetbrains.annotations.NotNull()
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