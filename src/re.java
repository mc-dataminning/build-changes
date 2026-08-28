import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class re {
   public static final ali<ens> a = rg.a("pillager_outpost/base_plates");

   public static void a(qz<ens> $$0) {
      jr<eqi> $$1 = $$0.a(ma.aT);
      jq<eqi> $$2 = $$1.b(rh.q);
      jr<ens> $$3 = $$0.a(ma.aV);
      jq<ens> $$4 = $$3.b(rg.a);
      $$0.a(a, new ens($$4, ImmutableList.of(Pair.of(enq.a("pillager_outpost/base_plate"), 1)), ens.a.b));
      rg.a(
         $$0,
         "pillager_outpost/towers",
         new ens(
            $$4,
            ImmutableList.of(Pair.of(enq.b(ImmutableList.of(enq.a("pillager_outpost/watchtower"), enq.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ens.a.b
         )
      );
      rg.a($$0, "pillager_outpost/feature_plates", new ens($$4, ImmutableList.of(Pair.of(enq.a("pillager_outpost/feature_plate"), 1)), ens.a.a));
      rg.a(
         $$0,
         "pillager_outpost/features",
         new ens(
            $$4,
            ImmutableList.of(
               Pair.of(enq.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(enq.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(enq.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(enq.a("pillager_outpost/feature_logs"), 1),
               Pair.of(enq.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(enq.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(enq.a("pillager_outpost/feature_targets"), 1),
               Pair.of(enq.h(), 6)
            ),
            ens.a.b
         )
      );
   }
}
