package com.karurmallow.demotestingapp.repository.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.karurmallow.demotestingapp.services.MAMovieDao;
import com.karurmallow.demotestingapp.services.MAMovieDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MADataBaseManager_Impl extends MADataBaseManager {
  private volatile MAMovieDao _mAMovieDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `moviesTable` (`movieSerialNumber` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userLanguage` TEXT NOT NULL, `pageNumber` INTEGER NOT NULL, `posterEndPoint` TEXT, `movieId` INTEGER, `movieLanguage` TEXT, `movieTitle` TEXT, `movieDescription` TEXT, `moviePosterEndPont` TEXT NOT NULL, `movieReleaseDate` TEXT, `movieAverageVote` REAL, `movieVoteCount` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7e73b0f06613b2fc65907ff0b046fcd8')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `moviesTable`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsMoviesTable = new HashMap<String, TableInfo.Column>(12);
        _columnsMoviesTable.put("movieSerialNumber", new TableInfo.Column("movieSerialNumber", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("userLanguage", new TableInfo.Column("userLanguage", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("pageNumber", new TableInfo.Column("pageNumber", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("posterEndPoint", new TableInfo.Column("posterEndPoint", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movieId", new TableInfo.Column("movieId", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movieLanguage", new TableInfo.Column("movieLanguage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movieTitle", new TableInfo.Column("movieTitle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movieDescription", new TableInfo.Column("movieDescription", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("moviePosterEndPont", new TableInfo.Column("moviePosterEndPont", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movieReleaseDate", new TableInfo.Column("movieReleaseDate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movieAverageVote", new TableInfo.Column("movieAverageVote", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMoviesTable.put("movieVoteCount", new TableInfo.Column("movieVoteCount", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMoviesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMoviesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMoviesTable = new TableInfo("moviesTable", _columnsMoviesTable, _foreignKeysMoviesTable, _indicesMoviesTable);
        final TableInfo _existingMoviesTable = TableInfo.read(_db, "moviesTable");
        if (! _infoMoviesTable.equals(_existingMoviesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "moviesTable(com.karurmallow.demotestingapp.model.MAMovieResults).\n"
                  + " Expected:\n" + _infoMoviesTable + "\n"
                  + " Found:\n" + _existingMoviesTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7e73b0f06613b2fc65907ff0b046fcd8", "09e7f5437f61695fe494c23e5e7c656d");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "moviesTable");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `moviesTable`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MAMovieDao.class, MAMovieDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public MAMovieDao userDao() {
    if (_mAMovieDao != null) {
      return _mAMovieDao;
    } else {
      synchronized(this) {
        if(_mAMovieDao == null) {
          _mAMovieDao = new MAMovieDao_Impl(this);
        }
        return _mAMovieDao;
      }
    }
  }
}
