/**
 * Created by ljg on 2017/2/22.
 */
import React from 'react';
import '../css/style.css';
import '../css/antd.less';
import {DatePicker} from 'antd';
import { render } from 'react-dom';
const RangePicker = DatePicker.RangePicker;

import User from './test/user'
console.info("444444");
console.info(User);
const u=new User('zhangsan');
console.info(u)
render(<RangePicker/>,document.getElementById("app"))


