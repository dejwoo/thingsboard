/**
 * Copyright © 2016-2017 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.common.data.alarm;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;
import org.thingsboard.server.common.data.BaseData;
import org.thingsboard.server.common.data.id.EntityId;

/**
 * Created by ashvayka on 11.05.17.
 */
@Data
public class Alarm extends BaseData<AlarmId> {

    private long startTs;
    private long endTs;
    private long ackTs;
    private long clearTs;
    private String type;
    private EntityId originator;
    private AlarmSeverity severity;
    private AlarmStatus status;
    private JsonNode details;
    private boolean propagate;

}
