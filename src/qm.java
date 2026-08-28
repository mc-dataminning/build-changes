import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qm {
   public static final alh<etl> a = qo.a("pillager_outpost/base_plates");

   public static void a(qh<etl> $$0) {
      jg<ewb> $$1 = $$0.a(mh.bc);
      jf<ewb> $$2 = $$1.b(qp.q);
      jg<etl> $$3 = $$0.a(mh.bf);
      jf<etl> $$4 = $$3.b(qo.a);
      $$0.a(a, new etl($$4, ImmutableList.of(Pair.of(etj.a("pillager_outpost/base_plate"), 1)), etl.a.b));
      qo.a(
         $$0,
         "pillager_outpost/towers",
         new etl(
            $$4,
            ImmutableList.of(Pair.of(etj.b(ImmutableList.of(etj.a("pillager_outpost/watchtower"), etj.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            etl.a.b
         )
      );
      qo.a($$0, "pillager_outpost/feature_plates", new etl($$4, ImmutableList.of(Pair.of(etj.a("pillager_outpost/feature_plate"), 1)), etl.a.a));
      qo.a(
         $$0,
         "pillager_outpost/features",
         new etl(
            $$4,
            ImmutableList.of(
               Pair.of(etj.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(etj.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(etj.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(etj.a("pillager_outpost/feature_logs"), 1),
               Pair.of(etj.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(etj.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(etj.a("pillager_outpost/feature_targets"), 1),
               Pair.of(etj.i(), 6)
            ),
            etl.a.b
         )
      );
   }
}
