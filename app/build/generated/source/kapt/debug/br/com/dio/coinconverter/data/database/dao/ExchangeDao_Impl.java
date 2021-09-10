package br.com.dio.coinconverter.data.database.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import br.com.dio.coinconverter.data.model.ExchangeResponseValue;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ExchangeDao_Impl implements ExchangeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ExchangeResponseValue> __insertionAdapterOfExchangeResponseValue;

  public ExchangeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfExchangeResponseValue = new EntityInsertionAdapter<ExchangeResponseValue>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tb_exchange` (`id`,`code`,`codein`,`name`,`bid`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ExchangeResponseValue value) {
        stmt.bindLong(1, value.getId());
        if (value.getCode() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCode());
        }
        if (value.getCodein() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCodein());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        stmt.bindDouble(5, value.getBid());
      }
    };
  }

  @Override
  public Object save(final ExchangeResponseValue entity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfExchangeResponseValue.insert(entity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Flow<List<ExchangeResponseValue>> findAll() {
    final String _sql = "SELECT * FROM tb_exchange";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"tb_exchange"}, new Callable<List<ExchangeResponseValue>>() {
      @Override
      public List<ExchangeResponseValue> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCode = CursorUtil.getColumnIndexOrThrow(_cursor, "code");
          final int _cursorIndexOfCodein = CursorUtil.getColumnIndexOrThrow(_cursor, "codein");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfBid = CursorUtil.getColumnIndexOrThrow(_cursor, "bid");
          final List<ExchangeResponseValue> _result = new ArrayList<ExchangeResponseValue>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ExchangeResponseValue _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpCode;
            if (_cursor.isNull(_cursorIndexOfCode)) {
              _tmpCode = null;
            } else {
              _tmpCode = _cursor.getString(_cursorIndexOfCode);
            }
            final String _tmpCodein;
            if (_cursor.isNull(_cursorIndexOfCodein)) {
              _tmpCodein = null;
            } else {
              _tmpCodein = _cursor.getString(_cursorIndexOfCodein);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final double _tmpBid;
            _tmpBid = _cursor.getDouble(_cursorIndexOfBid);
            _item = new ExchangeResponseValue(_tmpId,_tmpCode,_tmpCodein,_tmpName,_tmpBid);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
