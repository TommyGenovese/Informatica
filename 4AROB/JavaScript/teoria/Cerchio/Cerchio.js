function Cerchio(ctx,x, y, r, g, b, radius) {
    this.ctx = ctx
    this.x = x
    this.y=y
    this.r=r
    this.g=g
    this.b=b
    this.radius=radius;
    this.disegna=function () {
        this.ctx.beginPath()
        this.ctx.arc(this.x, this.y, this.radius, 0, 2*Math.PI, true)
        this.ctx.fillStyle= 'rgb('+ this.r + ', ' + this.g + ', ' + this.b + ')'
        this.ctx.fill()
        this.ctx.strokeStyle= 'rgb('+ this.r + ', ' + this.g + ', ' + this.b + ')'
        this.ctx.stroke()
        this.ctx.closePath()
    }
}