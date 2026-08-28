import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qe {
   public static void a(qh<ess> $$0) {
      jg<ess> $$1 = $$0.a(mh.bf);
      jf<ess> $$2 = $$1.b(qo.a);
      qo.a(
         $$0,
         "bastion/mobs/piglin",
         new ess(
            $$2,
            ImmutableList.of(
               Pair.of(esq.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(esq.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(esq.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(esq.b("bastion/mobs/empty"), 1)
            ),
            ess.a.b
         )
      );
      qo.a(
         $$0, "bastion/mobs/hoglin", new ess($$2, ImmutableList.of(Pair.of(esq.b("bastion/mobs/hoglin"), 2), Pair.of(esq.b("bastion/mobs/empty"), 1)), ess.a.b)
      );
      qo.a(
         $$0, "bastion/blocks/gold", new ess($$2, ImmutableList.of(Pair.of(esq.b("bastion/blocks/air"), 3), Pair.of(esq.b("bastion/blocks/gold"), 1)), ess.a.b)
      );
      qo.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ess(
            $$2,
            ImmutableList.of(
               Pair.of(esq.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(esq.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(esq.b("bastion/mobs/sword_piglin"), 1)
            ),
            ess.a.b
         )
      );
   }
}
