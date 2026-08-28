import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qw {
   public static void a(qz<ens> $$0) {
      jr<ens> $$1 = $$0.a(ma.aV);
      jq<ens> $$2 = $$1.b(rg.a);
      rg.a(
         $$0,
         "bastion/mobs/piglin",
         new ens(
            $$2,
            ImmutableList.of(
               Pair.of(enq.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(enq.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(enq.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(enq.b("bastion/mobs/empty"), 1)
            ),
            ens.a.b
         )
      );
      rg.a(
         $$0, "bastion/mobs/hoglin", new ens($$2, ImmutableList.of(Pair.of(enq.b("bastion/mobs/hoglin"), 2), Pair.of(enq.b("bastion/mobs/empty"), 1)), ens.a.b)
      );
      rg.a(
         $$0, "bastion/blocks/gold", new ens($$2, ImmutableList.of(Pair.of(enq.b("bastion/blocks/air"), 3), Pair.of(enq.b("bastion/blocks/gold"), 1)), ens.a.b)
      );
      rg.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ens(
            $$2,
            ImmutableList.of(
               Pair.of(enq.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(enq.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(enq.b("bastion/mobs/sword_piglin"), 1)
            ),
            ens.a.b
         )
      );
   }
}
