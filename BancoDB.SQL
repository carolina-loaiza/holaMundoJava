--TABLA CUSTOMERS
CREATE TABLE [dbo].[TBL_CLIENTES]
(
	[CEDULA] int NOT NULL PRIMARY KEY,
    [NOMBRE] NVARCHAR(50) NOT NULL, 
    [APELLIDO] NVARCHAR(50) NOT NULL, 
    [EDAD] int NOT NULL,
    [FECHA_NACIMIENTO] NVARCHAR(50) NOT NULL, 
    [ESTADO_CIVIL] NVARCHAR(50) NOT NULL, 
    [GENERO] NVARCHAR(50) NOT NULL,
)

--INSERT EN  CUSTOMERS
CREATE PROCEDURE [dbo].[CRE_CLIENTES_PR]
  @P_CEDULA int,
	@P_NOMBRE NVARCHAR(50),
	@P_APELLIDO NVARCHAR(50),
	@P_EDAD int,
	@P_FECHA_NACIMIENTO NVARCHAR(50),
  @P_ESTADO_CIVIL NVARCHAR(50),
  @P_GENERO NVARCHAR(50)
AS
	INSERT INTO [dbo].[TBL_CLIENTES] VALUES(@P_CEDULA,@P_NOMBRE,@P_APELLIDO,@P_EDAD,@P_FECHA_NACIMIENTO,@P_ESTADO_CIVIL,@P_GENERO);
GO;

--RETRIEVE ALL CUSTOMER
CREATE PROCEDURE [dbo].[RET_ALL_CLIENTES_PR]
AS
	SELECT CEDULA, NOMBRE, APELLIDO, EDAD FROM TBL_CLIENTES;
RETURN 0

