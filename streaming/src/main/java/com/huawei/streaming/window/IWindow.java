/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.huawei.streaming.window;

import com.huawei.streaming.view.IDataCollection;
import com.huawei.streaming.view.IView;

/**
 * <Window接口，Window允许保存上一个View发送来的数据。Window 可以为长度窗口，也可以为时间窗口。>
 * 
 */
public interface IWindow extends IView
{
    /**
     * <设置窗口数据缓存集>
     * <设置窗口数据缓存集，用于后续表达式访问窗口数据>
     * @param dataCollection 数据缓存集
     */
    public void setDataCollection(IDataCollection dataCollection);
}
