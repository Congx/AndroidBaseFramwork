package com.base.androidbaseframwork.rxjava

/**
 * @date 2019-12-05
 * @Author luffy
 * @description 所有的类继承
 *
 */
class RxBusEvent {

    open class BaseEvent(var msg:String = "") {
        init {
            msg = msg.let { this.javaClass.simpleName }
        }

        override fun toString(): String {
            return msg
        }
    }

    class Event:BaseEvent()
}