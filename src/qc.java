import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qc {
   public static final ajs<egq> a = qe.a("pillager_outpost/base_plates");

   public static void a(px<egq> $$0) {
      im<ejf> $$1 = $$0.a(ks.aG);
      il<ejf> $$2 = $$1.b(qf.q);
      im<egq> $$3 = $$0.a(ks.aI);
      il<egq> $$4 = $$3.b(qe.a);
      $$0.a(a, new egq($$4, ImmutableList.of(Pair.of(ego.a("pillager_outpost/base_plate"), 1)), egq.a.b));
      qe.a(
         $$0,
         "pillager_outpost/towers",
         new egq(
            $$4,
            ImmutableList.of(Pair.of(ego.b(ImmutableList.of(ego.a("pillager_outpost/watchtower"), ego.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            egq.a.b
         )
      );
      qe.a($$0, "pillager_outpost/feature_plates", new egq($$4, ImmutableList.of(Pair.of(ego.a("pillager_outpost/feature_plate"), 1)), egq.a.a));
      qe.a(
         $$0,
         "pillager_outpost/features",
         new egq(
            $$4,
            ImmutableList.of(
               Pair.of(ego.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ego.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ego.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ego.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ego.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ego.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ego.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ego.g(), 6)
            ),
            egq.a.b
         )
      );
   }
}
