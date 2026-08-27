import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pf {
   public static final ags<dzx> a = ph.a("pillager_outpost/base_plates");

   public static void a(pa<dzx> $$0) {
      ig<ecm> $$1 = $$0.a(kc.aD);
      ie<ecm> $$2 = $$1.b(pi.q);
      ig<dzx> $$3 = $$0.a(kc.aF);
      ie<dzx> $$4 = $$3.b(ph.a);
      $$0.a(a, new dzx($$4, ImmutableList.of(Pair.of(dzv.a("pillager_outpost/base_plate"), 1)), dzx.a.b));
      ph.a(
         $$0,
         "pillager_outpost/towers",
         new dzx(
            $$4,
            ImmutableList.of(Pair.of(dzv.b(ImmutableList.of(dzv.a("pillager_outpost/watchtower"), dzv.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dzx.a.b
         )
      );
      ph.a($$0, "pillager_outpost/feature_plates", new dzx($$4, ImmutableList.of(Pair.of(dzv.a("pillager_outpost/feature_plate"), 1)), dzx.a.a));
      ph.a(
         $$0,
         "pillager_outpost/features",
         new dzx(
            $$4,
            ImmutableList.of(
               Pair.of(dzv.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dzv.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dzv.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dzv.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dzv.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dzv.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dzv.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dzv.g(), 6)
            ),
            dzx.a.b
         )
      );
   }
}
