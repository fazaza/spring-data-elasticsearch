/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.elasticsearch.core.facet;

import org.springframework.util.Assert;

/**
 * @author Artur Konczak
 */
public abstract class AbstractFacetRequest implements FacetRequest {

    private String name;
    private boolean applyQueryFilter;

    public AbstractFacetRequest(String name) {
        Assert.hasText(name, "Facet can't be null or empty !!!");
        this.name = name;
    }

    protected String getName(){
        return name;
    }

    public void setApplyQueryFilter(boolean applyQueryFilter) {
        this.applyQueryFilter = applyQueryFilter;
    }

    @Override
    public boolean applyQueryFilter() {
        return applyQueryFilter;
    }
}