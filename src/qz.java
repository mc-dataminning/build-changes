import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qz {
   public static void a(rc<ejv> $$0) {
      jj<ejv> $$1 = $$0.a(lq.aM);
      ji<ejv> $$2 = $$1.b(rj.a);
      rj.a(
         $$0,
         "bastion/mobs/piglin",
         new ejv(
            $$2,
            ImmutableList.of(
               Pair.of(ejt.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ejt.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ejt.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ejt.b("bastion/mobs/empty"), 1)
            ),
            ejv.a.b
         )
      );
      rj.a(
         $$0, "bastion/mobs/hoglin", new ejv($$2, ImmutableList.of(Pair.of(ejt.b("bastion/mobs/hoglin"), 2), Pair.of(ejt.b("bastion/mobs/empty"), 1)), ejv.a.b)
      );
      rj.a(
         $$0, "bastion/blocks/gold", new ejv($$2, ImmutableList.of(Pair.of(ejt.b("bastion/blocks/air"), 3), Pair.of(ejt.b("bastion/blocks/gold"), 1)), ejv.a.b)
      );
      rj.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ejv(
            $$2,
            ImmutableList.of(
               Pair.of(ejt.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ejt.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ejt.b("bastion/mobs/sword_piglin"), 1)
            ),
            ejv.a.b
         )
      );
   }
}
