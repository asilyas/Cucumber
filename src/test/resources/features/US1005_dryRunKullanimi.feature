@wip
Feature: US1005 kullanici amazonda urun aratip 2.urun detaylarini test eder

  @ss
  Scenario: TC09 Kullanici arama sonuclarinda istedigi urunu test edebilmeli

    Given kullanici "amazonUrl" anasayfaya gider
    When amazonda "Nutella" icin arama yapar
    And 5 saniye bekler
    And 2.urune gider
    Then urun isminin "Nutella" icerdigini test eder
    And sayfayi kapatir