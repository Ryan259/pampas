/*
 *
 *  *  Copyright 2009-2018.
 *  *
 *  *    Licensed under the Apache License, Version 2.0 (the "License");
 *  *    you may not use this file except in compliance with the License.
 *  *    You may obtain a copy of the License at
 *  *
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *    Unless required by applicable law or agreed to in writing, software
 *  *    distributed under the License is distributed on an "AS IS" BASIS,
 *  *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *    See the License for the specific language governing permissions and
 *  *    limitations under the License.
 *
 */

package com.github.df.pampas.common.exec;

import com.github.df.pampas.common.exec.payload.RequestInfo;
import com.github.df.pampas.common.exec.payload.ResponseInfo;

import java.util.concurrent.Future;

/**
 * 作业者
 * Created by darrenfu on 18-1-24.
 *
 * @author: darrenfu
 * @date: 18-1-24
 */
public interface Worker<Q extends Object, R extends Object> {

    Future<ResponseInfo<R>> execute(RequestInfo<Q> req, Filter<Q, R> filter);

//    Future<Rsp> execute(Req req, BiConsumer<Req, Rsp> success, BiConsumer<Req, Throwable> failed);
}
