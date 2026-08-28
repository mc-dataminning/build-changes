import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qn {
   public static final alq<etx> a = qp.a("pillager_outpost/base_plates");

   public static void a(qi<etx> $$0) {
      jh<ewn> $$1 = $$0.a(mi.bc);
      jg<ewn> $$2 = $$1.b(qq.q);
      jh<etx> $$3 = $$0.a(mi.bf);
      jg<etx> $$4 = $$3.b(qp.a);
      $$0.a(a, new etx($$4, ImmutableList.of(Pair.of(etv.a("pillager_outpost/base_plate"), 1)), etx.a.b));
      qp.a(
         $$0,
         "pillager_outpost/towers",
         new etx(
            $$4,
            ImmutableList.of(Pair.of(etv.b(ImmutableList.of(etv.a("pillager_outpost/watchtower"), etv.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            etx.a.b
         )
      );
      qp.a($$0, "pillager_outpost/feature_plates", new etx($$4, ImmutableList.of(Pair.of(etv.a("pillager_outpost/feature_plate"), 1)), etx.a.a));
      qp.a(
         $$0,
         "pillager_outpost/features",
         new etx(
            $$4,
            ImmutableList.of(
               Pair.of(etv.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(etv.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(etv.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(etv.a("pillager_outpost/feature_logs"), 1),
               Pair.of(etv.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(etv.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(etv.a("pillager_outpost/feature_targets"), 1),
               Pair.of(etv.i(), 6)
            ),
            etx.a.b
         )
      );
   }
}
