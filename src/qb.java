import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qb {
   public static void a(qe<eox> $$0) {
      js<eox> $$1 = $$0.a(mc.aX);
      jr<eox> $$2 = $$1.b(ql.a);
      ql.a(
         $$0,
         "bastion/mobs/piglin",
         new eox(
            $$2,
            ImmutableList.of(
               Pair.of(eov.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(eov.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(eov.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(eov.b("bastion/mobs/empty"), 1)
            ),
            eox.a.b
         )
      );
      ql.a(
         $$0, "bastion/mobs/hoglin", new eox($$2, ImmutableList.of(Pair.of(eov.b("bastion/mobs/hoglin"), 2), Pair.of(eov.b("bastion/mobs/empty"), 1)), eox.a.b)
      );
      ql.a(
         $$0, "bastion/blocks/gold", new eox($$2, ImmutableList.of(Pair.of(eov.b("bastion/blocks/air"), 3), Pair.of(eov.b("bastion/blocks/gold"), 1)), eox.a.b)
      );
      ql.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eox(
            $$2,
            ImmutableList.of(
               Pair.of(eov.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(eov.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(eov.b("bastion/mobs/sword_piglin"), 1)
            ),
            eox.a.b
         )
      );
   }
}
