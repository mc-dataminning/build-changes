import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qj {
   public static void a(qm<ekf> $$0) {
      jk<ekf> $$1 = $$0.a(lr.aT);
      jj<ekf> $$2 = $$1.b(qt.a);
      qt.a(
         $$0,
         "bastion/mobs/piglin",
         new ekf(
            $$2,
            ImmutableList.of(
               Pair.of(ekd.b("bastion/mobs/melee_piglin"), 1),
               Pair.of(ekd.b("bastion/mobs/sword_piglin"), 4),
               Pair.of(ekd.b("bastion/mobs/crossbow_piglin"), 4),
               Pair.of(ekd.b("bastion/mobs/empty"), 1)
            ),
            ekf.a.b
         )
      );
      qt.a(
         $$0, "bastion/mobs/hoglin", new ekf($$2, ImmutableList.of(Pair.of(ekd.b("bastion/mobs/hoglin"), 2), Pair.of(ekd.b("bastion/mobs/empty"), 1)), ekf.a.b)
      );
      qt.a(
         $$0, "bastion/blocks/gold", new ekf($$2, ImmutableList.of(Pair.of(ekd.b("bastion/blocks/air"), 3), Pair.of(ekd.b("bastion/blocks/gold"), 1)), ekf.a.b)
      );
      qt.a(
         $$0,
         "bastion/mobs/piglin_melee",
         new ekf(
            $$2,
            ImmutableList.of(
               Pair.of(ekd.b("bastion/mobs/melee_piglin_always"), 1),
               Pair.of(ekd.b("bastion/mobs/melee_piglin"), 5),
               Pair.of(ekd.b("bastion/mobs/sword_piglin"), 1)
            ),
            ekf.a.b
         )
      );
   }
}
