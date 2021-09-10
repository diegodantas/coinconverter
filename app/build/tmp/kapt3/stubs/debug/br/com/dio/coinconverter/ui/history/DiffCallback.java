package br.com.dio.coinconverter.ui.history;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lbr/com/dio/coinconverter/ui/history/DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lbr/com/dio/coinconverter/data/model/ExchangeResponseValue;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
public final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<br.com.dio.coinconverter.data.model.ExchangeResponseValue> {
    
    public DiffCallback() {
        super();
    }
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.data.model.ExchangeResponseValue oldItem, @org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.data.model.ExchangeResponseValue newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.data.model.ExchangeResponseValue oldItem, @org.jetbrains.annotations.NotNull()
    br.com.dio.coinconverter.data.model.ExchangeResponseValue newItem) {
        return false;
    }
}