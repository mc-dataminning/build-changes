import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qj {
   public static void a(qm<ekh> $$0) {
      jk<ekh> $$1 = $$0.a(lr.aT);
      jj<ekh> $$2 = $$1.b(qt.a);
      qt.a(
         $$0,
         "bastion/mobs/piglin",
         new ekh(
            $$2,
            ImmutableList.of(
               Pair.of(ekf.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ekf.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ekf.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ekf.b("bastion/mobs/empty"), 1)
            ),
            ekh.a.b
         )
      );
      qt.a(
         $$0, "bastion/mobs/hoglin", new ekh($$2, ImmutableList.of(Pair.of(ekf.b("bastion/mobs/hoglin"), 2), Pair.of(ekf.b("bastion/mobs/empty"), 1)), ekh.a.b)
      );
      qt.a(
         $$0, "bastion/blocks/gold", new ekh($$2, ImmutableList.of(Pair.of(ekf.b("bastion/blocks/air"), 3), Pair.of(ekf.b("bastion/blocks/gold"), 1)), ekh.a.b)
      );
      qt.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ekh(
            $$2,
            ImmutableList.of(
               Pair.of(ekf.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ekf.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ekf.b("bastion/mobs/sword_piglin"), 1)
            ),
            ekh.a.b
         )
      );
   }
}
