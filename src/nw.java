import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class nw {
   public static final aev<dwr> a = ny.a("pillager_outpost/base_plates");

   public static void a(nr<dwr> $$0) {
      hf<dyz> $$1 = $$0.a(jc.aA);
      he<dyz> $$2 = $$1.b(nz.q);
      hf<dwr> $$3 = $$0.a(jc.aC);
      he<dwr> $$4 = $$3.b(ny.a);
      $$0.a(a, new dwr($$4, ImmutableList.of(Pair.of(dwp.a("pillager_outpost/base_plate"), 1)), dwr.a.b));
      ny.a(
         $$0,
         "pillager_outpost/towers",
         new dwr(
            $$4,
            ImmutableList.of(Pair.of(dwp.a(ImmutableList.of(dwp.a("pillager_outpost/watchtower"), dwp.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dwr.a.b
         )
      );
      ny.a($$0, "pillager_outpost/feature_plates", new dwr($$4, ImmutableList.of(Pair.of(dwp.a("pillager_outpost/feature_plate"), 1)), dwr.a.a));
      ny.a(
         $$0,
         "pillager_outpost/features",
         new dwr(
            $$4,
            ImmutableList.of(
               Pair.of(dwp.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dwp.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dwp.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dwp.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dwp.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dwp.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dwp.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dwp.g(), 6)
            ),
            dwr.a.b
         )
      );
   }
}
