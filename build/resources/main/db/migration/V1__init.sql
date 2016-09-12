CREATE TABLE Piece (
  Id VARCHAR(255) NOT NULL,
  Name VARCHAR(50) NOT NULL,
  CostPrice FLOAT(8) NOT NULL,
  SalePrice FLOAT(8) NOT NULL,
  Distributor VARCHAR(30),
  PRIMARY KEY (Id)
);

INSERT INTO Piece
    VALUES ('1', 'Cerradura Aluminio', 30.00, 75.00, 'Mapfre'), ('2', 'Cerradura Aluminio', 30.00, 75.00, 'Mapfre'),
           ('3', 'Cerradura Aluminio', 30.00, 75.00, 'Mapfre'), ('4', 'Cerradura Aluminio', 30.00, 75.00, 'Mapfre');