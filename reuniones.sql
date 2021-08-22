-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-08-2021 a las 04:59:22
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.9

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
(1, '32', 'd MMM y', 'jTextField1323', 'jTextField1232', 'comboBoxChanged', '232'),
(2, 'misas¿', 'd MMM y', '6:00 pm', '6:00 pm', 'comboBoxChanged', 'hjhjkju uyhkuy uibgyig'),
(3, 'tu maldita creta', 'd MMM y', '6:25 am', '7:25 am', 'comboBoxChanged', 'yo soy un roco');

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
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
