#Author: Julian
Feature: Select products on the Exito platform
  I as a user access the page of success,
  I select the category of "cell phones and accessories" and I select the subcategory "Samsung"
  Then, 5 products are chosen at random.
  It is added to the shopping cart and the quantity of each product is chosen randomly

  @Scenario1
  Scenario: Select random products with random quantities
    Given Julian entered the exito platform
    When I enter the category of cell phones and accessories and choose the products
    Then the name is verified the total prices the quantities and the number of products