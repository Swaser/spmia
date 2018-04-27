package com.noser.licensing.model

class License(val id : String,
              val organizationId : String,
              val productName : String,
              val licenseType : String) {

    fun withId(id : String) =
            License(id, organizationId, productName, licenseType)

    fun withOrganizationId(organizationId : String) =
            License(id, organizationId, productName, licenseType)

    fun withProductName(productName : String) =
            License(id, organizationId, productName, licenseType)

    fun withLicenseType(licenseType : String) =
            License(id, organizationId, productName, licenseType)
}