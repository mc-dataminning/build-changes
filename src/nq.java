import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nq {
   public static void a(nt<dwt> $$0) {
      hh<dwt> $$1 = $$0.a(je.aC);
      hg<dwt> $$2 = $$1.b(oa.a);
      oa.a(
         $$0,
         "bastion/mobs/piglin",
         new dwt(
            $$2,
            ImmutableList.of(
               Pair.of(dwr.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(dwr.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(dwr.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(dwr.b("bastion/mobs/empty"), 1)
            ),
            dwt.a.b
         )
      );
      oa.a(
         $$0, "bastion/mobs/hoglin", new dwt($$2, ImmutableList.of(Pair.of(dwr.b("bastion/mobs/hoglin"), 2), Pair.of(dwr.b("bastion/mobs/empty"), 1)), dwt.a.b)
      );
      oa.a(
         $$0, "bastion/blocks/gold", new dwt($$2, ImmutableList.of(Pair.of(dwr.b("bastion/blocks/air"), 3), Pair.of(dwr.b("bastion/blocks/gold"), 1)), dwt.a.b)
      );
      oa.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new dwt(
            $$2,
            ImmutableList.of(
               Pair.of(dwr.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(dwr.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(dwr.b("bastion/mobs/sword_piglin"), 1)
            ),
            dwt.a.b
         )
      );
   }
}
