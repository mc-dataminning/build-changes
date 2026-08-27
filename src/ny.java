import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ny {
   public static final aex<dwt> a = oa.a("pillager_outpost/base_plates");

   public static void a(nt<dwt> $$0) {
      hh<dzb> $$1 = $$0.a(je.aA);
      hg<dzb> $$2 = $$1.b(ob.q);
      hh<dwt> $$3 = $$0.a(je.aC);
      hg<dwt> $$4 = $$3.b(oa.a);
      $$0.a(a, new dwt($$4, ImmutableList.of(Pair.of(dwr.a("pillager_outpost/base_plate"), 1)), dwt.a.b));
      oa.a(
         $$0,
         "pillager_outpost/towers",
         new dwt(
            $$4,
            ImmutableList.of(Pair.of(dwr.a(ImmutableList.of(dwr.a("pillager_outpost/watchtower"), dwr.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dwt.a.b
         )
      );
      oa.a($$0, "pillager_outpost/feature_plates", new dwt($$4, ImmutableList.of(Pair.of(dwr.a("pillager_outpost/feature_plate"), 1)), dwt.a.a));
      oa.a(
         $$0,
         "pillager_outpost/features",
         new dwt(
            $$4,
            ImmutableList.of(
               Pair.of(dwr.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dwr.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dwr.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dwr.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dwr.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dwr.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dwr.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dwr.g(), 6)
            ),
            dwt.a.b
         )
      );
   }
}
