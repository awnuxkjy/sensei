/**
 * This software is licensed to you under the Apache License, Version 2.0 (the
 * "Apache License").
 *
 * LinkedIn's contributions are made under the Apache License. If you contribute
 * to the Software, the contributions will be deemed to have been made under the
 * Apache License, unless you expressly indicate otherwise. Please do not make any
 * contributions that would be inconsistent with the Apache License.
 *
 * You may obtain a copy of the Apache License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, this software
 * distributed under the Apache License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the Apache
 * License for the specific language governing permissions and limitations for the
 * software governed under the Apache License.
 *
 * © 2012 LinkedIn Corp. All Rights Reserved.  
 */

package com.senseidb.search.client.req.query;

import java.util.HashMap;
import java.util.Map;

import com.senseidb.search.client.json.CustomJsonHandler;
import com.senseidb.search.client.json.JsonField;
import org.json.JSONObject;

/**
 * User may supply his own implementation of the query
 * 
 */
@CustomJsonHandler(value = QueryJsonHandler.class)
public class CustomQuery extends Query {
    @JsonField("class")
    private String cls;
    @JsonField("constructor")
    private JSONObject constructor;
    private Map<String, String> params = new HashMap<String, String>();
    private double boost;

    public CustomQuery(String cls, JSONObject constructor, Map<String, String> params, double boost) {
        super();
        this.cls = cls;
        this.params = params;
        this.boost = boost;
        this.constructor = constructor;
    }

    public String getCls() {
        return cls;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public double getBoost() {
        return boost;
    }

    public JSONObject getConstructor() {
        return constructor;
    }

}
