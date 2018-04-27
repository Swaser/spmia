package com.noser.licensing.controller

import com.noser.licensing.model.License
import com.noser.licensing.service.LicenseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
class LicensingController
@Autowired constructor(private val licenseService : LicenseService) {

    @RequestMapping(value = ["/{licenseId}"], method = [RequestMethod.GET])
    fun getLicenses(@PathVariable("organizationId") organizationId : String,
                    @PathVariable("licenseId") licenseId : String) =
            License(licenseId, organizationId, "Teleco", "Seat")

    @RequestMapping(value = ["{licenseId}"], method = [RequestMethod.PUT])
    fun updateLicenses(@PathVariable("licenseId") licenseId : String) : String {
        return String.format("This is the put")
    }

    @RequestMapping(value = ["{licenseId}"], method = [RequestMethod.POST])
    fun saveLicenses(@PathVariable("licenseId") licenseId : String) : String {
        return String.format("This is the post")
    }

    @RequestMapping(value = ["{licenseId}"], method = [RequestMethod.DELETE])
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteLicenses(@PathVariable("licenseId") licenseId : String) : String {
        return String.format("This is the Delete")
    }
}