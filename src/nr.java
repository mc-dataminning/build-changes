import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nr {
   public static final aeq<dwh> a = nt.a("pillager_outpost/base_plates");

   public static void a(nm<dwh> $$0) {
      hf<dyp> $$1 = $$0.a(jc.aA);
      he<dyp> $$2 = $$1.b(nu.q);
      hf<dwh> $$3 = $$0.a(jc.aC);
      he<dwh> $$4 = $$3.b(nt.a);
      $$0.a(a, new dwh($$4, ImmutableList.of(Pair.of(dwf.a("pillager_outpost/base_plate"), 1)), dwh.a.b));
      nt.a(
         $$0,
         "pillager_outpost/towers",
         new dwh(
            $$4,
            ImmutableList.of(Pair.of(dwf.a(ImmutableList.of(dwf.a("pillager_outpost/watchtower"), dwf.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dwh.a.b
         )
      );
      nt.a($$0, "pillager_outpost/feature_plates", new dwh($$4, ImmutableList.of(Pair.of(dwf.a("pillager_outpost/feature_plate"), 1)), dwh.a.a));
      nt.a(
         $$0,
         "pillager_outpost/features",
         new dwh(
            $$4,
            ImmutableList.of(
               Pair.of(dwf.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dwf.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dwf.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dwf.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dwf.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dwf.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dwf.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dwf.g(), 6)
            ),
            dwh.a.b
         )
      );
   }
}
