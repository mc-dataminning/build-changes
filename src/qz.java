import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qz {
   public static void a(rc<ejo> $$0) {
      jj<ejo> $$1 = $$0.a(lq.aM);
      ji<ejo> $$2 = $$1.b(rj.a);
      rj.a(
         $$0,
         "bastion/mobs/piglin",
         new ejo(
            $$2,
            ImmutableList.of(
               Pair.of(ejm.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ejm.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ejm.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ejm.b("bastion/mobs/empty"), 1)
            ),
            ejo.a.b
         )
      );
      rj.a(
         $$0, "bastion/mobs/hoglin", new ejo($$2, ImmutableList.of(Pair.of(ejm.b("bastion/mobs/hoglin"), 2), Pair.of(ejm.b("bastion/mobs/empty"), 1)), ejo.a.b)
      );
      rj.a(
         $$0, "bastion/blocks/gold", new ejo($$2, ImmutableList.of(Pair.of(ejm.b("bastion/blocks/air"), 3), Pair.of(ejm.b("bastion/blocks/gold"), 1)), ejo.a.b)
      );
      rj.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ejo(
            $$2,
            ImmutableList.of(
               Pair.of(ejm.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ejm.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ejm.b("bastion/mobs/sword_piglin"), 1)
            ),
            ejo.a.b
         )
      );
   }
}
