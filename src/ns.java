import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ns {
   public static final aeo<dwg> a = nu.a("pillager_outpost/base_plates");

   public static void a(nn<dwg> $$0) {
      hg<dyo> $$1 = $$0.a(jd.aA);
      hf<dyo> $$2 = $$1.b(nv.q);
      hg<dwg> $$3 = $$0.a(jd.aC);
      hf<dwg> $$4 = $$3.b(nu.a);
      $$0.a(a, new dwg($$4, ImmutableList.of(Pair.of(dwe.a("pillager_outpost/base_plate"), 1)), dwg.a.b));
      nu.a(
         $$0,
         "pillager_outpost/towers",
         new dwg(
            $$4,
            ImmutableList.of(Pair.of(dwe.a(ImmutableList.of(dwe.a("pillager_outpost/watchtower"), dwe.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dwg.a.b
         )
      );
      nu.a($$0, "pillager_outpost/feature_plates", new dwg($$4, ImmutableList.of(Pair.of(dwe.a("pillager_outpost/feature_plate"), 1)), dwg.a.a));
      nu.a(
         $$0,
         "pillager_outpost/features",
         new dwg(
            $$4,
            ImmutableList.of(
               Pair.of(dwe.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dwe.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dwe.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dwe.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dwe.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dwe.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dwe.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dwe.g(), 6)
            ),
            dwg.a.b
         )
      );
   }
}
