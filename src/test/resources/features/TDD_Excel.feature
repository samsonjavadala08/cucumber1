Feature: Pulling date from excels


 @pExcel
  Scenario: Reading date from excel using Map
  
  When I read excel data
  
  @pdatatable
  Scenario: Using datatable
  
  When i read below date in datatable
    |name|Subject|Marks|
    |samson|English|45|
    |ravi|Science|57| 