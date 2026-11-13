package com.v2ray.ang.core

import com.v2ray.ang.AppConfig
import com.v2ray.ang.dto.entities.RulesetItem

object LockedBypass {

    val PACKAGES: Set<String> = linkedSetOf(

    // =========================
    // Банки и платежи
    // =========================

    // Сбербанк
    "ru.sberbankmobile",
    "ru.sberbank.investor",
    "ru.sberbank_sbbol",
    "ru.sberbank.spasibo",

    // Т-Банк
    "com.idamob.tinkoff.android",
    "ru.tinkoff.investing",

    // ВТБ
    "ru.vtb24.mobilebanking.android",
    "ru.vtb.invest",
    "ru.multibonus.program",

    // Альфа-Банк
    "ru.alfabank.mobile.android",
    "ru.alfadirect.app",

    // Другие банки
    "ru.gazprombank.android.mobilebank.app",
    "ru.raiffeisen.mobile.new",
    "logo.com.mbanking",
    "ru.ozon.fintech.finance",
    "ru.sovcomcard.halva.v1",
    "ru.rshb.dbo",
    "ru.mkb.mobile",
    "ru.akbars.mobile",
    "ru.bspb",

    // Платёжные и инвестиционные сервисы
    "ru.nspk.mirpay",
    "ru.nspk.sbpay",
    "ru.yoo.money",
    "ru.mts.money",
    "com.yandex.bank",
    "ru.broker.my",

    // =========================
    // Государственные сервисы
    // =========================

    "ru.rostel",
    "ru.gosuslugi.auto",
    "ru.gosuslugi.goskey",
    "com.gnivts.selfemployed",
    "com.octopod.russianpost.client.android",
    "ru.pochta.lkul",

    // =========================
    // VK, Mail.ru, OK, Rutube, MAX
    // =========================

    "com.vkontakte.android",
    "com.vk.vkvideo",
    "ru.vk.store",
    "com.uma.musicvk",
    "ru.ok.android",
    "ru.mail.mailapp",
    "ru.mail.cloud",
    "ru.rutube.app",
    "ru.oneme.app",

    // Другие медиа
    "ru.zen.android",
    "com.vgtrk.smotrim",
    "ru.litres.android",
    "free.zaycev.net",

    // =========================
    // Яндекс
    // =========================

    "ru.yandex.searchplugin",
    "com.yandex.browser",
    "ru.yandex.yandexmaps",
    "ru.yandex.yandexnavi",
    "ru.yandex.taxi",
    "ru.yandex.music",
    "ru.yandex.mail",
    "ru.yandex.disk",
    "ru.yandex.eda",
    "ru.beru.android",
    "ru.kinopoisk",

    // =========================
    // Маркетплейсы
    // =========================

    "ru.ozon.app.android",
    "com.wildberries.ru",
    "com.avito.android",
    "ru.megamarket.marketplace",

    // =========================
    // Магазины электроники и техники
    // =========================

    "ru.dns.shop.android",
    "ru.citilink",
    "ru.filit.mvideo.b2c",
    "ru.mvm.eldo",

    // =========================
    // Другие магазины
    // =========================

    "ru.bestprice.fixprice",
    "ru.sportmaster.app",
    "ru.detmir.dmbonus",
    "ru.letu",
    "ru.leroymerlin.mobile",
    "ru.handh.petrovich",
    "com.notissimus.allinstruments.android",

    // =========================
    // X5 Group и продуктовые сети
    // =========================

    "ru.pyaterochka.app.browser",
    "ru.perekrestok.app",
    "club.chizhik",
    "ru.x5.perekrestok.darkstore",

    // Другие продуктовые магазины
    "ru.tander.magnit",
    "ru.instamart",
    "ru.vkusvill",
    "com.icemobile.lenta.prod",
    "ru.myauchan.droid",

    // =========================
    // Доставка еды и продуктов
    // =========================

    "ru.sbcs.store",
    "ru.foodfox.client",
    "ru.dodopizza.app",

    // =========================
    // Доставка и логистика
    // =========================

    "com.logistic.sdek",
    "ru.boxberry.mobile",

    // =========================
    // Карты и транспорт
    // =========================

    "ru.dublgis.dgismobile",
    "ru.rzd.pass",
    "ru.aviasales",
    "ru.tutu.tutu_emp",
    "com.ivolk.StrelkaGPS",

    // =========================
    // Работа и недвижимость
    // =========================

    "ru.hh.android",
    "ru.cian.main",
    "ru.domclick.mortgage",

    // =========================
    // Операторы
    // =========================

    "ru.mts.mymts",
    "ru.beeline.services",
    "ru.megafon.mlk",
    "ru.tele2.mytele2",
    "ru.net.tritel.account",

    // Дополнительные сервисы операторов
    "ru.mts.mtstv",
    "ru.mts.music.android",
    "ru.rt.video.app.mobile",

    // =========================
    // Такси
    // =========================

    "com.taxsee.taxsee",
    "globus.tax.global",
    "com.solnce.taxi.client",

    // =========================
    // Иное
    // =========================

    "sputnik.axmor.com",
)


    private val DOMAINS = arrayListOf(
        "geosite:category-ru", "geosite:category-gov-ru", "geosite:yandex", "geosite:vk", "geosite:mailru", "geosite:ozon",
        "domain:ru", "domain:su", "domain:xn--p1ai", // .рф
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