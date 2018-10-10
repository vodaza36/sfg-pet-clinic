package at.hochbichler.sfgpetclinic.bootstrap;

import at.hochbichler.sfgpetclinic.model.Owner;
import at.hochbichler.sfgpetclinic.model.Vet;
import at.hochbichler.sfgpetclinic.services.OwnerService;
import at.hochbichler.sfgpetclinic.services.VetService;
import at.hochbichler.sfgpetclinic.services.map.OwnerServiceMap;
import at.hochbichler.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Max");
        owner1.setLastName("Muster");
        owner1.setId(1L);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Robert");
        owner2.setLastName("Gross");
        owner2.setId(2L);

        ownerService.save(owner2);

        System.out.println("Load owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Jimmy");
        vet1.setLastName("Gold");
        vet1.setId(1L);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Juli");
        vet2.setLastName("Klein");
        vet2.setId(1L);

        vetService.save(vet2);

        System.out.println("Load vets...");
    }
}
