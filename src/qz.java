import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qz {
   public static void a(rc<ejr> $$0) {
      jj<ejr> $$1 = $$0.a(lq.aM);
      ji<ejr> $$2 = $$1.b(rj.a);
      rj.a(
         $$0,
         "bastion/mobs/piglin",
         new ejr(
            $$2,
            ImmutableList.of(
               Pair.of(ejp.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ejp.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ejp.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ejp.b("bastion/mobs/empty"), 1)
            ),
            ejr.a.b
         )
      );
      rj.a(
         $$0, "bastion/mobs/hoglin", new ejr($$2, ImmutableList.of(Pair.of(ejp.b("bastion/mobs/hoglin"), 2), Pair.of(ejp.b("bastion/mobs/empty"), 1)), ejr.a.b)
      );
      rj.a(
         $$0, "bastion/blocks/gold", new ejr($$2, ImmutableList.of(Pair.of(ejp.b("bastion/blocks/air"), 3), Pair.of(ejp.b("bastion/blocks/gold"), 1)), ejr.a.b)
      );
      rj.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ejr(
            $$2,
            ImmutableList.of(
               Pair.of(ejp.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ejp.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ejp.b("bastion/mobs/sword_piglin"), 1)
            ),
            ejr.a.b
         )
      );
   }
}
