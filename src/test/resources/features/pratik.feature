Feature: 007 kullanici youtube a gider cesitli testler yapar
  
  Scenario: kullanici arama sonuclarından istedigini oynatıldıgını test eder
    Given kullanici "youtubeUrl" anasayfaya gider
    When youtube da arama kutusuna "AhmetBulutluoz" yazar
    And 3 saniye bekler
    Then ilk secenegi tiklayip cikan ilk videonun icerinde Ders yazisininin ciktigini test eder
    And sayfayi kapatir