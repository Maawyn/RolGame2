package controllers;

import tree.BinaryTree;
import entities.Node;

public class TreeManager {
		
	public BinaryTree generateBinaryTree(){
		String name = "Babah";
		BinaryTree BTree = new BinaryTree();
		
		BTree.addRoot(new Node(name + " era la maga más reconocida y más poderosa del reino. Y hacía ya un tiempo, que los habitantes del valle del Agua Clara"
				+ " estaban siendo afectado por unas tormentas bestiales. Por eso, le habían encargado derrotar al gran rey de la Tormenta, y ahí estaba ella,"
				+ " decidida a acabar con él. Nuestra protagonista " + name + " estaba en un acantilado, a lo lejos podía ver la tormenta."
						+ " Entonces " + name + " decidió atravesar las nubes hacia la tormenta.", 0, 1));
		
		BTree.addTo(1, new Node("1.Caminar",1 ,2));
		BTree.addTo(1, new Node("2.Pararse",1 ,3));
		
		BTree.addTo(2, new Node(name + " vió que había dos caminos hacia dos acantilados nuevos. Se dirigió a la izquierda, hacia la tormenta.", 2, 4));
		BTree.addTo(2, new Node(name + " caminó hacia una neblina y se perdió en ella durante mucho, mucho tiempo hasta que murió por su avanzada edad."
				+ " Nunca más se supo de ella y el Rey atormentado siguió atormentado la preciosa ciudad de Aguas Claras.", 2, 5)); //FIN
		BTree.addTo(3, new Node("Nuestra heroína aún sabiendo que tenia que ir hacia la tormenta decidió pararse a tomar un cucurucho de helado en un apacible"
				+ " puesto de comerciantes de las nubes. Después de ello decidió retomar la aventura y andar hacia la tormenta.", 2, 6));
		BTree.addTo(3, new Node(name + " aún sabiendo que tenia que ir hacia la tormenta decidió quedarse quieta, pero la roca en la que se encontraba"
				+ " empezó a temblar y se desplomó la zona en la que se encontraba precipitandose al vacio, acto seguido fue aplastada por las rocas"
				+ " y murió. Nunca más se supo de nuetra heroína en Aguas Claras.", 2, 7));

		BTree.addTo(4, new Node("1.Izquierda (-5 Maná)", 3, 8));
		BTree.addTo(4, new Node("2.Derecha (-5 Maná)", 3, 9));
		BTree.addTo(6, new Node("1.Tormenta", 3, 12));
		BTree.addTo(6, new Node("2.Pararse", 3, 13));
		
		BTree.addTo(8, new Node("Nuestra heroína decidida a llegar a la tormenta, alcanzó el acantilado. Desde ahí, divisó una estructura misteriosa"
				+ " a lo lejos. Sin embargo, decidió seguir hacia la tormenta.", 4, 16));
		BTree.addTo(8, new Node("Nuestra heroína, decidida a llegar a la tormenta, corrió hacia ella. Pero en su carrera acabó cayendo estrepitosamente"
				+ " y perdiendo la orientación (-50 Vida). Aún así decidió volver a recuperarse.", 4, 17));
		BTree.addTo(9, new Node("Aún sabiendo que tenía que dirigirse a la izquierda, decidió tomar el camino de la derecha y acercarse a los Goblins de"
				+ " las nubes que tenían muy mala pinta.", 4, 18));
		BTree.addTo(9, new Node("Aún sabiendo que tenía que dirigirse a la izquierda, decidió tomar el camino de la derecha hacia un acantilado nuevo. Pero"
				+ " antes de llegar apareció un Coloso Llorón. " + name +" decidió enfrentarse a él.", 4, 19));
		BTree.addTo(12, new Node(name + " retomó su marcha hacía la tormenta pero al llegar se encontró que el Rey atormentado había dejado de atormentar"
				+ " a los ciudadanos de Aguas Claras debido a que era un berrinche momentaneo un poco exagerado. Así concluye la aventura de "+ name +".", 4, 24));
		BTree.addTo(12, new Node("Cuando " + name + " estaba tomandose un respiro, un canibal hambriendo le golpeó la cabeza dejandola inconsciente y"
				+ " posteriormente se comió las partes más jugosas de su cuerpo. (Esto no habría pasado si hubiese seguido la narrativa)", 4, 25)); //FIN
		BTree.addTo(13, new Node(name + " volvió a tomar un descanso y admirar las preciosas vistas desde el acantilado, sin adentrarse aún en la"
				+ " espesura de las nubes. Pero recordó su misión y decidió emprender la aventura sin más dilación.", 4, 26));
		BTree.addTo(13, new Node(name + " recordó que tenía que volver a completar su misión y no podía perder más tiempo admirando las vistas."
				+ " Entonces nuestra protragonista prosigio con la historia narrativa diseñada para ella y se dirigió hacia la tormenta.", 4, 27));
		
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
		
		BTree.addTo(32, new Node(name + " se encontró con el gran Rey atormentado de la Tormenta Tormentosa y le atacó por detrás.", 6, 64));
		BTree.addTo(32, new Node(name + " se perdió en la neblina. A lo lejos vió unos acantilados con un pueblo contruido encima y se dirigió"
				+ " en busca de referencias.", 6, 65));
		BTree.addTo(33, new Node("Aunque se lo pensó un poco mejor, y decidió ir hacia la estrucutura misteriosa, que resultó ser un submarino de papel en"
				+ " ruinas. Entonces " + name + " entró.", 6, 66));
		BTree.addTo(33, new Node("Mientras se dirigía, hacia lo que resultó ser un submarino de papel, pisó al último ratón-nube, extinguiendo así una"
				+ " de las razas más antigüas de Aguas Claras. Fue repudiada por todos. Se exilió viviendo como una pária el resto de su vida.", 6, 67)); //FIN
		BTree.addTo(34, new Node(name +" volvió a Aguas Claras para comprar pociones de curación para sanarse.", 6, 68));
		BTree.addTo(34, new Node(name +" al volver, se perdió por uno de los muchos caminos. Muriendo herida, sin ninguna ayuda, entre las nubes.", 6, 69)); //FIN
		BTree.addTo(35, new Node("Aún herida, nuestra protagonista retomó su camino dejando un rastro de su propia sangre a su paso. Decidió que lo mejor"
				+ " era acabar en el menor tiempo posible con esto.", 6, 70));
		BTree.addTo(35, new Node("Aún herida, nuestra protagonista retomó su camino dejando un rastro de su propia sangre a su paso. Esto alertó a unos"
				+ " monstruos nube que la siguieron hasta atacarla por detrás y acabar con su vida.", 6, 71)); //FIN
		BTree.addTo(36, new Node(" 'Las apariencias engañan' los Goblins de las Nubes resultaron ser amigablames y le dieron a " + name + " una poción"
				+ " sin pedir nada a cambio. Nuestra protagonista se la tomó.", 6, 72));
		BTree.addTo(36, new Node(name + " al acercarse, fue herida, por una flecha envenenada. Los Goblins de las Nubes la saltaron encima y la apalearon"
				+ " hasta su muerte.", 6, 73)); //FIN
		BTree.addTo(37, new Node("Al huir, los Goblins de las Nubes se amontonaron persiguiendo a la protagonista, haciendo que la nube que les soportaba"
				+ " se rompiese. La protagonista y los Goblins cayeron al vacío.", 6, 74));//FIN
		BTree.addTo(37, new Node("Al huir, un chamán Goblin le lanzó a " + name + " un hechizo que creó una gemela malvada de nuestra protagonista, la cual"
				+ " lanzó sobre " + name + " un rayo de sombras. Acabando con la luz que habitaba en su corazón, perdió su magia y cayó de las nubes.", 6, 75));//FIN
		BTree.addTo(38, new Node(name + "atacó al Coloso Llorón con un rayo de luz desmotándolo en piezas que se esparcieron por el suelo. En el medio de los"
				+ " escombros encontró el Corazón de Tormenta del Coloso Llorón. Lo cogió y se lo llevó al Rey atormentado de la Tormenta Tormentosa", 6, 76));
		BTree.addTo(38, new Node("Antes de que "+ name +" atacara, el Coloso Llorón gritó '¡¡Papi!!' entre llantos. Su padre, el Rey atormentado de la"
				+ " Tormenta Tormentosa llegó para salvar a su hijo de " + name +". Le lanzó un rayo eléctrico y nuestra protagonista murió.", 6, 77)); //FIN
		BTree.addTo(39, new Node(name + " intentó huir sin éxito, el Coloso Llorón la aplastó con su puño de roca nubosa. El Coloso fue feliz, había disfrutado"
				+ " de su juguete.", 6, 78));//FIN
		BTree.addTo(39, new Node(name + " intentó huir pero el Coloso Llorón le lanzó una lluvia torrencial que le dió de lleno. Al estar empapada, "  + name 
				+ " pesaba demasiado para su propia magia, y cayó al vacío sin remedio.", 6, 79));//FIN
		BTree.addTo(52, new Node("Al quedarse mucho tiempo parada, se hizo de noche sabiendo que no podría avanzar durante la noche lanzó un rayo de luz"
				+ " a la lejanía para ver su camino y sin quererlo le golpeó al Rey atormentado de la Tormenta Tormentosa derrotando así al enemigo sin avanzar"
				+ " en la elaborada y refinada historía narrativa de nuestra protagonista. Fue recordada por su hazaña y su heroicidad y se brinda"
				+ " el día del vago de Aguas Claras en su nombre.", 6, 104)); //FIN
		BTree.addTo(52, new Node("Al estar tanto tiempo quieta "+ name + " se le habian dormido las piernas y cuando intentó moverse, torpemente se le"
				+ " cruzarón las piernas y cayó entre el acantilado y las nubes, precipitandose al vacio.", 6, 105));
		BTree.addTo(53, new Node("Contra todo pronostico " + name + " realmente le habían gustado las flores elaboradas por la imaginación del jugador"
				+ " y decidió pararse a contemplarlas un poco más, después de inmediato y sin ninguna pausa más, decidió que tenia que proseguir su"
				+ " aventura.", 6, 106));
		BTree.addTo(53, new Node(name + " no se dió cuenta de que el tiempo pasaba a su alrededor y Aguas Claras ya habia sufrido una inundación, además"
				+ " el Rey atormentado había muerto antes de poder enfrentarse a ella. Nuestra protagonista ya no tenía objetivo y decidió exiliarse.", 6, 107));
		BTree.addTo(54, new Node("El sol la sonreía, el horizonte estaba despejado... menos la tormenta. " + name + " caminó con paso animado mientras pensaba"
				+ " en lo famosa que se volvería... se bebió la poción y resultó ser una pócima... un momento, oh dios mío no, creo que he confundido las"
				+ " historias... ¿Qué te parece si empezamos de nuevo? Sí, creo que va a ser lo mejor.", 6, 108));
		BTree.addTo(54, new Node(name + "caminó por las nubes. Pero le sucedió un infortunio. Frente a ella, se encontraban los dos seres más temidos -después"
				+ " del Rey atormentado de la Tormenta Tormentosa- de las nubes. El Coloso Llorón a lomos del ratón-nube. " + name + " se quedó tan estupefacta"
				+ " con la escena, que no tuvo tiempo a reaccionar cuando el Coloso Llorón la agarró con una mano y la llevó a las fauces del ratón-nube."
				+ " Este la arrancó la yugular de un mordisco y " + name + " murió", 6, 109)); //Logro fuente de sangre.
		BTree.addTo(55, new Node("Viendo que " + name + " no hacia esfuerzo por salvar Aguas Claras, el narrador decidió sustuir a " + name + " por Boby."
				+ " Que mató al Rey atormentado salvando Aguas Claras y convirtiendose en un heroe reconocido por todos. Deberías tomar nota de ello para"
				+ " la próxima.", 6, 110));
		BTree.addTo(55, new Node("Viendo que " + name + " no hacia esfuerzo por salvar Aguas Claras, el narrador decidió sustuir a " + name + " por Boby."
				+ " Que murió nada más enfrentarse al Rey atormentado pero al menos se movió. Deberías tomar nota de ello para la próxima.", 6, 111));
		
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
		BTree.addTo(76, new Node("1.Mostrar el corazón", 7, 152));
		BTree.addTo(76, new Node("2.Romper el corazón", 7, 153));
		BTree.addTo(106, new Node("1.Proseguir", 7, 212));
		BTree.addTo(106, new Node("2.Pararse", 7, 213));
		
		BTree.addTo(128, new Node("Le lanza un rayo de luz que desintegra al rey, acabando con el problema. Y al fin se despejó el cielo de Aguas Claras."
				+ " Y se celebró una fiesta en su honor, " + name + " fue la heroína más recordada de la historia de Aguas Claras", 8, 256));
		BTree.addTo(128, new Node("Le lanza un rayo de luz que desintegra al rey, acabando con el problema. Pero, al despejarse el cielo de Aguas Claras,"
				+ " nuestra heroína cayó debido a que en la nube en la que se encontraba se evaporó junto al rey caído. Nunca más se supo de " + name + " en"
				+ " Aguas Claras. Aunque será recordada como la heroína que despejó los cielos.", 8, 257));
		BTree.addTo(129, new Node(name + " alarmó al Rey atormentado de la Tormenta Tormentosa y este le lanzó un rayo que ella consiguió esquivar. Cayó"
				+ " fuera de la nube, en Aguas Claras, quedando completamente incosciente. El rey, ya no tuvo ningún adversario que pudiera hacerle frente"
				+ " por lo que siguió atormentando Aguas Claras por mucho tiempo.", 8, 258));
		BTree.addTo(129, new Node(name + " alarmó al Rey atormentado de la Tormenta Tormentosa y este le lanzó un rayo que la alcanzó desintegrandola en el"
				+ " acto.", 8, 259));
		BTree.addTo(130, new Node(name + " llegó al pueblo, y nada más llegar se dio cuenta de que esa gente eran caníbales. Lanzó todo su poder, creó una"
				+ " nova de luz acabando con todo ser vivo en el pueblo. Y se desmayó de tanto poder liberado. Aguas Claras nunca volvió a tener noticias"
				+ " sobre ella.", 8, 260));
		BTree.addTo(130, new Node(name + " llegó al pueblo, y nada más llegar se dio cuenta de que esa gente eran caníbales. Para su sorpresa, dos hombres"
				+ " se acercaron por su espalda apresándola. Esa noche hubo un gran banquete con nuestra querida " + name + ".", 8, 261));
		BTree.addTo(131, new Node("Pero antes, decidió dar una vuelta más por la niebla, donde acabó perdiéndose para siempre. Aguas Claras nunca volvió"
				+ " a saber de ella.", 8, 262));
		BTree.addTo(131, new Node("Pero antes, decidió dar una vuelta más por la niebla, para su desgracia el rey la había visto y le lanzó un rayo que la"
				+ " desintegró en el acto. Aguas Claras nunca volvió a saber de ella.", 8, 263));
		BTree.addTo(132, new Node("Encontró la corona del Rey atormentado de la Tormenta Tormentosa y se la devolvió a su legítimo dueño, acabando con el"
				+ " problema. Aguas Claras recuperó sus cielos despejados gracias a nuestra querida " + name + ".", 8, 264));
		BTree.addTo(132, new Node("Encontró la corona del Rey atormentado de la Tormenta Tormentosa, entonces se la quedó y a partir de ese momento"
				+ " se la conoció como la Reina de la Tormenta Tormentosa, controlando con ella los cielos pero el poder la cegó y olvidó su verdadero objetivo,"
				+ " dejando a Aguas Claras a merced del Rey sin corona de la tormenta Tormentosa.", 8, 265));
		BTree.addTo(133, new Node("Nuestra protagonista, se da cuenta de que es un submarino de papel. No existen submarinos de papel en la vida real."
				+ " " +name+ " se depierta. Todo fue un sueño.", 8, 266));
		BTree.addTo(133, new Node(name + " se acerco al submarino pero el miedo a su interior la paralizó causandola una fobia que la mantuvo mucho tiempo"
				+ " alejada de los cielos. Así el Rey de la tormenta Tormentosa siguió atormentando a Aguas Claras por mucho tiempo.", 8, 267));
		BTree.addTo(136, new Node(name + " cuando alcanzó a ver Aguas Claras ya no existia nadie allí, un gran rayo cayó sobre la población dejando"
				+ " la ciudad en cenizas. Ya quedaba nadie a quien salvar. Nuestra protagonista se sintió derrotada.", 8, 272));
		BTree.addTo(136, new Node(name + " llegó a Aguas Claras y pidió una poción de vida al comerciante, este le estafó debido a que sabia quien era"
				+ " y solo le interesaba su negocio, nuestra protagonista no pudo retomar su viaje por problemas económicos.", 8, 273));
		BTree.addTo(137, new Node("Nuestra protagonista, descanso esa noche en Aguas Claras, al despertar el cielo estaba despejado y habia una fiesta en"
				+ " nombre de otro Heroe, que consiguió derrotar al Rey atormentado de la Tormenta Tormentosa, aquí acabarón las hazañas de "+ name, 8, 274));
		BTree.addTo(137, new Node("Nuestra protagonista, no pudo recuperarse de las heridas a pesar de la ayuda de los curanderos de Aguas Claras y acabó"
				+ " muriendo días después de llegar. Nadie pudo hacer frente al Rey atormentado de la Tormenta Tormentosa.", 8, 275));
		BTree.addTo(140, new Node(name + "llegó a la tormenta, el Rey atormentado de la Tormenta Tormentosa la vio. Él le lanzó el rayo eléctrico y ella su"
				+ " ataque de luz. Los dos alcanzaron su blanco mortalmente.", 8, 280));
		BTree.addTo(140, new Node(name + "llegó a la tormenta, el Rey atormentado de la Tormenta Tormentosa la vio y le lanzó un rayo, que " + name + " no"
				+ " pudo esquivar muriendo en el acto.", 8, 281));
		BTree.addTo(141, new Node(name + " descansó en medio de las nubes. Mientras dormía otro héroe se adelantó y acabó con la vida del Rey atormentado"
				+ " de la Tormenta Tormentosa liberando la ciudad de su cruel tiranía.", 8, 282));
		BTree.addTo(141, new Node(name + " descansó en medio de las nubes. Mientras dormía un ratón-nube se acercó hambriento y se avalanzó sobre su yugular"
				+ " acabando con su vida entre terribles sufrimientos.", 8, 283));
		BTree.addTo(144, new Node(name + " se bebió la poción y resultó ser una pócima alucinógena que le hizo olvidar su objetivo. Quedándose con los"
				+ " Goblins de las Nubes toda su vida.", 8, 288));
		BTree.addTo(144, new Node(name + " se bebió la poción y resultó ser una pócima de veneno. En realidad, los Goblins de las Nubes eran malos y habían"
				+ " engañado a " + name + ".", 8, 289));
		BTree.addTo(145, new Node(name + " rechazó la poción cortesmente y al darse la vuelta los Goblins de las Nubes, saltaron sobre ella para encadenarla."
				+ "Preferió la muerte a ser esclava. Pero nadie pudo complacer su deseo.", 8, 290));
		BTree.addTo(145, new Node(name + " rechazó la poción cortesmente. Los Goblins se sintienro muy ofendidos y al darse la vuelta ella, la molieron a palos. Nunca"
				+ " más se supo de ella en Aguas Claras.", 8, 291));
		BTree.addTo(152, new Node(name + " una vez le muestra el corazón al Rey atormentado de la Tormenta Tormentosa, esté horririzado de ver que han matado a"
				+ " su único hijo no tiene fuerzas para seguir viviendo, entonces se precipita lanzadose de la nube en la que se encontraba hacia el vacio."
				+ " Nuestra protagonista fue y sigue siendo recordada como una heroina durante muchos años, salvando Aguas Claras del terrible Rey atormentado.", 8, 304));
		BTree.addTo(152, new Node(name + " una vez le muestra el corazón al Rey atormentado de la Tormenta Tormentosa, esté con odio le lanza el más grande"
				+ " y poderoso rayo que podía lanzar, destruyendo a nuestra protagonista y a todo lo que se encontraba a su paso, incluido Aguas Claras."
				+ " El rey atormentado habia hecho desaparecer esa pequeña ciudad de un solo golpe.", 8, 305));
		BTree.addTo(153, new Node(name + " delante del Rey atormentado de la Tormenta Tormentosa, rompió el corazón de su hijo postumo haciendo mella en el"
				+ " corazón del rey, provocandole un pavor irracional el cual, el rey no pudo soportar y huyo del lugar.", 8, 306));
		BTree.addTo(153, new Node("Nuestra protagonista delante del Rey atormentado de la Tormenta Tormentosa, rompió el corazón de su hijo postumo lo que enojó al rey"
				+ " tanto que esté le lanzó un rayo de odio infinito que desintegro a "+ name + ".", 8, 307));
		BTree.addTo(213, new Node(name + " era realmente vaga, y sin darse cuenta, al volver a pararse y contemplar todo su alrededor, empezarón"
				+ " a desaparecer los monstruos, posteriormente la tormenta y lo último el suelo a su alrededor dejandola unicamente a ella"
				+ " como el único elemento de la trama narrativa. Entonces nunca más pudó moverse de ese lugar.", 8, 426));
		BTree.addTo(213, new Node("ERROR: ¿NO TE DAS CUENTA QUE EL JUEGO NECESITA AVANZAR?, ¿POR QUÉ HACES ESTO?, NO TIENES SENSIBILIDAD NINGUNA"
				+ " SE ACABO. NO JUEGUES MÁS. --Cerrando aplicación...--", 8, 427));
		
		return BTree;
	}
}
