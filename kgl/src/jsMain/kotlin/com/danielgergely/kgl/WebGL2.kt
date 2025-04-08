package com.danielgergely.kgl

import org.khronos.webgl.WebGLObject
import org.khronos.webgl.WebGLRenderingContext

abstract external class WebGL2RenderingContext : WebGLRenderingContext {
    fun createVertexArray(): WebGLVertexArrayObject?

    fun bindVertexArray(vertexArray: WebGLVertexArrayObject)

    fun deleteVertexArray(vertexArray: WebGLVertexArrayObject)

    /**
     * Renders primitives from array data like the gl.drawArrays() method.
     * In addition, it can execute multiple instances of the range of elements.
     */
    fun drawArraysInstanced(
        mode: Int,
        first: Int,
        count: Int,
        instanceCount: Int,
    )

    /**
     * Renders primitives from array data like the gl.drawElements() method.
     * In addition, it can execute multiple instances of a set of elements.
     */
    fun drawElementsInstanced(
        mode: Int,
        count: Int,
        type: Int,
        offset: Int,
        instanceCount: Int,
    )
}

external class WebGLVertexArrayObject : WebGLObject
