import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qm {
   public static final alf<esd> a = qo.a("pillager_outpost/base_plates");

   public static void a(qh<esd> $$0) {
      jf<eut> $$1 = $$0.a(mg.bb);
      je<eut> $$2 = $$1.b(qp.q);
      jf<esd> $$3 = $$0.a(mg.be);
      je<esd> $$4 = $$3.b(qo.a);
      $$0.a(a, new esd($$4, ImmutableList.of(Pair.of(esb.a("pillager_outpost/base_plate"), 1)), esd.a.b));
      qo.a(
         $$0,
         "pillager_outpost/towers",
         new esd(
            $$4,
            ImmutableList.of(Pair.of(esb.b(ImmutableList.of(esb.a("pillager_outpost/watchtower"), esb.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            esd.a.b
         )
      );
      qo.a($$0, "pillager_outpost/feature_plates", new esd($$4, ImmutableList.of(Pair.of(esb.a("pillager_outpost/feature_plate"), 1)), esd.a.a));
      qo.a(
         $$0,
         "pillager_outpost/features",
         new esd(
            $$4,
            ImmutableList.of(
               Pair.of(esb.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(esb.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(esb.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(esb.a("pillager_outpost/feature_logs"), 1),
               Pair.of(esb.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(esb.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(esb.a("pillager_outpost/feature_targets"), 1),
               Pair.of(esb.h(), 6)
            ),
            esd.a.b
         )
      );
   }
}
