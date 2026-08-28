import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qm {
   public static final alf<ess> a = qo.a("pillager_outpost/base_plates");

   public static void a(qh<ess> $$0) {
      jg<evi> $$1 = $$0.a(mh.bc);
      jf<evi> $$2 = $$1.b(qp.q);
      jg<ess> $$3 = $$0.a(mh.bf);
      jf<ess> $$4 = $$3.b(qo.a);
      $$0.a(a, new ess($$4, ImmutableList.of(Pair.of(esq.a("pillager_outpost/base_plate"), 1)), ess.a.b));
      qo.a(
         $$0,
         "pillager_outpost/towers",
         new ess(
            $$4,
            ImmutableList.of(Pair.of(esq.b(ImmutableList.of(esq.a("pillager_outpost/watchtower"), esq.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ess.a.b
         )
      );
      qo.a($$0, "pillager_outpost/feature_plates", new ess($$4, ImmutableList.of(Pair.of(esq.a("pillager_outpost/feature_plate"), 1)), ess.a.a));
      qo.a(
         $$0,
         "pillager_outpost/features",
         new ess(
            $$4,
            ImmutableList.of(
               Pair.of(esq.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(esq.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(esq.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(esq.a("pillager_outpost/feature_logs"), 1),
               Pair.of(esq.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(esq.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(esq.a("pillager_outpost/feature_targets"), 1),
               Pair.of(esq.i(), 6)
            ),
            ess.a.b
         )
      );
   }
}
