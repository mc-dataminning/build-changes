import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nq {
   public static void a(nt<dwr> $$0) {
      hh<dwr> $$1 = $$0.a(je.aC);
      hg<dwr> $$2 = $$1.b(oa.a);
      oa.a(
         $$0,
         "bastion/mobs/piglin",
         new dwr(
            $$2,
            ImmutableList.of(
               Pair.of(dwp.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(dwp.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(dwp.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(dwp.b("bastion/mobs/empty"), 1)
            ),
            dwr.a.b
         )
      );
      oa.a(
         $$0, "bastion/mobs/hoglin", new dwr($$2, ImmutableList.of(Pair.of(dwp.b("bastion/mobs/hoglin"), 2), Pair.of(dwp.b("bastion/mobs/empty"), 1)), dwr.a.b)
      );
      oa.a(
         $$0, "bastion/blocks/gold", new dwr($$2, ImmutableList.of(Pair.of(dwp.b("bastion/blocks/air"), 3), Pair.of(dwp.b("bastion/blocks/gold"), 1)), dwr.a.b)
      );
      oa.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new dwr(
            $$2,
            ImmutableList.of(
               Pair.of(dwp.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(dwp.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(dwp.b("bastion/mobs/sword_piglin"), 1)
            ),
            dwr.a.b
         )
      );
   }
}
