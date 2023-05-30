package com.flowershop.flowershop;

import com.flowershop.flowershop.entities.Bouquet;
import com.flowershop.flowershop.entities.BouquetType;
import com.flowershop.flowershop.entities.Fleur;
import com.flowershop.flowershop.repositories.BouquetRepo;
import com.flowershop.flowershop.repositories.FleurRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlowershopApplicationTests {

	@Autowired
	BouquetRepo bouquetRepo;
	@Autowired
	FleurRepo fleurRepo;

	@Test
	public void TestCreateBouquet(){
		Fleur fleur = new Fleur("Tulipe",10L, "Blanc");
		fleurRepo.save(fleur);
		Fleur f = new Fleur("Rose",10L, "Rouge");
		fleurRepo.save(f);


		Bouquet b1 = new Bouquet(BouquetType.LONGS);
		bouquetRepo.save(b1);

		b1.getFleurlist().add(fleur);
		b1.getFleurlist().add(f);

		bouquetRepo.save(b1);
	}

}
