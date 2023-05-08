Feature: U002_TechproEducation_Testi
  @gr1
  Scenario: TC01_TechProEducation_Sayfasi_Testi
    Given kullanici_techpro_sayfasina_gider
    And arama_kutusunda_QA_aratir
    And sayfa_basliğinin_qa_icerdigini_test_eder
    And sayfayi_kapatir