Feature: je rempli le formulaire
  Etant qu utilisateur je souhaite remplir le formulaire  afin de m enregistrer

  @Registre_T
  Scenario Outline: Remplir le formulaire registre
    Given je me connecte sur l application Mercury
    When je click sur le button registre
    When je saisi le First Name  "<firstname>"
    When je saisi le Last Name  "<lastname>"
    And je saisi le Phone  "<phone>"
    And je saisi le Email  "<email>"
    And je saisi l Address "<adresse>"
    And je saisi la City  "<city>"
    And je saisi le State/Province "<state>"
    And je saisi le Postal Code "<code>"
    And je choisie le Country "<country>"
    And je saisi le User Name "<username>"
    And je saisi le Password "<password>"
    And je saisi le Confirm Password "<password>"
    And je clique sur le boutton Envoyer
    Then je me rederige vers la pagee de Registre avec succee "<message>"

    Examples: 
      | firstname | lastname | phone    | email                    | adresse           | city   | state | code | country | username   | password         | message                             |
      | oussama   | guebli   | 50569523 | oussama.guebli@gmail.com | 10 rue el sarouel | tunis  | tunis | 2045 | tunisia | oussama123 | OussamaGuebli123 | Note: Your user name is oussama123. |
      | ouss      | gu       | 56321152 | ou.gueb@gmail.com        | 20 rue laouina    | ariana | tunis | 3000 | canada  | ouss456    | oussgu456        | Note: Your user name is ouss456.    |
