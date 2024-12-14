Feature: Inscription
  En tant que utilisateur je souhaite m inscrire au site Mercury

  @inscription
  Scenario: s inscrire au site Mercury
    Given je me connecte sur l application Mercury
    When je click sur le button registre
    And je saisi le First Name  "oussama"
    And je saisi le Last Name  "guebli"
    And je saisi le Phone  "56080010"
    And je saisi le Email  "oussama.guebli@gmail.com"
    And je saisi l Address "10 rue el sarouel"
    And je saisi la City  "tunis"
    And je saisi le State/Province "tunis"
    And je saisi le Postal Code "2045"
    And je choisie le Country "tunisia"
    And je saisi le User Name "oussama123"
    And je saisi le Password "OussamaGuebli123"
    And je saisi le Confirm Password "OussamaGuebli123"
    And je clique sur le boutton Envoyer
    Then je me rederige vers la pagee de Registre avec succee "Note: Your user name is oussama123."
