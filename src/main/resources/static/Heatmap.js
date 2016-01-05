/**
 * Created by yoichi.kikuchi on 2016/01/04.
 */
function Heatmap(cold, hot, min, max) {
    this.cold = cold || 'g';
    this.hot = hot || 'r';
    this.min = min || 0;
    this.max = max || 255;

    if (!this.cold || !/r|g|b/.test(this.cold)) {
        this.cold = 'g';
    }

    if (!this.hot || !/r|g|b/.test(this.hot)) {
        this.hot = 'r';
    }

    if (!this.min || this.min < 0) {
        this.min = 0;
    }

    if (!this.max || this.max > 255) {
        this.max = 255;
    }
}

Heatmap.prototype.color = function(value) {
    var v = value;

    if (!v || v < 0) {
        v = 0;
    }

    if (v > 1) {
        v = 1;
    }

    var cold = this.max - Math.floor((v - 0.5) / 0.5 * this.max) + (this.min * 0.5);
    var hot = Math.floor(v / 0.5 * this.max) + (this.min * 0.5);

    if (cold < this.min) {
        cold = this.min;
    }

    if (cold > this.max) {
        cold = this.max;
    }

    if (hot < this.min) {
        hot = this.min;
    }

    if (hot > this.max) {
        hot = this.max;
    }

    return 'rgb('
        + (this.cold === 'r' ? cold : this.hot === 'r' ? hot : this.min) + ','
        + (this.cold === 'g' ? cold : this.hot === 'g' ? hot : this.min) + ','
        + (this.cold === 'b' ? cold : this.hot === 'b' ? hot : this.min) + ')';
}

module.exports = Heatmap;
