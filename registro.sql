-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-04-2022 a las 22:12:35
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `registro`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reuniones`
--

CREATE TABLE `reuniones` (
  `Id` int(11) NOT NULL,
  `NombreE` varchar(30) NOT NULL,
  `Fecha` varchar(50) NOT NULL,
  `HoraInicio` varchar(15) NOT NULL,
  `HoraFinal` varchar(15) NOT NULL,
  `Lugar` varchar(15) NOT NULL,
  `Nota` varchar(70) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reuniones`
--

INSERT INTO `reuniones` (`Id`, `NombreE`, `Fecha`, `HoraInicio`, `HoraFinal`, `Lugar`, `Nota`) VALUES
(8, 'Reunion de negocios', '2022-04-23', '2:00 am', '3:00 am', 'MULTIUSO 8', 'llegar a tiempo por favor'),
(9, 'Mesa de reunion viernes', '2022-04-23', '3:00 am', '12:00 am', 'SELECIONAR', 'reunion el viernes');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `reuniones`
--
ALTER TABLE `reuniones`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `reuniones`
--
ALTER TABLE `reuniones`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
