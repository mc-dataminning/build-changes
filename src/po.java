import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class po {
   public static final ajb<edp> a = pq.a("pillager_outpost/base_plates");

   public static void a(pj<edp> $$0) {
      im<ege> $$1 = $$0.a(ki.aF);
      il<ege> $$2 = $$1.b(pr.q);
      im<edp> $$3 = $$0.a(ki.aH);
      il<edp> $$4 = $$3.b(pq.a);
      $$0.a(a, new edp($$4, ImmutableList.of(Pair.of(edn.a("pillager_outpost/base_plate"), 1)), edp.a.b));
      pq.a(
         $$0,
         "pillager_outpost/towers",
         new edp(
            $$4,
            ImmutableList.of(Pair.of(edn.b(ImmutableList.of(edn.a("pillager_outpost/watchtower"), edn.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            edp.a.b
         )
      );
      pq.a($$0, "pillager_outpost/feature_plates", new edp($$4, ImmutableList.of(Pair.of(edn.a("pillager_outpost/feature_plate"), 1)), edp.a.a));
      pq.a(
         $$0,
         "pillager_outpost/features",
         new edp(
            $$4,
            ImmutableList.of(
               Pair.of(edn.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(edn.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(edn.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(edn.a("pillager_outpost/feature_logs"), 1),
               Pair.of(edn.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(edn.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(edn.a("pillager_outpost/feature_targets"), 1),
               Pair.of(edn.g(), 6)
            ),
            edp.a.b
         )
      );
   }
}
