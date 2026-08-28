import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rp {
   public static final aly<epm> a = rr.a("pillager_outpost/base_plates");

   public static void a(rk<epm> $$0) {
      jr<esc> $$1 = $$0.a(mb.aU);
      jq<esc> $$2 = $$1.b(rs.q);
      jr<epm> $$3 = $$0.a(mb.aW);
      jq<epm> $$4 = $$3.b(rr.a);
      $$0.a(a, new epm($$4, ImmutableList.of(Pair.of(epk.a("pillager_outpost/base_plate"), 1)), epm.a.b));
      rr.a(
         $$0,
         "pillager_outpost/towers",
         new epm(
            $$4,
            ImmutableList.of(Pair.of(epk.b(ImmutableList.of(epk.a("pillager_outpost/watchtower"), epk.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            epm.a.b
         )
      );
      rr.a($$0, "pillager_outpost/feature_plates", new epm($$4, ImmutableList.of(Pair.of(epk.a("pillager_outpost/feature_plate"), 1)), epm.a.a));
      rr.a(
         $$0,
         "pillager_outpost/features",
         new epm(
            $$4,
            ImmutableList.of(
               Pair.of(epk.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(epk.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(epk.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(epk.a("pillager_outpost/feature_logs"), 1),
               Pair.of(epk.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(epk.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(epk.a("pillager_outpost/feature_targets"), 1),
               Pair.of(epk.h(), 6)
            ),
            epm.a.b
         )
      );
   }
}
