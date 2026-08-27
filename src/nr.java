import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nr {
   public static final aeq<dwi> a = nt.a("pillager_outpost/base_plates");

   public static void a(nm<dwi> $$0) {
      hf<dyq> $$1 = $$0.a(jc.aA);
      he<dyq> $$2 = $$1.b(nu.q);
      hf<dwi> $$3 = $$0.a(jc.aC);
      he<dwi> $$4 = $$3.b(nt.a);
      $$0.a(a, new dwi($$4, ImmutableList.of(Pair.of(dwg.a("pillager_outpost/base_plate"), 1)), dwi.a.b));
      nt.a(
         $$0,
         "pillager_outpost/towers",
         new dwi(
            $$4,
            ImmutableList.of(Pair.of(dwg.a(ImmutableList.of(dwg.a("pillager_outpost/watchtower"), dwg.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dwi.a.b
         )
      );
      nt.a($$0, "pillager_outpost/feature_plates", new dwi($$4, ImmutableList.of(Pair.of(dwg.a("pillager_outpost/feature_plate"), 1)), dwi.a.a));
      nt.a(
         $$0,
         "pillager_outpost/features",
         new dwi(
            $$4,
            ImmutableList.of(
               Pair.of(dwg.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dwg.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dwg.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dwg.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dwg.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dwg.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dwg.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dwg.g(), 6)
            ),
            dwi.a.b
         )
      );
   }
}
