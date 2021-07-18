#Realizar una busqueda y verificar listado
#Abrir un producto y agregarlo a favoritos y verificar que se agrego
#Ir a un producto y darle comprar y verificar pagina opciones de compra
@Meli
Feature: Mercadolibre Product Search
    As a user
    I Want to search something
    To see the available products options to buy

Background: User is in the MercadoLibre home page
    Given the user is in the homepage

Scenario: Successfully product search from the search bar
    When the user enters a search criteria in the search bar
    And submits the search
    Then the user sees the products matching the search criteria

# Scenario: Autocomplete suggestions in the search bar
#     When the user enters some text in the search bar
#     Then the user sees matching suggestions

# #Algo de negative testing
# Scenario: Search with no matching results
#     When the user enters search criteria with no results in the search bar
#     And submits the search
#     Then the user sees no results and a proper message
#         """
#         No hay publicaciones que coincidan con tu búsqueda.
#         """
