import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rh {
   public static void a(rk<epu> $$0) {
      jr<epu> $$1 = $$0.a(mb.aX);
      jq<epu> $$2 = $$1.b(rr.a);
      rr.a(
         $$0,
         "bastion/mobs/piglin",
         new epu(
            $$2,
            ImmutableList.of(
               Pair.of(eps.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(eps.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(eps.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(eps.b("bastion/mobs/empty"), 1)
            ),
            epu.a.b
         )
      );
      rr.a(
         $$0, "bastion/mobs/hoglin", new epu($$2, ImmutableList.of(Pair.of(eps.b("bastion/mobs/hoglin"), 2), Pair.of(eps.b("bastion/mobs/empty"), 1)), epu.a.b)
      );
      rr.a(
         $$0, "bastion/blocks/gold", new epu($$2, ImmutableList.of(Pair.of(eps.b("bastion/blocks/air"), 3), Pair.of(eps.b("bastion/blocks/gold"), 1)), epu.a.b)
      );
      rr.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new epu(
            $$2,
            ImmutableList.of(
               Pair.of(eps.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(eps.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(eps.b("bastion/mobs/sword_piglin"), 1)
            ),
            epu.a.b
         )
      );
   }
}
