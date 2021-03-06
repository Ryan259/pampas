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

package com.github.pampas.common.exec;

/**
 * Created by darrenfu on 18-2-6.
 *
 * @author: darrenfu
 * @date: 18-2-6
 */
public class FilterContext {

    public static final FilterContext CURRENT = new FilterContext();

    private final ThreadLocal<FilterChain> threadLocal = ThreadLocal.withInitial(() -> new FilterChain());

    private FilterContext() {

    }

    protected FilterChain chain(String currentFilter) {
        FilterChain filterChain = threadLocal.get();
        filterChain.setCurrent(currentFilter);
        filterChain.resetStatus();
        return filterChain;
    }

    protected void resetChain() {
        FilterChain filterChain = threadLocal.get();
        filterChain.resetAndClear();
    }

}
