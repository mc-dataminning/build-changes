import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rp {
   public static final aly<ept> a = rr.a("pillager_outpost/base_plates");

   public static void a(rk<ept> $$0) {
      jr<esj> $$1 = $$0.a(mb.aV);
      jq<esj> $$2 = $$1.b(rs.q);
      jr<ept> $$3 = $$0.a(mb.aX);
      jq<ept> $$4 = $$3.b(rr.a);
      $$0.a(a, new ept($$4, ImmutableList.of(Pair.of(epr.a("pillager_outpost/base_plate"), 1)), ept.a.b));
      rr.a(
         $$0,
         "pillager_outpost/towers",
         new ept(
            $$4,
            ImmutableList.of(Pair.of(epr.b(ImmutableList.of(epr.a("pillager_outpost/watchtower"), epr.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ept.a.b
         )
      );
      rr.a($$0, "pillager_outpost/feature_plates", new ept($$4, ImmutableList.of(Pair.of(epr.a("pillager_outpost/feature_plate"), 1)), ept.a.a));
      rr.a(
         $$0,
         "pillager_outpost/features",
         new ept(
            $$4,
            ImmutableList.of(
               Pair.of(epr.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(epr.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(epr.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(epr.a("pillager_outpost/feature_logs"), 1),
               Pair.of(epr.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(epr.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(epr.a("pillager_outpost/feature_targets"), 1),
               Pair.of(epr.h(), 6)
            ),
            ept.a.b
         )
      );
   }
}
