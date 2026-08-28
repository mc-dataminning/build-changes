import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qv {
   public static final akq<ekz> a = qx.a("pillager_outpost/base_plates");

   public static void a(qq<ekz> $$0) {
      jn<enp> $$1 = $$0.a(lu.aS);
      jm<enp> $$2 = $$1.b(qy.q);
      jn<ekz> $$3 = $$0.a(lu.aU);
      jm<ekz> $$4 = $$3.b(qx.a);
      $$0.a(a, new ekz($$4, ImmutableList.of(Pair.of(ekx.a("pillager_outpost/base_plate"), 1)), ekz.a.b));
      qx.a(
         $$0,
         "pillager_outpost/towers",
         new ekz(
            $$4,
            ImmutableList.of(Pair.of(ekx.b(ImmutableList.of(ekx.a("pillager_outpost/watchtower"), ekx.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            ekz.a.b
         )
      );
      qx.a($$0, "pillager_outpost/feature_plates", new ekz($$4, ImmutableList.of(Pair.of(ekx.a("pillager_outpost/feature_plate"), 1)), ekz.a.a));
      qx.a(
         $$0,
         "pillager_outpost/features",
         new ekz(
            $$4,
            ImmutableList.of(
               Pair.of(ekx.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ekx.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ekx.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ekx.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ekx.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ekx.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ekx.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ekx.h(), 6)
            ),
            ekz.a.b
         )
      );
   }
}
