import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qz {
   public static void a(rc<ejt> $$0) {
      jj<ejt> $$1 = $$0.a(lq.aM);
      ji<ejt> $$2 = $$1.b(rj.a);
      rj.a(
         $$0,
         "bastion/mobs/piglin",
         new ejt(
            $$2,
            ImmutableList.of(
               Pair.of(ejr.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ejr.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ejr.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ejr.b("bastion/mobs/empty"), 1)
            ),
            ejt.a.b
         )
      );
      rj.a(
         $$0, "bastion/mobs/hoglin", new ejt($$2, ImmutableList.of(Pair.of(ejr.b("bastion/mobs/hoglin"), 2), Pair.of(ejr.b("bastion/mobs/empty"), 1)), ejt.a.b)
      );
      rj.a(
         $$0, "bastion/blocks/gold", new ejt($$2, ImmutableList.of(Pair.of(ejr.b("bastion/blocks/air"), 3), Pair.of(ejr.b("bastion/blocks/gold"), 1)), ejt.a.b)
      );
      rj.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ejt(
            $$2,
            ImmutableList.of(
               Pair.of(ejr.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ejr.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ejr.b("bastion/mobs/sword_piglin"), 1)
            ),
            ejt.a.b
         )
      );
   }
}
