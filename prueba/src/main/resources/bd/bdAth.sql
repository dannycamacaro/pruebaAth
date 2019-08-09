
DROP DATABASE IF EXISTS `bdath`;
CREATE DATABASE bdath;


--

CREATE TABLE `person` (
  `id` bigint(20) NOT NULL,
  `age` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `phone_number` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `person`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;


INSERT INTO `person` (`email`, `last_name`, `name`, `age`, `phone_number`) VALUES
('francisco@gmail.com', 'riah', 'Francisco', 45, 456456445);

INSERT INTO `person` (`email`, `last_name`, `name`, `age`, `phone_number`) VALUES
('alan@gmail.com', 'riah', 'alan', 25, 3146563252);
