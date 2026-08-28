import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qj {
   public static void a(qm<ejz> $$0) {
      jk<ejz> $$1 = $$0.a(lr.aT);
      jj<ejz> $$2 = $$1.b(qt.a);
      qt.a(
         $$0,
         "bastion/mobs/piglin",
         new ejz(
            $$2,
            ImmutableList.of(
               Pair.of(ejx.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ejx.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ejx.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ejx.b("bastion/mobs/empty"), 1)
            ),
            ejz.a.b
         )
      );
      qt.a(
         $$0, "bastion/mobs/hoglin", new ejz($$2, ImmutableList.of(Pair.of(ejx.b("bastion/mobs/hoglin"), 2), Pair.of(ejx.b("bastion/mobs/empty"), 1)), ejz.a.b)
      );
      qt.a(
         $$0, "bastion/blocks/gold", new ejz($$2, ImmutableList.of(Pair.of(ejx.b("bastion/blocks/air"), 3), Pair.of(ejx.b("bastion/blocks/gold"), 1)), ejz.a.b)
      );
      qt.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ejz(
            $$2,
            ImmutableList.of(
               Pair.of(ejx.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ejx.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ejx.b("bastion/mobs/sword_piglin"), 1)
            ),
            ejz.a.b
         )
      );
   }
}
