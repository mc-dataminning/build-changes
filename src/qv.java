import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class qv {
   public static final akq<elb> a = qx.a("pillager_outpost/base_plates");

   public static void a(qq<elb> $$0) {
      jn<enr> $$1 = $$0.a(lu.aS);
      jm<enr> $$2 = $$1.b(qy.q);
      jn<elb> $$3 = $$0.a(lu.aU);
      jm<elb> $$4 = $$3.b(qx.a);
      $$0.a(a, new elb($$4, ImmutableList.of(Pair.of(ekz.a("pillager_outpost/base_plate"), 1)), elb.a.b));
      qx.a(
         $$0,
         "pillager_outpost/towers",
         new elb(
            $$4,
            ImmutableList.of(Pair.of(ekz.b(ImmutableList.of(ekz.a("pillager_outpost/watchtower"), ekz.a("pillager_outpost/watchtower_overgrown", $$2))), 1)),
            elb.a.b
         )
      );
      qx.a($$0, "pillager_outpost/feature_plates", new elb($$4, ImmutableList.of(Pair.of(ekz.a("pillager_outpost/feature_plate"), 1)), elb.a.a));
      qx.a(
         $$0,
         "pillager_outpost/features",
         new elb(
            $$4,
            ImmutableList.of(
               Pair.of(ekz.a("pillager_outpost/feature_cage1"), 1),
               Pair.of(ekz.a("pillager_outpost/feature_cage2"), 1),
               Pair.of(ekz.a("pillager_outpost/feature_cage_with_allays"), 1),
               Pair.of(ekz.a("pillager_outpost/feature_logs"), 1),
               Pair.of(ekz.a("pillager_outpost/feature_tent1"), 1),
               Pair.of(ekz.a("pillager_outpost/feature_tent2"), 1),
               Pair.of(ekz.a("pillager_outpost/feature_targets"), 1),
               Pair.of(ekz.h(), 6)
            ),
            elb.a.b
         )
      );
   }
}
