package com.v2ray.ang.core

import com.v2ray.ang.AppConfig
import com.v2ray.ang.dto.entities.RulesetItem

object LockedBypass {

    val PACKAGES: Set<String> = linkedSetOf(
        // Банки и платежи
        "ru.sberbankmobile", "com.idamob.tinkoff.android", "ru.vtb24.mobilebanking.android",
        "ru.alfabank.mobile.android", "ru.gazprombank.android.mobilebank.app",
        "ru.raiffeisen.mobile.new", "ru.nspk.mirpay",
        // Госуслуги
        "ru.rostel",
        // VK, Mail.ru, OK, Rutube, MAX
        "com.vkontakte.android", "ru.ok.android", "ru.mail.mailapp", "ru.mail.cloud",
        "ru.rutube.app", "ru.oneme.app",
        // Яндекс
        "ru.yandex.searchplugin", "com.yandex.browser", "ru.yandex.yandexmaps",
        "ru.yandex.yandexnavi", "ru.yandex.taxi", "ru.yandex.music", "ru.yandex.mail",
        "ru.yandex.disk", "ru.yandex.eda", "ru.beru.android", "ru.kinopoisk",
        // Маркетплейсы и сервисы
        "ru.ozon.app.android", "com.wildberries.ru", "com.avito.android", "ru.tander.magnit",
        "ru.instamart", "ru.dublgis.dgismobile", "ru.hh.android", "ru.cian.main",
        // Операторы
        "ru.mts.mymts", "ru.beeline.services", "ru.megafon.mlk", "ru.tele2.mytele2",
        // Тестовый блок
        "org.zwanoo.android.speedtest",
    )

    private val DOMAINS = arrayListOf(
        "geosite:category-ru", "domain:ru", "domain:su", "domain:xn--p1ai", // .рф
        "domain:vk.com", "domain:vk-cdn.net", "domain:userapi.com", "domain:mycdn.me",
        "domain:yandex.com", "domain:yandex.net", "domain:yastatic.net", "domain:sberbank.com",
    )

    private val IPS = arrayListOf("geoip:ru")

    fun rulesets(): List<RulesetItem> = listOf(
        RulesetItem(id = "locked-ru-domains", remarks = "Locked: Russia domains",
            domain = DOMAINS, outboundTag = AppConfig.TAG_DIRECT, enabled = true, locked = true),
        RulesetItem(id = "locked-ru-ip", remarks = "Locked: Russia IP",
            ip = IPS, outboundTag = AppConfig.TAG_DIRECT, enabled = true, locked = true),
    )
}