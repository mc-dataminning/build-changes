import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class ny {
   public static final aew<dwr> a = oa.a("pillager_outpost/base_plates");

   public static void a(nt<dwr> $$0) {
      hh<dyz> $$1 = $$0.a(je.aA);
      hg<dyz> $$2 = $$1.b(ob.q);
      hh<dwr> $$3 = $$0.a(je.aC);
      hg<dwr> $$4 = $$3.b(oa.a);
      $$0.a(a, new dwr($$4, ImmutableList.of(Pair.of(dwp.a("pillager_outpost/base_plate"), 1)), dwr.a.b));
      oa.a(
         $$0,
         "pillager_outpost/towers",
         new dwr(
            $$4,
            ImmutableList.of(Pair.of(dwp.a(ImmutableList.of(dwp.a("pillager_outpost/watchtower"), dwp.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            dwr.a.b
         )
      );
      oa.a($$0, "pillager_outpost/feature_plates", new dwr($$4, ImmutableList.of(Pair.of(dwp.a("pillager_outpost/feature_plate"), 1)), dwr.a.a));
      oa.a(
         $$0,
         "pillager_outpost/features",
         new dwr(
            $$4,
            ImmutableList.of(
               Pair.of(dwp.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(dwp.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(dwp.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(dwp.a("pillager_outpost/feature_logs"), 1),
               Pair.of(dwp.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(dwp.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(dwp.a("pillager_outpost/feature_targets"), 1),
               Pair.of(dwp.g(), 6)
            ),
            dwr.a.b
         )
      );
   }
}
