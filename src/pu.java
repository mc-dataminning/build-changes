import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pu {
   public static void a(px<egq> $$0) {
      im<egq> $$1 = $$0.a(ks.aI);
      il<egq> $$2 = $$1.b(qe.a);
      qe.a(
         $$0,
         "bastion/mobs/piglin",
         new egq(
            $$2,
            ImmutableList.of(
               Pair.of(ego.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ego.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ego.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ego.b("bastion/mobs/empty"), 1)
            ),
            egq.a.b
         )
      );
      qe.a(
         $$0, "bastion/mobs/hoglin", new egq($$2, ImmutableList.of(Pair.of(ego.b("bastion/mobs/hoglin"), 2), Pair.of(ego.b("bastion/mobs/empty"), 1)), egq.a.b)
      );
      qe.a(
         $$0, "bastion/blocks/gold", new egq($$2, ImmutableList.of(Pair.of(ego.b("bastion/blocks/air"), 3), Pair.of(ego.b("bastion/blocks/gold"), 1)), egq.a.b)
      );
      qe.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new egq(
            $$2,
            ImmutableList.of(
               Pair.of(ego.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ego.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ego.b("bastion/mobs/sword_piglin"), 1)
            ),
            egq.a.b
         )
      );
   }
}
