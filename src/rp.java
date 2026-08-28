import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rp {
   public static final aly<epu> a = rr.a("pillager_outpost/base_plates");

   public static void a(rk<epu> $$0) {
      jr<esk> $$1 = $$0.a(mb.aV);
      jq<esk> $$2 = $$1.b(rs.q);
      jr<epu> $$3 = $$0.a(mb.aX);
      jq<epu> $$4 = $$3.b(rr.a);
      $$0.a(a, new epu($$4, ImmutableList.of(Pair.of(eps.a("pillager_outpost/base_plate"), 1)), epu.a.b));
      rr.a(
         $$0,
         "pillager_outpost/towers",
         new epu(
            $$4,
            ImmutableList.of(Pair.of(eps.b(ImmutableList.of(eps.a("pillager_outpost/watchtower"), eps.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            epu.a.b
         )
      );
      rr.a($$0, "pillager_outpost/feature_plates", new epu($$4, ImmutableList.of(Pair.of(eps.a("pillager_outpost/feature_plate"), 1)), epu.a.a));
      rr.a(
         $$0,
         "pillager_outpost/features",
         new epu(
            $$4,
            ImmutableList.of(
               Pair.of(eps.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eps.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eps.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eps.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eps.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eps.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eps.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eps.h(), 6)
            ),
            epu.a.b
         )
      );
   }
}
