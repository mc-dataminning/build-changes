import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pe {
   public static void a(ph<ecn> $$0) {
      ik<ecn> $$1 = $$0.a(kg.aG);
      ij<ecn> $$2 = $$1.b(po.a);
      po.a(
         $$0,
         "bastion/mobs/piglin",
         new ecn(
            $$2,
            ImmutableList.of(
               Pair.of(ecl.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ecl.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ecl.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ecl.b("bastion/mobs/empty"), 1)
            ),
            ecn.a.b
         )
      );
      po.a(
         $$0, "bastion/mobs/hoglin", new ecn($$2, ImmutableList.of(Pair.of(ecl.b("bastion/mobs/hoglin"), 2), Pair.of(ecl.b("bastion/mobs/empty"), 1)), ecn.a.b)
      );
      po.a(
         $$0, "bastion/blocks/gold", new ecn($$2, ImmutableList.of(Pair.of(ecl.b("bastion/blocks/air"), 3), Pair.of(ecl.b("bastion/blocks/gold"), 1)), ecn.a.b)
      );
      po.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ecn(
            $$2,
            ImmutableList.of(
               Pair.of(ecl.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ecl.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ecl.b("bastion/mobs/sword_piglin"), 1)
            ),
            ecn.a.b
         )
      );
   }
}
