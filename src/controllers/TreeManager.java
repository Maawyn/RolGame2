package controllers;

import tree.BinaryTree;
import entities.Node;

public class TreeManager {
		
	public BinaryTree generateBinaryTree(){
		String name = "Babah";
		BinaryTree BTree = new BinaryTree();
		
		BTree.addRoot(new Node(name + " era la maga m�s reconocida y m�s poderosa del reino. Y hac�a ya un tiempo, que los habitantes del valle del Agua Clara"
				+ " estaban siendo afectado por unas tormentas bestiales. Por eso, le hab�an encargado derrotar al gran rey de la Tormenta, y ah� estaba ella,"
				+ " decidida a acabar con �l. Nuestra protagonista " + name + " estaba en un acantilado, a lo lejos pod�a ver la tormenta."
						+ " Entonces " + name + " decidi� atravesar las nubes hacia la tormenta.", 0, 1));
		
		BTree.addTo(1, new Node("1.Caminar",1 ,2));
		BTree.addTo(1, new Node("2.Pararse",1 ,3));
		
		BTree.addTo(2, new Node(name + " vi� que hab�a dos caminos hacia dos acantilados nuevos. Se dirigi� a la izquierda, hacia la tormenta.", 2, 4));
		BTree.addTo(2, new Node(name + " camin� hacia una neblina y se perdi� en ella durante mucho, mucho tiempo hasta que muri� por su avanzada edad."
				+ " Nunca m�s se supo de ella y el Rey atormentado sigui� atormentado la preciosa ciudad de Aguas Claras.", 2, 5)); //FIN
		BTree.addTo(3, new Node("Nuestra hero�na a�n sabiendo que tenia que ir hacia la tormenta decidi� pararse a tomar un cucurucho de helado en un apacible"
				+ " puesto de comerciantes de las nubes. Despu�s de ello decidi� retomar la aventura y andar hacia la tormenta.", 2, 6));
		BTree.addTo(3, new Node(name + " a�n sabiendo que tenia que ir hacia la tormenta decidi� quedarse quieta, pero la roca en la que se encontraba"
				+ " empez� a temblar y se desplom� la zona en la que se encontraba precipitandose al vacio, acto seguido fue aplastada por las rocas"
				+ " y muri�. Nunca m�s se supo de nuetra hero�na en Aguas Claras.", 2, 7));

		BTree.addTo(4, new Node("1.Izquierda (-5 Man�)", 3, 8));
		BTree.addTo(4, new Node("2.Derecha (-5 Man�)", 3, 9));
		BTree.addTo(6, new Node("1.Tormenta", 3, 12));
		BTree.addTo(6, new Node("2.Pararse", 3, 13));
		
		BTree.addTo(8, new Node("Nuestra hero�na decidida a llegar a la tormenta, alcanz� el acantilado. Desde ah�, divis� una estructura misteriosa"
				+ " a lo lejos. Sin embargo, decidi� seguir hacia la tormenta.", 4, 16));
		BTree.addTo(8, new Node("Nuestra hero�na, decidida a llegar a la tormenta, corri� hacia ella. Pero en su carrera acab� cayendo estrepitosamente"
				+ " y perdiendo la orientaci�n (-50 Vida). A�n as� decidi� volver a recuperarse.", 4, 17));
		BTree.addTo(9, new Node("A�n sabiendo que ten�a que dirigirse a la izquierda, decidi� tomar el camino de la derecha y acercarse a los Goblins de"
				+ " las nubes que ten�an muy mala pinta.", 4, 18));
		BTree.addTo(9, new Node("A�n sabiendo que ten�a que dirigirse a la izquierda, decidi� tomar el camino de la derecha hacia un acantilado nuevo. Pero"
				+ " antes de llegar apareci� un Coloso Llor�n. " + name +" decidi� enfrentarse a �l.", 4, 19));
		BTree.addTo(12, new Node(name + " retom� su marcha hac�a la tormenta pero al llegar se encontr� que el Rey atormentado hab�a dejado de atormentar"
				+ " a los ciudadanos de Aguas Claras debido a que era un berrinche momentaneo un poco exagerado. As� concluye la aventura de "+ name +".", 4, 24));
		BTree.addTo(12, new Node("Cuando " + name + " estaba tomandose un respiro, un canibal hambriendo le golpe� la cabeza dejandola inconsciente y"
				+ " posteriormente se comi� las partes m�s jugosas de su cuerpo. (Esto no habr�a pasado si hubiese seguido la narrativa)", 4, 25)); //FIN
		BTree.addTo(13, new Node(name + " volvi� a tomar un descanso y admirar las preciosas vistas desde el acantilado, sin adentrarse a�n en la"
				+ " espesura de las nubes. Pero record� su misi�n y decidi� emprender la aventura sin m�s dilaci�n.", 4, 26));
		BTree.addTo(13, new Node(name + " record� que ten�a que volver a completar su misi�n y no pod�a perder m�s tiempo admirando las vistas."
				+ " Entonces nuestra protragonista prosigio con la historia narrativa dise�ada para ella y se dirigi� hacia la tormenta.", 4, 27));
		
		BTree.addTo(16, new Node("1.Tormenta", 5, 32));
		BTree.addTo(16, new Node("2.Estructura misteriosa", 5, 33));
		BTree.addTo(17, new Node("1.Volver", 5, 34));
		BTree.addTo(17, new Node("2.Seguir", 5, 35));
		BTree.addTo(18, new Node("1.Acercarse", 5, 36));
		BTree.addTo(18, new Node("2.Huir", 5, 37));
		BTree.addTo(19, new Node("1.Enfretarse", 5, 38));
		BTree.addTo(19, new Node("2.Huir", 5, 39));
		BTree.addTo(26, new Node("1.Moverse", 5, 52));
		BTree.addTo(26, new Node("2.Pararse", 5, 53));
		BTree.addTo(27, new Node("1.Tormenta", 5, 54));
		BTree.addTo(27, new Node("2.Pararse", 5, 55));
		
		BTree.addTo(32, new Node(name + " se encontr� con el gran Rey atormentado de la Tormenta Tormentosa y le atac� por detr�s.", 6, 64));
		BTree.addTo(32, new Node(name + " se perdi� en la neblina. A lo lejos vi� unos acantilados con un pueblo contruido encima y se dirigi�"
				+ " en busca de referencias.", 6, 65));
		BTree.addTo(33, new Node("Aunque se lo pens� un poco mejor, y decidi� ir hacia la estrucutura misteriosa, que result� ser un submarino de papel en"
				+ " ruinas. Entonces " + name + " entr�.", 6, 66));
		BTree.addTo(33, new Node("Mientras se dirig�a, hacia lo que result� ser un submarino de papel, pis� al �ltimo rat�n-nube, extinguiendo as� una"
				+ " de las razas m�s antig�as de Aguas Claras. Fue repudiada por todos. Se exili� viviendo como una p�ria el resto de su vida.", 6, 67)); //FIN
		BTree.addTo(34, new Node(name +" volvi� a Aguas Claras para comprar pociones de curaci�n para sanarse.", 6, 68));
		BTree.addTo(34, new Node(name +" al volver, se perdi� por uno de los muchos caminos. Muriendo herida, sin ninguna ayuda, entre las nubes.", 6, 69)); //FIN
		BTree.addTo(35, new Node("A�n herida, nuestra protagonista retom� su camino dejando un rastro de su propia sangre a su paso. Decidi� que lo mejor"
				+ " era acabar en el menor tiempo posible con esto.", 6, 70));
		BTree.addTo(35, new Node("A�n herida, nuestra protagonista retom� su camino dejando un rastro de su propia sangre a su paso. Esto alert� a unos"
				+ " monstruos nube que la siguieron hasta atacarla por detr�s y acabar con su vida.", 6, 71)); //FIN
		BTree.addTo(36, new Node(" 'Las apariencias enga�an' los Goblins de las Nubes resultaron ser amigablames y le dieron a " + name + " una poci�n"
				+ " sin pedir nada a cambio. Nuestra protagonista se la tom�.", 6, 72));
		BTree.addTo(36, new Node(name + " al acercarse, fue herida, por una flecha envenenada. Los Goblins de las Nubes la saltaron encima y la apalearon"
				+ " hasta su muerte.", 6, 73)); //FIN
		BTree.addTo(37, new Node("Al huir, los Goblins de las Nubes se amontonaron persiguiendo a la protagonista, haciendo que la nube que les soportaba"
				+ " se rompiese. La protagonista y los Goblins cayeron al vac�o.", 6, 74));//FIN
		BTree.addTo(37, new Node("Al huir, un cham�n Goblin le lanz� a " + name + " un hechizo que cre� una gemela malvada de nuestra protagonista, la cual"
				+ " lanz� sobre " + name + " un rayo de sombras. Acabando con la luz que habitaba en su coraz�n, perdi� su magia y cay� de las nubes.", 6, 75));//FIN
		BTree.addTo(38, new Node(name + "atac� al Coloso Llor�n con un rayo de luz desmot�ndolo en piezas que se esparcieron por el suelo. En el medio de los"
				+ " escombros encontr� el Coraz�n de Tormenta del Coloso Llor�n. Lo cogi� y se lo llev� al Rey atormentado de la Tormenta Tormentosa", 6, 76));
		BTree.addTo(38, new Node("Antes de que "+ name +" atacara, el Coloso Llor�n grit� '��Papi!!' entre llantos. Su padre, el Rey atormentado de la"
				+ " Tormenta Tormentosa lleg� para salvar a su hijo de " + name +". Le lanz� un rayo el�ctrico y nuestra protagonista muri�.", 6, 77)); //FIN
		BTree.addTo(39, new Node(name + " intent� huir sin �xito, el Coloso Llor�n la aplast� con su pu�o de roca nubosa. El Coloso fue feliz, hab�a disfrutado"
				+ " de su juguete.", 6, 78));//FIN
		BTree.addTo(39, new Node(name + " intent� huir pero el Coloso Llor�n le lanz� una lluvia torrencial que le di� de lleno. Al estar empapada, "  + name 
				+ " pesaba demasiado para su propia magia, y cay� al vac�o sin remedio.", 6, 79));//FIN
		BTree.addTo(52, new Node("Al quedarse mucho tiempo parada, se hizo de noche sabiendo que no podr�a avanzar durante la noche lanz� un rayo de luz"
				+ " a la lejan�a para ver su camino y sin quererlo le golpe� al Rey atormentado de la Tormenta Tormentosa derrotando as� al enemigo sin avanzar"
				+ " en la elaborada y refinada histor�a narrativa de nuestra protagonista. Fue recordada por su haza�a y su heroicidad y se brinda"
				+ " el d�a del vago de Aguas Claras en su nombre.", 6, 104)); //FIN
		BTree.addTo(52, new Node("Al estar tanto tiempo quieta "+ name + " se le habian dormido las piernas y cuando intent� moverse, torpemente se le"
				+ " cruzar�n las piernas y cay� entre el acantilado y las nubes, precipitandose al vacio.", 6, 105));
		BTree.addTo(53, new Node("Contra todo pronostico " + name + " realmente le hab�an gustado las flores elaboradas por la imaginaci�n del jugador"
				+ " y decidi� pararse a contemplarlas un poco m�s, despu�s de inmediato y sin ninguna pausa m�s, decidi� que tenia que proseguir su"
				+ " aventura.", 6, 106));
		BTree.addTo(53, new Node(name + " no se di� cuenta de que el tiempo pasaba a su alrededor y Aguas Claras ya habia sufrido una inundaci�n, adem�s"
				+ " el Rey atormentado hab�a muerto antes de poder enfrentarse a ella. Nuestra protagonista ya no ten�a objetivo y decidi� exiliarse.", 6, 107));
		BTree.addTo(54, new Node("El sol la sonre�a, el horizonte estaba despejado... menos la tormenta. " + name + " camin� con paso animado mientras pensaba"
				+ " en lo famosa que se volver�a... se bebi� la poci�n y result� ser una p�cima... un momento, oh dios m�o no, creo que he confundido las"
				+ " historias... �Qu� te parece si empezamos de nuevo? S�, creo que va a ser lo mejor.", 6, 108));
		BTree.addTo(54, new Node(name + "camin� por las nubes. Pero le sucedi� un infortunio. Frente a ella, se encontraban los dos seres m�s temidos -despu�s"
				+ " del Rey atormentado de la Tormenta Tormentosa- de las nubes. El Coloso Llor�n a lomos del rat�n-nube. " + name + " se qued� tan estupefacta"
				+ " con la escena, que no tuvo tiempo a reaccionar cuando el Coloso Llor�n la agarr� con una mano y la llev� a las fauces del rat�n-nube."
				+ " Este la arranc� la yugular de un mordisco y " + name + " muri�", 6, 109)); //Logro fuente de sangre.
		BTree.addTo(55, new Node("Viendo que " + name + " no hacia esfuerzo por salvar Aguas Claras, el narrador decidi� sustuir a " + name + " por Boby."
				+ " Que mat� al Rey atormentado salvando Aguas Claras y convirtiendose en un heroe reconocido por todos. Deber�as tomar nota de ello para"
				+ " la pr�xima.", 6, 110));
		BTree.addTo(55, new Node("Viendo que " + name + " no hacia esfuerzo por salvar Aguas Claras, el narrador decidi� sustuir a " + name + " por Boby."
				+ " Que muri� nada m�s enfrentarse al Rey atormentado pero al menos se movi�. Deber�as tomar nota de ello para la pr�xima.", 6, 111));
		
		BTree.addTo(64, new Node("1.Atacar", 7, 128));
		BTree.addTo(64, new Node("2.Gritar", 7, 129));
		BTree.addTo(65, new Node("1.Pueblo", 7, 130));
		BTree.addTo(65, new Node("2.Niebla", 7, 131));
		BTree.addTo(66, new Node("1.Entrar", 7, 132));
		BTree.addTo(66, new Node("2.Inspeccionar", 7, 133));
		BTree.addTo(68, new Node("1.Comprar", 7, 136));
		BTree.addTo(68, new Node("2.Descansar", 7, 137));
		BTree.addTo(70, new Node("1.Ir a la tormenta", 7, 140));
		BTree.addTo(70, new Node("2.Descansar", 7, 141));
		BTree.addTo(72, new Node("1.Tomar", 7, 144));
		BTree.addTo(72, new Node("2.Rechazar", 7, 145));
		BTree.addTo(76, new Node("1.Mostrar el coraz�n", 7, 152));
		BTree.addTo(76, new Node("2.Romper el coraz�n", 7, 153));
		BTree.addTo(106, new Node("1.Proseguir", 7, 212));
		BTree.addTo(106, new Node("2.Pararse", 7, 213));
		
		BTree.addTo(128, new Node("Le lanza un rayo de luz que desintegra al rey, acabando con el problema. Y al fin se despej� el cielo de Aguas Claras."
				+ " Y se celebr� una fiesta en su honor, " + name + " fue la hero�na m�s recordada de la historia de Aguas Claras", 8, 256));
		BTree.addTo(128, new Node("Le lanza un rayo de luz que desintegra al rey, acabando con el problema. Pero, al despejarse el cielo de Aguas Claras,"
				+ " nuestra hero�na cay� debido a que en la nube en la que se encontraba se evapor� junto al rey ca�do. Nunca m�s se supo de " + name + " en"
				+ " Aguas Claras. Aunque ser� recordada como la hero�na que despej� los cielos.", 8, 257));
		BTree.addTo(129, new Node(name + " alarm� al Rey atormentado de la Tormenta Tormentosa y este le lanz� un rayo que ella consigui� esquivar. Cay�"
				+ " fuera de la nube, en Aguas Claras, quedando completamente incosciente. El rey, ya no tuvo ning�n adversario que pudiera hacerle frente"
				+ " por lo que sigui� atormentando Aguas Claras por mucho tiempo.", 8, 258));
		BTree.addTo(129, new Node(name + " alarm� al Rey atormentado de la Tormenta Tormentosa y este le lanz� un rayo que la alcanz� desintegrandola en el"
				+ " acto.", 8, 259));
		BTree.addTo(130, new Node(name + " lleg� al pueblo, y nada m�s llegar se dio cuenta de que esa gente eran can�bales. Lanz� todo su poder, cre� una"
				+ " nova de luz acabando con todo ser vivo en el pueblo. Y se desmay� de tanto poder liberado. Aguas Claras nunca volvi� a tener noticias"
				+ " sobre ella.", 8, 260));
		BTree.addTo(130, new Node(name + " lleg� al pueblo, y nada m�s llegar se dio cuenta de que esa gente eran can�bales. Para su sorpresa, dos hombres"
				+ " se acercaron por su espalda apres�ndola. Esa noche hubo un gran banquete con nuestra querida " + name + ".", 8, 261));
		BTree.addTo(131, new Node("Pero antes, decidi� dar una vuelta m�s por la niebla, donde acab� perdi�ndose para siempre. Aguas Claras nunca volvi�"
				+ " a saber de ella.", 8, 262));
		BTree.addTo(131, new Node("Pero antes, decidi� dar una vuelta m�s por la niebla, para su desgracia el rey la hab�a visto y le lanz� un rayo que la"
				+ " desintegr� en el acto. Aguas Claras nunca volvi� a saber de ella.", 8, 263));
		BTree.addTo(132, new Node("Encontr� la corona del Rey atormentado de la Tormenta Tormentosa y se la devolvi� a su leg�timo due�o, acabando con el"
				+ " problema. Aguas Claras recuper� sus cielos despejados gracias a nuestra querida " + name + ".", 8, 264));
		BTree.addTo(132, new Node("Encontr� la corona del Rey atormentado de la Tormenta Tormentosa, entonces se la qued� y a partir de ese momento"
				+ " se la conoci� como la Reina de la Tormenta Tormentosa, controlando con ella los cielos pero el poder la ceg� y olvid� su verdadero objetivo,"
				+ " dejando a Aguas Claras a merced del Rey sin corona de la tormenta Tormentosa.", 8, 265));
		BTree.addTo(133, new Node("Nuestra protagonista, se da cuenta de que es un submarino de papel. No existen submarinos de papel en la vida real."
				+ " " +name+ " se depierta. Todo fue un sue�o.", 8, 266));
		BTree.addTo(133, new Node(name + " se acerco al submarino pero el miedo a su interior la paraliz� causandola una fobia que la mantuvo mucho tiempo"
				+ " alejada de los cielos. As� el Rey de la tormenta Tormentosa sigui� atormentando a Aguas Claras por mucho tiempo.", 8, 267));
		BTree.addTo(136, new Node(name + " cuando alcanz� a ver Aguas Claras ya no existia nadie all�, un gran rayo cay� sobre la poblaci�n dejando"
				+ " la ciudad en cenizas. Ya quedaba nadie a quien salvar. Nuestra protagonista se sinti� derrotada.", 8, 272));
		BTree.addTo(136, new Node(name + " lleg� a Aguas Claras y pidi� una poci�n de vida al comerciante, este le estaf� debido a que sabia quien era"
				+ " y solo le interesaba su negocio, nuestra protagonista no pudo retomar su viaje por problemas econ�micos.", 8, 273));
		BTree.addTo(137, new Node("Nuestra protagonista, descanso esa noche en Aguas Claras, al despertar el cielo estaba despejado y habia una fiesta en"
				+ " nombre de otro Heroe, que consigui� derrotar al Rey atormentado de la Tormenta Tormentosa, aqu� acabar�n las haza�as de "+ name, 8, 274));
		BTree.addTo(137, new Node("Nuestra protagonista, no pudo recuperarse de las heridas a pesar de la ayuda de los curanderos de Aguas Claras y acab�"
				+ " muriendo d�as despu�s de llegar. Nadie pudo hacer frente al Rey atormentado de la Tormenta Tormentosa.", 8, 275));
		BTree.addTo(140, new Node(name + "lleg� a la tormenta, el Rey atormentado de la Tormenta Tormentosa la vio. �l le lanz� el rayo el�ctrico y ella su"
				+ " ataque de luz. Los dos alcanzaron su blanco mortalmente.", 8, 280));
		BTree.addTo(140, new Node(name + "lleg� a la tormenta, el Rey atormentado de la Tormenta Tormentosa la vio y le lanz� un rayo, que " + name + " no"
				+ " pudo esquivar muriendo en el acto.", 8, 281));
		BTree.addTo(141, new Node(name + " descans� en medio de las nubes. Mientras dorm�a otro h�roe se adelant� y acab� con la vida del Rey atormentado"
				+ " de la Tormenta Tormentosa liberando la ciudad de su cruel tiran�a.", 8, 282));
		BTree.addTo(141, new Node(name + " descans� en medio de las nubes. Mientras dorm�a un rat�n-nube se acerc� hambriento y se avalanz� sobre su yugular"
				+ " acabando con su vida entre terribles sufrimientos.", 8, 283));
		BTree.addTo(144, new Node(name + " se bebi� la poci�n y result� ser una p�cima alucin�gena que le hizo olvidar su objetivo. Qued�ndose con los"
				+ " Goblins de las Nubes toda su vida.", 8, 288));
		BTree.addTo(144, new Node(name + " se bebi� la poci�n y result� ser una p�cima de veneno. En realidad, los Goblins de las Nubes eran malos y hab�an"
				+ " enga�ado a " + name + ".", 8, 289));
		BTree.addTo(145, new Node(name + " rechaz� la poci�n cortesmente y al darse la vuelta los Goblins de las Nubes, saltaron sobre ella para encadenarla."
				+ "Preferi� la muerte a ser esclava. Pero nadie pudo complacer su deseo.", 8, 290));
		BTree.addTo(145, new Node(name + " rechaz� la poci�n cortesmente. Los Goblins se sintienro muy ofendidos y al darse la vuelta ella, la molieron a palos. Nunca"
				+ " m�s se supo de ella en Aguas Claras.", 8, 291));
		BTree.addTo(152, new Node(name + " una vez le muestra el coraz�n al Rey atormentado de la Tormenta Tormentosa, est� horririzado de ver que han matado a"
				+ " su �nico hijo no tiene fuerzas para seguir viviendo, entonces se precipita lanzadose de la nube en la que se encontraba hacia el vacio."
				+ " Nuestra protagonista fue y sigue siendo recordada como una heroina durante muchos a�os, salvando Aguas Claras del terrible Rey atormentado.", 8, 304));
		BTree.addTo(152, new Node(name + " una vez le muestra el coraz�n al Rey atormentado de la Tormenta Tormentosa, est� con odio le lanza el m�s grande"
				+ " y poderoso rayo que pod�a lanzar, destruyendo a nuestra protagonista y a todo lo que se encontraba a su paso, incluido Aguas Claras."
				+ " El rey atormentado habia hecho desaparecer esa peque�a ciudad de un solo golpe.", 8, 305));
		BTree.addTo(153, new Node(name + " delante del Rey atormentado de la Tormenta Tormentosa, rompi� el coraz�n de su hijo postumo haciendo mella en el"
				+ " coraz�n del rey, provocandole un pavor irracional el cual, el rey no pudo soportar y huyo del lugar.", 8, 306));
		BTree.addTo(153, new Node("Nuestra protagonista delante del Rey atormentado de la Tormenta Tormentosa, rompi� el coraz�n de su hijo postumo lo que enoj� al rey"
				+ " tanto que est� le lanz� un rayo de odio infinito que desintegro a "+ name + ".", 8, 307));
		BTree.addTo(213, new Node(name + " era realmente vaga, y sin darse cuenta, al volver a pararse y contemplar todo su alrededor, empezar�n"
				+ " a desaparecer los monstruos, posteriormente la tormenta y lo �ltimo el suelo a su alrededor dejandola unicamente a ella"
				+ " como el �nico elemento de la trama narrativa. Entonces nunca m�s pud� moverse de ese lugar.", 8, 426));
		BTree.addTo(213, new Node("ERROR: �NO TE DAS CUENTA QUE EL JUEGO NECESITA AVANZAR?, �POR QU� HACES ESTO?, NO TIENES SENSIBILIDAD NINGUNA"
				+ " SE ACABO. NO JUEGUES M�S. --Cerrando aplicaci�n...--", 8, 427));
		
		return BTree;
	}
}
