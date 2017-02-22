/**
 * Created by ljg on 2017/2/21.
 */
const webpack = require('webpack');
const path=require('path');
const appPath=path.join(__dirname,'apps','index.js');
console.info(__dirname)
module.exports = {
    entry: {
        app1:appPath
    },
    output: {
        path: '../../static/dist',
        filename: 'bundle-[name].js',
        publicPath:'/static/dist/a'
    },
    module: {
        loaders: [
            {test: /\.css$/, loader: 'style-loader!css-loader'},
            {test:/\.js$/,loader:'babel-loader'},
            {test:/\.less$/,loader: "style!css!less"},
        ]
    },
    plugins:[
        new webpack.optimize.UglifyJsPlugin({
            compress: {
                warnings: false
            }
        })
    ]
}