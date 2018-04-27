package com.noser.licensing.service

import com.noser.licensing.model.License
import org.springframework.stereotype.Service
import java.util.*


@Service
class LicenseService {

    fun getLicense(licenseId : String) =
            License(licenseId, UUID.randomUUID().toString(), "Test Product Name", "PerSeat")

    fun saveLicense(license : License) {

    }

    fun updateLicense(license : License) {

    }

    fun deleteLicense(license : License) {

    }
}