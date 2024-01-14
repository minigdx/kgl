package com.danielgergely.kgl

public actual abstract class Buffer()

public actual class FloatBuffer() : Buffer() {
    actual constructor(buffer: Array<Float>) : this()

    actual constructor(buffer: FloatArray) : this()

    actual constructor(size: Int) : this()

    actual var position: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    actual fun put(f: Float) {
    }

    actual fun put(floatArray: FloatArray) {
    }

    actual fun put(
        floatArray: FloatArray,
        offset: Int,
        length: Int,
    ) {
    }

    actual operator fun set(
        pos: Int,
        f: Float,
    ) {
    }

    actual fun get(): Float {
        TODO("Not yet implemented")
    }

    actual fun get(floatArray: FloatArray) {
    }

    actual fun get(
        floatArray: FloatArray,
        offset: Int,
        length: Int,
    ) {
    }

    actual operator fun get(pos: Int): Float {
        TODO("Not yet implemented")
    }
}

public actual class ByteBuffer() : Buffer() {
    actual constructor(buffer: Array<Byte>) : this()

    actual constructor(buffer: ByteArray) : this()

    actual constructor(size: Int) : this()

    actual var position: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    actual fun put(b: Byte) {
    }

    actual fun put(byteArray: ByteArray) {
    }

    actual fun put(
        byteArray: ByteArray,
        offset: Int,
        length: Int,
    ) {
    }

    actual operator fun set(
        pos: Int,
        b: Byte,
    ) {
    }

    actual fun get(): Byte {
        TODO("Not yet implemented")
    }

    actual fun get(byteArray: ByteArray) {
    }

    actual fun get(
        byteArray: ByteArray,
        offset: Int,
        length: Int,
    ) {
    }

    actual operator fun get(pos: Int): Byte {
        TODO("Not yet implemented")
    }
}

public actual class IntBuffer() : Buffer() {
    actual constructor(buffer: Array<Int>) : this()

    actual constructor(buffer: IntArray) : this()

    actual constructor(size: Int) : this()

    actual var position: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    actual fun put(i: Int) {
    }

    actual fun put(intArray: IntArray) {
    }

    actual fun put(
        intArray: IntArray,
        offset: Int,
        length: Int,
    ) {
    }

    actual operator fun set(
        pos: Int,
        i: Int,
    ) {
    }

    actual fun get(): Int {
        TODO("Not yet implemented")
    }

    actual fun get(intArray: IntArray) {
    }

    actual fun get(
        intArray: IntArray,
        offset: Int,
        length: Int,
    ) {
    }

    actual operator fun get(pos: Int): Int {
        TODO("Not yet implemented")
    }
}
