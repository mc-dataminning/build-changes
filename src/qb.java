import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qb {
   public static void a(qe<ept> $$0) {
      js<ept> $$1 = $$0.a(mc.aZ);
      jr<ept> $$2 = $$1.b(ql.a);
      ql.a(
         $$0,
         "bastion/mobs/piglin",
         new ept(
            $$2,
            ImmutableList.of(
               Pair.of(epr.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(epr.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(epr.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(epr.b("bastion/mobs/empty"), 1)
            ),
            ept.a.b
         )
      );
      ql.a(
         $$0, "bastion/mobs/hoglin", new ept($$2, ImmutableList.of(Pair.of(epr.b("bastion/mobs/hoglin"), 2), Pair.of(epr.b("bastion/mobs/empty"), 1)), ept.a.b)
      );
      ql.a(
         $$0, "bastion/blocks/gold", new ept($$2, ImmutableList.of(Pair.of(epr.b("bastion/blocks/air"), 3), Pair.of(epr.b("bastion/blocks/gold"), 1)), ept.a.b)
      );
      ql.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ept(
            $$2,
            ImmutableList.of(
               Pair.of(epr.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(epr.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(epr.b("bastion/mobs/sword_piglin"), 1)
            ),
            ept.a.b
         )
      );
   }
}
