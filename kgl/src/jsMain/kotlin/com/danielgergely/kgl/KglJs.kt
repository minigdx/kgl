package com.danielgergely.kgl

import org.khronos.webgl.Float32Array
import org.khronos.webgl.Int32Array
import org.khronos.webgl.WebGLBuffer
import org.khronos.webgl.WebGLFramebuffer
import org.khronos.webgl.WebGLProgram
import org.khronos.webgl.WebGLRenderbuffer
import org.khronos.webgl.WebGLShader
import org.khronos.webgl.WebGLTexture
import org.khronos.webgl.WebGLUniformLocation

class KglJs(private val gl: WebGL2RenderingContext) : Kgl {
    override fun createShader(type: Int): Shader? = gl.createShader(type)

    override fun shaderSource(
        shaderId: Shader,
        source: String,
    ): Unit = gl.shaderSource(shaderId.unsafeCast<WebGLShader>(), source)

    override fun compileShader(shaderId: Shader): Unit = gl.compileShader(shaderId.unsafeCast<WebGLShader>())

    override fun deleteShader(shaderId: Shader): Unit = gl.deleteShader(shaderId.unsafeCast<WebGLShader>())

    override fun getShaderParameter(
        shader: Shader,
        pname: Int,
    ): Int {
        val value = gl.getShaderParameter(shader.unsafeCast<WebGLShader>(), pname)!!

        if (value is Boolean) {
            return if (value) GL_TRUE else GL_FALSE
        }
        return value as Int
    }

    override fun getProgramInfoLog(program: Program): String? = gl.getProgramInfoLog(program.unsafeCast<WebGLProgram>())

    override fun getShaderInfoLog(shaderId: Shader): String? = gl.getShaderInfoLog(shaderId.unsafeCast<WebGLShader>())

    override fun getProgramParameter(
        program: Program,
        pname: Int,
    ): Int {
        val value = gl.getProgramParameter(program.unsafeCast<WebGLProgram>(), pname)!!
        if (value is Boolean) {
            return if (value) GL_TRUE else GL_FALSE
        }
        return value as Int
    }

    override fun createProgram(): Program? = gl.createProgram()

    override fun attachShader(
        programId: Program,
        shaderId: Shader,
    ): Unit = gl.attachShader(programId.unsafeCast<WebGLProgram>(), shaderId.unsafeCast<WebGLShader>())

    override fun linkProgram(programId: Program): Unit = gl.linkProgram(programId.unsafeCast<WebGLProgram>())

    override fun useProgram(programId: Program): Unit = gl.useProgram(programId.unsafeCast<WebGLProgram>())

    override fun detachShader(
        programId: Program,
        shaderId: Shader,
    ): Unit = gl.detachShader(programId.unsafeCast<WebGLProgram>(), shaderId.unsafeCast<WebGLShader>())

    override fun deleteProgram(programId: Program): Unit = gl.deleteProgram(programId.unsafeCast<WebGLProgram>())

    override fun getUniformLocation(
        programId: Program,
        name: String,
    ): UniformLocation? = gl.getUniformLocation(programId.unsafeCast<WebGLProgram>(), name)

    override fun getAttribLocation(
        programId: Program,
        name: String,
    ): Int = gl.getAttribLocation(programId.unsafeCast<WebGLProgram>(), name)

    override fun bindAttribLocation(
        programId: Program,
        index: Int,
        name: String,
    ): Unit = gl.bindAttribLocation(programId.unsafeCast<WebGLProgram>(), index, name)

    override fun enableVertexAttribArray(location: Int): Unit = gl.enableVertexAttribArray(location)

    override fun disableVertexAttribArray(location: Int): Unit = gl.disableVertexAttribArray(location)

    override fun enable(cap: Int): Unit = gl.enable(cap)

    override fun disable(cap: Int): Unit = gl.disable(cap)

    override fun createBuffer(): GlBuffer = gl.createBuffer() ?: throw Exception()

    override fun createBuffers(count: Int): Array<GlBuffer> = Array(count) { gl.createBuffer() ?: throw Exception() }

    override fun bindBuffer(
        target: Int,
        bufferId: GlBuffer?,
    ): Unit = gl.bindBuffer(target, bufferId.unsafeCast<WebGLBuffer>())

    override fun bufferData(
        target: Int,
        sourceData: Buffer,
        size: Int,
        usage: Int,
    ) {
        gl.bufferData(target, sourceData.getJsBufferWithOffset(), usage)
    }

    override fun deleteBuffer(buffer: GlBuffer): Unit = gl.deleteBuffer(buffer.unsafeCast<WebGLBuffer>())

    override fun vertexAttribPointer(
        location: Int,
        size: Int,
        type: Int,
        normalized: Boolean,
        stride: Int,
        offset: Int,
    ): Unit = gl.vertexAttribPointer(location, size, type, normalized, stride, offset)

    override fun uniform1f(
        location: UniformLocation,
        f: Float,
    ): Unit = gl.uniform1f(location.unsafeCast<WebGLUniformLocation>(), f)

    override fun uniform1fv(
        location: UniformLocation,
        value: FloatArray,
    ): Unit = gl.uniform1fv(location.unsafeCast<WebGLUniformLocation>(), value.unsafeCast<Float32Array>())

    override fun uniform1i(
        location: UniformLocation,
        i: Int,
    ): Unit = gl.uniform1i(location.unsafeCast<WebGLUniformLocation>(), i)

    override fun uniform1iv(
        location: UniformLocation,
        value: IntArray,
    ): Unit = gl.uniform1iv(location.unsafeCast<WebGLUniformLocation>(), value.unsafeCast<Int32Array>())

    override fun uniform2f(
        location: UniformLocation,
        x: Float,
        y: Float,
    ): Unit = gl.uniform2f(location.unsafeCast<WebGLUniformLocation>(), x, y)

    override fun uniform2fv(
        location: UniformLocation,
        value: FloatArray,
    ): Unit = gl.uniform2fv(location.unsafeCast<WebGLUniformLocation>(), value.unsafeCast<Float32Array>())

    override fun uniform2i(
        location: UniformLocation,
        x: Int,
        y: Int,
    ): Unit = gl.uniform2i(location.unsafeCast<WebGLUniformLocation>(), x, y)

    override fun uniform2iv(
        location: UniformLocation,
        value: IntArray,
    ): Unit = gl.uniform2iv(location.unsafeCast<WebGLUniformLocation>(), value.unsafeCast<Int32Array>())

    override fun uniform3f(
        location: UniformLocation,
        x: Float,
        y: Float,
        z: Float,
    ): Unit = gl.uniform3f(location.unsafeCast<WebGLUniformLocation>(), x, y, z)

    override fun uniform3fv(
        location: UniformLocation,
        value: FloatArray,
    ): Unit = gl.uniform3fv(location.unsafeCast<WebGLUniformLocation>(), value.unsafeCast<Float32Array>())

    override fun uniform3i(
        location: UniformLocation,
        x: Int,
        y: Int,
        z: Int,
    ): Unit = gl.uniform3i(location.unsafeCast<WebGLUniformLocation>(), x, y, z)

    override fun uniform3iv(
        location: UniformLocation,
        value: IntArray,
    ): Unit = gl.uniform3iv(location.unsafeCast<WebGLUniformLocation>(), value.unsafeCast<Int32Array>())

    override fun uniform4f(
        location: UniformLocation,
        x: Float,
        y: Float,
        z: Float,
        w: Float,
    ): Unit = gl.uniform4f(location.unsafeCast<WebGLUniformLocation>(), x, y, z, w)

    override fun uniform4fv(
        location: UniformLocation,
        value: FloatArray,
    ): Unit = gl.uniform4fv(location.unsafeCast<WebGLUniformLocation>(), value.unsafeCast<Float32Array>())

    override fun uniform4i(
        location: UniformLocation,
        x: Int,
        y: Int,
        z: Int,
        w: Int,
    ): Unit = gl.uniform4i(location.unsafeCast<WebGLUniformLocation>(), x, y, z, w)

    override fun uniform4iv(
        location: UniformLocation,
        value: IntArray,
    ): Unit = gl.uniform4iv(location.unsafeCast<WebGLUniformLocation>(), value.unsafeCast<Int32Array>())

    override fun uniformMatrix3fv(
        location: UniformLocation,
        transpose: Boolean,
        value: dynamic,
    ) {
        gl.uniformMatrix3fv(location.unsafeCast<WebGLUniformLocation>(), transpose, value.unsafeCast<Float32Array>())
    }

    override fun uniformMatrix4fv(
        location: UniformLocation,
        transpose: Boolean,
        value: dynamic,
    ) {
        gl.uniformMatrix4fv(location.unsafeCast<WebGLUniformLocation>(), transpose, value.unsafeCast<Float32Array>())
    }

    override fun viewport(
        x: Int,
        y: Int,
        width: Int,
        height: Int,
    ): Unit = gl.viewport(x, y, width, height)

    override fun clear(mask: Int): Unit = gl.clear(mask)

    override fun clearColor(
        r: Float,
        g: Float,
        b: Float,
        a: Float,
    ): Unit = gl.clearColor(r, g, b, a)

    override fun blendFunc(
        sFactor: Int,
        dFactor: Int,
    ): Unit = gl.blendFunc(sFactor, dFactor)

    override fun cullFace(mode: Int): Unit = gl.cullFace(mode)

    override fun createTexture(): Texture = gl.createTexture() ?: throw Exception()

    override fun createTextures(n: Int): Array<Texture> = Array(n) { gl.createTexture() ?: throw Exception() }

    override fun deleteTexture(texture: Texture): Unit = gl.deleteTexture(texture.unsafeCast<WebGLTexture>())

    override fun texImage2D(
        target: Int,
        level: Int,
        internalFormat: Int,
        border: Int,
        resource: TextureResource,
    ): Unit = gl.texImage2D(target, level, internalFormat, GL_RGBA, GL_UNSIGNED_BYTE, resource.image)

    override fun texImage2D(
        target: Int,
        level: Int,
        internalFormat: Int,
        width: Int,
        height: Int,
        border: Int,
        format: Int,
        type: Int,
        buffer: Buffer?,
    ) {
        gl.texImage2D(
            target,
            level,
            internalFormat,
            width,
            height,
            border,
            format,
            type,
            buffer?.getJsBufferWithOffset(),
        )
    }

    override fun activeTexture(texture: Int): Unit = gl.activeTexture(texture)

    override fun bindTexture(
        target: Int,
        texture: Texture?,
    ): Unit = gl.bindTexture(target, texture.unsafeCast<WebGLTexture>())

    override fun generateMipmap(target: Int): Unit = gl.generateMipmap(target)

    override fun texParameteri(
        target: Int,
        pname: Int,
        value: Int,
    ): Unit = gl.texParameteri(target, pname, value)

    override fun createVertexArray(): VertexArrayObject = gl.createVertexArray() ?: throw Exception()

    override fun bindVertexArray(vertexArrayObject: VertexArrayObject?): Unit =
        gl.bindVertexArray(vertexArrayObject.unsafeCast<WebGLVertexArrayObject>())

    override fun deleteVertexArray(vertexArrayObject: VertexArrayObject): Unit =
        gl.deleteVertexArray(vertexArrayObject.unsafeCast<WebGLVertexArrayObject>())

    override fun drawArrays(
        mode: Int,
        first: Int,
        count: Int,
    ): Unit = gl.drawArrays(mode, first, count)

    override fun drawElements(
        mode: Int,
        count: Int,
        type: Int,
        offset: Long,
    ): Unit = gl.drawElements(mode, count, type, offset.toInt())

    override fun drawArraysInstanced(
        mode: Int,
        first: Int,
        count: Int,
        instanceCount: Int,
    ) {
        return gl.drawArraysInstanced(mode, first, count, instanceCount)
    }

    override fun drawElementsInstanced(
        mode: Int,
        count: Int,
        type: Int,
        offset: Long,
        instanceCount: Int,
    ) {
        return gl.drawElementsInstanced(mode, count, type, offset.toInt(), instanceCount)
    }

    override fun scissor(
        x: Int,
        y: Int,
        width: Int,
        height: Int,
    ) {
        return gl.scissor(x, y, width, height)
    }

    override fun pixelStorei(
        pname: Int,
        parameter: Int,
    ) {
        return gl.pixelStorei(pname, parameter)
    }

    override fun blendFuncSeparate(
        srcRGB: Int,
        dstRGB: Int,
        srcAlpha: Int,
        dstAlpha: Int,
    ) {
        return gl.blendFuncSeparate(srcRGB, dstRGB, srcAlpha, dstAlpha)
    }

    override fun getError(): Int = gl.getError()

    override fun finish(): Unit = gl.finish()

    override fun bindFramebuffer(
        target: Int,
        framebuffer: Framebuffer?,
    ): Unit = gl.bindFramebuffer(target, framebuffer.unsafeCast<WebGLFramebuffer>())

    override fun createFramebuffer(): Framebuffer = gl.createFramebuffer() ?: throw Exception()

    override fun deleteFramebuffer(framebuffer: Framebuffer): Unit = gl.deleteFramebuffer(framebuffer.unsafeCast<WebGLFramebuffer>())

    override fun checkFramebufferStatus(target: Int): Int = gl.checkFramebufferStatus(target)

    override fun framebufferTexture2D(
        target: Int,
        attachment: Int,
        textarget: Int,
        texture: Texture,
        level: Int,
    ): Unit = gl.framebufferTexture2D(target, attachment, textarget, texture.unsafeCast<WebGLTexture>(), level)

    override fun isFramebuffer(framebuffer: Framebuffer): Boolean = gl.isFramebuffer(framebuffer.unsafeCast<WebGLFramebuffer>())

    override fun bindRenderbuffer(
        target: Int,
        renderbuffer: Renderbuffer?,
    ): Unit = gl.bindRenderbuffer(target, renderbuffer.unsafeCast<WebGLRenderbuffer>())

    override fun createRenderbuffer(): Renderbuffer = gl.createRenderbuffer() ?: throw Exception()

    override fun deleteRenderbuffer(renderbuffer: Renderbuffer): Unit = gl.deleteRenderbuffer(renderbuffer.unsafeCast<WebGLRenderbuffer>())

    override fun framebufferRenderbuffer(
        target: Int,
        attachment: Int,
        renderbuffertarget: Int,
        renderbuffer: Renderbuffer,
    ): Unit = gl.framebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer.unsafeCast<WebGLRenderbuffer>())

    override fun isRenderbuffer(renderbuffer: Renderbuffer): Boolean = gl.isRenderbuffer(renderbuffer.unsafeCast<WebGLRenderbuffer>())

    override fun renderbufferStorage(
        target: Int,
        internalformat: Int,
        width: Int,
        height: Int,
    ): Unit = gl.renderbufferStorage(target, internalformat, width, height)

    override fun readPixels(
        x: Int,
        y: Int,
        width: Int,
        height: Int,
        format: Int,
        type: Int,
        buffer: Buffer,
    ) {
        gl.readPixels(x, y, width, height, format, type, buffer.getJsBufferWithOffset())
    }
}
