Feature: Homework test

  Scenario Outline: Parametrized test for jokes
    Given put basic <URI> URI
    When get jokes by <path> and <categoria>
    Then compare request

    Examples:
      | path          | categoria | URI                         |
      | jokes/random/ | animal    | https://api.chucknorris.io/ |
      | jokes/random/ | career    | https://api.chucknorris.io/ |
      | jokes/random/ | food      | https://api.chucknorris.io/ |
      | jokes/random/ | movie     | https://api.chucknorris.io/ |
      | jokes/random/ | travel    | https://api.chucknorris.io/ |