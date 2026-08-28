import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qm {
   public static final ald<ers> a = qo.a("pillager_outpost/base_plates");

   public static void a(qh<ers> $$0) {
      jf<eui> $$1 = $$0.a(mg.ba);
      je<eui> $$2 = $$1.b(qp.q);
      jf<ers> $$3 = $$0.a(mg.bd);
      je<ers> $$4 = $$3.b(qo.a);
      $$0.a(a, new ers($$4, ImmutableList.of(Pair.of(erq.a("pillager_outpost/base_plate"), 1)), ers.a.b));
      qo.a(
         $$0,
         "pillager_outpost/towers",
         new ers(
            $$4,
            ImmutableList.of(Pair.of(erq.b(ImmutableList.of(erq.a("pillager_outpost/watchtower"), erq.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ers.a.b
         )
      );
      qo.a($$0, "pillager_outpost/feature_plates", new ers($$4, ImmutableList.of(Pair.of(erq.a("pillager_outpost/feature_plate"), 1)), ers.a.a));
      qo.a(
         $$0,
         "pillager_outpost/features",
         new ers(
            $$4,
            ImmutableList.of(
               Pair.of(erq.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(erq.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(erq.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(erq.a("pillager_outpost/feature_logs"), 1),
               Pair.of(erq.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(erq.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(erq.a("pillager_outpost/feature_targets"), 1),
               Pair.of(erq.h(), 6)
            ),
            ers.a.b
         )
      );
   }
}
