/**
 * Created by yoichi.kikuchi on 2016/01/04.
 */
'use strict'
var assert = require('power-assert');
var Heatmap = require('../../../main/resources/static/Heatmap.js');

describe('color(value)', function () {

    it('0.50 -> rgb(255,255,0)', function () {
        var heatmap = new Heatmap();
        assert.equal(heatmap.color(0.5), 'rgb(255,255,0)');
    });
    it('0.00 -> rgb(0,255,0)', function () {
        var heatmap = new Heatmap();
        assert.equal(heatmap.color(0.0), 'rgb(0,255,0)');
    });
    it('1.00 -> rgb(255,0,0)', function () {
        var heatmap = new Heatmap();
        assert.equal(heatmap.color(1.0), 'rgb(255,0,0)');
    });
    it('0.25 -> rgb(127,255,0)', function () {
        var heatmap = new Heatmap();
        assert.equal(heatmap.color(0.25), 'rgb(127,255,0)');
    });
    it('0.75 -> rgb(255,128,0)', function () {
        var heatmap = new Heatmap();
        assert.equal(heatmap.color(0.75), 'rgb(255,128,0)');
    });

    it('1.00 -> rgb(255,128,128)', function () {
        var heatmap = new Heatmap('b', 'r', 128, 255);
        assert.equal(heatmap.color(1.0), 'rgb(255,128,128)');
    });
    it('0.00 -> rgb(128,128,255)', function () {
        var heatmap = new Heatmap('b', 'r', 128, 255);
        assert.equal(heatmap.color(0.0), 'rgb(128,128,255)');
    });
    it('0.25 -> rgb(191,128,255)', function () {
        var heatmap = new Heatmap('b', 'r', 128, 255);
        assert.equal(heatmap.color(0.25), 'rgb(191,128,255)');
    });
    it('0.75 -> rgb(255,128,192)', function () {
        var heatmap = new Heatmap('b', 'r', 128, 255);
        assert.equal(heatmap.color(0.75), 'rgb(255,128,192)');
    });

    it('1.00 -> rgb(255,64,64)', function () {
        var heatmap = new Heatmap('b', 'r', 64, 255);
        assert.equal(heatmap.color(1.0), 'rgb(255,64,64)');
    });
    it('0.00 -> rgb(64,64,255)', function () {
        var heatmap = new Heatmap('b', 'r', 64, 255);
        assert.equal(heatmap.color(0.0), 'rgb(64,64,255)');
    });
    it('0.50 -> rgb(255,64,255)', function () {
        var heatmap = new Heatmap('b', 'r', 64, 255);
        assert.equal(heatmap.color(0.5), 'rgb(255,64,255)');
    });
    it('0.25 -> rgb(159,64,255)', function () {
        var heatmap = new Heatmap('b', 'r', 64, 255);
        assert.equal(heatmap.color(0.25), 'rgb(159,64,255)');
    });
});
