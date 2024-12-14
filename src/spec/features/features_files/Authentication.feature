Feature: je verifie la page d authentification
  En tant que utilisateur je souhaite me connecter au site Mercury

  @connexion
  Scenario: je verifie la page d authentification
    Given je me connecte sur l application Mercury
    When je saisi le user name "test"
    And je saisi le password  "test"
    And je clique sur le boutton submit
    Then je me rederige vers la pagee home "Login Successfully"
