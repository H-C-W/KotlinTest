package com.android.kotlintest

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

/**
 * Created by engrh on 2018/4/13.
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        val config = RealmConfiguration.Builder()
                .name("realm.my_todo")
                .encryptionKey(getKey())
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                .build()
        Realm.setDefaultConfiguration(config)
    }

    fun getKey(): ByteArray {
        return byteArrayOf(0, 1, 2, 3, 4, 3, 2, 1, 0, 1, 2, 3, 4, 3, 2, 1, 0, 1, 2, 3
                , 4, 3, 2, 1, 0, 1, 2, 3, 4, 3, 2, 1, 0, 1, 2, 3, 4, 3, 2, 1, 0, 1, 2, 3,
                4, 3, 2, 1, 0, 1, 2, 3, 4, 3, 2, 1, 0, 1, 2, 3, 4, 3, 2, 1)
    }


}