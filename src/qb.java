import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qb {
   public static void a(qe<eow> $$0) {
      js<eow> $$1 = $$0.a(mc.aX);
      jr<eow> $$2 = $$1.b(ql.a);
      ql.a(
         $$0,
         "bastion/mobs/piglin",
         new eow(
            $$2,
            ImmutableList.of(
               Pair.of(eou.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(eou.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(eou.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(eou.b("bastion/mobs/empty"), 1)
            ),
            eow.a.b
         )
      );
      ql.a(
         $$0, "bastion/mobs/hoglin", new eow($$2, ImmutableList.of(Pair.of(eou.b("bastion/mobs/hoglin"), 2), Pair.of(eou.b("bastion/mobs/empty"), 1)), eow.a.b)
      );
      ql.a(
         $$0, "bastion/blocks/gold", new eow($$2, ImmutableList.of(Pair.of(eou.b("bastion/blocks/air"), 3), Pair.of(eou.b("bastion/blocks/gold"), 1)), eow.a.b)
      );
      ql.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eow(
            $$2,
            ImmutableList.of(
               Pair.of(eou.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(eou.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(eou.b("bastion/mobs/sword_piglin"), 1)
            ),
            eow.a.b
         )
      );
   }
}
