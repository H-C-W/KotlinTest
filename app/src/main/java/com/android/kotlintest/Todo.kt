package com.android.kotlintest

import io.realm.RealmConfiguration
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

/**
 * Created by engrh on 2018/4/13.
 */
@RealmClass
open class Todo : RealmObject() {
    @PrimaryKey
    open var id: String = "-1"
    open var title: String = "hahah"
    open var content: String = "heihei"


}