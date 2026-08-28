import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qn {
   public static final alj<etn> a = qp.a("pillager_outpost/base_plates");

   public static void a(qi<etn> $$0) {
      jh<ewd> $$1 = $$0.a(mi.bc);
      jg<ewd> $$2 = $$1.b(qq.q);
      jh<etn> $$3 = $$0.a(mi.bf);
      jg<etn> $$4 = $$3.b(qp.a);
      $$0.a(a, new etn($$4, ImmutableList.of(Pair.of(etl.a("pillager_outpost/base_plate"), 1)), etn.a.b));
      qp.a(
         $$0,
         "pillager_outpost/towers",
         new etn(
            $$4,
            ImmutableList.of(Pair.of(etl.b(ImmutableList.of(etl.a("pillager_outpost/watchtower"), etl.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            etn.a.b
         )
      );
      qp.a($$0, "pillager_outpost/feature_plates", new etn($$4, ImmutableList.of(Pair.of(etl.a("pillager_outpost/feature_plate"), 1)), etn.a.a));
      qp.a(
         $$0,
         "pillager_outpost/features",
         new etn(
            $$4,
            ImmutableList.of(
               Pair.of(etl.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(etl.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(etl.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(etl.a("pillager_outpost/feature_logs"), 1),
               Pair.of(etl.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(etl.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(etl.a("pillager_outpost/feature_targets"), 1),
               Pair.of(etl.i(), 6)
            ),
            etn.a.b
         )
      );
   }
}
