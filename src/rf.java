import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rf {
   public static final alo<epn> a = rh.a("pillager_outpost/base_plates");

   public static void a(ra<epn> $$0) {
      jr<esd> $$1 = $$0.a(mb.aV);
      jq<esd> $$2 = $$1.b(ri.q);
      jr<epn> $$3 = $$0.a(mb.aX);
      jq<epn> $$4 = $$3.b(rh.a);
      $$0.a(a, new epn($$4, ImmutableList.of(Pair.of(epl.a("pillager_outpost/base_plate"), 1)), epn.a.b));
      rh.a(
         $$0,
         "pillager_outpost/towers",
         new epn(
            $$4,
            ImmutableList.of(Pair.of(epl.b(ImmutableList.of(epl.a("pillager_outpost/watchtower"), epl.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            epn.a.b
         )
      );
      rh.a($$0, "pillager_outpost/feature_plates", new epn($$4, ImmutableList.of(Pair.of(epl.a("pillager_outpost/feature_plate"), 1)), epn.a.a));
      rh.a(
         $$0,
         "pillager_outpost/features",
         new epn(
            $$4,
            ImmutableList.of(
               Pair.of(epl.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(epl.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(epl.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(epl.a("pillager_outpost/feature_logs"), 1),
               Pair.of(epl.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(epl.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(epl.a("pillager_outpost/feature_targets"), 1),
               Pair.of(epl.h(), 6)
            ),
            epn.a.b
         )
      );
   }
}
