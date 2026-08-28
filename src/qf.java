import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qf {
   public static void a(qi<etx> $$0) {
      jh<etx> $$1 = $$0.a(mi.bf);
      jg<etx> $$2 = $$1.b(qp.a);
      qp.a(
         $$0,
         "bastion/mobs/piglin",
         new etx(
            $$2,
            ImmutableList.of(
               Pair.of(etv.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(etv.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(etv.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(etv.b("bastion/mobs/empty"), 1)
            ),
            etx.a.b
         )
      );
      qp.a(
         $$0, "bastion/mobs/hoglin", new etx($$2, ImmutableList.of(Pair.of(etv.b("bastion/mobs/hoglin"), 2), Pair.of(etv.b("bastion/mobs/empty"), 1)), etx.a.b)
      );
      qp.a(
         $$0, "bastion/blocks/gold", new etx($$2, ImmutableList.of(Pair.of(etv.b("bastion/blocks/air"), 3), Pair.of(etv.b("bastion/blocks/gold"), 1)), etx.a.b)
      );
      qp.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new etx(
            $$2,
            ImmutableList.of(
               Pair.of(etv.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(etv.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(etv.b("bastion/mobs/sword_piglin"), 1)
            ),
            etx.a.b
         )
      );
   }
}
