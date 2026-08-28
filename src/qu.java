import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qu {
   public static final akp<ekw> a = qw.a("pillager_outpost/base_plates");

   public static void a(qp<ekw> $$0) {
      jn<enl> $$1 = $$0.a(lu.aS);
      jm<enl> $$2 = $$1.b(qx.q);
      jn<ekw> $$3 = $$0.a(lu.aU);
      jm<ekw> $$4 = $$3.b(qw.a);
      $$0.a(a, new ekw($$4, ImmutableList.of(Pair.of(eku.a("pillager_outpost/base_plate"), 1)), ekw.a.b));
      qw.a(
         $$0,
         "pillager_outpost/towers",
         new ekw(
            $$4,
            ImmutableList.of(Pair.of(eku.b(ImmutableList.of(eku.a("pillager_outpost/watchtower"), eku.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ekw.a.b
         )
      );
      qw.a($$0, "pillager_outpost/feature_plates", new ekw($$4, ImmutableList.of(Pair.of(eku.a("pillager_outpost/feature_plate"), 1)), ekw.a.a));
      qw.a(
         $$0,
         "pillager_outpost/features",
         new ekw(
            $$4,
            ImmutableList.of(
               Pair.of(eku.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(eku.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(eku.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(eku.a("pillager_outpost/feature_logs"), 1),
               Pair.of(eku.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(eku.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(eku.a("pillager_outpost/feature_targets"), 1),
               Pair.of(eku.g(), 6)
            ),
            ekw.a.b
         )
      );
   }
}
