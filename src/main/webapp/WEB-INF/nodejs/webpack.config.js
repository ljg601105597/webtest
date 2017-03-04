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
    resolve:{
        modules: ['node_modules', path.resolve(__dirname, 'web_modules')]
    },
    module: {
        loaders: [
            {test: /\.css$/,exclude:/node_modules/, loader: 'style-loader!css-loader'},
            {test:/\.js$/,exclude:/node_modules/,loader:'babel-loader?cacheDirectory=true'},
            {test:/\.less$/,exclude:/node_modules/,loader: "style!css!less"},
        ]
    },
    plugins:[
        // new webpack.optimize.UglifyJsPlugin({
        //     compress: {
        //         warnings: false
        //     }
        // }) 压缩插件，开发不压缩所以注释掉
    ]
}