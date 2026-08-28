import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qr {
   public static final akj<ekf> a = qt.a("pillager_outpost/base_plates");

   public static void a(qm<ekf> $$0) {
      jk<emu> $$1 = $$0.a(lr.aR);
      jj<emu> $$2 = $$1.b(qu.q);
      jk<ekf> $$3 = $$0.a(lr.aT);
      jj<ekf> $$4 = $$3.b(qt.a);
      $$0.a(a, new ekf($$4, ImmutableList.of(Pair.of(ekd.a("pillager_outpost/base_plate"), 1)), ekf.a.b));
      qt.a(
         $$0,
         "pillager_outpost/towers",
         new ekf(
            $$4,
            ImmutableList.of(Pair.of(ekd.b(ImmutableList.of(ekd.a("pillager_outpost/watchtower"), ekd.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ekf.a.b
         )
      );
      qt.a($$0, "pillager_outpost/feature_plates", new ekf($$4, ImmutableList.of(Pair.of(ekd.a("pillager_outpost/feature_plate"), 1)), ekf.a.a));
      qt.a(
         $$0,
         "pillager_outpost/features",
         new ekf(
            $$4,
            ImmutableList.of(
               Pair.of(ekd.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ekd.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ekd.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ekd.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ekd.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ekd.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ekd.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ekd.g(), 6)
            ),
            ekf.a.b
         )
      );
   }
}
