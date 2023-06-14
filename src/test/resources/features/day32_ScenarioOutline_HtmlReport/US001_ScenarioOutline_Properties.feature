Feature: US001_Google_Search
  Background: Kullanici_Google_Anasayfasina_Gider
    Given kullanici_"googleUrl"_sayfasina_gider
  Scenario Outline: Google_Aramalari
    * kullanici googleda "<aranacakKelime>" aratir
    * basligin "<aranacakKelime>" icerdigini dogrular
    * sayfayi_kapatir
    Examples:
      | aranacakKelime |
      | volvo |
      | bmw |
      | mercedes |
      | audi |
      | ford |