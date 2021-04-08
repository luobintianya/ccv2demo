/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.det.cx.occ.controllers.poc;

import de.hybris.platform.commercefacades.order.data.OrderData;
import de.hybris.platform.webservicescommons.swagger.ApiBaseSiteIdAndUserIdParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/{baseSiteId}/order/poc")
@Api(tags = "Order POC")
public class OrderPocController
{

    @Secured(
            { "ROLE_CUSTOMERGROUP", "ROLE_CUSTOMERMANAGERGROUP", "ROLE_TRUSTED_CLIENT" })
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    @ApiOperation(value = "POC for value.", notes = "for poc Order.")
    @ApiBaseSiteIdAndUserIdParam
    public String createOrderPoc(@ApiParam(value = "For POC Order Data Model", required = true)
                                     @RequestBody final OrderData orderData){





        return "SUCCESS";
    }
}
