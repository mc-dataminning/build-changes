import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qm {
   public static final alf<esl> a = qo.a("pillager_outpost/base_plates");

   public static void a(qh<esl> $$0) {
      jf<evb> $$1 = $$0.a(mg.bc);
      je<evb> $$2 = $$1.b(qp.q);
      jf<esl> $$3 = $$0.a(mg.bf);
      je<esl> $$4 = $$3.b(qo.a);
      $$0.a(a, new esl($$4, ImmutableList.of(Pair.of(esj.a("pillager_outpost/base_plate"), 1)), esl.a.b));
      qo.a(
         $$0,
         "pillager_outpost/towers",
         new esl(
            $$4,
            ImmutableList.of(Pair.of(esj.b(ImmutableList.of(esj.a("pillager_outpost/watchtower"), esj.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            esl.a.b
         )
      );
      qo.a($$0, "pillager_outpost/feature_plates", new esl($$4, ImmutableList.of(Pair.of(esj.a("pillager_outpost/feature_plate"), 1)), esl.a.a));
      qo.a(
         $$0,
         "pillager_outpost/features",
         new esl(
            $$4,
            ImmutableList.of(
               Pair.of(esj.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(esj.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(esj.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(esj.a("pillager_outpost/feature_logs"), 1),
               Pair.of(esj.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(esj.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(esj.a("pillager_outpost/feature_targets"), 1),
               Pair.of(esj.h(), 6)
            ),
            esl.a.b
         )
      );
   }
}
