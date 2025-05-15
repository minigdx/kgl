package com.danielgergely.kgl

interface Kgl {
    fun createShader(type: Int): Shader?

    fun shaderSource(
        shaderId: Shader,
        source: String,
    )

    fun compileShader(shaderId: Shader)

    fun deleteShader(shaderId: Shader)

    fun getShaderParameter(
        shader: Shader,
        pname: Int,
    ): Int

    fun getProgramInfoLog(program: Program): String?

    fun getShaderInfoLog(shaderId: Shader): String?

    fun createProgram(): Program?

    fun attachShader(
        programId: Program,
        shaderId: Shader,
    )

    fun linkProgram(programId: Program)

    fun useProgram(programId: Program)

    fun detachShader(
        programId: Program,
        shaderId: Shader,
    )

    fun deleteProgram(programId: Program)

    fun getProgramParameter(
        program: Program,
        pname: Int,
    ): Int

    fun getUniformLocation(
        programId: Program,
        name: String,
    ): UniformLocation?

    fun getAttribLocation(
        programId: Program,
        name: String,
    ): Int

    fun bindAttribLocation(
        programId: Program,
        index: Int,
        name: String,
    )

    fun enable(cap: Int)

    fun disable(cap: Int)

    fun enableVertexAttribArray(location: Int)

    fun disableVertexAttribArray(location: Int)

    fun createBuffer(): GlBuffer

    fun createBuffers(count: Int): Array<GlBuffer>

    fun bindBuffer(
        target: Int,
        bufferId: GlBuffer?,
    )

    fun bufferData(
        target: Int,
        sourceData: Buffer,
        size: Int,
        usage: Int,
    )

    fun deleteBuffer(buffer: GlBuffer)

    fun vertexAttribPointer(
        location: Int,
        size: Int,
        type: Int,
        normalized: Boolean,
        stride: Int,
        offset: Int,
    )

    fun uniform1f(
        location: UniformLocation,
        f: Float,
    )

    fun uniform1fv(
        location: UniformLocation,
        value: FloatArray,
    )

    fun uniform1i(
        location: UniformLocation,
        i: Int,
    )

    fun uniform1iv(
        location: UniformLocation,
        value: IntArray,
    )

    fun uniform2f(
        location: UniformLocation,
        x: Float,
        y: Float,
    )

    fun uniform2fv(
        location: UniformLocation,
        value: FloatArray,
    )

    fun uniform2i(
        location: UniformLocation,
        x: Int,
        y: Int,
    )

    fun uniform2iv(
        location: UniformLocation,
        value: IntArray,
    )

    fun uniform3f(
        location: UniformLocation,
        x: Float,
        y: Float,
        z: Float,
    )

    fun uniform3fv(
        location: UniformLocation,
        value: FloatArray,
    )

    fun uniform3i(
        location: UniformLocation,
        x: Int,
        y: Int,
        z: Int,
    )

    fun uniform3iv(
        location: UniformLocation,
        value: IntArray,
    )

    fun uniform4f(
        location: UniformLocation,
        x: Float,
        y: Float,
        z: Float,
        w: Float,
    )

    fun uniform4fv(
        location: UniformLocation,
        value: FloatArray,
    )

    fun uniform4i(
        location: UniformLocation,
        x: Int,
        y: Int,
        z: Int,
        w: Int,
    )

    fun uniform4iv(
        location: UniformLocation,
        value: IntArray,
    )

    fun uniformMatrix3fv(
        location: UniformLocation,
        transpose: Boolean,
        value: FloatArray,
    )

    fun uniformMatrix4fv(
        location: UniformLocation,
        transpose: Boolean,
        value: FloatArray,
    )

    /**
     * specify pixel arithmetic
     */
    fun blendFunc(
        sFactor: Int,
        dFactor: Int,
    )

    /**
     * specify pixel arithmetic for RGB and alpha components separately
     */
    fun blendFuncSeparate(
        srcRGB: Int,
        dstRGB: Int,
        srcAlpha: Int,
        dstAlpha: Int,
    )

    fun cullFace(mode: Int)

    fun viewport(
        x: Int,
        y: Int,
        width: Int,
        height: Int,
    )

    fun clearColor(
        r: Float,
        g: Float,
        b: Float,
        a: Float,
    )

    fun clear(mask: Int)

    fun createTexture(): Texture

    fun createTextures(n: Int): Array<Texture>

    fun deleteTexture(texture: Texture)

    fun texImage2D(
        target: Int,
        level: Int,
        internalFormat: Int,
        border: Int,
        resource: TextureResource,
    )

    fun texImage2D(
        target: Int,
        level: Int,
        internalFormat: Int,
        width: Int,
        height: Int,
        border: Int,
        format: Int,
        type: Int,
        buffer: Buffer?,
    )

    fun activeTexture(texture: Int)

    fun bindTexture(
        target: Int,
        texture: Texture?,
    )

    fun generateMipmap(target: Int)

    fun texParameteri(
        target: Int,
        pname: Int,
        value: Int,
    )

    fun createVertexArray(): VertexArrayObject

    fun bindVertexArray(vertexArrayObject: VertexArrayObject?)

    fun deleteVertexArray(vertexArrayObject: VertexArrayObject)

    fun drawArrays(
        mode: Int,
        first: Int,
        count: Int,
    )

    fun drawElements(
        mode: Int,
        count: Int,
        type: Int,
        offset: Long,
    )

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
        offset: Long,
        instanceCount: Int,
    )

    fun getError(): Int

    fun finish()

    fun bindFramebuffer(
        target: Int,
        framebuffer: Framebuffer?,
    )

    fun createFramebuffer(): Framebuffer

    fun deleteFramebuffer(framebuffer: Framebuffer)

    fun checkFramebufferStatus(target: Int): Int

    fun framebufferTexture2D(
        target: Int,
        attachment: Int,
        textarget: Int,
        texture: Texture,
        level: Int,
    )

    fun isFramebuffer(framebuffer: Framebuffer): Boolean

    fun bindRenderbuffer(
        target: Int,
        renderbuffer: Renderbuffer?,
    )

    fun createRenderbuffer(): Renderbuffer

    fun deleteRenderbuffer(renderbuffer: Renderbuffer)

    fun framebufferRenderbuffer(
        target: Int,
        attachment: Int,
        renderbuffertarget: Int,
        renderbuffer: Renderbuffer,
    )

    fun isRenderbuffer(renderbuffer: Renderbuffer): Boolean

    fun renderbufferStorage(
        target: Int,
        internalformat: Int,
        width: Int,
        height: Int,
    )

    fun readPixels(
        x: Int,
        y: Int,
        width: Int,
        height: Int,
        format: Int,
        type: Int,
        buffer: Buffer,
    )

    fun scissor(
        x: Int,
        y: Int,
        width: Int,
        height: Int,
    )

    /**
     * set pixel storage modes
     * @see: https://registry.khronos.org/OpenGL-Refpages/gl4/html/glPixelStore.xhtml
     */
    fun pixelStorei(
        pname: Int,
        parameter: Int,
    )

    /**
     * control the front and back writing of individual bits in the stencil planes
     * @see: https://registry.khronos.org/OpenGL-Refpages/es2.0/xhtml/glStencilMask.xml
     */
    fun stencilMask(mask: Int)
}
