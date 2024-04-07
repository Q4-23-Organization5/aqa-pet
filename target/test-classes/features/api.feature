Feature: Homework test

  Scenario Outline: Parametrized test for jokes
    Given put basic <URI> URI
    When get jokes by <path> and <categoria>
    Then compare request

    Examples:
    | URI                         | path          | categoria |
    | https://api.chucknorris.io/ | jokes/random/ | animal    |
    | https://api.chucknorris.io/ | jokes/random/ | career    |
    | https://api.chucknorris.io/ | jokes/random/ | food      |
    | https://api.chucknorris.io/ | jokes/random/ | movie     |
    | https://api.chucknorris.io/ | jokes/random/ | travel    |

  Scenario: Get all available categories
    Given Set basic "https://api.chucknorris.io/" URI
    When set request "jokes/categories" path
    Then compare available categories