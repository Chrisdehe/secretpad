/*
 * Copyright 2023 Ant Group Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.secretflow.secretpad.service.model.noderoute;

import org.secretflow.secretpad.service.constant.Constants;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;
import lombok.*;

/**
 * @author yutu
 * @date 2023/08/04
 */
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UpdateNodeRouterRequest {

    /**
     * routerId
     */
    @Schema(description = "routerId")
    private String routerId;

    /**
     * srcNetAddress
     */
    @Schema(description = "srcNetAddress")
    @Pattern(regexp = Constants.IP_PREFIX_REG, message = "needs to start with http or https")
    @Pattern(regexp = Constants.IP_PORT_PATTERN, message = "address not support rule")
    private String srcNetAddress;

    /**
     * dstNetAddress
     */
    @Schema(description = "dstNetAddress")
    @Pattern(regexp = Constants.IP_PREFIX_REG, message = "needs to start with http or https")
    @Pattern(regexp = Constants.IP_PORT_PATTERN, message = "address not support rule")
    private String dstNetAddress;
}