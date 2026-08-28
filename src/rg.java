import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rg {
   public static final alk<enl> a = ri.a("pillager_outpost/base_plates");

   public static void a(rb<enl> $$0) {
      jr<eqb> $$1 = $$0.a(ma.aT);
      jq<eqb> $$2 = $$1.b(rj.q);
      jr<enl> $$3 = $$0.a(ma.aV);
      jq<enl> $$4 = $$3.b(ri.a);
      $$0.a(a, new enl($$4, ImmutableList.of(Pair.of(enj.a("pillager_outpost/base_plate"), 1)), enl.a.b));
      ri.a(
         $$0,
         "pillager_outpost/towers",
         new enl(
            $$4,
            ImmutableList.of(Pair.of(enj.b(ImmutableList.of(enj.a("pillager_outpost/watchtower"), enj.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            enl.a.b
         )
      );
      ri.a($$0, "pillager_outpost/feature_plates", new enl($$4, ImmutableList.of(Pair.of(enj.a("pillager_outpost/feature_plate"), 1)), enl.a.a));
      ri.a(
         $$0,
         "pillager_outpost/features",
         new enl(
            $$4,
            ImmutableList.of(
               Pair.of(enj.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(enj.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(enj.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(enj.a("pillager_outpost/feature_logs"), 1),
               Pair.of(enj.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(enj.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(enj.a("pillager_outpost/feature_targets"), 1),
               Pair.of(enj.h(), 6)
            ),
            enl.a.b
         )
      );
   }
}
