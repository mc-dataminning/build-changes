import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qb {
   public static void a(qe<eou> $$0) {
      js<eou> $$1 = $$0.a(mc.aX);
      jr<eou> $$2 = $$1.b(ql.a);
      ql.a(
         $$0,
         "bastion/mobs/piglin",
         new eou(
            $$2,
            ImmutableList.of(
               Pair.of(eos.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(eos.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(eos.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(eos.b("bastion/mobs/empty"), 1)
            ),
            eou.a.b
         )
      );
      ql.a(
         $$0, "bastion/mobs/hoglin", new eou($$2, ImmutableList.of(Pair.of(eos.b("bastion/mobs/hoglin"), 2), Pair.of(eos.b("bastion/mobs/empty"), 1)), eou.a.b)
      );
      ql.a(
         $$0, "bastion/blocks/gold", new eou($$2, ImmutableList.of(Pair.of(eos.b("bastion/blocks/air"), 3), Pair.of(eos.b("bastion/blocks/gold"), 1)), eou.a.b)
      );
      ql.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new eou(
            $$2,
            ImmutableList.of(
               Pair.of(eos.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(eos.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(eos.b("bastion/mobs/sword_piglin"), 1)
            ),
            eou.a.b
         )
      );
   }
}
