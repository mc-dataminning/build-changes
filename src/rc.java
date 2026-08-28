import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class rc {
   public static final alg<enb> a = re.a("pillager_outpost/base_plates");

   public static void a(qx<enb> $$0) {
      jq<epr> $$1 = $$0.a(ly.aT);
      jp<epr> $$2 = $$1.b(rf.q);
      jq<enb> $$3 = $$0.a(ly.aV);
      jp<enb> $$4 = $$3.b(re.a);
      $$0.a(a, new enb($$4, ImmutableList.of(Pair.of(emz.a("pillager_outpost/base_plate"), 1)), enb.a.b));
      re.a(
         $$0,
         "pillager_outpost/towers",
         new enb(
            $$4,
            ImmutableList.of(Pair.of(emz.b(ImmutableList.of(emz.a("pillager_outpost/watchtower"), emz.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            enb.a.b
         )
      );
      re.a($$0, "pillager_outpost/feature_plates", new enb($$4, ImmutableList.of(Pair.of(emz.a("pillager_outpost/feature_plate"), 1)), enb.a.a));
      re.a(
         $$0,
         "pillager_outpost/features",
         new enb(
            $$4,
            ImmutableList.of(
               Pair.of(emz.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(emz.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(emz.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(emz.a("pillager_outpost/feature_logs"), 1),
               Pair.of(emz.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(emz.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(emz.a("pillager_outpost/feature_targets"), 1),
               Pair.of(emz.h(), 6)
            ),
            enb.a.b
         )
      );
   }
}
