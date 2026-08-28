import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qb {
   public static void a(qe<eov> $$0) {
      js<eov> $$1 = $$0.a(mc.aX);
      jr<eov> $$2 = $$1.b(ql.a);
      ql.a(
         $$0,
         "bastion/mobs/piglin",
         new eov(
            $$2,
            ImmutableList.of(
               Pair.of(eot.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(eot.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(eot.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(eot.b("bastion/mobs/empty"), 1)
            ),
            eov.a.b
         )
      );
      ql.a(
         $$0, "bastion/mobs/hoglin", new eov($$2, ImmutableList.of(Pair.of(eot.b("bastion/mobs/hoglin"), 2), Pair.of(eot.b("bastion/mobs/empty"), 1)), eov.a.b)
      );
      ql.a(
         $$0, "bastion/blocks/gold", new eov($$2, ImmutableList.of(Pair.of(eot.b("bastion/blocks/air"), 3), Pair.of(eot.b("bastion/blocks/gold"), 1)), eov.a.b)
      );
      ql.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eov(
            $$2,
            ImmutableList.of(
               Pair.of(eot.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(eot.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(eot.b("bastion/mobs/sword_piglin"), 1)
            ),
            eov.a.b
         )
      );
   }
}
