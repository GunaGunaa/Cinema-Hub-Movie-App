package com.karurmallow.demotestingapp.services;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.karurmallow.demotestingapp.model.MAMovieResults;
import java.lang.Class;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MAMovieDao_Impl implements MAMovieDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MAMovieResults> __insertionAdapterOfMAMovieResults;

  private final SharedSQLiteStatement __preparedStmtOfClearMovies;

  public MAMovieDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMAMovieResults = new EntityInsertionAdapter<MAMovieResults>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `moviesTable` (`movieSerialNumber`,`userLanguage`,`pageNumber`,`posterEndPoint`,`movieId`,`movieLanguage`,`movieTitle`,`movieDescription`,`moviePosterEndPont`,`movieReleaseDate`,`movieAverageVote`,`movieVoteCount`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MAMovieResults value) {
        stmt.bindLong(1, value.getMovieSerialNumber());
        if (value.getUserLanguage() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserLanguage());
        }
        stmt.bindLong(3, value.getPageNumber());
        if (value.getPosterEndPoint() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPosterEndPoint());
        }
        if (value.getMovieId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getMovieId());
        }
        if (value.getMovieLanguage() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMovieLanguage());
        }
        if (value.getMovieTitle() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getMovieTitle());
        }
        if (value.getMovieDescription() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getMovieDescription());
        }
        if (value.getMoviePosterEndPont() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getMoviePosterEndPont());
        }
        if (value.getMovieReleaseDate() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getMovieReleaseDate());
        }
        if (value.getMovieAverageVote() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindDouble(11, value.getMovieAverageVote());
        }
        if (value.getMovieVoteCount() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindLong(12, value.getMovieVoteCount());
        }
      }
    };
    this.__preparedStmtOfClearMovies = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM moviesTable WHERE userLanguage = ?";
        return _query;
      }
    };
  }

  @Override
  public void saveMovies(final MAMovieResults movies) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMAMovieResults.insert(movies);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clearMovies(final String userLanguage) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearMovies.acquire();
    int _argIndex = 1;
    if (userLanguage == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, userLanguage);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearMovies.release(_stmt);
    }
  }

  @Override
  public List<MAMovieResults> retrieveMoviesByPageNumber(final String userLanguage,
      final int pageNumber, final int order) {
    final String _sql = "SELECT * FROM moviesTable WHERE userLanguage= ? AND pageNumber=? ORDER BY CASE WHEN ?=0 THEN movieTitle END ASC,CASE WHEN ?=1 THEN movieTitle END DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (userLanguage == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userLanguage);
    }
    _argIndex = 2;
    _statement.bindLong(_argIndex, pageNumber);
    _argIndex = 3;
    _statement.bindLong(_argIndex, order);
    _argIndex = 4;
    _statement.bindLong(_argIndex, order);
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
      try {
        final int _cursorIndexOfMovieSerialNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "movieSerialNumber");
        final int _cursorIndexOfUserLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "userLanguage");
        final int _cursorIndexOfPageNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "pageNumber");
        final int _cursorIndexOfPosterEndPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "posterEndPoint");
        final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movieId");
        final int _cursorIndexOfMovieLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "movieLanguage");
        final int _cursorIndexOfMovieTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "movieTitle");
        final int _cursorIndexOfMovieDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "movieDescription");
        final int _cursorIndexOfMoviePosterEndPont = CursorUtil.getColumnIndexOrThrow(_cursor, "moviePosterEndPont");
        final int _cursorIndexOfMovieReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "movieReleaseDate");
        final int _cursorIndexOfMovieAverageVote = CursorUtil.getColumnIndexOrThrow(_cursor, "movieAverageVote");
        final int _cursorIndexOfMovieVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "movieVoteCount");
        final List<MAMovieResults> _result = new ArrayList<MAMovieResults>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final MAMovieResults _item;
          final long _tmpMovieSerialNumber;
          _tmpMovieSerialNumber = _cursor.getLong(_cursorIndexOfMovieSerialNumber);
          final String _tmpUserLanguage;
          if (_cursor.isNull(_cursorIndexOfUserLanguage)) {
            _tmpUserLanguage = null;
          } else {
            _tmpUserLanguage = _cursor.getString(_cursorIndexOfUserLanguage);
          }
          final int _tmpPageNumber;
          _tmpPageNumber = _cursor.getInt(_cursorIndexOfPageNumber);
          final String _tmpPosterEndPoint;
          if (_cursor.isNull(_cursorIndexOfPosterEndPoint)) {
            _tmpPosterEndPoint = null;
          } else {
            _tmpPosterEndPoint = _cursor.getString(_cursorIndexOfPosterEndPoint);
          }
          final Integer _tmpMovieId;
          if (_cursor.isNull(_cursorIndexOfMovieId)) {
            _tmpMovieId = null;
          } else {
            _tmpMovieId = _cursor.getInt(_cursorIndexOfMovieId);
          }
          final String _tmpMovieLanguage;
          if (_cursor.isNull(_cursorIndexOfMovieLanguage)) {
            _tmpMovieLanguage = null;
          } else {
            _tmpMovieLanguage = _cursor.getString(_cursorIndexOfMovieLanguage);
          }
          final String _tmpMovieTitle;
          if (_cursor.isNull(_cursorIndexOfMovieTitle)) {
            _tmpMovieTitle = null;
          } else {
            _tmpMovieTitle = _cursor.getString(_cursorIndexOfMovieTitle);
          }
          final String _tmpMovieDescription;
          if (_cursor.isNull(_cursorIndexOfMovieDescription)) {
            _tmpMovieDescription = null;
          } else {
            _tmpMovieDescription = _cursor.getString(_cursorIndexOfMovieDescription);
          }
          final String _tmpMoviePosterEndPont;
          if (_cursor.isNull(_cursorIndexOfMoviePosterEndPont)) {
            _tmpMoviePosterEndPont = null;
          } else {
            _tmpMoviePosterEndPont = _cursor.getString(_cursorIndexOfMoviePosterEndPont);
          }
          final String _tmpMovieReleaseDate;
          if (_cursor.isNull(_cursorIndexOfMovieReleaseDate)) {
            _tmpMovieReleaseDate = null;
          } else {
            _tmpMovieReleaseDate = _cursor.getString(_cursorIndexOfMovieReleaseDate);
          }
          final Float _tmpMovieAverageVote;
          if (_cursor.isNull(_cursorIndexOfMovieAverageVote)) {
            _tmpMovieAverageVote = null;
          } else {
            _tmpMovieAverageVote = _cursor.getFloat(_cursorIndexOfMovieAverageVote);
          }
          final Long _tmpMovieVoteCount;
          if (_cursor.isNull(_cursorIndexOfMovieVoteCount)) {
            _tmpMovieVoteCount = null;
          } else {
            _tmpMovieVoteCount = _cursor.getLong(_cursorIndexOfMovieVoteCount);
          }
          _item = new MAMovieResults(_tmpMovieSerialNumber,_tmpUserLanguage,_tmpPageNumber,_tmpPosterEndPoint,_tmpMovieId,_tmpMovieLanguage,_tmpMovieTitle,_tmpMovieDescription,_tmpMoviePosterEndPont,_tmpMovieReleaseDate,_tmpMovieAverageVote,_tmpMovieVoteCount);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<MAMovieResults> retrieveMoviesByAscendingOrder(final String userLanguage) {
    final String _sql = "SELECT * FROM moviesTable  WHERE userLanguage= ? ORDER BY pageNumber  ASC, movieTitle  ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userLanguage == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userLanguage);
    }
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
      try {
        final int _cursorIndexOfMovieSerialNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "movieSerialNumber");
        final int _cursorIndexOfUserLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "userLanguage");
        final int _cursorIndexOfPageNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "pageNumber");
        final int _cursorIndexOfPosterEndPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "posterEndPoint");
        final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movieId");
        final int _cursorIndexOfMovieLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "movieLanguage");
        final int _cursorIndexOfMovieTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "movieTitle");
        final int _cursorIndexOfMovieDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "movieDescription");
        final int _cursorIndexOfMoviePosterEndPont = CursorUtil.getColumnIndexOrThrow(_cursor, "moviePosterEndPont");
        final int _cursorIndexOfMovieReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "movieReleaseDate");
        final int _cursorIndexOfMovieAverageVote = CursorUtil.getColumnIndexOrThrow(_cursor, "movieAverageVote");
        final int _cursorIndexOfMovieVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "movieVoteCount");
        final List<MAMovieResults> _result = new ArrayList<MAMovieResults>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final MAMovieResults _item;
          final long _tmpMovieSerialNumber;
          _tmpMovieSerialNumber = _cursor.getLong(_cursorIndexOfMovieSerialNumber);
          final String _tmpUserLanguage;
          if (_cursor.isNull(_cursorIndexOfUserLanguage)) {
            _tmpUserLanguage = null;
          } else {
            _tmpUserLanguage = _cursor.getString(_cursorIndexOfUserLanguage);
          }
          final int _tmpPageNumber;
          _tmpPageNumber = _cursor.getInt(_cursorIndexOfPageNumber);
          final String _tmpPosterEndPoint;
          if (_cursor.isNull(_cursorIndexOfPosterEndPoint)) {
            _tmpPosterEndPoint = null;
          } else {
            _tmpPosterEndPoint = _cursor.getString(_cursorIndexOfPosterEndPoint);
          }
          final Integer _tmpMovieId;
          if (_cursor.isNull(_cursorIndexOfMovieId)) {
            _tmpMovieId = null;
          } else {
            _tmpMovieId = _cursor.getInt(_cursorIndexOfMovieId);
          }
          final String _tmpMovieLanguage;
          if (_cursor.isNull(_cursorIndexOfMovieLanguage)) {
            _tmpMovieLanguage = null;
          } else {
            _tmpMovieLanguage = _cursor.getString(_cursorIndexOfMovieLanguage);
          }
          final String _tmpMovieTitle;
          if (_cursor.isNull(_cursorIndexOfMovieTitle)) {
            _tmpMovieTitle = null;
          } else {
            _tmpMovieTitle = _cursor.getString(_cursorIndexOfMovieTitle);
          }
          final String _tmpMovieDescription;
          if (_cursor.isNull(_cursorIndexOfMovieDescription)) {
            _tmpMovieDescription = null;
          } else {
            _tmpMovieDescription = _cursor.getString(_cursorIndexOfMovieDescription);
          }
          final String _tmpMoviePosterEndPont;
          if (_cursor.isNull(_cursorIndexOfMoviePosterEndPont)) {
            _tmpMoviePosterEndPont = null;
          } else {
            _tmpMoviePosterEndPont = _cursor.getString(_cursorIndexOfMoviePosterEndPont);
          }
          final String _tmpMovieReleaseDate;
          if (_cursor.isNull(_cursorIndexOfMovieReleaseDate)) {
            _tmpMovieReleaseDate = null;
          } else {
            _tmpMovieReleaseDate = _cursor.getString(_cursorIndexOfMovieReleaseDate);
          }
          final Float _tmpMovieAverageVote;
          if (_cursor.isNull(_cursorIndexOfMovieAverageVote)) {
            _tmpMovieAverageVote = null;
          } else {
            _tmpMovieAverageVote = _cursor.getFloat(_cursorIndexOfMovieAverageVote);
          }
          final Long _tmpMovieVoteCount;
          if (_cursor.isNull(_cursorIndexOfMovieVoteCount)) {
            _tmpMovieVoteCount = null;
          } else {
            _tmpMovieVoteCount = _cursor.getLong(_cursorIndexOfMovieVoteCount);
          }
          _item = new MAMovieResults(_tmpMovieSerialNumber,_tmpUserLanguage,_tmpPageNumber,_tmpPosterEndPoint,_tmpMovieId,_tmpMovieLanguage,_tmpMovieTitle,_tmpMovieDescription,_tmpMoviePosterEndPont,_tmpMovieReleaseDate,_tmpMovieAverageVote,_tmpMovieVoteCount);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<MAMovieResults> retrieveMoviesByDescendingOrder(final String userLanguage) {
    final String _sql = "SELECT * FROM moviesTable  WHERE userLanguage= ? ORDER BY   pageNumber  ASC, movieTitle  DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userLanguage == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userLanguage);
    }
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
      try {
        final int _cursorIndexOfMovieSerialNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "movieSerialNumber");
        final int _cursorIndexOfUserLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "userLanguage");
        final int _cursorIndexOfPageNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "pageNumber");
        final int _cursorIndexOfPosterEndPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "posterEndPoint");
        final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movieId");
        final int _cursorIndexOfMovieLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "movieLanguage");
        final int _cursorIndexOfMovieTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "movieTitle");
        final int _cursorIndexOfMovieDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "movieDescription");
        final int _cursorIndexOfMoviePosterEndPont = CursorUtil.getColumnIndexOrThrow(_cursor, "moviePosterEndPont");
        final int _cursorIndexOfMovieReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "movieReleaseDate");
        final int _cursorIndexOfMovieAverageVote = CursorUtil.getColumnIndexOrThrow(_cursor, "movieAverageVote");
        final int _cursorIndexOfMovieVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "movieVoteCount");
        final List<MAMovieResults> _result = new ArrayList<MAMovieResults>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final MAMovieResults _item;
          final long _tmpMovieSerialNumber;
          _tmpMovieSerialNumber = _cursor.getLong(_cursorIndexOfMovieSerialNumber);
          final String _tmpUserLanguage;
          if (_cursor.isNull(_cursorIndexOfUserLanguage)) {
            _tmpUserLanguage = null;
          } else {
            _tmpUserLanguage = _cursor.getString(_cursorIndexOfUserLanguage);
          }
          final int _tmpPageNumber;
          _tmpPageNumber = _cursor.getInt(_cursorIndexOfPageNumber);
          final String _tmpPosterEndPoint;
          if (_cursor.isNull(_cursorIndexOfPosterEndPoint)) {
            _tmpPosterEndPoint = null;
          } else {
            _tmpPosterEndPoint = _cursor.getString(_cursorIndexOfPosterEndPoint);
          }
          final Integer _tmpMovieId;
          if (_cursor.isNull(_cursorIndexOfMovieId)) {
            _tmpMovieId = null;
          } else {
            _tmpMovieId = _cursor.getInt(_cursorIndexOfMovieId);
          }
          final String _tmpMovieLanguage;
          if (_cursor.isNull(_cursorIndexOfMovieLanguage)) {
            _tmpMovieLanguage = null;
          } else {
            _tmpMovieLanguage = _cursor.getString(_cursorIndexOfMovieLanguage);
          }
          final String _tmpMovieTitle;
          if (_cursor.isNull(_cursorIndexOfMovieTitle)) {
            _tmpMovieTitle = null;
          } else {
            _tmpMovieTitle = _cursor.getString(_cursorIndexOfMovieTitle);
          }
          final String _tmpMovieDescription;
          if (_cursor.isNull(_cursorIndexOfMovieDescription)) {
            _tmpMovieDescription = null;
          } else {
            _tmpMovieDescription = _cursor.getString(_cursorIndexOfMovieDescription);
          }
          final String _tmpMoviePosterEndPont;
          if (_cursor.isNull(_cursorIndexOfMoviePosterEndPont)) {
            _tmpMoviePosterEndPont = null;
          } else {
            _tmpMoviePosterEndPont = _cursor.getString(_cursorIndexOfMoviePosterEndPont);
          }
          final String _tmpMovieReleaseDate;
          if (_cursor.isNull(_cursorIndexOfMovieReleaseDate)) {
            _tmpMovieReleaseDate = null;
          } else {
            _tmpMovieReleaseDate = _cursor.getString(_cursorIndexOfMovieReleaseDate);
          }
          final Float _tmpMovieAverageVote;
          if (_cursor.isNull(_cursorIndexOfMovieAverageVote)) {
            _tmpMovieAverageVote = null;
          } else {
            _tmpMovieAverageVote = _cursor.getFloat(_cursorIndexOfMovieAverageVote);
          }
          final Long _tmpMovieVoteCount;
          if (_cursor.isNull(_cursorIndexOfMovieVoteCount)) {
            _tmpMovieVoteCount = null;
          } else {
            _tmpMovieVoteCount = _cursor.getLong(_cursorIndexOfMovieVoteCount);
          }
          _item = new MAMovieResults(_tmpMovieSerialNumber,_tmpUserLanguage,_tmpPageNumber,_tmpPosterEndPoint,_tmpMovieId,_tmpMovieLanguage,_tmpMovieTitle,_tmpMovieDescription,_tmpMoviePosterEndPont,_tmpMovieReleaseDate,_tmpMovieAverageVote,_tmpMovieVoteCount);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<MAMovieResults> retrieveMovieBySearchKey(final String searchKey,
      final String userLanguage, final int order) {
    final String _sql = "SELECT * FROM moviesTable WHERE movieTitle LIKE '%' || ? || '%' AND userLanguage=? ORDER BY CASE WHEN ?=0 THEN movieTitle END ASC,CASE WHEN ?=1 THEN movieTitle END DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (searchKey == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchKey);
    }
    _argIndex = 2;
    if (userLanguage == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userLanguage);
    }
    _argIndex = 3;
    _statement.bindLong(_argIndex, order);
    _argIndex = 4;
    _statement.bindLong(_argIndex, order);
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
      try {
        final int _cursorIndexOfMovieSerialNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "movieSerialNumber");
        final int _cursorIndexOfUserLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "userLanguage");
        final int _cursorIndexOfPageNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "pageNumber");
        final int _cursorIndexOfPosterEndPoint = CursorUtil.getColumnIndexOrThrow(_cursor, "posterEndPoint");
        final int _cursorIndexOfMovieId = CursorUtil.getColumnIndexOrThrow(_cursor, "movieId");
        final int _cursorIndexOfMovieLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "movieLanguage");
        final int _cursorIndexOfMovieTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "movieTitle");
        final int _cursorIndexOfMovieDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "movieDescription");
        final int _cursorIndexOfMoviePosterEndPont = CursorUtil.getColumnIndexOrThrow(_cursor, "moviePosterEndPont");
        final int _cursorIndexOfMovieReleaseDate = CursorUtil.getColumnIndexOrThrow(_cursor, "movieReleaseDate");
        final int _cursorIndexOfMovieAverageVote = CursorUtil.getColumnIndexOrThrow(_cursor, "movieAverageVote");
        final int _cursorIndexOfMovieVoteCount = CursorUtil.getColumnIndexOrThrow(_cursor, "movieVoteCount");
        final List<MAMovieResults> _result = new ArrayList<MAMovieResults>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final MAMovieResults _item;
          final long _tmpMovieSerialNumber;
          _tmpMovieSerialNumber = _cursor.getLong(_cursorIndexOfMovieSerialNumber);
          final String _tmpUserLanguage;
          if (_cursor.isNull(_cursorIndexOfUserLanguage)) {
            _tmpUserLanguage = null;
          } else {
            _tmpUserLanguage = _cursor.getString(_cursorIndexOfUserLanguage);
          }
          final int _tmpPageNumber;
          _tmpPageNumber = _cursor.getInt(_cursorIndexOfPageNumber);
          final String _tmpPosterEndPoint;
          if (_cursor.isNull(_cursorIndexOfPosterEndPoint)) {
            _tmpPosterEndPoint = null;
          } else {
            _tmpPosterEndPoint = _cursor.getString(_cursorIndexOfPosterEndPoint);
          }
          final Integer _tmpMovieId;
          if (_cursor.isNull(_cursorIndexOfMovieId)) {
            _tmpMovieId = null;
          } else {
            _tmpMovieId = _cursor.getInt(_cursorIndexOfMovieId);
          }
          final String _tmpMovieLanguage;
          if (_cursor.isNull(_cursorIndexOfMovieLanguage)) {
            _tmpMovieLanguage = null;
          } else {
            _tmpMovieLanguage = _cursor.getString(_cursorIndexOfMovieLanguage);
          }
          final String _tmpMovieTitle;
          if (_cursor.isNull(_cursorIndexOfMovieTitle)) {
            _tmpMovieTitle = null;
          } else {
            _tmpMovieTitle = _cursor.getString(_cursorIndexOfMovieTitle);
          }
          final String _tmpMovieDescription;
          if (_cursor.isNull(_cursorIndexOfMovieDescription)) {
            _tmpMovieDescription = null;
          } else {
            _tmpMovieDescription = _cursor.getString(_cursorIndexOfMovieDescription);
          }
          final String _tmpMoviePosterEndPont;
          if (_cursor.isNull(_cursorIndexOfMoviePosterEndPont)) {
            _tmpMoviePosterEndPont = null;
          } else {
            _tmpMoviePosterEndPont = _cursor.getString(_cursorIndexOfMoviePosterEndPont);
          }
          final String _tmpMovieReleaseDate;
          if (_cursor.isNull(_cursorIndexOfMovieReleaseDate)) {
            _tmpMovieReleaseDate = null;
          } else {
            _tmpMovieReleaseDate = _cursor.getString(_cursorIndexOfMovieReleaseDate);
          }
          final Float _tmpMovieAverageVote;
          if (_cursor.isNull(_cursorIndexOfMovieAverageVote)) {
            _tmpMovieAverageVote = null;
          } else {
            _tmpMovieAverageVote = _cursor.getFloat(_cursorIndexOfMovieAverageVote);
          }
          final Long _tmpMovieVoteCount;
          if (_cursor.isNull(_cursorIndexOfMovieVoteCount)) {
            _tmpMovieVoteCount = null;
          } else {
            _tmpMovieVoteCount = _cursor.getLong(_cursorIndexOfMovieVoteCount);
          }
          _item = new MAMovieResults(_tmpMovieSerialNumber,_tmpUserLanguage,_tmpPageNumber,_tmpPosterEndPoint,_tmpMovieId,_tmpMovieLanguage,_tmpMovieTitle,_tmpMovieDescription,_tmpMoviePosterEndPont,_tmpMovieReleaseDate,_tmpMovieAverageVote,_tmpMovieVoteCount);
          _result.add(_item);
        }
        __db.setTransactionSuccessful();
        return _result;
      } finally {
        _cursor.close();
        _statement.release();
      }
    } finally {
      __db.endTransaction();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
