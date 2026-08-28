import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qr {
   public static final akj<ekh> a = qt.a("pillager_outpost/base_plates");

   public static void a(qm<ekh> $$0) {
      jk<emw> $$1 = $$0.a(lr.aR);
      jj<emw> $$2 = $$1.b(qu.q);
      jk<ekh> $$3 = $$0.a(lr.aT);
      jj<ekh> $$4 = $$3.b(qt.a);
      $$0.a(a, new ekh($$4, ImmutableList.of(Pair.of(ekf.a("pillager_outpost/base_plate"), 1)), ekh.a.b));
      qt.a(
         $$0,
         "pillager_outpost/towers",
         new ekh(
            $$4,
            ImmutableList.of(Pair.of(ekf.b(ImmutableList.of(ekf.a("pillager_outpost/watchtower"), ekf.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ekh.a.b
         )
      );
      qt.a($$0, "pillager_outpost/feature_plates", new ekh($$4, ImmutableList.of(Pair.of(ekf.a("pillager_outpost/feature_plate"), 1)), ekh.a.a));
      qt.a(
         $$0,
         "pillager_outpost/features",
         new ekh(
            $$4,
            ImmutableList.of(
               Pair.of(ekf.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ekf.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ekf.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ekf.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ekf.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ekf.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ekf.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ekf.g(), 6)
            ),
            ekh.a.b
         )
      );
   }
}
