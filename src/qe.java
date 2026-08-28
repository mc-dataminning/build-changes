import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qe {
   public static void a(qh<esd> $$0) {
      jf<esd> $$1 = $$0.a(mg.be);
      je<esd> $$2 = $$1.b(qo.a);
      qo.a(
         $$0,
         "bastion/mobs/piglin",
         new esd(
            $$2,
            ImmutableList.of(
               Pair.of(esb.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(esb.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(esb.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(esb.b("bastion/mobs/empty"), 1)
            ),
            esd.a.b
         )
      );
      qo.a(
         $$0, "bastion/mobs/hoglin", new esd($$2, ImmutableList.of(Pair.of(esb.b("bastion/mobs/hoglin"), 2), Pair.of(esb.b("bastion/mobs/empty"), 1)), esd.a.b)
      );
      qo.a(
         $$0, "bastion/blocks/gold", new esd($$2, ImmutableList.of(Pair.of(esb.b("bastion/blocks/air"), 3), Pair.of(esb.b("bastion/blocks/gold"), 1)), esd.a.b)
      );
      qo.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new esd(
            $$2,
            ImmutableList.of(
               Pair.of(esb.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(esb.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(esb.b("bastion/mobs/sword_piglin"), 1)
            ),
            esd.a.b
         )
      );
   }
}
