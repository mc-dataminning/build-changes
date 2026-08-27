import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class pm {
   public static final aix<ecn> a = po.a("pillager_outpost/base_plates");

   public static void a(ph<ecn> $$0) {
      ik<efc> $$1 = $$0.a(kg.aE);
      ij<efc> $$2 = $$1.b(pp.q);
      ik<ecn> $$3 = $$0.a(kg.aG);
      ij<ecn> $$4 = $$3.b(po.a);
      $$0.a(a, new ecn($$4, ImmutableList.of(Pair.of(ecl.a("pillager_outpost/base_plate"), 1)), ecn.a.b));
      po.a(
         $$0,
         "pillager_outpost/towers",
         new ecn(
            $$4,
            ImmutableList.of(Pair.of(ecl.b(ImmutableList.of(ecl.a("pillager_outpost/watchtower"), ecl.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ecn.a.b
         )
      );
      po.a($$0, "pillager_outpost/feature_plates", new ecn($$4, ImmutableList.of(Pair.of(ecl.a("pillager_outpost/feature_plate"), 1)), ecn.a.a));
      po.a(
         $$0,
         "pillager_outpost/features",
         new ecn(
            $$4,
            ImmutableList.of(
               Pair.of(ecl.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ecl.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ecl.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ecl.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ecl.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ecl.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ecl.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ecl.g(), 6)
            ),
            ecn.a.b
         )
      );
   }
}
